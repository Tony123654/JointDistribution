package com.acuit.jointdistribution.Common.Base;

import android.support.v7.app.AppCompatActivity;

import com.squareup.leakcanary.RefWatcher;

/**
 * 类名: BaseActivity <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017-08-18 09:51 <p>
 * 描述: Activity的基类，用于添加activity中的通用方法
 *        整合了内存泄漏工具LeakCanary
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class BaseActivity extends AppCompatActivity {
    // TODO: 2017/7/12 BaseActivity待追加


    @Override
    public void onDestroy() {
        super.onDestroy();

//        LeakCanary内存泄漏监控
        RefWatcher refWatcher = BaseApplication.getRefWatcher();
        refWatcher.watch(this);

    }

}
