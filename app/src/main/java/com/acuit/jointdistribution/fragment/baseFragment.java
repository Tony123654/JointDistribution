package com.acuit.jointdistribution.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 类名: baseFragment <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/8/8  16:49 <p>
 * 描述:Fragment基类
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public abstract class baseFragment extends android.support.v4.app.Fragment {

    public Activity mActivity;
    public View mRootView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.print("_________________________________");
         mRootView = initViews();
        return mRootView;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    protected  void initData(){

    }
    public abstract View initViews();

}
