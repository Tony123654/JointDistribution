package com.acuit.jointdistribution.Supplier.Bean.impl;

import android.app.Activity;
import android.view.View;

import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Bean.BasePager;

/**
 *统计分析
 */


public class StatisticalAnalysisPager extends BasePager {
	public Activity mActivity;
private View view;
	public StatisticalAnalysisPager(Activity activity) {
		super(activity);
		 mActivity = activity;
	}

	@Override
	public void initData() {

		//给空的帧布局动态添加布局对象
//		TextView view = new TextView(mActivity);
//		view.setTextSize(22);
//		view.setTextColor(Color.GREEN);
//		view.setGravity(Gravity.CENTER);//居中显示
//		view.setText("统计分析");
		view = View.inflate(mActivity, R.layout.analysis_statistic,null);

		flContainer.addView(view);//给帧布局添加对象

		//修改标题
		tvTitle.setText("统计分析");
	}

}
