package com.acuit.jointdistribution.Common.Presenter;

import com.acuit.jointdistribution.Common.Model.Interface.LoginModel_Interface;
import com.acuit.jointdistribution.Common.Model.LoginModel_Impl;
import com.acuit.jointdistribution.Common.View.Activity.FirstActivity;
import com.acuit.jointdistribution.Common.View.Activity.LoginActivity;
import com.acuit.jointdistribution.Common.View.Activity.LoginView_Interface;

/**
 * 类名: LoginPresenter <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/18 17:23 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class LoginPresenter {

    private LoginView_Interface mView;
    private LoginModel_Interface mModel;

    public LoginPresenter(LoginView_Interface mView) {
        this.mView = mView;
        this.mModel = new LoginModel_Impl(this);
    }


    /**
     * 检测账户记录
     */
    public void chickHistory() {
        if (mModel.chickHistory()) {
//            存在账户记录
            mModel.login();

        } else {
//            跳转登录界面
            mModel.startLoginActivity(1000);
        }
    }


    public void login(String account, String phone, String pwd) {
        mModel.login(account, phone, pwd);
    }

    public void showToast(String msg) {
        mView.showToast(msg);
    }

    /**
     * 当前为初始动画界面：需要页面跳转，结束当前页
     * 否则为登录页面，将传递的账户赋值给页面控件
     */
    public void startLoginActivity(String account) {
        if (mView instanceof FirstActivity) {
            mView.startLoginActivity();
            mView.finish();
        } else {
            ((LoginActivity) mView).initData(account);
        }
    }

    public void startStoremanHome() {
        mView.startStoremanHome();
        mView.finish();
    }

    public void startSupplierHome() {
        mView.startSupplierHome();
        mView.finish();
    }
}
