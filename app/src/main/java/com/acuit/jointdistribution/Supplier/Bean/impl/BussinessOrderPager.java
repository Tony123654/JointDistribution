package com.acuit.jointdistribution.Supplier.Bean.impl;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Base.BasePager;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Acitivity.PurchaseChangedActivity;
import com.acuit.jointdistribution.Supplier.Bean.BaseMenuDetailPager;

import java.util.ArrayList;

/**
 * 业务订单
 */
public class BussinessOrderPager extends BasePager {

	private ArrayList<BaseMenuDetailPager> mPagers;
	private View view;

	public BussinessOrderPager(Activity activity) {
		super(activity);
	}

	@Override
	public void initData() {


//		给空的帧布局动态添加布局对象
//				TextView view = new TextView(mActivity);
//				view.setTextSize(22);
//				view.setTextColor(Color.GREEN);
//				view.setGravity(Gravity.CENTER);//居中显示
//              view.setText("业务订单");
		view = View.inflate(mActivity, R.layout.order_business,null);

				flContainer.addView(view);//给帧布局添加对象

        TextView purchase = (TextView) view.findViewById(R.id.tv_purchase);

//		       tvTitle.setText("业务订单");

        purchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mActivity.startActivity(new Intent(BaseApplication.getContext(), PurchaseChangedActivity.class));
            }
        });


	}
}