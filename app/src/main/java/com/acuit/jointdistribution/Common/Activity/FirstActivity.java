package com.acuit.jointdistribution.Common.Activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.ArrayMap;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Bean.LoginBean;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Activity.MainActivity;
import com.acuit.jointdistribution.Storeman.Utils.SharedPreference_Utils;
import com.acuit.jointdistribution.Storeman.Utils.ThreadPool_Util;
import com.acuit.jointdistribution.Supplier.Acitivity.HomeActivity;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import java.util.Map;

/**
 * 类名: FirstActivity <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/17 15:49 <p>
 * 描述:  app初始界面：获取账户记录，进入不同页面
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class FirstActivity extends Activity {

    private Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        context = this;
        dispatchActivity();
    }


    private void dispatchActivity() {

        ArrayMap<String, String> configs = (SharedPreference_Utils.getInstance(this)).getConfigs();
        final String pwd = configs.get(SharedPreference_Utils.KEY_PWD);
        final String phone = configs.get(SharedPreference_Utils.KEY_PHONE);
        final String account = configs.get(SharedPreference_Utils.KEY_ACCOUNT);


        final Handler handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                startActivity((Intent) msg.obj);
                finish();
            }
        };


        // TODO: 2017/8/17  获取数据判断
        if (pwd.isEmpty() || (account.isEmpty() && phone.isEmpty())) {
//            密码为空或者（账户和手机号都为空） 进入登录界面
            Message msg = Message.obtain();
            msg.obj = new Intent(context, LoginActivity.class);
            handler.sendMessageDelayed(msg, 1000);

        } else {
//            非初次，获取参数信息，直接登录，根据登录结果dispatch页面

            String login_url = null;
            RequestQueue requestQueue = ((BaseApplication) getApplication()).getRequestQueue();

            StringRequest stringRequest = new StringRequest(Request.Method.POST, login_url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {

                    Gson gson = new Gson();
                    LoginBean loginBean = gson.fromJson(response, LoginBean.class);

                    Intent intent = null;
//                    登录成功
                    if (200 == loginBean.getCode()) {

                        loginBean.getData().getUser_info().getRoleid();

                        switch (loginBean.getData().getUser_info().getRoleid()) {
//                            角色id供应商
                            case 137 + "":
                                intent = new Intent(context, HomeActivity.class);
                                break;
//                            保管员
                            case 157 + "":
                                intent = new Intent(context, MainActivity.class);
                                break;
//                            厨师长
//                            case 154 + "":
//                                intent = new Intent(context, MainActivity.class);
//                                break;
                            default:
                                break;

                        }


                        Message msg = Message.obtain();
                        msg.obj = intent;
//                        handler.sendMessage(msg);
                        handler.sendMessageDelayed(msg, 1000);

                    } else {
//                        登录失败
                        Toast.makeText(context, loginBean.getMsg(), Toast.LENGTH_SHORT).show();
                    }

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(FirstActivity.this, "登录失败，请检查网络", Toast.LENGTH_SHORT).show();
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

    }


    /**
     * 延时跳转页面
     *
     * @param intent
     */
    private void delayJump(final Intent intent, final Handler handler) {


        ThreadPool_Util.doTask(new Runnable() {
            @Override
            public void run() {
                handler.sendMessageDelayed(Message.obtain(), 1000);
            }
        });
    }
}
