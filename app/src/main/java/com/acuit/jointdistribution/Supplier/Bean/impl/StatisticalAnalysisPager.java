package com.acuit.jointdistribution.Supplier.Bean.impl;

import android.app.Activity;
import android.view.View;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Base.BasePager;
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
    private TextView count;
    private String count1;

    public StatisticalAnalysisPager(Activity activity) {
        super(activity);
        mActivity = activity;

    }

    @Override
    public void initData() {


        view = View.inflate(mActivity, R.layout.analysis_statistic, null);

        flContainer.addView(view);

        count = (TextView) view.findViewById(R.id.tv_count);

        HttpUtils http = new HttpUtils();
        RequestParams params = new RequestParams();
        params.addBodyParameter("page", "1");
        params.addBodyParameter("rows", "5");


        http.send(HttpRequest.HttpMethod.POST, "http://192.168.2.241/admin.php?c=Minterface&a=count_order_money_number", new RequestCallBack<String>() {
            @Override
            public void onSuccess(ResponseInfo<String> responseInfo) {
                String result = responseInfo.result;
                Gson gson = new Gson();
                System.out.println("json:" + result);

                Count_Money count_money = gson.fromJson(result, Count_Money.class);
                count1 = count_money.getData().getDay().getCount();

                count.setText(count1);


            }

            @Override
            public void onFailure(HttpException error, String msg) {
                ToastUtils.showToast(BaseApplication.getContext(), "网络异常");
            }
        });

    }

}


