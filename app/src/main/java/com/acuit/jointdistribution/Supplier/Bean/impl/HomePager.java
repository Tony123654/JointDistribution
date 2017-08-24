package com.acuit.jointdistribution.Supplier.Bean.impl;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Base.BasePager;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Acitivity.ReceivedActivity;
/**
 * 首页
 */

public class HomePager extends BasePager {

    private View view;
    private TextView tv_order;
    public Activity mActivity;

    public HomePager(Activity activity) {
        super(activity);
        mActivity = activity;

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
