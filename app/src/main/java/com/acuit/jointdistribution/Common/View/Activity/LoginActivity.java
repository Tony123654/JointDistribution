package com.acuit.jointdistribution.Common.View.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Presenter.LoginPresenter;
import com.acuit.jointdistribution.R;

import static com.acuit.jointdistribution.R.id.et_mm;
import static com.acuit.jointdistribution.R.id.et_zh;

/**
 * 登录
 * <p>
 * <p>
 * 修改人：yanj
 * 修改时间：2017-08-19 10:49
 * 修改内容：实现登录
 */
public class LoginActivity extends AppCompatActivity implements LoginView_Interface, View.OnClickListener {

    private EditText etAccount;
    private EditText etPsw;
    private Button btnLogin;
    private String account = null;
    private String phone = null;
    private String pwd = null;
    private LoginPresenter loginPresenter;
    private TextView tvForgetPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();

        loginPresenter = new LoginPresenter(this);

        btnLogin.setOnClickListener(this);
        tvForgetPwd.setOnClickListener(this);

        loginPresenter.chickHistory();
    }

    private void initView() {
        etPsw = (EditText) findViewById(et_mm);
        etAccount = (EditText) findViewById(et_zh);
        btnLogin = (Button) findViewById(R.id.btn_login);
        tvForgetPwd = (TextView) findViewById(R.id.tv_forgetPwd);
    }

    // TODO: 2017/8/22 若存在帐号，填充（登录状态记录logined）
    public void initData(String account) {
        if (null != account && !account.isEmpty()) {
            etAccount.setText(account);
            etPsw.requestFocus();
            InputMethodManager imm = (InputMethodManager) LoginActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_login:
                login();
                break;
            case R.id.tv_forgetPwd:
                startActivity(new Intent(LoginActivity.this, ForgetPwdActivity.class));
                break;
        }

    }

    private void login() {
        account = etAccount.getText().toString();
        pwd = etPsw.getText().toString();

        if (account.isEmpty()) {
            Toast.makeText(this, "账户不能为空", Toast.LENGTH_SHORT).show();
            return;
        }
        if (pwd.isEmpty()) {
            Toast.makeText(this, "密码不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        {
//        合法性校验（11位纯数字则赋值给phone）

        }

        loginPresenter.login(account, phone, pwd);
    }


    @Override
    public void startLoginActivity() {
    }

    @Override
    public void startHomePage() {
        startActivity(new Intent(this, HomeActivity.class));
    }

    @Override
    public void finish() {
        super.finish();
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        BaseApplication.getRequestQueue().cancelAll("LoginActivity");
    }
}
