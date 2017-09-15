package com.acuit.jointdistribution.Supplier.Bean.impl;

import android.app.Activity;
import android.view.View;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Base.BasePager;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Domain.Count_Money;
import com.acuit.jointdistribution.Supplier.Utils.ToastUtils;
import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;

/**
 * 统计分析
 */


public class StatisticalAnalysisPager extends BasePager {
    public Activity mActivity;
    private View view;
    private SimpleAdapter sim_adapter;
    private TextView day_total_money;
    private TextView day_total_count;
    private TextView week_total_money;
    private TextView week_total_count;
    private TextView month_total_money;
    private TextView month_total_count;


    public StatisticalAnalysisPager(Activity activity) {
        super(activity);
        mActivity = activity;

    }

    @Override
    public void initData() {


        view = View.inflate(mActivity, R.layout.analysis_statistic, null);

        flContainer.addView(view);

        day_total_money = (TextView) view.findViewById(R.id.day_total_money);
        day_total_count = (TextView) view.findViewById(R.id.day_total_count);
        week_total_money = (TextView) view.findViewById(R.id.week_total_money);
        week_total_count = (TextView) view.findViewById(R.id.week_total_count);
        month_total_money = (TextView) view.findViewById(R.id.month_total_money);
        month_total_count = (TextView) view.findViewById(R.id.month_total_count);


        HttpUtils http = new HttpUtils();
        RequestParams params = new RequestParams();
        params.addBodyParameter("token", BaseApplication.getLoginBean().getData().getToken());

        http.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_COUNT_ORDER_MONEY_NUMBER,params,
                new RequestCallBack<String>() {
            @Override
            public void onSuccess(ResponseInfo<String> responseInfo) {
                String result = responseInfo.result;
                Gson gson = new Gson();
                System.out.println("json:" + result);
                Count_Money count_money = gson.fromJson(result, Count_Money.class);

                //数据可以获取到就是不能显示到界面（数据类型的问题）

                day_total_money.setText(count_money.getData().getDay().getMoney());
                day_total_count.setText(count_money.getData().getDay().getCount()+"");

                week_total_money.setText(count_money.getData().getWeek().getMoney()+"");
                week_total_count.setText(count_money.getData().getWeek().getCount()+"");


                month_total_money.setText(count_money.getData().getMon().getMoney()+"");
                month_total_count.setText(count_money.getData().getMon().getCount()+"");



            }

            @Override
            public void onFailure(HttpException error, String msg) {
                ToastUtils.showToast(BaseApplication.getContext(), "网络异常");
            }
        });

    }

}


