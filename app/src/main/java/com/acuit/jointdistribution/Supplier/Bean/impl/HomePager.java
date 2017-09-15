package com.acuit.jointdistribution.Supplier.Bean.impl;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Base.BasePager;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Acitivity.CommandActivity;
import com.acuit.jointdistribution.Supplier.Acitivity.PickingActivity;
import com.acuit.jointdistribution.Supplier.Acitivity.ReceivedActivity;
import com.acuit.jointdistribution.Supplier.Acitivity.SendActivity;
import com.acuit.jointdistribution.Supplier.Domain.BuyOrderBean;
import com.acuit.jointdistribution.Supplier.Utils.ToastUtils;
import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;

import java.util.Date;

/**
 * 首页
 */

public class HomePager extends BasePager {

    private View view;
    private TextView tv_order;
    private TextView count;
    private TextView total_money;
    private TextView picking;
    private TextView send;
    private TextView command;

    public HomePager(Activity activity) {
        super(activity);

    }


    @Override
    public void initData() {

        //给空的帧布局动态添加布局对象
//		TextView view = new TextView(mActivity);
//		view.setTextSize(22);
//		view.setTextColor(Color.GREEN);
//		view.setGravity(Gravity.CENTER);
//		view.setText("首页");
//		flContainer.addView(view);
//		tvTitle.setText("首页");

        view = View.inflate(mActivity, R.layout.pager_home, null);
        picking = (TextView) view.findViewById(R.id.tv_picking);
        send = (TextView) view.findViewById(R.id.tv_send);
        tv_order = (TextView) view.findViewById(R.id.tv_order);
        command = (TextView) view.findViewById(R.id.tv_command);
        //配货
       picking.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mActivity.startActivity(new Intent(BaseApplication.getContext(), PickingActivity.class));
           }
       });
        //发货
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivity.startActivity(new Intent(BaseApplication.getContext(), SendActivity.class));
            }
        });
        //评价
        command.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivity.startActivity(new Intent(BaseApplication.getContext(), CommandActivity.class));
            }
        });


        flContainer.addView(view);

        count = (TextView) view.findViewById(R.id.day_count);
        total_money = (TextView) view.findViewById(R.id.day_money);
        HttpUtils utils = new HttpUtils();
        RequestParams params = new RequestParams();
        params.addBodyParameter("token", BaseApplication.getLoginBean().getData().getToken());
        params.addBodyParameter("start_date", (new Date(0)).getTime() / 1000 + "");
        params.addBodyParameter("end_date", System.currentTimeMillis() / 1000 + "");
        params.addBodyParameter("page", "1");
        params.addBodyParameter("rows", "40");
        params.addBodyParameter("status", "2");
        utils.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_BUY_ORDER_LIST,
                params, new RequestCallBack<String>() {
                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {
                        String result = responseInfo.result;
                        Gson gson = new Gson();
                        BuyOrderBean buyOrderBean = gson.fromJson(result, BuyOrderBean.class);
                        count.setText(buyOrderBean.getData().getCount());
                        total_money.setText(buyOrderBean.getData().getTotal_money());
                    }

                    @Override
                    public void onFailure(HttpException error, String msg) {
                        ToastUtils.showToast(BaseApplication.getContext(),"网络异常"+msg);
                    }
                });

// 接单




        tv_order.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BaseApplication.getContext(), ReceivedActivity.class);

                mActivity.startActivity(intent);


            }
        });

    }


}
