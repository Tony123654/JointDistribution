package com.acuit.jointdistribution.Storeman.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.R;

/**
 * 类名: MainActivity <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/18 12:05 <p>
 * 描述:  保管员角色主页
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_context);

        initView();
    }

    private void initView() {

    }
}
