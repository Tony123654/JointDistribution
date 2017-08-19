package com.acuit.jointdistribution.Common.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Acitivity.HomeActivity;

import static com.acuit.jointdistribution.R.id.et_mm;
import static com.acuit.jointdistribution.R.id.et_zh;

/**
 * 登录
 * <p>
 * <p>
 * 修改人：yanj
 * 修改时间：2017-08-17 11:49:57
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etAccount;
    private EditText etPsw;
    private Button btnLogin;
    private String account;
    private String pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etAccount = (EditText) findViewById(et_zh);
        etPsw = (EditText) findViewById(et_mm);
        btnLogin = (Button) findViewById(R.id.btn);

        btnLogin.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        account = etAccount.getText().toString();
        pwd = etPsw.getText().toString();

        if (account.isEmpty()) {
            Toast.makeText(this, "账户不能为空", Toast.LENGTH_SHORT).show();
        }
        if (pwd.isEmpty()) {
            Toast.makeText(this, "密码不能为空", Toast.LENGTH_SHORT).show();
        }





        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);



        startActivity(intent);
    }
}
