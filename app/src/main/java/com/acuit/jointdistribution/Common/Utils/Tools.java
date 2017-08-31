package com.acuit.jointdistribution.Common.Utils;

import android.text.TextUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 类名: Tools <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/25 15:30 <p>
 * 描述: 加密工具
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class Tools {


    public static final String REGEX_PHONE = "1(3[0-9]|47|5((?!4)[0-9])|7(0|1|[6-8])|8[0-9])\\d{8,8}";

    public static final String REGEX_PWD = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,20}$";

    /**
     * 字符串md5加密
     *
     * @param string
     * @return
     */
    public static String md5(String string) {
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = md5.digest(string.getBytes());
            String result = "";
            for (byte b : bytes) {
                String temp = Integer.toHexString(b & 0xff);
                if (temp.length() == 1) {
                    temp = "0" + temp;
                }
                result += temp;
            }
            return result;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 获取固定格式的时间字符串
     * ("yyyy-MM-dd HH:mm:ss")
     * @param seconds
     * @return
     */
    public static String getFormatedTime(long seconds) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(new Date(1000 * seconds));
    }

    public static String getFormatedTime(String seconds) {

        return getFormatedTime(Long.parseLong(seconds));
    }

    /**
     * 获取固定格式的时间字符串
     * (yyyy-MM-dd)
     * @param seconds
     * @return
     */
    public static String getSimpleFormatedTime(long seconds) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(new Date(1000 * seconds));
    }


    public static String getSimpleFormatedTime(String seconds) {
        return getSimpleFormatedTime(seconds);
    }
}
