package com.acuit.jointdistribution.bean.impl;

import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

import com.acuit.jointdistribution.bean.BaseMenuDetailPager;
import com.acuit.jointdistribution.bean.BasePager;

import java.util.ArrayList;

/**
 * 业务订单
 */
public class BussinessOrderPager extends BasePager {

	private ArrayList<BaseMenuDetailPager> mPagers;


	public BussinessOrderPager(Activity activity) {
		super(activity);
	}

	@Override
	public void initData() {


//		给空的帧布局动态添加布局对象
				TextView view = new TextView(mActivity);
				view.setTextSize(22);
				view.setTextColor(Color.GREEN);
				view.setGravity(Gravity.CENTER);//居中显示
				view.setText("首页");

				flContainer.addView(view);//给帧布局添加对象

		       tvTitle.setText("业务订单");


	}
}