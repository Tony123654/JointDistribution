package com.acuit.jointdistribution.Supplier.bean;

import android.app.Activity;
import android.view.View;


public abstract class BaseMenuDetailPager {

	public Activity mActivity;
	public View mRootView;

	public BaseMenuDetailPager(Activity activity) {
		mActivity = activity;
		mRootView = initViews();
	}

	public abstract View initViews();

	public void initData() {

	}

}
