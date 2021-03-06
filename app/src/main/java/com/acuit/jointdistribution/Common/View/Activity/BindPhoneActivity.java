package com.acuit.jointdistribution.Common.View.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.View.Fragment.PhoneExistFragment;
import com.acuit.jointdistribution.Common.View.Fragment.PhoneInexistenetFragment;
import com.acuit.jointdistribution.R;

/**
 * 类名: BindPhoneActivity <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/24 14:12 <p>
 * 描述: 设置模块——绑定手机号码界面
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class BindPhoneActivity extends BaseActivity implements View.OnClickListener {

    private String mobilePhone;
    private ImageView ivBack;
    private TextView tvTitle;
    private FrameLayout flContent;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;


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
//        flContent = (FrameLayout) findViewById(R.id.fl_contentBindPhone);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        mobilePhone = BaseApplication.getLoginBean().getData().getUser_info().getMobile_phone();
        if (mobilePhone.isEmpty()) {
            fragmentTransaction.replace(R.id.fl_contentBindPhone, new PhoneInexistenetFragment(this));
        } else {
            fragmentTransaction.replace(R.id.fl_contentBindPhone, new PhoneExistFragment(this));
        }
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
        BaseApplication.getRequestQueue().cancelAll("BindPhoneActivity");
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
