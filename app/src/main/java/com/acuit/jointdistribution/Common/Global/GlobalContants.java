package com.acuit.jointdistribution.Common.Global;

import java.io.File;

/**
 * 定义全局常量
 * <p>
 * <p>
 * 修改者：yanj
 * 修改时间：2017-08-18 17:22
 */
public class
GlobalContants {


    //    http://xxx/admin.php?c=Minterface&a=login
    public static final String SERVER_IP = "192.168.2.241";

    public static final String BASE_URL = "http:" + File.separator + File.separator + SERVER_IP;

    public static final String SERVER_URL = BASE_URL + File.separator + "admin.php?c=Minterface&a=";
    public static final String MOBILE_BIND_URL = BASE_URL + File.separator + "admin.php?c=mobilebind&a=";
    public static final String AJAX_URL = BASE_URL + File.separator + "admin.php?c=ajax&a=";
    public static final String ADMIN_URL = BASE_URL + File.separator + "admin.php?c=Admin_manage&a=";
    public static final String AJAXREPORT_URL = BASE_URL + File.separator + "admin.php?c=ajaxreport&a=";


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


    //****************保管员首页展示信息(订单数据、供应商数据)获取链接：
    //    订单数据
    public static final String URL_SUPPLIERS_DATA = AJAXREPORT_URL + "supply_order";//&dep_id=8
    //    送货(供应商)数据
    public static final String URL_DELIVER_DATA = AJAXREPORT_URL + "storekeeper_order";//&dep_id=8
    //    获取入库单列表
    public static final String URL_STORE_IN_LIST = SERVER_URL + "store_in_list";
    //    获取入库单详情信息
    public static final String URL_STOREIN_DETAIL = SERVER_URL + "view_store_in_for_cofirm";
    //    获取商品入库标准——拒收原因
    public static final String URL_STOREIN_STANDARD = AJAX_URL + "get_store_in_standard";




}


