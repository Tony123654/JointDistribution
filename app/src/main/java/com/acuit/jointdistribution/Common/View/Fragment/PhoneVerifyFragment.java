package com.acuit.jointdistribution.Common.View.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Bean.CodeAndMsg;
import com.acuit.jointdistribution.Common.Bean.SendVerifyCodeBean;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.Common.View.Activity.BindPhoneActivity;
import com.acuit.jointdistribution.Common.View.Activity.ForgetPwdActivity;
import com.acuit.jointdistribution.R;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import java.util.Map;

/**
 * 类名: PhoneExistFragment <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/24 15:11 <p>
 * 描述:  绑定手机模块——验证码界面
 * <p>
 * 更新人: YanJ<p>
 * 更新时间: 2017-08-26 10:29<p>
 * 更新描述: 找回密码功能复用本页面<p>
 */

public class PhoneVerifyFragment extends Fragment implements View.OnClickListener {

    private boolean isBindPhone = true;
    private BindPhoneActivity mPhoneActivity;
    private ForgetPwdActivity mForgetActivity;
    private BaseActivity mActivity;
    private Button btnSubmit;
    private EditText etVerifyCode;
    private Button btnGetVerity;
    private SendVerifyCodeBean mVerifyCodeBean;

    public PhoneVerifyFragment(BaseActivity mActivity, SendVerifyCodeBean sendVerifyCodeBean) {
        this.mActivity = mActivity;
        if (mActivity instanceof BindPhoneActivity) {
            this.mPhoneActivity = (BindPhoneActivity) mActivity;
        } else {
            this.mForgetActivity = (ForgetPwdActivity) mActivity;
            isBindPhone = false;
        }
        this.mVerifyCodeBean = sendVerifyCodeBean;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bind_phone_checkverify, null);

        etVerifyCode = (EditText) view.findViewById(R.id.et_verifyCode);
        btnSubmit = (Button) view.findViewById(R.id.btn_submitVerifyCode);
        btnGetVerity = (Button) view.findViewById(R.id.btn_getVerifyCode);


        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        mPhoneActivity.setTvTitle("输入验证码");

        etVerifyCode.requestFocus();

        InputMethodManager imm = (InputMethodManager) mActivity.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);

        btnSubmit.setOnClickListener(this);
        btnGetVerity.setOnClickListener(this);

        btnGetVerity.setClickable(false);
        (new TimeThread()).start();
    }


    @Override
    public void onClick(View v) {
        String verifyCode = etVerifyCode.getText().toString();
        switch (v.getId()) {
            case R.id.btn_getVerifyCode:
                sendVerifyCode((String) mVerifyCodeBean.getPhone_number());
                (new TimeThread()).start();
                break;
            case R.id.btn_submitVerifyCode:
                if (verifyCode.isEmpty()) {
                    Toast.makeText(mActivity, "请输入验证码", Toast.LENGTH_SHORT).show();
                } else if ((System.currentTimeMillis() / 1000) > mVerifyCodeBean.getTime() + 60) {
                    Toast.makeText(mActivity, "验证码已过期，请重新获取", Toast.LENGTH_SHORT).show();
                } else if (!verifyCode.equals(mVerifyCodeBean.getVerify_code() + "")) {
                    Toast.makeText(mActivity, "验证码错误", Toast.LENGTH_SHORT).show();
                    etVerifyCode.setText("");
                } else {

                    if (isBindPhone) {
                        changePhone();
                    } else {
                        FragmentManager fragmentManager = mActivity.getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                        fragmentTransaction.replace(R.id.fl_contentBindPhone, new PwdUpdateFragment(mActivity, mVerifyCodeBean));

                        fragmentTransaction.commit();
                    }

                }

                break;
        }
    }

    /**
     * 修改绑定的手机号
     */
    private void changePhone() {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_BIND_PHONE, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                CodeAndMsg codeAndMsg = gson.fromJson(response, CodeAndMsg.class);

                Toast.makeText(mActivity, codeAndMsg.getMsg(), Toast.LENGTH_SHORT).show();
                if (200 == codeAndMsg.getCode()) {
                    FragmentManager fragmentManager = mActivity.getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fl_contentBindPhone, new PhoneExistFragment(mPhoneActivity));
                    fragmentTransaction.commit();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(mActivity, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String> params = new ArrayMap<String, String>();

                params.put("token", BaseApplication.getLoginBean().getData().getToken());
                params.put("phone", mVerifyCodeBean.getPhone_number() + "");

                return params;
            }
        };

        stringRequest.setTag("BindPhoneActivity");
        BaseApplication.getRequestQueue().add(stringRequest);

    }

    private int TAG_VERIFY_INVALIDATE = -1;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {

            if (TAG_VERIFY_INVALIDATE == msg.what) {

                String time = "(" + msg.arg1 + "s)";
                if ("(0s)".equals(time)) {
                    btnGetVerity.setClickable(true);
                    btnGetVerity.setText("重新获取");
                    try {
                        Thread timeThread = (Thread) msg.obj;
                        timeThread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    btnGetVerity.setText("重新获取" + time);
                }

            }

        }
    };


    private class TimeThread extends Thread {
        @Override
        public void run() {
            int time = 60;

            while (time > 0) {
                try {
                    this.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                time--;
                Message msg = Message.obtain();
                msg.what = TAG_VERIFY_INVALIDATE;
                msg.arg1 = time;
                msg.obj = this;
                handler.sendMessage(msg);
            }

        }
    }


    /**
     * 向指定手机号发送验证码
     *
     * @param phone
     */
    private void sendVerifyCode(final String phone) {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_SEND_VERIFY_TO_USER, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                SendVerifyCodeBean sendVerifyCodeBean = gson.fromJson(response, SendVerifyCodeBean.class);

                if (1 == sendVerifyCodeBean.getStatus()) {
                    Toast.makeText(mActivity, "发送成功", Toast.LENGTH_SHORT).show();
                    FragmentManager fragmentManager = mActivity.getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fl_contentBindPhone, new PhoneVerifyFragment(mActivity, sendVerifyCodeBean));
                    fragmentTransaction.commit();
                } else {
                    Toast.makeText(mActivity, sendVerifyCodeBean.getCode(), Toast.LENGTH_SHORT).show();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(mActivity, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String> params = new ArrayMap<String, String>();

//                params.put("token", BaseApplication.getLoginBean().getData().getToken());
                params.put("phone", phone);

                return params;
            }
        };

        if (isBindPhone) {
            stringRequest.setTag("BindPhoneActivity");
        } else {
            stringRequest.setTag("ForgetPwdActivity");
        }
        BaseApplication.getRequestQueue().add(stringRequest);
    }

}
