package com.acuit.jointdistribution.Supplier.bean.impl;

import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

import com.acuit.jointdistribution.Supplier.bean.BasePager;
/**
 * 首页
 */

/**
 * 首页
 */
public class HomePager extends BasePager {

	public HomePager(Activity activity) {
		super(activity);
	}

	@Override
	public void initData() {

		//给空的帧布局动态添加布局对象
		TextView view = new TextView(mActivity);
		view.setTextSize(22);
		view.setTextColor(Color.RED);
		view.setGravity(Gravity.CENTER);
		view.setText("首页");

	}
}
