package com.acuit.jointdistribution.Common.View.Activity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Utils.Tools;
import com.acuit.jointdistribution.Common.View.Fragment.ContentFragment;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.View.StoreInDetilsActivity;
import com.acuit.jointdistribution.Storeman.View.StoremanHomePage;

/**
 * 类名: HomeActivity <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/8/8 08 10:04 <p>
 * 描述: 主页面 用于不同角色替换整个页面
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class HomeActivity extends BaseActivity {

    private static final String FRAG_CONTENT = "frag_content";
    private FragmentManager fragmentManager;
    private boolean backPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initFragment();

    }

    private void initFragment() {
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.fl_main, new ContentFragment(HomeActivity.this));
        ft.commit();

//        judgePwd(getIntent().getStringExtra("pwd"));
    }

    public ContentFragment getContentFragment() {
        ContentFragment fragment = (ContentFragment) fragmentManager.findFragmentByTag(FRAG_CONTENT);
        return fragment;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        BaseApplication.getRequestQueue().cancelAll("HomeActivity");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == StoremanHomePage.requestCode && resultCode == RESULT_OK && null != data) {
            String resultString = data.getStringExtra("result");
            String storeInId = resultString.substring(resultString.indexOf("=") + 1);
            Intent intent = new Intent(this, StoreInDetilsActivity.class);
            intent.putExtra("StoreInId", storeInId);
            startActivity(intent);
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    /**
     * 根据登录密码 显示提示
     *
     * @param pwd
     */
    private void judgePwd(String pwd) {

        if (Tools.tooSimple(pwd)) {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("密码太过简单，请修改密码");
            builder.create().show();

        }

    }


    @Override
    public void onBackPressed() {

        if (backPressed) {
            super.onBackPressed();
        } else {
            Toast.makeText(HomeActivity.this, "再次点击返回将退出程序", Toast.LENGTH_SHORT).show();
            backPressed = true;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    handler.sendMessageDelayed(Message.obtain(), 3000);
                }
            }).start();
        }
    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            backPressed = false;
        }
    };
}
