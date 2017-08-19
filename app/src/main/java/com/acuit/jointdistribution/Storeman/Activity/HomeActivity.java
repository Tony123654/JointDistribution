package com.acuit.jointdistribution.Storeman.Activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Fragment.ContentFragment;

/**
 * 类名: HomeActivity <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/18 12:05 <p>
 * 描述:  保管员角色主页
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class HomeActivity extends BaseActivity {

    private static final String FRAG_CONTENT = "frag_content";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home);

        initFragment();

    }

    private void initFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fl_main, new ContentFragment(HomeActivity.this));
        ft.commit();

    }
    public ContentFragment getContentFragment() {
        FragmentManager fm = getSupportFragmentManager();
        ContentFragment fragment = (ContentFragment) fm.findFragmentByTag(FRAG_CONTENT);
        return fragment;
    }


}
