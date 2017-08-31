package com.acuit.jointdistribution.Storeman.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Adapter.StoreInListAdapter;
import com.acuit.jointdistribution.Storeman.Bean.StoreInListBySupplierBean;
import com.acuit.jointdistribution.Storeman.Bean.SuppliersListBean;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 类名: StoreInListActivity <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/29 12:08 <p>
 * 描述: 保管员验收入库——特定供货商入库单列表
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class StoreInListActivity extends BaseActivity implements View.OnClickListener {

    private SuppliersListBean.DataBean.StoreInListBean supplier;
    private ImageView ivBack;
    private ImageView ivScanCode;
    private TextView tvSupplierName;
    private RecyclerView rvStoreList;
    private int page = 1;
    private List<StoreInListBySupplierBean.DataBean.StoreInListBean> storeInList = new ArrayList<StoreInListBySupplierBean.DataBean.StoreInListBean>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storeinlist_by_supplier);

        initView();
        initData();
        initEvent();

    }

    private void initView() {

        ivBack = (ImageView) findViewById(R.id.iv_back);
        ivScanCode = (ImageView) findViewById(R.id.iv_scanCode);
        tvSupplierName = (TextView) findViewById(R.id.tv_supplierName);
        rvStoreList = (RecyclerView) findViewById(R.id.rv_storeInList);
    }


    private void initEvent() {
        ivBack.setOnClickListener(this);
        ivScanCode.setOnClickListener(this);

        // TODO: 2017/8/29  下拉刷新，上拉加载

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.iv_scanCode:
                startActivity(new Intent(StoreInListActivity.this, ScanCodeActivity.class));
                break;
        }
    }


    private void initData() {

        supplier = (SuppliersListBean.DataBean.StoreInListBean) getIntent().getSerializableExtra("SupplierId");
        tvSupplierName.setText(supplier.getSupply_name());

        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_STORE_IN_LIST, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                StoreInListBySupplierBean storeInListBySupplierBean = gson.fromJson(response, StoreInListBySupplierBean.class);
//                    登录成功
                if (200 == storeInListBySupplierBean.getCode()) {
                    storeInList.clear();
                    storeInList.addAll(storeInListBySupplierBean.getData().getStore_in_list());
                    initAdapter();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                if (null == error.getMessage()) {
                    Toast.makeText(StoreInListActivity.this, "无法获取信息，请检查网络环境", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(StoreInListActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                ArrayMap<String, String> params = new ArrayMap<String, String>();

                params.put("token", BaseApplication.getLoginBean().getData().getToken());
                params.put("start_date", (new Date(0)).getTime() / 1000 + "");
                params.put("end_date", System.currentTimeMillis() / 1000 + "");
                params.put("rows", "20");
                params.put("page", page + "");
                params.put("status", "2");
                params.put("supply_id", supplier.getSupply_id());

                return params;
            }
        };

        stringRequest.setTag("StoreInListActivity");
        BaseApplication.getRequestQueue().add(stringRequest);
    }

    private void initAdapter() {

        rvStoreList.setHasFixedSize(true);
        rvStoreList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        if (0 != storeInList.size()) {

            StoreInListAdapter storeInListAdapter = new StoreInListAdapter(storeInList, StoreInListActivity.this);
            rvStoreList.setAdapter(storeInListAdapter);

        } else {
            Toast.makeText(StoreInListActivity.this, "没有数据", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        BaseApplication.getRequestQueue().cancelAll("StoreInListActivity");
    }

}
