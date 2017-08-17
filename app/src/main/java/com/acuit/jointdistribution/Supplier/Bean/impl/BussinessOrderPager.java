package com.acuit.jointdistribution.Supplier.Bean.impl;

import android.app.Activity;
import android.view.View;

import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Bean.BaseMenuDetailPager;
import com.acuit.jointdistribution.Supplier.Bean.BasePager;

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

		       tvTitle.setText("业务订单");


	}
}