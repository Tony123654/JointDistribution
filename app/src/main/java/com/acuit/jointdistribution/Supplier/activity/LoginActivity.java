package com.acuit.jointdistribution.Supplier.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.acuit.jointdistribution.R;

import static com.acuit.jointdistribution.R.id.et_mm;
import static com.acuit.jointdistribution.R.id.et_zh;

/**
 * 登录
 */
public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText passWord;
    private Button btn;
    private String user_name;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(et_zh);
        passWord = (EditText) findViewById(et_mm);
        btn = (Button) findViewById(R.id.btn);
    }
       public void Login(View v){

           startActivity(new Intent(LoginActivity.this, com.acuit.jointdistribution.Supplier.activity.HomeActivity.class));


       }

}
