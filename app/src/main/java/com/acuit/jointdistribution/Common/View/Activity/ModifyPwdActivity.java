package com.acuit.jointdistribution.Common.View.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.R;

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

    public String msg = "";
    public static boolean LEGAL = false;
    public static final String REGEX = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,20}$";

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

        etPwd.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    legalChick();
                }
            }
        });


        etNewPwd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().matches(REGEX)) {
                    etNewPwd.setTextColor(0xff000000);
                    etEnsurePwd.setFocusable(true);
                    etEnsurePwd.setFocusableInTouchMode(true);
                    etEnsurePwd.setHint("两次输入新密码需一致");

                } else {
                    etNewPwd.setTextColor(0xffff0000);
                    etEnsurePwd.setFocusable(false);
                    etEnsurePwd.setFocusableInTouchMode(false);
                    etEnsurePwd.setHint("新密码需为6~20位的数字字母混合");
                    LEGAL = false;
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
                    LEGAL = true;
                    btnSubmitPwd.setClickable(true);
                } else {
                    etEnsurePwd.setTextColor(0xffff0000);
                    LEGAL = false;
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
                onBackPressed();
                break;
            case R.id.btn_submitPwd:
                if (LEGAL) {
                    submitPwd();
                } else {
                    Toast.makeText(this, "新密码错误", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }


    private void submitPwd() {
        Toast.makeText(this, "修改密码成功！", Toast.LENGTH_SHORT).show();
    }


    private void legalChick() {

        LEGAL = false;
        btnSubmitPwd.setClickable(false);
        if (etPwd.getText().toString().isEmpty()) {
            Toast.makeText(this, "请输入原密码", Toast.LENGTH_SHORT).show();
            return;
        }
        if (etNewPwd.getText().toString().isEmpty()) {
            Toast.makeText(this, "请输入新密码", Toast.LENGTH_SHORT).show();
            return;
        }
        if (etEnsurePwd.getText().toString().isEmpty()) {
            Toast.makeText(this, "请在此输入新密码", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!etEnsurePwd.getText().toString().equals(etNewPwd.getText().toString())) {
            Toast.makeText(this, "两次新密码需要一致", Toast.LENGTH_SHORT).show();
            return;
        } else {
            btnSubmitPwd.setClickable(true);
        }

    }


}
