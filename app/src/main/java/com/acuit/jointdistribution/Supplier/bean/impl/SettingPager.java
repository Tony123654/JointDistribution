package com.acuit.jointdistribution.Supplier.bean.impl;

import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

import com.acuit.jointdistribution.Supplier.bean.BasePager;


/**
 * 设置
 */
public class SettingPager extends BasePager {

	public SettingPager(Activity activity) {
		super(activity);
	}

	@Override
	public void initData() {

		//给空的帧布局动态添加布局对象
		TextView view = new TextView(mActivity);
		view.setTextSize(22);
		view.setTextColor(Color.GREEN);
		view.setGravity(Gravity.CENTER);//居中显示
		view.setText("设置");

		flContainer.addView(view);//给帧布局添加对象

		//修改标题
		tvTitle.setText("设置");
	}

}
