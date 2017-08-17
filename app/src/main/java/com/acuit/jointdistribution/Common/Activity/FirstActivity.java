package com.acuit.jointdistribution.Common.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.ArrayMap;

import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Utils.SharedPreference_Utils;
import com.acuit.jointdistribution.Storeman.Utils.ThreadPool_Util;

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

public class FirstActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        dispatchActivity();
    }



    private void dispatchActivity() {

        ArrayMap<String, String> configs = (SharedPreference_Utils.getInstance(this)).getConfigs();

        Intent intent = null;

        // TODO: 2017/8/17  获取数据判断
//        if (configs.get(SharedPreference_Utils.KEY_DB_IP).isEmpty()||configs.get(SharedPreference_Utils.KEY_REMOTE_SERVER_IP).isEmpty()) {
////        if(true){
//            System.out.println("aaa 帐号记录为空，进入登录页面");
////            未设置前置机、服务器
////            初次打开，进入设置模块登录界面
//            intent = new Intent(this, LoginActivity.class);
//
//        } else {
////            非初次，获取参数信息，直接进入主界面 需要获取：
//            System.out.println("aaa 进入主页模块");
//            intent = new Intent(this, MainActivity.class);
//
//        }


        final Intent finalIntent = intent;
        final Handler handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                startActivity(finalIntent);
            }
        };

        ThreadPool_Util.doTask(new Runnable() {
            @Override
            public void run() {
                handler.sendMessageDelayed(Message.obtain(), 1000);
            }
        });

    }
}
