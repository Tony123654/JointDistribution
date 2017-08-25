package com.acuit.jointdistribution.Common.View.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Bean.PhoneGetBean;
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
 * 描述:  绑定手机模块——手机号已绑定
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class PhoneExistFragment extends Fragment implements View.OnClickListener {

    private BindPhoneActivity mActivity;
    private TextView tvPhone;
    private Button btnChange;

    public PhoneExistFragment(BindPhoneActivity mActivity) {
        this.mActivity = mActivity;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bind_phone_exist, null);

        tvPhone = (TextView) view.findViewById(R.id.tv_phone);
        btnChange = (Button) view.findViewById(R.id.btn_changePhone);


        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        mActivity.setTvTitle("手机绑定");

        gitPhone();

        tvPhone.setText(mActivity.getMobilePhone());

        btnChange.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = mActivity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fl_contentBindPhone, new PhoneEnsurePwdFragment(mActivity));
        fragmentTransaction.commit();

    }


    /**
     * 获取手机号
     */
    private void gitPhone() {
        RequestQueue requestQueue = BaseApplication.getRequestQueue();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_GET_PHONE, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println("aaa json:" + response);
                Gson gson = new Gson();
                PhoneGetBean phoneGetBean = gson.fromJson(response, PhoneGetBean.class);

                if (200 == phoneGetBean.getCode()) {
                    tvPhone.setText(phoneGetBean.getMobile_phone());
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

                return params;
            }
        };

        requestQueue.add(stringRequest);

    }


}
