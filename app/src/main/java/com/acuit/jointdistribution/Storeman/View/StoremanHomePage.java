package com.acuit.jointdistribution.Storeman.View;

import android.app.Activity;
import android.content.Intent;
import android.util.ArrayMap;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Base.BasePager;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Bean.DeliverSupliersDataBean;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.zxing.activity.CaptureActivity;

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

    private TextView tvMessageCenter;
    private Button btnCheckOrder;
    private Button btnEvaluateOrder;
    private TextView tvWaitDistribution;
    private TextView tvHaventDistribution;
    private TextView tvParticalDistribution;
    private TextView tvParticalDeliver;
    private TextView tvHaventDeliver;
    private TextView tvDelivering;
    private TextView tvScanCode;
    public final static int requestCode = 4564;

    public StoremanHomePage(Activity activity) {
        super(activity);

    }

    @Override
    public void initData() {

        View view = View.inflate(mActivity, R.layout.page_home_storeman, null);
        flContainer.addView(view);

        tvScanCode = (TextView) view.findViewById(R.id.tv_scan_code);
        btnCheckOrder = (Button) view.findViewById(R.id.btn_checkOrder);
        btnEvaluateOrder = (Button) view.findViewById(R.id.btn_evaluateOrder);
        tvMessageCenter = (TextView) view.findViewById(R.id.tv_messageCenter);

        tvDelivering = (TextView) view.findViewById(R.id.tv_delivering);
        tvHaventDeliver = (TextView) view.findViewById(R.id.tv_haventDeliver);
        tvParticalDeliver = (TextView) view.findViewById(R.id.tv_particalDeliver);

        tvWaitDistribution = (TextView) view.findViewById(R.id.tv_waitDistribution);
        tvHaventDistribution = (TextView) view.findViewById(R.id.tv_haventDistribution);
        tvParticalDistribution = (TextView) view.findViewById(R.id.tv_particalDistribution);

        tvScanCode.setOnClickListener(this);
        btnCheckOrder.setOnClickListener(this);
        tvMessageCenter.setOnClickListener(this);
        btnEvaluateOrder.setOnClickListener(this);

        setText();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_scan_code:
                mActivity.startActivityForResult(new Intent(mActivity, CaptureActivity.class), requestCode);
                break;
            case R.id.btn_checkOrder:
                mActivity.startActivity(new Intent(mActivity, SupplierListActivity.class));
                break;
            case R.id.tv_messageCenter:
                // TODO: 2017/8/28 消息中心
                break;
            case R.id.btn_evaluateOrder:
//                评价订单
                break;
        }
    }

    /**
     * 获取展示数据，设置给页面
     */
    private void setText() {

        String dataUrl = BaseApplication.getLoginBean().getData().getUser_info().getRole_page().get(0).getAjax_url();
        if (null != dataUrl && !dataUrl.isEmpty()) {
            String sotreUrl = "";
            String supplyUrl = "";
            String[] ajaxUrl = dataUrl.split(",");
            for (String str : ajaxUrl) {
                if (str.contains("store")) {
                    sotreUrl = GlobalContants.BASE_URL + str;
                }
                if (str.contains("supply")) {
                    supplyUrl = GlobalContants.BASE_URL + str;
                }
            }

            getData(sotreUrl);
            getData(supplyUrl);

        }

    }

    private void getData(final String url) {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Gson gson = new Gson();
                DeliverSupliersDataBean deliverSupliersDataBean = gson.fromJson(response, DeliverSupliersDataBean.class);

                if (200 == deliverSupliersDataBean.getCode()) {
                    if (url.contains("supply")) {
                        tvDelivering.setText(deliverSupliersDataBean.getData().getData().get(0).getValue() + "");
                        tvHaventDeliver.setText(deliverSupliersDataBean.getData().getData().get(1).getValue() + "");
                        tvParticalDeliver.setText(deliverSupliersDataBean.getData().getData().get(2).getValue() + "");
                    } else if (url.contains("store")) {
                        tvWaitDistribution.setText(deliverSupliersDataBean.getData().getData().get(0).getValue() + "");
                        tvHaventDistribution.setText(deliverSupliersDataBean.getData().getData().get(1).getValue() + "");
                        tvParticalDistribution.setText(deliverSupliersDataBean.getData().getData().get(2).getValue() + "");
                    }
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
                ArrayMap<String, String> params = new ArrayMap<>();
                params.put("token", BaseApplication.getLoginBean().getData().getToken());

                return params;
            }
        };

        stringRequest.setTag("HomeActivity");
        BaseApplication.getRequestQueue().add(stringRequest);
    }

}
