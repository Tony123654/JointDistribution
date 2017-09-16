package com.acuit.jointdistribution.Storeman.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.Common.Utils.Tools;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Adapter.SuppliersListAdapter;
import com.acuit.jointdistribution.Storeman.Bean.SeachSupplyByKeyBean;
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

public class SupplierListActivity extends BaseActivity implements View.OnClickListener, XRecyclerView.LoadingListener {

    private XRecyclerView xrvSupplierList;
    private EditText etSearchBar;
    private TextView tvSearchSupplier;
    private ImageView ivBack;
    private TextView tvScanCode;
    private int rows = 10;
    private int page = 1;
    private int total = -1;
    private List<SuppliersListBean.DataBean.StoreInListBean> suppliersList = new ArrayList<>();
    private SuppliersListAdapter suppliersAdapter;
    private final int requestCode = 1245;
    private boolean Flag_LoadMore;

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
        tvScanCode = (TextView) findViewById(R.id.tv_scanCode);
        etSearchBar = (EditText) findViewById(R.id.et_searchBySupplierName);
        tvSearchSupplier = (TextView) findViewById(R.id.tv_searchSuppliers);
        xrvSupplierList = (XRecyclerView) findViewById(R.id.xrl_suppliersList);
    }


    private void initData() {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_STORE_IN_LIST, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                SuppliersListBean suppliersListBean = gson.fromJson(response, SuppliersListBean.class);
//                    登录成功
                if (200 == suppliersListBean.getCode()) {
                    if (!Flag_LoadMore) {
                        suppliersList.clear();
                    }
                    Flag_LoadMore = false;
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
                params.put("rows", rows + "");
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

        xrvSupplierList.setHasFixedSize(true);
        xrvSupplierList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        if (0 != suppliersList.size()) {

            if (null != suppliersAdapter) {

                xrvSupplierList.refreshComplete();
                xrvSupplierList.loadMoreComplete();
                suppliersAdapter.notifyDataSetChanged();
            } else {

                suppliersAdapter = new SuppliersListAdapter(suppliersList, SupplierListActivity.this);
                xrvSupplierList.setAdapter(suppliersAdapter);
            }

        } else {
            Toast.makeText(SupplierListActivity.this, "没有数据", Toast.LENGTH_SHORT).show();
        }

        if (total == suppliersList.size()) {
            xrvSupplierList.setLoadingMoreEnabled(false);
        }
    }


    private void initEvent() {
        ivBack.setOnClickListener(this);
        tvScanCode.setOnClickListener(this);
        tvSearchSupplier.setOnClickListener(this);

        xrvSupplierList.setLoadingListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_scanCode:
//                startActivity(new Intent(SupplierListActivity.this, ScanCodeActivity.class));
                startActivityForResult(new Intent(SupplierListActivity.this, CaptureActivity.class), requestCode);
                break;
            case R.id.tv_searchSuppliers:
                search();
                break;
        }
    }

    private void search() {

        boolean flag;
        boolean storein = true;
        boolean suppliy = false;

        String url;
        String str = etSearchBar.getText().toString();
        ArrayMap<String, String> params = new ArrayMap<>();

        if (str.isEmpty()) {
            return;
        }

        if (Tools.isStoreInID(str)) {
//            查询入库单
            flag = storein;
            url = GlobalContants.URL_STORE_IN_LIST;

            params.put("key_words", str);
        } else {
//            查询供应商
            flag = suppliy;
            url = GlobalContants.URL_SEARCH_SUPPLY;

            params.put("kw_code", str);
        }

        params.put("token", BaseApplication.getLoginBean().getData().getToken());
        doSearch(params, url, flag);


    }

    private void doSearch(final ArrayMap<String, String> params, final String url, final boolean flag) {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
//                System.out.println("aaa url:" + url);
//                System.out.println("aaa json:" + response);
                Gson gson = new Gson();
                if (flag) {
                    StoreInListBySupplierBean storeInListBySupplierBean = gson.fromJson(response, StoreInListBySupplierBean.class);
                    if (200 == storeInListBySupplierBean.getCode()) {
                        if (storeInListBySupplierBean.getData().getStore_in_list().get(0).getStatus().equals(2 + "")) {
                            Intent intent = new Intent(SupplierListActivity.this, StoreInDetilsActivity.class);
                            intent.putExtra("StoreInId", storeInListBySupplierBean.getData().getStore_in_list().get(0).getId());
                            startActivity(intent);
                        } else {
                            Toast.makeText(SupplierListActivity.this, "该入库单不是待验收状态！", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(SupplierListActivity.this, storeInListBySupplierBean.getMsg(), Toast.LENGTH_SHORT).show();
                    }

                } else {
                    SeachSupplyByKeyBean seachSupplyByKeyBean = gson.fromJson(response, SeachSupplyByKeyBean.class);
                    if (200 == seachSupplyByKeyBean.getCode()) {
                        suppliersList.clear();

                        List<SeachSupplyByKeyBean.DataBean> data = seachSupplyByKeyBean.getData();
                        for (SeachSupplyByKeyBean.DataBean dataBean : data) {
                            SuppliersListBean.DataBean.StoreInListBean storeInListBean = new SuppliersListBean.DataBean.StoreInListBean();
                            storeInListBean.setSupply_id(dataBean.getId());
                            storeInListBean.setSupply_name(dataBean.getName());
                            storeInListBean.setCount(-1);
                            storeInListBean.setSupply_code("");
                            suppliersList.add(storeInListBean);
                        }
                        suppliersAdapter.notifyDataSetChanged();
                    } else {
                        Toast.makeText(SupplierListActivity.this, seachSupplyByKeyBean.getMsg(), Toast.LENGTH_SHORT).show();
                    }

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
//                System.out.println("aaa params:" + params);
                return params;
            }
        };

        BaseApplication.getRequestQueue().add(stringRequest);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == this.requestCode && resultCode == RESULT_OK && null != data) {
            String resultString = data.getStringExtra("result");
            String storeInId = resultString.substring(resultString.indexOf("=") + 1);
            Intent intent = new Intent(SupplierListActivity.this, StoreInDetilsActivity.class);
            intent.putExtra("StoreInId", storeInId);
            startActivity(intent);

        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onResume() {
        super.onResume();
        xrvSupplierList.refresh();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        BaseApplication.getRequestQueue().cancelAll("SupplierListActivity");
    }


    @Override
    public void onRefresh() {

        page = 1;
        initData();
        xrvSupplierList.setLoadingMoreEnabled(true);
    }

    @Override
    public void onLoadMore() {

        page++;
        Flag_LoadMore = true;
        initData();
    }
}
