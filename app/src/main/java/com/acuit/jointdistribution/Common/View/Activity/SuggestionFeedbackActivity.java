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
import android.widget.TextView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Bean.CodeAndMsg;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.R;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import java.util.Map;

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
    private ImageView ivBack;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion_feedback);

        initView();

        initData();

        initEvent();

    }

    private void initView() {

        ivBack = (ImageView) findViewById(R.id.iv_back);
        tvSize = (TextView) findViewById(R.id.tv_sizeOfSuggestion);
        etSuggestion = (EditText) findViewById(R.id.et_suggestion);
        btnSubmit = (Button) findViewById(R.id.btn_submitPwd);
    }

    private void initData() {

    }

    private void initEvent() {
        ivBack.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);
        etSuggestion.addTextChangedListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
                onBackPressed();
                break;
            case R.id.btn_submitPwd:
                if (6 < Integer.parseInt(tvSize.getText().toString())) {
                    submit();
                } else {
                    Toast.makeText(this, "请描述得更详细一点吧。", Toast.LENGTH_SHORT).show();
                }
                break;
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


    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    /**
     * 提交意见（内容不多，未采用mvp）
     */
    private void submit() {

//        提交反馈意见
        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_SUBMIT_SUGGESTION, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Gson gson = new Gson();
                CodeAndMsg codeAndMsg = gson.fromJson(response, CodeAndMsg.class);

//                    登录成功
                if (200 == codeAndMsg.getCode()) {
                    Toast.makeText(SuggestionFeedbackActivity.this, codeAndMsg.getMsg(), Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(SuggestionFeedbackActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                ArrayMap<String, String> params = new ArrayMap<>();
//                token	string	网页调用可不传
//                brief	String	意见内容
//                name	String	意见标题

                params.put("passwtokenord", BaseApplication.getLoginBean().getData().getToken());
                params.put("brief", etSuggestion.getText().toString());
                params.put("name", "");

                return params;
            }
        };

        stringRequest.setTag("SuggestionFeedbackActivity");
        BaseApplication.getRequestQueue().add(stringRequest);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        BaseApplication.getRequestQueue().cancelAll("SuggestionFeedbackActivity");
    }
}
