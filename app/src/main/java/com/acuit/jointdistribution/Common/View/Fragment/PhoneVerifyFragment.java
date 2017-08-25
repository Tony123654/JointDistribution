package com.acuit.jointdistribution.Common.View.Fragment;

import android.content.Context;
import android.os.Bundle;
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

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Bean.CheckPwdBean;
import com.acuit.jointdistribution.Common.Bean.SendVerifyCodeBean;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.Common.View.Activity.BindPhoneActivity;
import com.acuit.jointdistribution.R;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
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
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class PhoneVerifyFragment extends Fragment implements View.OnClickListener {

    private BindPhoneActivity mActivity;
    private Button btnSubmit;
    private EditText etVerifyCode;
    private Button btnGetVerity;
    private SendVerifyCodeBean mVerifyCodeBean;

    public PhoneVerifyFragment(BindPhoneActivity mActivity, SendVerifyCodeBean sendVerifyCodeBean) {
        this.mActivity = mActivity;
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

        mActivity.setTvTitle("输入验证码");
        etVerifyCode.requestFocus();

        InputMethodManager imm = (InputMethodManager) mActivity.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);

        btnSubmit.setOnClickListener(this);
        btnGetVerity.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {
        String verifyCode = etVerifyCode.getText().toString();
        switch (v.getId()) {
            case R.id.btn_getVerifyCode:

                break;
            case R.id.btn_submitVerifyCode:
                if (verifyCode.isEmpty()) {
                    Toast.makeText(mActivity, "请输入验证码", Toast.LENGTH_SHORT).show();
                } else if ((System.currentTimeMillis() / 1000) > mVerifyCodeBean.getTime() + 60) {
                    Toast.makeText(mActivity, "验证码已过期，请重新获取", Toast.LENGTH_SHORT).show();
                } else if (!verifyCode.equals(mVerifyCodeBean.getVerify_code()+"")) {
                    System.out.println("aaa inputVerifyCode:"+verifyCode+"  realVerifyCode:"+mVerifyCodeBean.getVerify_code());
                    Toast.makeText(mActivity, "验证码错误", Toast.LENGTH_SHORT).show();
                    etVerifyCode.setText("");
                } else {
                    changePhone();
                }

                break;
        }
    }

    /**
     * 修改绑定的手机号
     */
    private void changePhone() {
        RequestQueue requestQueue = BaseApplication.getRequestQueue();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_BIND_PHONE, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                CheckPwdBean checkPwdBean = gson.fromJson(response, CheckPwdBean.class);

                Toast.makeText(mActivity, checkPwdBean.getMsg(), Toast.LENGTH_SHORT).show();
                if (200 == checkPwdBean.getCode()) {
                    FragmentManager fragmentManager = mActivity.getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fl_contentBindPhone, new PhoneExistFragment(mActivity));
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

        requestQueue.add(stringRequest);

    }


}
