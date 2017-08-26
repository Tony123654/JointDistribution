package com.acuit.jointdistribution.Common.View.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.View.Fragment.PhoneInexistenetFragment;
import com.acuit.jointdistribution.R;

/**
 * 类名: ForgetPwdActivity <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/26 10:00 <p>
 * 描述: 忘记密码——找回密码功能页
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class ForgetPwdActivity extends BaseActivity implements View.OnClickListener {

    private ImageView ivBack;
    private TextView tvTitle;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private String mobilePhone;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bind_phone);

        initView();

        initData();

        initEvent();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        // TODO: 2017/8/25  返回键或图标，返回之前fragment页面，当前为直接退出activity
    }

    private void initView() {

        ivBack = (ImageView) findViewById(R.id.iv_back);
        tvTitle = (TextView) findViewById(R.id.tv_title);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fl_contentBindPhone, new PhoneInexistenetFragment(this));
        fragmentTransaction.commit();

    }

    private void initData() {

    }

    private void initEvent() {

        ivBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.iv_back:
                finish();
                break;

        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        BaseApplication.getRequestQueue().cancelAll("ForgetPwdActivity");
    }


    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getTvTitle() {
        return tvTitle.getText().toString();
    }

    public void setTvTitle(String title) {
        this.tvTitle.setText(title);
    }
}
