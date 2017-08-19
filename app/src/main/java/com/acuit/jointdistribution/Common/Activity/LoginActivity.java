package com.acuit.jointdistribution.Common.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Presenter.LoginPresenter;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Activity.MainActivity;
import com.acuit.jointdistribution.Supplier.Acitivity.HomeActivity;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();

        loginPresenter = new LoginPresenter(this);

        btnLogin.setOnClickListener(this);
    }

    private void initView() {
        etAccount = (EditText) findViewById(et_zh);
        etPsw = (EditText) findViewById(et_mm);
        btnLogin = (Button) findViewById(R.id.btn);
    }


    @Override
    public void onClick(View view) {

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
    public void startStoremanHome() {
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    public void startSupplierHome() {
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
        BaseApplication.getRequestQueue().cancelAll("login");
    }
}
