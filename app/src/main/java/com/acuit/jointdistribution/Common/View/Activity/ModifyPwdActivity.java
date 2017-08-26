package com.acuit.jointdistribution.Common.View.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Bean.CodeAndMsg;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.Common.Utils.Tools;
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
 * 类名: ModifyPwdActivity <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/23 16:39 <p>
 * 描述: 设置模块——修改密码
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class ModifyPwdActivity extends BaseActivity implements View.OnClickListener {

    private EditText etEnsurePwd;
    private EditText etNewPwd;
    private EditText etPwd;
    private ImageView ivBack;
    private Button btnSubmitPwd;

    private RequestQueue requestQueue;
    private String md5Pwd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_modify_pwd);

        initView();

        initData();

        initEvent();
    }

    private void initView() {

        ivBack = (ImageView) findViewById(R.id.iv_back);

        etPwd = (EditText) findViewById(R.id.et_pwd);
        etNewPwd = (EditText) findViewById(R.id.et_newPwd);
        etEnsurePwd = (EditText) findViewById(R.id.et_ensurePwd);
        btnSubmitPwd = (Button) findViewById(R.id.btn_submitPwd);

    }

    private void initData() {

    }

    private void initEvent() {
        ivBack.setOnClickListener(this);
        btnSubmitPwd.setOnClickListener(this);

        etNewPwd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().matches(Tools.REGEX_PWD)) {
                    etNewPwd.setTextColor(0xff000000);
                    etEnsurePwd.setFocusable(true);
                    etEnsurePwd.setFocusableInTouchMode(true);
                    etEnsurePwd.setHint("两次输入新密码需一致");

                } else {
                    etNewPwd.setTextColor(0xffff0000);
                    etEnsurePwd.setFocusable(false);
                    etEnsurePwd.setFocusableInTouchMode(false);
                    etEnsurePwd.setHint("新密码需为6~20位的数字字母混合");
                    btnSubmitPwd.setClickable(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


        etEnsurePwd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().equals(etNewPwd.getText().toString())) {
                    etEnsurePwd.setTextColor(0xff000000);
                    btnSubmitPwd.setClickable(true);
                } else {
                    etEnsurePwd.setTextColor(0xffff0000);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
                onBackPressed();
                break;
            case R.id.btn_submitPwd:
                if (etPwd.getText().toString().isEmpty()) {
                    Toast.makeText(ModifyPwdActivity.this, "原密码不能为空", Toast.LENGTH_SHORT).show();
                } else if (etNewPwd.getText().toString().isEmpty()) {
                    Toast.makeText(ModifyPwdActivity.this, "新密码不能为空", Toast.LENGTH_SHORT).show();
                } else if (etEnsurePwd.getText().toString().isEmpty()) {
                    Toast.makeText(ModifyPwdActivity.this, "请再次输入新密码", Toast.LENGTH_SHORT).show();
                } else {
                    md5Pwd = Tools.md5(etPwd.getText().toString());
                    checkPwd();
                }
                break;
        }
    }


    private void checkPwd() {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_CHECK_PWD, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                CodeAndMsg codeAndMsg = gson.fromJson(response, CodeAndMsg.class);

                if (200 == codeAndMsg.getCode()) {
                    updatePwd();
                } else {
                    Toast.makeText(ModifyPwdActivity.this, codeAndMsg.getMsg(), Toast.LENGTH_SHORT).show();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ModifyPwdActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String> params = new ArrayMap<String, String>();

                params.put("token", BaseApplication.getLoginBean().getData().getToken());
                params.put("old_pwd", md5Pwd);

                return params;
            }
        };

        stringRequest.setTag("ModifyPwdActivity");
        BaseApplication.getRequestQueue().add(stringRequest);

    }

    private void updatePwd() {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_UPDATE_PWD, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println("aaa updatePwdJson:" + response);
                Gson gson = new Gson();
                CodeAndMsg codeAndMsg = gson.fromJson(response, CodeAndMsg.class);

                Toast.makeText(ModifyPwdActivity.this, codeAndMsg.getMsg(), Toast.LENGTH_SHORT).show();
                if (200 == codeAndMsg.getCode()) {
                    finish();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ModifyPwdActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String> params = new ArrayMap<String, String>();

                params.put("token", BaseApplication.getLoginBean().getData().getToken());
                params.put("new_pwd", Tools.md5(etEnsurePwd.getText().toString()));

                return params;
            }
        };

        stringRequest.setTag("ModifyPwdActivity");
        BaseApplication.getRequestQueue().add(stringRequest);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        BaseApplication.getRequestQueue().cancelAll("ModifyPwdActivity");
    }
}
