package com.acuit.jointdistribution.Common.Global;

import java.io.File;

/**
 * 定义全局常量
 * <p>
 * <p>
 * 修改者：yanj
 * 修改时间：2017-08-18 17:22
 */
public class GlobalContants {


    //    http://xxx/admin.php?c=Minterface&a=login
    public static final String SERVER_IP = "192.168.2.241";

    public static final String BASE_URL = "http:" + File.separator + File.separator + SERVER_IP + File.separator + "admin.php?";

    public static final String SERVER_URL = BASE_URL + "c=Minterface&a=";
    public static final String MOBILE_BIND_URL = BASE_URL + "c=mobilebind&a=";
    public static final String AJAX_URL = BASE_URL + "c=ajax&a=";
    public static final String ADMIN_URL = BASE_URL + "c=Admin_manage&a=";


    //    登录
    public static final String URL_LOGIN_BY_USERNAME = SERVER_URL + "login";

    //    验证密码
    public static final String URL_CHECK_PWD = AJAX_URL + "yzmima";
    //    修改密码
    public static final String URL_UPDATE_PWD = AJAX_URL + "updatePwd";
    //    手机修改密码
    public static final String URL_UPDATE_PWD_BY_PHONE = MOBILE_BIND_URL + "setPasswordByPhoneNumber";

    //    获取手机号
    public static final String URL_GET_PHONE = AJAX_URL + "getBindPhone";
    //    绑定手机号
    public static final String URL_BIND_PHONE = AJAX_URL + "bindPhoneNumber";

    //    验证验证码
    public static final String URL_CHECK_VERIFY = MOBILE_BIND_URL + "checkVerify";
    //    发送验证码
    public static final String URL_SEND_VERIFY_TO_USER = MOBILE_BIND_URL + "sendMsgToUser";

    //    提交反馈意见
    public static final String URL_SUBMIT_SUGGESTION = SERVER_URL + "submit_bug_add";
    //    查看反馈意见
    public static final String URL_VIEW_SUGGESTION = SERVER_URL + "submit_bug_list";



}


