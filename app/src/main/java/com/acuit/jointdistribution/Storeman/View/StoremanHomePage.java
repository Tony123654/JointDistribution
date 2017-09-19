package com.acuit.jointdistribution.Storeman.View;

import android.app.Activity;
import android.content.Intent;
import android.util.ArrayMap;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Base.BasePager;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.Common.Widget.MessageImageView;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Bean.SuppliersListBean;
import com.acuit.jointdistribution.Storeman.Bean.UnaccpetOrdersAndSuppliersBean;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.zxing.activity.CaptureActivity;

import java.util.Date;
import java.util.Map;

/**
 * 类名: StoremanHomePage <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/28 10:05 <p>
 * 描述: 保管员首页
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class StoremanHomePage extends BasePager implements View.OnClickListener {

    private LinearLayout llMessageCenter;
    private LinearLayout llCheckOrder;
    private LinearLayout llEvaluateOrder;
    private TextView tvUnacceptOrderes;
    private TextView tvHaventDistribution;
    private TextView tvParticalDistribution;
    private TextView tvParticalDeliver;
    private TextView tvHaventDeliver;
    private TextView tvUnacceptSupplers;
    private TextView tvScanCode;
    public final static int requestCode = 4564;
    private MessageImageView mivCheckOrder;
    private MessageImageView mivInvaluateOrder;
    private MessageImageView mivMessageCenter;

    public StoremanHomePage(Activity activity) {
        super(activity);

    }

    @Override
    public void initData() {

        View view = View.inflate(mActivity, R.layout.page_home_storeman, null);
        flContainer.addView(view);

        tvScanCode = (TextView) view.findViewById(R.id.tv_scan_code);
        llCheckOrder = (LinearLayout) view.findViewById(R.id.ll_checkOrder);
        llEvaluateOrder = (LinearLayout) view.findViewById(R.id.ll_evaluateOrder);
        llMessageCenter = (LinearLayout) view.findViewById(R.id.tv_messageCenter);

        mivCheckOrder = (MessageImageView) view.findViewById(R.id.miv_checkOrder);
        mivMessageCenter = (MessageImageView) view.findViewById(R.id.miv_messageCenter);
        mivInvaluateOrder = (MessageImageView) view.findViewById(R.id.miv_evaluateOrder);


        tvUnacceptSupplers = (TextView) view.findViewById(R.id.tv_unaccept_supplers);
//        tvHaventDeliver = (TextView) view.findViewById(R.id.tv_haventDeliver);
//        tvParticalDeliver = (TextView) view.findViewById(R.id.tv_particalDeliver);

        tvUnacceptOrderes = (TextView) view.findViewById(R.id.tv_unaccept_orders);
//        tvHaventDistribution = (TextView) view.findViewById(R.id.tv_haventDistribution);
//        tvParticalDistribution = (TextView) view.findViewById(R.id.tv_particalDistribution);

        tvScanCode.setOnClickListener(this);
        llCheckOrder.setOnClickListener(this);
        llMessageCenter.setOnClickListener(this);
        llEvaluateOrder.setOnClickListener(this);


        getData();

        getCount();

    }

    private void setRedPoint() {

        mivMessageCenter.setCurrentMode(2);
        mivMessageCenter.setIsHaveNew(true);

        mivInvaluateOrder.setCurrentMode(3);
        mivInvaluateOrder.setMessageNumber(999);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_scan_code:
                mActivity.startActivityForResult(new Intent(mActivity, CaptureActivity.class), requestCode);
                break;
            case R.id.ll_checkOrder:
                mActivity.startActivity(new Intent(mActivity, SupplierListActivity.class));
                break;
            case R.id.tv_messageCenter:
                // TODO: 2017/8/28 消息中心
                break;
            case R.id.ll_evaluateOrder:
//                评价订单
                break;
        }
    }

    /**
     * 获取展示数据，设置给页面
     */
    private void setText() {

//        String dataUrl = BaseApplication.getLoginBean().getData().getUser_info().getRole_page().get(0).getAjax_url();
//        if (null != dataUrl && !dataUrl.isEmpty()) {
//            String sotreUrl = "";
//            String supplyUrl = "";
//            String[] ajaxUrl = dataUrl.split(",");
//            for (String str : ajaxUrl) {
//                if (str.contains("store")) {
//                    sotreUrl = GlobalContants.BASE_URL + str;
//                }
//                if (str.contains("supply")) {
//                    supplyUrl = GlobalContants.BASE_URL + str;
//                }
//            }
//
//            getData(sotreUrl);
//            getData(supplyUrl);
//
//        }

    }

    /**
     * 获取 未接单数 未接单供应商数
     */
    private void getData() {
//    private void getData(final String url) {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_UNACCEPT_ORDERS_SUPPLY, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

//                System.out.println("aaa json:" + response);
                Gson gson = new Gson();

                UnaccpetOrdersAndSuppliersBean unaccpetOrdersAndSuppliersBean = gson.fromJson(response, UnaccpetOrdersAndSuppliersBean.class);
                if (200 == unaccpetOrdersAndSuppliersBean.getCode()) {
                    tvUnacceptOrderes.setText(unaccpetOrdersAndSuppliersBean.getData().getData().get_$1().getValue() + "");
                    tvUnacceptSupplers.setText(unaccpetOrdersAndSuppliersBean.getData().getData().get_$5().getValue() + "");
                }


//                DeliverSupliersDataBean deliverSupliersDataBean = gson.fromJson(response, DeliverSupliersDataBean.class);
//                if (200 == deliverSupliersDataBean.getCode()) {
//                    if (url.contains("supply")) {
//                        tvUnacceptSupplers.setText(deliverSupliersDataBean.getData().getData().get(0).getValue() + "");
//                        tvHaventDeliver.setText(deliverSupliersDataBean.getData().getData().get(1).getValue() + "");
//                        tvParticalDeliver.setText(deliverSupliersDataBean.getData().getData().get(2).getValue() + "");
//                    } else if (url.contains("store")) {
//                        tvUnacceptOrderes.setText(deliverSupliersDataBean.getData().getData().get(0).getValue() + "");
//                        tvHaventDistribution.setText(deliverSupliersDataBean.getData().getData().get(1).getValue() + "");
//                        tvParticalDistribution.setText(deliverSupliersDataBean.getData().getData().get(2).getValue() + "");
//                    }
//                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                if (null == error.getMessage()) {
                    Toast.makeText(mActivity, "无法获取信息，请检查网络环境", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(mActivity, error.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                ArrayMap<String, String> params = new ArrayMap<>();
                params.put("token", BaseApplication.getLoginBean().getData().getToken());
                params.put("date", 0 + "");
                params.put("end_date", System.currentTimeMillis() / 1000 + "");
                params.put("phone", 1 + "");

                return params;
            }
        };

        stringRequest.setTag("HomeActivity");
        BaseApplication.getRequestQueue().add(stringRequest);
    }


    public void getCount() {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_STORE_IN_LIST, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                SuppliersListBean suppliersListBean = gson.fromJson(response, SuppliersListBean.class);
//                    登录成功
                if (200 == suppliersListBean.getCode()) {
                    mivCheckOrder.setCurrentMode(3);
                    mivCheckOrder.setMessageNumber(Integer.parseInt(suppliersListBean.getData().getTotal()));

                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                if (null == error.getMessage()) {
                    Toast.makeText(mActivity, "无法获取信息，请检查网络环境", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(mActivity, error.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                ArrayMap<String, String> params = new ArrayMap<String, String>();

                params.put("token", BaseApplication.getLoginBean().getData().getToken());
                params.put("start_date", (new Date(0)).getTime() / 1000 + "");
                params.put("end_date", System.currentTimeMillis() / 1000 + "");
                params.put("status", "2");
                params.put("get_supply_list", "1");

                return params;
            }
        };

        stringRequest.setTag("HomeActivity");
        BaseApplication.getRequestQueue().add(stringRequest);
    }
}
