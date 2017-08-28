package com.acuit.jointdistribution.Common.View.Activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Common.View.Fragment.ContentFragment;

/**
 * 类名: HomeActivity <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/8/8 08 10:04 <p>
 * 描述: 主页面 用于不同角色替换整个页面
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class HomeActivity extends BaseActivity {

    private static final String FRAG_CONTENT = "frag_content";
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initFragment();

    }

    private void initFragment() {
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.fl_main, new ContentFragment(HomeActivity.this));
        ft.commit();

    }

    public ContentFragment getContentFragment() {
        ContentFragment fragment = (ContentFragment) fragmentManager.findFragmentByTag(FRAG_CONTENT);
        return fragment;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        BaseApplication.getRequestQueue().cancelAll("HomeActivity");
    }
}
