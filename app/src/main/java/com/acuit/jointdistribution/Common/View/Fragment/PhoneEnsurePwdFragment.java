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
import com.acuit.jointdistribution.Common.Bean.CodeAndMsg;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.Common.Utils.EncodeUtils;
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
 * 描述:  绑定手机模块——手机号输入界面
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class PhoneEnsurePwdFragment extends Fragment implements View.OnClickListener {

    private BindPhoneActivity mActivity;
    private Button btnSubmit;
    private EditText etEnsurePwd;

    public PhoneEnsurePwdFragment(BindPhoneActivity mActivity) {
        this.mActivity = mActivity;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bind_phone_ensurepwd, null);

        etEnsurePwd = (EditText) view.findViewById(R.id.et_ensurePwd);
        btnSubmit = (Button) view.findViewById(R.id.btn_submit);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mActivity.setTvTitle("输入密码");
        etEnsurePwd.requestFocus();

        InputMethodManager imm = (InputMethodManager) mActivity.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);

        btnSubmit.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        String pwd = etEnsurePwd.getText().toString();
//        密码验证
        if (pwd.isEmpty()) {
            Toast.makeText(mActivity, "请输入密码", Toast.LENGTH_SHORT).show();
        } else {

            String md5Pwd = EncodeUtils.md5(pwd);

            checkPwd(md5Pwd);

        }

    }

    private void checkPwd(final String md5Pwd) {
        RequestQueue requestQueue = BaseApplication.getRequestQueue();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_CHECK_PWD, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                CodeAndMsg codeAndMsg = gson.fromJson(response, CodeAndMsg.class);
                if (200 == codeAndMsg.getCode()) {
//          --------------------密码正确，跳转----------------
                    FragmentManager fragmentManager = mActivity.getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fl_contentBindPhone, new PhoneInexistenetFragment(mActivity));
                    fragmentTransaction.commit();

                }
                Toast.makeText(mActivity, codeAndMsg.getMsg(), Toast.LENGTH_SHORT).show();

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
                params.put("old_pwd", md5Pwd);

                return params;
            }
        };

        stringRequest.setTag("BindPhoneActivity");
        requestQueue.add(stringRequest);
    }


}
