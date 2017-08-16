package com.acuit.jointdistribution.Supplier.Bean.impl;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Bean.BasePager;
/**
 * 首页
 */

/**
 * 首页
 */
public class HomePager extends BasePager {

	private View view;
	private TextView jiedan;

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
		jiedan = (TextView) view.findViewById(R.id.tv_jiedan);

	}


}
