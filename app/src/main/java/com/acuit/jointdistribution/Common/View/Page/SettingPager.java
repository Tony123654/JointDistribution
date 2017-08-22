package com.acuit.jointdistribution.Common.View.Page;

import android.app.Activity;
import android.view.View;

import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Common.Base.BasePager;


/**
 * 设置
 */
public class SettingPager extends BasePager {

	private View view;

	public SettingPager(Activity activity) {
		super(activity);
	}

	@Override
	public void initData() {

		//给空的帧布局动态添加布局对象
//		TextView view = new TextView(mActivity);
//		view.setTextSize(22);
//		view.setTextColor(Color.GREEN);
//		view.setGravity(Gravity.CENTER);//居中显示
//		view.setText("设置");
		view = View.inflate(mActivity, R.layout.pager_setting, null);
		flContainer.addView(view);//给帧布局添加对象

		//修改标题
//		tvTitle.setText("设置");
	}

}
