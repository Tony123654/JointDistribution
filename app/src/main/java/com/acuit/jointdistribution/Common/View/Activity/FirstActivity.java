package com.acuit.jointdistribution.Common.View.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Presenter.LoginPresenter;
import com.acuit.jointdistribution.R;

/**
 * 类名: FirstActivity <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/17 15:49 <p>
 * 描述:  app初始界面：获取账户记录，进入不同页面
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class FirstActivity extends Activity implements LoginView_Interface {

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        loginPresenter = new LoginPresenter(this);

    }

    @Override
    protected void onResume() {
        super.onResume();

        loginPresenter.chickHistory();
    }



    @Override
    public void startLoginActivity() {
        startActivity(new Intent(this,LoginActivity.class));
    }

    @Override
    public void startHomePage() {
        startActivity(new Intent(this,HomeActivity.class));
    }

    @Override
    public void finish() {
        super.finish();
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
