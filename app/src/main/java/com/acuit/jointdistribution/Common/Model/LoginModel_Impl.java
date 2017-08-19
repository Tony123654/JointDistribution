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
import com.acuit.jointdistribution.Storeman.Utils.SharedPreference_Utils;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
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
    private LoginPresenter presenter;


    public static final int TAG_LOGIN = 0;
    public static final int TAG_SUPPLIER = 1;
    public static final int TAG_STOREMAN = 2;

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case TAG_LOGIN:
                    presenter.startLoginActivity();
                    break;
                case TAG_STOREMAN:
                    presenter.startStoremanHome();
                    break;
                case TAG_SUPPLIER:
                    presenter.startSupplierHome();
                    break;
            }

        }
    };


    public LoginModel_Impl(LoginPresenter presenter) {
        this.presenter = presenter;
        getUserInfo();
    }


    public void login() {

//            非初次，获取参数信息，直接登录，根据登录结果dispatch页面

        RequestQueue requestQueue = BaseApplication.getRequestQueue();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_LOGIN, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Gson gson = new Gson();
                LoginBean loginBean = gson.fromJson(response, LoginBean.class);

                Message msg = Message.obtain();
//                    登录成功
                if (200 == loginBean.getCode()) {

                    loginBean.getData().getUser_info().getRoleid();

                    switch (loginBean.getData().getUser_info().getRoleid()) {
//                      角色id
//                            供应商
                        case 137 + "":
                            msg.what = TAG_SUPPLIER;
                            break;
//                            保管员
                        case 157 + "":
                            msg.what = TAG_STOREMAN;
                            break;
//                            厨师长
//                            case 154 + "":
//                                intent = new Intent(context, MainActivity.class);
//                                break;
                        default:
                            break;
                    }

//                        handler.sendMessage(msg);
                    handler.sendMessageDelayed(msg, 1000);

                } else {
//                        登录失败
                    presenter.showToast(loginBean.getMsg());
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                presenter.showToast("登录失败，请检查网络");
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                ArrayMap<String, String> params = new ArrayMap<>();

                params.put("username", account);
                params.put("password", pwd);

                return params;
            }
        };

        requestQueue.add(stringRequest);
        requestQueue.start();

    }

    /**
     * 查看sharedPrefrence是否存有登录账户
     * @return 有账户返回true
     */
    @Override
    public boolean chickHistory() {
        if  (pwd.isEmpty()||(account.isEmpty()&&phone.isEmpty())){
            return false;
        }
        return true;
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
        } catch (Exception e) {
            Log.e("aaa", "getUserInfo: " + e.getMessage());
            return false;
        }
        return true;
    }


}
