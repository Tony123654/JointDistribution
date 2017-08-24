package com.acuit.jointdistribution.Common.Global;

import java.io.File;

/**
 * 定义全局常量
 *
 *
 * 修改者：yanj
 * 修改时间：2017-08-18 17:22
 */
public class GlobalContants {


    //    http://xxx/admin.php?c=Minterface&a=login
    public static final String SERVER_IP = "192.168.2.241";

    public static final String BASE_URL = "http:" + File.separator + File.separator + SERVER_IP + File.separator + "admin.php";

    public static final String SERVER_URL = BASE_URL + "?c=Minterface&a=";
    public static final String MOBILE_URL = BASE_URL + "?c=mobilebind&a=";


//    登录
    public static final String URL_LOGIN_BY_USERNAME = SERVER_URL + "login";


//    验证验证码
    public static final String URL_CHECK_VERIFY = MOBILE_URL + "checkVerify";
//    发送验证码
    public static final String URL_SEND_VERIFY_TO_USER = MOBILE_URL + "sendMsgToUser";


}


