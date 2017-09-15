package com.acuit.jointdistribution.Supplier.Acitivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Domain.BuyOrderInfoBean;
import com.acuit.jointdistribution.Supplier.Utils.ToastUtils;
import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;

import static com.acuit.jointdistribution.Supplier.Utils.MyHttpUtils.getHttpUtils;

public class SendInfoActivity extends BaseActivity {
    private String id;

    private TextView createDate;
    private TextView planDate;
    private TextView contactPerson;
    private TextView contactNumber;
    private TextView price;
    private TextView code;
    private TextView stockName;
    private TextView unitName;
    private BuyOrderInfoBean sendOrderInfo;
    private TextView tv_request_dep_strs;
    private TextView tv_dep_brief_name;
    private TextView tv_dep_root_name;
    private TextView tv_total_amount;
    private TextView send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_info);
        createDate = (TextView) findViewById(R.id.tv_send_create_date);
        tv_request_dep_strs = (TextView) findViewById(R.id.tv_send_request_dep_strs);
        tv_dep_brief_name = (TextView) findViewById(R.id.tv_send_dep_brief_name);
        tv_dep_root_name = (TextView) findViewById(R.id.tv_send_dep_root_name);

        planDate = (TextView) findViewById(R.id.tv_send_plan_date);
        contactPerson = (TextView) findViewById(R.id.tv_send_contact_person);
        contactNumber = (TextView) findViewById(R.id.tv_send_contact_number);
        send = (TextView) findViewById(R.id.tv_send);

        price = (TextView) findViewById(R.id.tv_send_price);
        code = (TextView) findViewById(R.id.tv_send_code);
        stockName = (TextView) findViewById(R.id.tv_send_stock_name);
        unitName = (TextView) findViewById(R.id.tv_send_unit_name);
        tv_total_amount = (TextView) findViewById(R.id.tv_send_total_amount);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SendInfoActivity.this);
                builder.setMessage("发货成功");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });





        HttpUtils http = getHttpUtils();
        Intent intent = getIntent();
        id = intent.getStringExtra("listId");


        RequestParams params = new RequestParams();
        params.addBodyParameter("from_app", "1");
        params.addBodyParameter("token", BaseApplication.getLoginBean().getData().getToken());
        params.addBodyParameter("id", id + "");

        http.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_BUY_ORDER_DETAIL,
                params, new RequestCallBack<String>() {


                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {
                        String result = responseInfo.result;
                        System.out.println("mmm:" + result);
                        Gson gson = new Gson();
                        sendOrderInfo = gson.fromJson(result, BuyOrderInfoBean.class);

                        code.setText(sendOrderInfo.getData().getOrder_info().getCode());
                        tv_request_dep_strs.setText(sendOrderInfo.getData().getOrder_info().getRequest_dep_strs());
                        tv_dep_brief_name.setText(sendOrderInfo.getData().getOrder_info().getDep_brief_name());
                        tv_dep_root_name.setText(sendOrderInfo.getData().getOrder_info().getDep_root_name());
                        createDate.setText(sendOrderInfo.getData().getOrder_info().getCreate_date());
                        planDate.setText(sendOrderInfo.getData().getOrder_info().getPlan_date());
                        contactNumber.setText(sendOrderInfo.getData().getOrder_info().getContact_number());
                        contactPerson.setText(sendOrderInfo.getData().getOrder_info().getContact_person());
                        tv_total_amount.setText(sendOrderInfo.getData().getOrder_info().getTotal_amount()+"kg");

                        // TODO: 2017/9/11 0011 等待接口修改
//                        price.setText(sendOrderInfo.getData().getStock_list_app().get(0).getStock_name());
//                        stockName.setText(sendOrderInfo.getData().getStock_list_app().get(0).getStock_name());
//                        unitName.setText(sendOrderInfo.getData().getStock_list_app().get(0).getUnit_name());
                        stockName.setText(sendOrderInfo.getData().getStock_list_app().get(0).getStock_name());
                        unitName.setText(sendOrderInfo.getData().getStock_list_app().get(0).getUnit_name());
                        price.setText(sendOrderInfo.getData().getStock_list_app().get(0).getPrice());


                    }

                    @Override
                    public void onFailure(HttpException error, String msg) {
                        ToastUtils.showToast(getApplicationContext(), "获取数据异常");
                    }
                });

    }
}
