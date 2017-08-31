package com.acuit.jointdistribution.Storeman.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.Common.Utils.Tools;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Adapter.StoreInGoodsAdapter;
import com.acuit.jointdistribution.Storeman.Bean.StoreInDetailBean;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 类名: StoreInDetilsActivity <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/29 11:57 <p>
 * 描述: 入库单详情页
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class StoreInDetilsActivity extends BaseActivity implements View.OnClickListener {


    private TextView tvSave;
    private ImageView ivBack;
    private ImageView ivMore;
    private String storeInId;
    private TextView tvChecked;
    private TextView tvOrderId;
    private TextView tvPlanDate;
    private RecyclerView rvGoods;
    private TextView tvStoreInDep;
    private TextView tvSupplierName;
    private TextView tvStraghtOutDep;
    private TextView tvContacterName;
    private TextView tvContacterPhone;
    private List<StoreInDetailBean.DataBean.ListBean> goodsList = new ArrayList<StoreInDetailBean.DataBean.ListBean>();
    private StoreInDetailBean storeInDetailBean = null;
    private StoreInGoodsAdapter storeInGoodsAdapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storein_detiles);

        initView();
        getData();
        initEvent();

    }

    private void initView() {

        tvSave = (TextView) findViewById(R.id.tv_save);
        ivBack = (ImageView) findViewById(R.id.iv_back);
        ivMore = (ImageView) findViewById(R.id.iv_more);
        tvChecked = (TextView) findViewById(R.id.tv_check);
        tvOrderId = (TextView) findViewById(R.id.tv_orderId);
        tvPlanDate = (TextView) findViewById(R.id.tv_planDate);
        rvGoods = (RecyclerView) findViewById(R.id.rv_goodsList);
        tvStoreInDep = (TextView) findViewById(R.id.tv_storeInDep);
        tvSupplierName = (TextView) findViewById(R.id.tv_supplierName);
        tvStraghtOutDep = (TextView) findViewById(R.id.tv_straghtOutDep);
        tvContacterName = (TextView) findViewById(R.id.tv_contacterName);
        tvContacterPhone = (TextView) findViewById(R.id.tv_contacterPhone);

    }


    private void initEvent() {

        ivBack.setOnClickListener(this);
        ivMore.setOnClickListener(this);

        tvSave.setOnClickListener(this);
        tvChecked.setOnClickListener(this);

        // TODO: 2017/8/30  下拉刷新，上拉加载
    }

//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        moveTaskToBack(true);
//    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
//                onBackPressed();
                finish();
                break;
            case R.id.iv_more:
//                startActivity(new Intent(StoreInDetilsActivity.this, ScanCodeActivity.class));
                break;


        }
    }


    private void getData() {

        storeInId = getIntent().getStringExtra("StoreInId");

        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_STOREIN_DETAIL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                storeInDetailBean = gson.fromJson(response, StoreInDetailBean.class);
//                    登录成功
                if (200 == storeInDetailBean.getCode()) {
                    initData();
                }
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                if (null == error.getMessage()) {
                    Toast.makeText(StoreInDetilsActivity.this, "无法获取信息，请检查网络环境", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(StoreInDetilsActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                ArrayMap<String, String> params = new ArrayMap<String, String>();

                params.put("token", BaseApplication.getLoginBean().getData().getToken());
                params.put("id", storeInId);

                return params;
            }
        };

        stringRequest.setTag("StoreInListActivity");
        BaseApplication.getRequestQueue().add(stringRequest);
    }

    private void initData() {
        if (null != storeInDetailBean) {

            tvOrderId.setText(storeInDetailBean.getData().get(0).getCode());

            tvStoreInDep.setText(storeInDetailBean.getData().get(0).getDep_name2());
            tvSupplierName.setText(storeInDetailBean.getData().get(0).getSupply_name());
            tvContacterName.setText(storeInDetailBean.getData().get(0).getContact_person());
            tvContacterPhone.setText("【" + storeInDetailBean.getData().get(0).getContact_phone() + "】");
            tvPlanDate.setText(Tools.getSimpleFormatedTime(storeInDetailBean.getData().get(0).getPlan_date()));

            goodsList.clear();
            goodsList.addAll(storeInDetailBean.getData().get(0).getList());
            initAdapter();
        }
    }

    private void initAdapter() {

        rvGoods.setHasFixedSize(true);
        rvGoods.setLayoutManager(new GridLayoutManager(this, 3));
        // TODO: 2017/8/30 RecyclerView添加分隔线 rvGoods.addItemDecoration();

        if (0 != goodsList.size()) {

            storeInGoodsAdapter = new StoreInGoodsAdapter(goodsList, StoreInDetilsActivity.this);
            rvGoods.setAdapter(storeInGoodsAdapter);

        } else {
            Toast.makeText(StoreInDetilsActivity.this, "没有数据", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        BaseApplication.getRequestQueue().cancelAll("StoreInDetilsActivity");
    }

}
