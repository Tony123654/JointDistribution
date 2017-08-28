package com.acuit.jointdistribution.Common.Base;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;

import com.acuit.jointdistribution.R;

/**
 * 4个标签页的基类
 */
public class BasePager {

	public Activity mActivity;

//	public TextView tvTitle;

	public FrameLayout flContainer;

	public View mRootView;

	public BasePager(Activity activity) {
		mActivity = activity;
		mRootView = initRootView();
	}


	public View initRootView() {

		View view = View.inflate(mActivity, R.layout.base_pager, null);

//		tvTitle = (TextView) view.findViewById(R.id.tv_title);

		flContainer = (FrameLayout) view.findViewById(R.id.fl_container);

		return view;
	}

	public void initData() {

	}

}
