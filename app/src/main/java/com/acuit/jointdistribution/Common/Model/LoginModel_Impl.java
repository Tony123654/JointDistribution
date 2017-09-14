package com.acuit.jointdistribution.Common.Model;

import android.os.Handler;
import android.os.Message;
import android.util.ArrayMap;
import android.util.Log;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Bean.LoginBean;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.Common.Model.Interface.LoginModel_Interface;
import com.acuit.jointdistribution.Common.Presenter.LoginPresenter;
import com.acuit.jointdistribution.Common.Utils.Tools;
import com.acuit.jointdistribution.Storeman.Utils.SharedPreference_Utils;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import java.util.Map;

/**
 * 类名: LoginModel_Impl <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/19 9:10 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class LoginModel_Impl implements LoginModel_Interface {


    private String pwd;
    private String phone;
    private String account;
    private String logined;
    private LoginPresenter presenter;


    public static final int TAG_LOGIN = 0;
    public static final int TAG_SUPPLIER = 1;
    public static final int TAG_HOME = 2;

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case TAG_LOGIN:
                    presenter.startLoginActivity(account);
                    break;
                case TAG_HOME:
                    presenter.startHomepage();
                    break;
            }

        }
    };


    public LoginModel_Impl(LoginPresenter presenter) {
        this.presenter = presenter;
    }

    private void saveUserInfo() {
        ArrayMap<String, String> userInfo = new ArrayMap<>();

        userInfo.put(SharedPreference_Utils.KEY_ACCOUNT, account);
        userInfo.put(SharedPreference_Utils.KEY_LOGINED, "true");
        userInfo.put(SharedPreference_Utils.KEY_PHONE, phone);
        userInfo.put(SharedPreference_Utils.KEY_PWD, pwd);
        SharedPreference_Utils.setValues(userInfo);

        Tools.judgeRole();
    }

    @Override
    public void startLoginActivity(int daley) {
        Message msg = Message.obtain();
        msg.what = TAG_LOGIN;
        handler.sendMessageDelayed(msg, daley);
    }

    /**
     * 查看sharedPrefrence是否存有登录账户
     *
     * @return 有账户返回true
     */
    @Override
    public boolean chickHistory() {
        getUserInfo();
        if (null != logined && logined.equals("true")) {
            return true;
        }
        return false;
    }

    /**
     * 获取登录账户记录
     *
     * @return
     */
    public boolean getUserInfo() {

        try {
            ArrayMap<String, String> userInfo = SharedPreference_Utils.getConfigs();

            pwd = userInfo.get(SharedPreference_Utils.KEY_PWD);
            phone = userInfo.get(SharedPreference_Utils.KEY_PHONE);
            account = userInfo.get(SharedPreference_Utils.KEY_ACCOUNT);
            logined = userInfo.get(SharedPreference_Utils.KEY_LOGINED);
        } catch (Exception e) {
            Log.e("aaa", "getUserInfo: " + e.getMessage());
            return false;
        }
        return true;
    }


    @Override
    public void login(String account, String phone, String pwd) {
        this.account = account;
        this.phone = phone;
        this.pwd = pwd;

        login();
    }

    @Override
    public void login() {

//            分账户和手机号登录，根据登录结果dispatch页面

        String login_url = null;
        if (null == phone || phone.isEmpty()) {
            login_url = GlobalContants.URL_LOGIN_BY_USERNAME;
        } else {
            // TODO: 2017/8/19 手机号码登陆
//            login_url = GlobalContants.URL_LOGIN_BY_PHONE;
            presenter.showToast("暂未开放手机号码登录，敬请期待");
        }


        StringRequest stringRequest = new StringRequest(Request.Method.POST, login_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                LoginBean loginBean = gson.fromJson(response, LoginBean.class);

//                    登录成功
                if (200 == loginBean.getCode()) {

                    BaseApplication.setLoginBean(loginBean);

                    Message msg = Message.obtain();
                    msg.what = TAG_HOME;
                    handler.sendMessageDelayed(msg, 1000);

                    saveUserInfo();

                } else {
//                        登录失败
                    presenter.showToast(loginBean.getMsg());

                    startLoginActivity(1000);
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                if (null == error.getMessage()) {
                    presenter.showToast("无法登录，请检查网络环境");
                } else {
                    presenter.showToast(error.getMessage());
                }
                startLoginActivity(1000);
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                ArrayMap<String, String> params = new ArrayMap<>();

                // TODO: 2017/8/19 手机号码登录
                params.put("username", account);
                params.put("password", pwd);

                return params;
            }
        };

        stringRequest.setTag("LoginActivity");
        BaseApplication.getRequestQueue().add(stringRequest);

    }


}
