package com.acuit.jointdistribution.Storeman.Utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.ArrayMap;

/**
 * 类名: SharedPreference_Utils <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/17 14:52 <p>
 * 描述:  存储：用户信息（默认登陆）
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class SharedPreference_Utils {

    private static SharedPreference_Utils instance;

    private static SharedPreferences sharedPreferences;

    private static ArrayMap<String, String> configs;

    private static Context context;

    //    构造器
    private SharedPreference_Utils(Context context) {
        this.context = context;
        this.sharedPreferences = context.getSharedPreferences("configs", context.MODE_PRIVATE);
        this.configs = getValuesALL();

    }

    //    单例
    public synchronized static SharedPreference_Utils getInstance(Context context) {
        if (null == instance) instance = new SharedPreference_Utils(context);
        return instance;
    }


    //获取全部参数(若为空，则使用URL_Util中的默认值)
    public static ArrayMap<String, String> getValuesALL() {

        ArrayMap<String, String> configs = new ArrayMap<>();
//
//        configs.put(KEY_REMOTE_SERVER_IP, sharedPreferences.getString(KEY_REMOTE_SERVER_IP, ""));
//        configs.put(KEY_REMOTE_SERVER_DEPATEMENT_CODE, sharedPreferences.getString(KEY_REMOTE_SERVER_DEPATEMENT_CODE, URL_Util.REMOTE_SERVER_DEPARTMENT_CODE_TEST));
//
//        configs.put(KEY_DB_IP, sharedPreferences.getString(KEY_DB_IP, ""));
//        configs.put(KEY_DB_PWD, sharedPreferences.getString(KEY_DB_PWD, URL_Util.DB_PWD_TEST));
//        configs.put(KEY_DB_PORT, sharedPreferences.getString(KEY_DB_PORT, URL_Util.DB_PORT_TEST));
//        configs.put(KEY_DB_NAME, sharedPreferences.getString(KEY_DB_NAME, URL_Util.DB_NAME_TEST));
//        configs.put(KEY_DB_USER, sharedPreferences.getString(KEY_DB_USER, URL_Util.DB_USER_TEST));
//        configs.put(KEY_DB_CHARATER_SET, sharedPreferences.getString(KEY_DB_CHARATER_SET, URL_Util.DB_CHARACTER_ENCODE));
//
//        // TODO: 2017/7/28 默认管理员账户
//        configs.put(KEY_ADMIN_NAME, sharedPreferences.getString(KEY_ADMIN_NAME, "admin"));
//        configs.put(KEY_ADMIN_PWD, sharedPreferences.getString(KEY_ADMIN_PWD, "admin"));


        return configs;
    }

    // TODO: 2017/8/17 获取sharedPrefrence信息
    public ArrayMap<String, String> getConfigs() {
        return null;
    }
}
