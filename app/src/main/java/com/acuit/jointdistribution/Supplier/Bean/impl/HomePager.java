package com.acuit.jointdistribution.Supplier.Bean.impl;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Base.BasePager;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Acitivity.ReceivedActivity;
import com.acuit.jointdistribution.Supplier.Domain.BuyOrderBean;
import com.acuit.jointdistribution.Supplier.Utils.ToastUtils;
import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;

/**
 * 首页
 */

public class HomePager extends BasePager {

    private View view;
    private TextView tv_order;
    private TextView count;
    private TextView total_money;

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
        flContainer.addView(view);

        count = (TextView) view.findViewById(R.id.day_count);
        total_money = (TextView) view.findViewById(R.id.day_money);
        HttpUtils utils = new HttpUtils();
        RequestParams params = new RequestParams();
        params.addBodyParameter("token",BaseApplication.getLoginBean().getData().getToken());
        params.addBodyParameter("count",count+"");
        params.addBodyParameter("total_money",total_money+"");
        utils.send(HttpRequest.HttpMethod.POST, "http://192.168.2.241/admin.php?c=Minterface&a=buy_order_list",
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


        tv_order = (TextView) view.findViewById(R.id.tv_order);



        tv_order.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BaseApplication.getContext(), ReceivedActivity.class);

                mActivity.startActivity(intent);


            }
        });

    }


}
