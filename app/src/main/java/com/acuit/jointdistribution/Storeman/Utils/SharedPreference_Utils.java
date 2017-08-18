package com.acuit.jointdistribution.Storeman.Utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.ArrayMap;

import java.util.Set;

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

    public final static String KEY_PWD = "pwd";
    public final static String KEY_PHONE = "phone";
    public final static String KEY_ACCOUNT = "account";

    private static SharedPreference_Utils instance;

    private static SharedPreferences sharedPreferences;

    private static ArrayMap<String, String> configs;

    private static Context context;


    /**
     * 构造器 完成数据获取
     *
     * @param context
     */
    private SharedPreference_Utils(Context context) {
        this.context = context;
        this.sharedPreferences = context.getSharedPreferences("configs", context.MODE_PRIVATE);
        this.configs = getValuesALL();

    }

    /**
     * 获取单例
     *
     * @param context
     * @return
     */
    public synchronized static SharedPreference_Utils getInstance(Context context) {
        if (null == instance) instance = new SharedPreference_Utils(context);
        return instance;
    }


    /**
     * 从sharedPrefrence内  获取全部参数(若为空，则返回"")
     *
     * @return 返回查询集合
     */
    private static ArrayMap<String, String> getValuesALL() {

        ArrayMap<String, String> configs = new ArrayMap<>();

        configs.put(KEY_ACCOUNT, sharedPreferences.getString(KEY_ACCOUNT, ""));
        configs.put(KEY_PWD, sharedPreferences.getString(KEY_PWD, ""));
        configs.put(KEY_PHONE, sharedPreferences.getString(KEY_PHONE, ""));

        return configs;
    }

    /**
     * 获取 当前对象已经获取的 存储信息
     *
     * @return
     */
    public ArrayMap<String, String> getConfigs() {
        if (null == configs) {
            return getInstance(context).getConfigs();
        }
        return configs;
    }

    /**
     * 批量设置参数，返回操作结果
     * @param data 需要存放的键值对
     * @return 返回保存结果
     */
    public static boolean setValues(ArrayMap<String, String> data) {
        SharedPreferences.Editor edit = sharedPreferences.edit();

        Set<String> keySet = data.keySet();
        for (String s : keySet) {
            edit.putString(s, data.get(s));
            System.out.println("aaa sharedPrefrence:" + s + "  " + data.get(s));
        }
//        提交成功则更新app中config
        if (edit.commit()) {
            SharedPreference_Utils.configs = getValuesALL();
            return true;
        }
        return false;
    }

}
