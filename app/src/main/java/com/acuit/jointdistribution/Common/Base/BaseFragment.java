package com.acuit.jointdistribution.Common.Base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 类名: BaseFragment <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/8/8  16:49 <p>
 * 描述:Fragment基类
 * <p>
 * 更新人: YanJ<p>
 * 更新时间: 2017-09-01 11:38<p>
 * 更新描述:首页 页面嵌套 Fragment基类 <p>
 */

public abstract class BaseFragment extends Fragment {

    public Activity mActivity;
    public View mRootView;

    public BaseFragment(Activity mActivity) {
        this.mActivity = mActivity;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
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
