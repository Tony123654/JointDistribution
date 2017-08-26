package com.acuit.jointdistribution.Common.View.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.util.ArrayMap;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Bean.CodeAndMsg;
import com.acuit.jointdistribution.Common.Bean.SendVerifyCodeBean;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.Common.Utils.Tools;
import com.acuit.jointdistribution.R;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import java.util.Map;

/**
 * 类名: PwdUpdateFragment <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/26 10:39 <p>
 * 描述: 设置新密码
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class PwdUpdateFragment extends Fragment implements View.OnClickListener {

    private final SendVerifyCodeBean sendVerifyCodeBean;
    private Button btnSubmitPwd;
    private EditText etNewPwd;
    private EditText etEnsurePwd;
    private BaseActivity mActivity;

    private String md5Pwd;

    public PwdUpdateFragment(BaseActivity mActivity, SendVerifyCodeBean sendVerifyCodeBean) {
        this.mActivity = mActivity;
        this.sendVerifyCodeBean = sendVerifyCodeBean;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmetn_pwd_update, null);

        etNewPwd = (EditText) view.findViewById(R.id.et_newPwd);
        etEnsurePwd = (EditText) view.findViewById(R.id.et_ensurePwd);
        btnSubmitPwd = (Button) view.findViewById(R.id.btn_submitPwd);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


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
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        if (etNewPwd.getText().toString().isEmpty()) {
            Toast.makeText(mActivity, "新密码不能为空", Toast.LENGTH_SHORT).show();
        } else if (etEnsurePwd.getText().toString().isEmpty()) {
            Toast.makeText(mActivity, "请再次输入新密码", Toast.LENGTH_SHORT).show();
        } else {
            md5Pwd = Tools.md5(etEnsurePwd.getText().toString());
            updatePwd();
        }
    }


    private void updatePwd() {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_UPDATE_PWD_BY_PHONE, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Gson gson = new Gson();
                CodeAndMsg codeAndMsg = gson.fromJson(response, CodeAndMsg.class);

                Toast.makeText(mActivity, codeAndMsg.getMsg(), Toast.LENGTH_SHORT).show();
                if (200 == codeAndMsg.getCode()) {
                    mActivity.finish();
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

                params.put("phone", sendVerifyCodeBean.getPhone_number().toString());
                params.put("pwd", etEnsurePwd.getText().toString());

                return params;
            }
        };

        stringRequest.setTag("ForgetPwdActivity");
        BaseApplication.getRequestQueue().add(stringRequest);
    }

}
