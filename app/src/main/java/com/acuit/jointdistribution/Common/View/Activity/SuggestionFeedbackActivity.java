package com.acuit.jointdistribution.Common.View.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.R;

/**
 * 类名: SuggestionFeedbackActivity <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/23 14:39 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class SuggestionFeedbackActivity extends BaseActivity implements View.OnClickListener, TextWatcher {

    private EditText etSuggestion;
    private TextView tvSize;
    private Button btnSubmit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion_feedback);

        initView();

        initData();

        initEvent();

    }

    private void initView() {

        tvSize = (TextView) findViewById(R.id.tv_sizeOfSuggestion);
        etSuggestion = (EditText) findViewById(R.id.et_suggestion);
        btnSubmit = (Button) findViewById(R.id.btn_submitSuggestion);
    }

    private void initData() {

    }

    private void initEvent() {
        btnSubmit.setOnClickListener(this);
        etSuggestion.addTextChangedListener(this);
    }


    @Override
    public void onClick(View v) {
        if (6 < Integer.parseInt(tvSize.getText().toString())) {
            submit();
        }
    }


    //  -------------------  TextWatcher  ------------------------
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        tvSize.setText(s.length() + "");
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
    //  -------------------  TextWatcher  ------------------------


    /**
     * 提交意见（内容不多，未采用mvp）
     */
    private void submit() {
        // TODO: 2017/8/23 提交反馈意见
                
//
////        提交反馈意见
//        String login_url = GlobalContants.URL_LOGIN_BY_USERNAME;
//
//        RequestQueue requestQueue = BaseApplication.getRequestQueue();
//
//        StringRequest stringRequest = new StringRequest(Request.Method.POST, login_url, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//
//                Gson gson = new Gson();
//                LoginBean loginBean = gson.fromJson(response, LoginBean.class);
//                BaseApplication.setLoginBean(loginBean);
//
//                Message msg = Message.obtain();
////                    登录成功
//                if (200 == loginBean.getCode()) {
//
////                    msg.obj =
//                    handler.sendMessageDelayed(msg);
//
//                } else {
////                        登录失败
//                    presenter.showToast(loginBean.getMsg());
//
//                    startLoginActivity(1000);
//                }
//
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//
//                presenter.showToast(error.getMessage());
//                startLoginActivity(1000);
//            }
//        }) {
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//                ArrayMap<String, String> params = new ArrayMap<>();
//
//                params.put("username", account);
//                params.put("password", pwd);
//
//                return params;
//            }
//        };
//
//        stringRequest.setTag("login");
//        requestQueue.add(stringRequest);

    }
}
