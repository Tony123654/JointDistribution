package com.acuit.jointdistribution.Storeman.View;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Base.BaseArrayList;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.Common.Utils.Tools;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Adapter.StoreInGoodsAdapter;
import com.acuit.jointdistribution.Storeman.Bean.CodeMsgDataBean;
import com.acuit.jointdistribution.Storeman.Bean.StoreInDetailBean;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import java.util.Collection;
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


    private Button btnSave;
    private ImageView ivBack;
    private ImageView ivMore;
    private String storeInId;
    private Button btnChecked;
    private TextView tvOrderId;
    private TextView tvPlanDate;
    private RecyclerView rvGoods;
    private TextView tvStoreInDep;
    private TextView tvSupplierName;
    private TextView tvStraghtOutDep;
    private TextView tvContacterName;
    private TextView tvContacterPhone;
    private StoreInGoodsAdapter storeInGoodsAdapter;
    private StoreInDetailBean storeInDetailBean = null;
    private final StoreInDetilsActivity mActivity = StoreInDetilsActivity.this;
    private BaseArrayList<StoreInDetailBean.DataBean.ListBean> goodsList = new BaseArrayList<StoreInDetailBean.DataBean.ListBean>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storein_detiles);

        initView();
        getData();
        initEvent();

    }

    private void initView() {

        btnSave = (Button) findViewById(R.id.btn_save);
        ivBack = (ImageView) findViewById(R.id.iv_back);
        ivMore = (ImageView) findViewById(R.id.iv_more);
        btnChecked = (Button) findViewById(R.id.btn_check);
        tvOrderId = (TextView) findViewById(R.id.tv_orderId);
        tvPlanDate = (TextView) findViewById(R.id.tv_planDate);
        rvGoods = (RecyclerView) findViewById(R.id.rv_goodsList);
        tvStoreInDep = (TextView) findViewById(R.id.tv_storeInDep);
        tvSupplierName = (TextView) findViewById(R.id.btn_supplierName);
        tvContacterName = (TextView) findViewById(R.id.tv_contacterName);
        tvContacterPhone = (TextView) findViewById(R.id.tv_contacterPhone);

    }


    private void initEvent() {

        ivBack.setOnClickListener(this);
        ivMore.setOnClickListener(this);

        btnSave.setOnClickListener(this);
        btnChecked.setOnClickListener(this);

        // TODO: 2017/8/30  下拉刷新，上拉加载
    }

//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        moveTaskToBack(true);
//    }


    @Override
    protected void onResume() {
        super.onResume();
        if (null != storeInGoodsAdapter) {
            storeInGoodsAdapter.notifyDataSetChanged();
        }

//        提示：不是待验收状态的——入库单
//        if (!storeInDetailBean.getData().get(0).getStatus().equals("2")) {
//            showDialog();
//        }

    }

    private void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("注意！本订单不是待验收状态！");
        builder.create().show();
    }

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
            case R.id.btn_check:
                checkStoreIn();
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
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == StoreInGoodsAdapter.REQUEST_CODE) {
            if (resultCode == GoodsEditActivity.RESULT_CODE) {
                goodsList.clear();
                goodsList.addAll((Collection<? extends StoreInDetailBean.DataBean.ListBean>) data.getSerializableExtra(GoodsEditActivity.GOODSLIST_RESULT));
                assert goodsList != null;

                storeInGoodsAdapter.notifyDataSetChanged();
            }
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    /**
     * 验收——入库
     */
    private void checkStoreIn() {


        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_SAVE_STOREIN, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println("aaa json:" + response);
                Gson gson = new Gson();
                CodeMsgDataBean codeMsgDataBean = gson.fromJson(response, CodeMsgDataBean.class);
                Toast.makeText(mActivity, codeMsgDataBean.getMsg(), Toast.LENGTH_SHORT).show();
                if (200 == codeMsgDataBean.getCode()) {
                    finish();
                }
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                if (null == error.getMessage()) {
                    Toast.makeText(StoreInDetilsActivity.this, "无法获取信息，请检查网络环境", Toast.LENGTH_SHORT).show();
                } else {
                    Log.e("aaa", "onErrorResponse: " + error.getMessage());
                }
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                ArrayMap<String, String> params = new ArrayMap<String, String>();

                params.put("is_direct_out", 1 + "");
                params.put("store_in_id", storeInDetailBean.getData().get(0).getId() + "");
                params.put("token", BaseApplication.getLoginBean().getData().getToken() + "");
                params.put("out_dep_id", storeInDetailBean.getData().get(0).getDep_id2() + "");

                for (StoreInDetailBean.DataBean.ListBean goodsBean : goodsList) {

                    params.put("back_brief[" + goodsBean.getId() + "]", "");
                    params.put("img_urls[" + goodsBean.getId() + "]", goodsBean.getPic_url() + "");
                    params.put("in_price[" + goodsBean.getId() + "]", goodsBean.getIn_price() + "");
                    params.put("buy_price[" + goodsBean.getId() + "]", goodsBean.getBuy_price() + "");
                    params.put("store_in_list_ids[" + goodsBean.getId() + "]", goodsBean.getId() + "");
                    params.put("standard[" + goodsBean.getId() + "]", goodsBean.getCheck_standard() + "");
                    params.put("price_gap_ratio[" + goodsBean.getId() + "]", goodsBean.getPrice_gap_ratio() + "");
                    params.put("already_in_amount[" + goodsBean.getId() + "]", goodsBean.getAlready_in_amount() + "");
                }

//                System.out.println("aaa params:" + params);
                return params;
            }
        };

        BaseApplication.getRequestQueue().add(stringRequest);

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        BaseApplication.getRequestQueue().cancelAll("StoreInDetilsActivity");
    }

}
