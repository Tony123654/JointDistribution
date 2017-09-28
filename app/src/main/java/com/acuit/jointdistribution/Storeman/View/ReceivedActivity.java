package com.acuit.jointdistribution.Storeman.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.LinearLayoutManager;
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
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.zxing.activity.CaptureActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 类名: ReceivedActivity <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/29 12:08 <p>
 * 描述: 保管员验收入库——特定供货商入库单列表
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class ReceivedActivity extends BaseActivity implements View.OnClickListener, XRecyclerView.LoadingListener {

    private SuppliersListBean.DataBean.StoreInListBean supplier;
    private ImageView ivBack;
    private TextView tvScanCode;
    private TextView tvSupplierName;
    private XRecyclerView xrvStoreList;
    private int rows = 10;
    private int page = 1;
    private int total = -1;
    private List<StoreInListBySupplierBean.DataBean.StoreInListBean> storeInList = new ArrayList<StoreInListBySupplierBean.DataBean.StoreInListBean>();
    private int requestCode = 1245;
    private StoreInListAdapter storeInListAdapter;
    private boolean Flag_LoadMore = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storeinlist_by_supplier);

        initView();

        supplier = (SuppliersListBean.DataBean.StoreInListBean) getIntent().getSerializableExtra("SupplierBean");
        tvSupplierName.setText(supplier.getSupply_name());
//        initData();
        initEvent();

    }

    private void initView() {

        ivBack = (ImageView) findViewById(R.id.iv_back);
        tvScanCode = (TextView) findViewById(R.id.tv_scanCode);
        tvSupplierName = (TextView) findViewById(R.id.btn_supplierName);
        xrvStoreList = (XRecyclerView) findViewById(R.id.xrv_storeInList);
        TextView emptyText = new TextView(ReceivedActivity.this);
        emptyText.setText("没有待验收入库单");
        xrvStoreList.setEmptyView(emptyText);
    }


    private void initEvent() {
        ivBack.setOnClickListener(this);
        tvScanCode.setOnClickListener(this);

        xrvStoreList.setLoadingListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_scanCode:
//                startActivity(new Intent(ReceivedActivity.this, ScanCodeActivity.class));
                startActivityForResult(new Intent(ReceivedActivity.this, CaptureActivity.class), requestCode);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == this.requestCode && resultCode == RESULT_OK && null != data) {
            String resultString = data.getStringExtra("result");
            String storeInId = resultString.substring(resultString.indexOf("=") + 1);
            Intent intent = new Intent(ReceivedActivity.this, StoreInDetilsActivity.class);
            intent.putExtra("StoreInId", storeInId);
            startActivity(intent);

        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    private void initData() {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_STORE_IN_LIST, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                StoreInListBySupplierBean storeInListBySupplierBean = gson.fromJson(response, StoreInListBySupplierBean.class);
                if (200 == storeInListBySupplierBean.getCode()) {
                    total = Integer.parseInt(storeInListBySupplierBean.getData().getTotal());
                    if (!Flag_LoadMore) {
                        storeInList.clear();
                    }
                    Flag_LoadMore = false;
                    List<StoreInListBySupplierBean.DataBean.StoreInListBean> store_in_list = storeInListBySupplierBean.getData().getStore_in_list();
                    if (null != store_in_list) {
                        storeInList.addAll(store_in_list);
                    }
                    initAdapter();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                if (null == error.getMessage()) {
                    Toast.makeText(ReceivedActivity.this, "无法获取信息，请检查网络环境", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ReceivedActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                ArrayMap<String, String> params = new ArrayMap<String, String>();

                params.put("token", BaseApplication.getLoginBean().getData().getToken());
//                params.put("start_date", (new Date(0)).getTime() / 1000 + "");
//                params.put("end_date", System.currentTimeMillis() / 1000 + "");
                params.put("rows", rows + "");
                params.put("page", page + "");
                params.put("status", "2");
                params.put("supply_id", supplier.getSupply_id());

                return params;
            }
        };

        stringRequest.setTag("ReceivedActivity");
        BaseApplication.getRequestQueue().add(stringRequest);
    }

    private void initAdapter() {

        xrvStoreList.setHasFixedSize(true);
        xrvStoreList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        if (0 != storeInList.size()) {

            if (null != storeInListAdapter) {

                xrvStoreList.refreshComplete();
                xrvStoreList.loadMoreComplete();
                storeInListAdapter.notifyDataSetChanged();

            } else {

                xrvStoreList.refreshComplete();
                xrvStoreList.loadMoreComplete();
                storeInListAdapter = new StoreInListAdapter(storeInList, ReceivedActivity.this);
                xrvStoreList.setAdapter(storeInListAdapter);
            }

        } else {
            Toast.makeText(ReceivedActivity.this, "没有数据", Toast.LENGTH_SHORT).show();
        }

        if (total == storeInList.size()) {
            xrvStoreList.setLoadingMoreEnabled(false);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        xrvStoreList.refresh();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        BaseApplication.getRequestQueue().cancelAll("ReceivedActivity");
    }

    @Override
    public void onRefresh() {

        page = 1;
        initData();
        xrvStoreList.setLoadingMoreEnabled(true);
    }

    @Override
    public void onLoadMore() {

        page++;
        Flag_LoadMore = true;
        initData();
    }
}
