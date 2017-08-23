package com.acuit.jointdistribution.Common.Presenter;

import android.content.Intent;
import android.util.ArrayMap;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.View.Activity.LoginActivity;
import com.acuit.jointdistribution.Common.View.Page.SettingPager;
import com.acuit.jointdistribution.Storeman.Utils.SharedPreference_Utils;

/**
 * 类名: SettingsPage_Presenter <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/22 17:15 <p>
 * 描述: 设置模块presenter
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class SettingsPage_Presenter {

    private SettingPager settingPager;

    public SettingsPage_Presenter(SettingPager context) {
        this.settingPager = context;
    }

    /**
     * 退出当前登录状态
     */
    public void quitAccount() {
        ArrayMap<String, String> data = new ArrayMap<>();
        data.put(SharedPreference_Utils.KEY_LOGINED, "false");
//        data.put(SharedPreference_Utils.KEY_ACCOUNT, "");
//        data.put(SharedPreference_Utils.KEY_PHONE, "");
//        data.put(SharedPreference_Utils.KEY_PWD, "");
        SharedPreference_Utils.setValues(data);
        BaseApplication.setLoginBean(null);
        settingPager.mActivity.startActivity(new Intent(settingPager.mActivity, LoginActivity.class));
        settingPager.mActivity.finish();
    }

}
