package com.acuit.jointdistribution.Storeman.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Adapter.SuppliersListAdapter;
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
 * 类名: SupplierListActivity <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/28 14:08 <p>
 * 描述: 供应商对入库单——验收入库  操作界面
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class SupplierListActivity extends BaseActivity implements View.OnClickListener {

    private RecyclerView rvSupplierList;
    private EditText etSearchBar;
    private Button btnSearchSupplier;
    private ImageView ivBack;
    private ImageView ivScanCode;
    private int page = 1;
    private List<SuppliersListBean.DataBean.StoreInListBean> suppliersList = new ArrayList<SuppliersListBean.DataBean.StoreInListBean>();
    private SuppliersListAdapter suppliersAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkorder_supplierlist);

        initView();
        initData();
        initEvent();
    }

    private void initView() {
        ivBack = (ImageView) findViewById(R.id.iv_back);
        ivScanCode = (ImageView) findViewById(R.id.iv_scanCode);
        btnSearchSupplier = (Button) findViewById(R.id.btn_searchSuppliers);
        etSearchBar = (EditText) findViewById(R.id.et_searchBySupplierName);
        rvSupplierList = (RecyclerView) findViewById(R.id.rl_suppliersList);
    }


    private void initEvent() {
        ivBack.setOnClickListener(this);
        ivScanCode.setOnClickListener(this);
        btnSearchSupplier.setOnClickListener(this);

        // TODO: 2017/8/29  下拉刷新，上拉加载

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.iv_scanCode:
                startActivity(new Intent(SupplierListActivity.this, ScanCodeActivity.class));
                break;
            case R.id.btn_searchSuppliers:

                break;
        }
    }

    private void initData() {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_STORE_IN_LIST, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                SuppliersListBean suppliersListBean = gson.fromJson(response, SuppliersListBean.class);
//                    登录成功
                if (200 == suppliersListBean.getCode()) {
                    suppliersList.clear();
                    suppliersList.addAll(suppliersListBean.getData().getStore_in_list());
                    initAdapter();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                if (null == error.getMessage()) {
                    Toast.makeText(SupplierListActivity.this, "无法获取信息，请检查网络环境", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SupplierListActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
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
                params.put("get_supply_list", "1");


                return params;
            }
        };

        stringRequest.setTag("SupplierListActivity");
        BaseApplication.getRequestQueue().add(stringRequest);
    }

    private void initAdapter() {

        rvSupplierList.setHasFixedSize(true);
        rvSupplierList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        if (0 != suppliersList.size()) {

            suppliersAdapter = new SuppliersListAdapter(suppliersList, SupplierListActivity.this);
            rvSupplierList.setAdapter(suppliersAdapter);

        } else {
            Toast.makeText(SupplierListActivity.this, "没有数据", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        BaseApplication.getRequestQueue().cancelAll("SupplierListActivity");
    }


}
