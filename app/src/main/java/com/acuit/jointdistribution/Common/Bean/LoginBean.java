package com.acuit.jointdistribution.Common.Bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 类名: LoginBean <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/12 0012 15:49 <p>
 * 描述:
 * <p>
 * 更新人: YanJ <p>
 * 更新时间: 2017-08-24 10:12 <p>
 * 更新描述:  增加了手机号字段 <p>
 */

public class LoginBean {

    /**
     * code : 200
     * msg : 执行成功！
     * data : {"token":"smart_4eeb312e511d0b199b407bd558d311b2","user_info":{"my_dep_list":[0,"54","63","62","61","60","59","58","57","56","55","93","92","21","20","19","18","17","16","15","12","11","80","10","9","65","66","13","67","64","14","8","1","1","1","1"],"userid":"13867","loginname":"002dxf","roleid":"142,144,113,116,114","mobile_phone":"13761075310","rolename":"js食堂保管员,js汇总单管理,js总仓,任务单系统,统计模块查看(全部)","mobile_interface":{"1720":"store_in_list"},"role_page":[{"page_url":"/admin.php?c=index&a=public_main_echarts1","name":"今日入库情况统计","p_menu_id":null,"pp_menu_id":null,"ajax_url":null}],"dep_info":{"supply_id":null,"dep_id":"1","dep_name":"第一餐饮中心（紫金港）","com_id":"1","com_name":"浙大饮食中心"},"menu":[{"id":"10","name":"panel","cname":"我的面板","parentid":"0","c":"Index","a":"public_main","data":"","listorder":"0","display":"1","url":"","data_leave":"./skin/images/nav_icon/icon_mb_h.png","data_on":"./skin/images/nav_icon/icon_mb_n.png","child":[{"id":"970","name":"admininfo","cname":"admininfo","parentid":"10","c":"admin_manage","a":"self_info","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"972","name":"editinfo","cname":null,"parentid":"970","c":"admin_manage","a":"public_edit_info","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1903","name":"意见反馈","cname":null,"parentid":"970","c":"dish","a":"submit_bug","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1980","name":"安全中心","cname":null,"parentid":"970","c":"Admin_manage","a":"public_edit_tel","data":"","listorder":"0","display":"1","url":"","data_leave":"","data_on":""},{"id":"971","name":"editpwd","cname":null,"parentid":"970","c":"admin_manage","a":"public_edit_pwd","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]}]},{"id":"1564","name":"数据中心","cname":null,"parentid":"0","c":"Dish","a":"init","data":"","listorder":"1","display":"1","url":null,"data_leave":"./skin/images/nav_icon/icon_date_h.png","data_on":"./skin/images/nav_icon/icon_date_n.png","child":[{"id":"1588","name":"存货管理","cname":null,"parentid":"1564","c":"dish","a":"p_stock","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1960","name":"商品净料表","cname":null,"parentid":"1588","c":"dish","a":"stock_list_jl","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1961","name":"商品毛料表","cname":null,"parentid":"1588","c":"dish","a":"stock_list_ml","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1962","name":"商品菜品表","cname":null,"parentid":"1588","c":"dish","a":"stock_list_cp","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1589","name":"存货列表","cname":null,"parentid":"1588","c":"dish","a":"stock_list","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1591","name":"存货组合","cname":null,"parentid":"1588","c":"dish","a":"composition","data":"","listorder":"2","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1851","name":"日常业务","cname":null,"parentid":"1564","c":"dish","a":"p_business","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1893","name":" 部门盈亏日报表","cname":null,"parentid":"1851","c":"finance","a":"dep_bep","data":"","listorder":"2","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1881","name":"营业收入","cname":null,"parentid":"1851","c":"finance","a":"finance_income","data":"","listorder":"3","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1852","name":"费用支出","cname":null,"parentid":"1851","c":"finance","a":"cost","data":"","listorder":"4","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1594","name":"订单管理","cname":null,"parentid":"1564","c":"dish","a":"p_order","data":"","listorder":"2","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1959","name":"订单追踪","cname":null,"parentid":"1594","c":"Buy","a":"view_order_store_status","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1592","name":"菜单计划","cname":null,"parentid":"1594","c":"dish","a":"menu_plan","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1593","name":"请购单管理","cname":null,"parentid":"1594","c":"dish","a":"request_list","data":"","listorder":"2","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1599","name":"采购汇总单管理","cname":null,"parentid":"1594","c":"dish","a":"order_list","data":"","listorder":"3","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1595","name":"信息查询","cname":null,"parentid":"1564","c":"dish","a":"p_info","data":"","listorder":"3","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1597","name":"净料规格表","cname":null,"parentid":"1595","c":"dish","a":"purity_standard","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1598","name":"菜品主辅料","cname":null,"parentid":"1595","c":"dish","a":"dish_stock","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1899","name":"商品导出","cname":null,"parentid":"1595","c":"dish","a":"dish_one_hundred_six","data":"","listorder":"0","display":"1","url":"/admin.php?c=Report&a=common_search&id=47","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1565","name":"基本设置","cname":null,"parentid":"1564","c":"dish","a":"p_setting","data":"","listorder":"4","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1566","name":"计量单位","cname":null,"parentid":"1565","c":"Dish","a":"unit_list","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1870","name":"部门商品属性设置","cname":null,"parentid":"1565","c":"dish","a":"dep_stock_all","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]}]},{"id":"1601","name":"统计分析","cname":null,"parentid":"0","c":"Statistics","a":"init","data":"","listorder":"2","display":"1","url":null,"data_leave":"./skin/images/nav_icon/icon_tjfx_h.png","data_on":"./skin/images/nav_icon/icon_tjfx_n.png","child":[{"id":"1602","name":"菜品统计","cname":null,"parentid":"1601","c":"Statistics","a":"p_stat","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1604","name":"供应菜单","cname":null,"parentid":"1602","c":"Statistics","a":"supply_menu","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1603","name":"菜品排行","cname":null,"parentid":"1602","c":"Statistics","a":"dish_rank","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1863","name":"日常统计","cname":null,"parentid":"1601","c":"dish","a":"","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1901","name":"营业收入统计表","cname":null,"parentid":"1863","c":"dish","a":"dish_sixteen","data":"","listorder":"0","display":"1","url":"/admin.php?c=Report&a=common_search&id=19&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1902","name":"费用支出汇总表","cname":null,"parentid":"1863","c":"dish","a":"dish_fourteen","data":"","listorder":"0","display":"1","url":"/admin.php?c=Report&a=common_search&id=17&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1907","name":"存货分类账","cname":null,"parentid":"1863","c":"dish","a":"dish_one_hundred_nighe","data":"","listorder":"0","display":"1","url":"/admin.php?c=Report&a=common_search&id=18&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1890","name":"部门应付账","cname":null,"parentid":"1863","c":"dish","a":"dish_twenty_one","data":"","listorder":"1","display":"1","url":"/admin.php?c=Report&a=common_search&id=27&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1889","name":"部门应收账","cname":null,"parentid":"1863","c":"dish","a":"dish_twenty","data":"","listorder":"2","display":"1","url":"/admin.php?c=Report&a=common_search&id=28&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1877","name":" 应付账明细表","cname":null,"parentid":"1863","c":"dish","a":"dish_seven","data":"","listorder":"3","display":"1","url":"/admin.php?c=Report&a=common_search&id=10&finance=1&datatable=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1876","name":"应收帐明细表","cname":null,"parentid":"1863","c":"dish","a":"dish_eight","data":"","listorder":"4","display":"1","url":"/admin.php?c=Report&a=common_search&id=11&finance=1&datatable=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1875","name":"进货入库统计表","cname":null,"parentid":"1863","c":"dish","a":"dish_one","data":"","listorder":"5","display":"1","url":"/admin.php?c=Report&a=common_search&id=2&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1886","name":"进货价格历史表","cname":null,"parentid":"1863","c":"dish","a":"dish_seven","data":"","listorder":"6","display":"1","url":"/admin.php?c=Report&a=common_search&id=24&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1888","name":"入库统计表","cname":null,"parentid":"1863","c":"dish","a":"dish_nineteen","data":"","listorder":"7","display":"1","url":"/admin.php?c=Report&a=common_search&id=26&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1887","name":"出库统计表","cname":null,"parentid":"1863","c":"dish","a":"dish_sixteen","data":"","listorder":"8","display":"1","url":"/admin.php?c=Report&a=common_search&id=25&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1864","name":"部门入库统计表","cname":null,"parentid":"1863","c":"dish","a":"dish_three","data":"","listorder":"9","display":"1","url":"/admin.php?c=Report&a=common_search&id=6&finance=1","data_leave":"/skin/AmazeUI/images/tongjibiao@3x.png","data_on":""},{"id":"1878","name":"部门出库统计表","cname":null,"parentid":"1863","c":"dish","a":"dish_thirteen","data":"","listorder":"10","display":"1","url":"/admin.php?c=Report&a=common_search&id=16&finance=1&datetable=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1891","name":"净料价格表","cname":null,"parentid":"1863","c":"dish","a":"dish_twenty_two","data":"","listorder":"11","display":"1","url":"/admin.php?c=Report&a=common_search&id=31&finance=1&datatable=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1880","name":"商品库存","cname":null,"parentid":"1863","c":"dish","a":"dish_two_1","data":"","listorder":"12","display":"1","url":"/admin.php?c=Report&a=common_search&id=4&finance=1&datatable=1&datatable=1&test=2","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]}]},{"id":"1730","name":"库存管理","cname":null,"parentid":"0","c":"Store","a":"init","data":"","listorder":"4","display":"1","url":"","data_leave":"./skin/images/nav_icon/icon_kcgl_h.png","data_on":"./skin/images/nav_icon/icon_kcgl_n.png","child":[{"id":"1731","name":"日常业务","cname":null,"parentid":"1730","c":"Store","a":"","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1720","name":"采购入库","cname":null,"parentid":"1731","c":"store","a":"store_in_list","data":"","listorder":"1","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1728","name":"出库管理","cname":null,"parentid":"1731","c":"Store","a":"store_out_list","data":"","listorder":"2","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1894","name":"退货单","cname":null,"parentid":"1731","c":"Store","a":"store_back_list","data":"","listorder":"4","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1879","name":"盘点单","cname":null,"parentid":"1731","c":"Store","a":"store_adjust_list","data":"","listorder":"5","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1732","name":"查询报表","cname":null,"parentid":"1730","c":"Store","a":"","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[]}]},{"id":"1605","name":"任务单系统","cname":null,"parentid":"0","c":"Task","a":"init","data":"","listorder":"88","display":"1","url":null,"data_leave":"/skin/images/nav_icon/icon_rwd_h.png","data_on":"/skin/images/nav_icon/icon_rwd_n.png","child":[{"id":"1606","name":"任务单管理","cname":null,"parentid":"1605","c":"Task","a":"p_task","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1706","name":"加工明细表","cname":null,"parentid":"1606","c":"","a":"","data":"","listorder":"0","display":"1","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fjgmxb.cpt","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1705","name":"加工汇总表","cname":null,"parentid":"1606","c":"","a":"","data":"","listorder":"0","display":"1","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fjgwcqkb.cpt","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1707","name":"出库明细表","cname":null,"parentid":"1606","c":"","a":"","data":"","listorder":"0","display":"1","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fbmckmxb.cpt","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1708","name":"出库汇总表","cname":null,"parentid":"1606","c":"","a":"","data":"","listorder":"0","display":"1","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fbmckhzb.cpt","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1609","name":"任务单列表","cname":null,"parentid":"1606","c":"task","a":"task_list","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1615","name":"净料分配表","cname":null,"parentid":"1606","c":"Task","a":"stock_assign","data":"","listorder":"2","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1619","name":"显示屏","cname":null,"parentid":"1605","c":"task","a":"task_show","data":"","listorder":"1","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1620","name":"显示屏页面","cname":null,"parentid":"1619","c":"task","a":"screen","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1610","name":"基本设置","cname":null,"parentid":"1605","c":"Task","a":"p_config","data":"","listorder":"2","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1613","name":"系统信息","cname":null,"parentid":"1610","c":"Task","a":"task_sys_info","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1614","name":"加工时间设置","cname":null,"parentid":"1610","c":"Task","a":"task_time_config","data":"","listorder":"3","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1629","name":"加工操作管理","cname":null,"parentid":"1605","c":"task","a":"","data":"","listorder":"3","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1630","name":"操作台设置","cname":null,"parentid":"1629","c":"task","a":"machine_config","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1633","name":"加工日志","cname":null,"parentid":"1629","c":"task","a":"task_log","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1634","name":"RFID设置","cname":null,"parentid":"1629","c":"task","a":"rfid_config","data":"","listorder":"3","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]}]}]},"priv":{"Buy":{"buy_order_list":{"priv_view":0,"priv_add":0,"priv_edit":0,"priv_set_in_use":0,"priv_delete":0,"priv_audit":0,"priv_confirm":0,"priv_send":0,"priv_create_store_in":0,"priv_create_order":0,"priv_copy":0,"priv_enroll":0,"priv_adjust_price":0}},"Store":{"store_in_list":{"priv_view":1,"priv_add":1,"priv_edit":1,"priv_set_in_use":0,"priv_delete":1,"priv_audit":1,"priv_confirm":1,"priv_send":0,"priv_create_store_in":0,"priv_create_order":0,"priv_copy":0,"priv_enroll":0,"priv_adjust_price":0}}}}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * token : smart_4eeb312e511d0b199b407bd558d311b2
         * user_info : {"my_dep_list":[0,"54","63","62","61","60","59","58","57","56","55","93","92","21","20","19","18","17","16","15","12","11","80","10","9","65","66","13","67","64","14","8","1","1","1","1"],"userid":"13867","loginname":"002dxf","roleid":"142,144,113,116,114","mobile_phone":"13761075310","rolename":"js食堂保管员,js汇总单管理,js总仓,任务单系统,统计模块查看(全部)","mobile_interface":{"1720":"store_in_list"},"role_page":[{"page_url":"/admin.php?c=index&a=public_main_echarts1","name":"今日入库情况统计","p_menu_id":null,"pp_menu_id":null,"ajax_url":null}],"dep_info":{"supply_id":null,"dep_id":"1","dep_name":"第一餐饮中心（紫金港）","com_id":"1","com_name":"浙大饮食中心"},"menu":[{"id":"10","name":"panel","cname":"我的面板","parentid":"0","c":"Index","a":"public_main","data":"","listorder":"0","display":"1","url":"","data_leave":"./skin/images/nav_icon/icon_mb_h.png","data_on":"./skin/images/nav_icon/icon_mb_n.png","child":[{"id":"970","name":"admininfo","cname":"admininfo","parentid":"10","c":"admin_manage","a":"self_info","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"972","name":"editinfo","cname":null,"parentid":"970","c":"admin_manage","a":"public_edit_info","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1903","name":"意见反馈","cname":null,"parentid":"970","c":"dish","a":"submit_bug","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1980","name":"安全中心","cname":null,"parentid":"970","c":"Admin_manage","a":"public_edit_tel","data":"","listorder":"0","display":"1","url":"","data_leave":"","data_on":""},{"id":"971","name":"editpwd","cname":null,"parentid":"970","c":"admin_manage","a":"public_edit_pwd","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]}]},{"id":"1564","name":"数据中心","cname":null,"parentid":"0","c":"Dish","a":"init","data":"","listorder":"1","display":"1","url":null,"data_leave":"./skin/images/nav_icon/icon_date_h.png","data_on":"./skin/images/nav_icon/icon_date_n.png","child":[{"id":"1588","name":"存货管理","cname":null,"parentid":"1564","c":"dish","a":"p_stock","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1960","name":"商品净料表","cname":null,"parentid":"1588","c":"dish","a":"stock_list_jl","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1961","name":"商品毛料表","cname":null,"parentid":"1588","c":"dish","a":"stock_list_ml","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1962","name":"商品菜品表","cname":null,"parentid":"1588","c":"dish","a":"stock_list_cp","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1589","name":"存货列表","cname":null,"parentid":"1588","c":"dish","a":"stock_list","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1591","name":"存货组合","cname":null,"parentid":"1588","c":"dish","a":"composition","data":"","listorder":"2","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1851","name":"日常业务","cname":null,"parentid":"1564","c":"dish","a":"p_business","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1893","name":" 部门盈亏日报表","cname":null,"parentid":"1851","c":"finance","a":"dep_bep","data":"","listorder":"2","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1881","name":"营业收入","cname":null,"parentid":"1851","c":"finance","a":"finance_income","data":"","listorder":"3","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1852","name":"费用支出","cname":null,"parentid":"1851","c":"finance","a":"cost","data":"","listorder":"4","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1594","name":"订单管理","cname":null,"parentid":"1564","c":"dish","a":"p_order","data":"","listorder":"2","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1959","name":"订单追踪","cname":null,"parentid":"1594","c":"Buy","a":"view_order_store_status","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1592","name":"菜单计划","cname":null,"parentid":"1594","c":"dish","a":"menu_plan","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1593","name":"请购单管理","cname":null,"parentid":"1594","c":"dish","a":"request_list","data":"","listorder":"2","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1599","name":"采购汇总单管理","cname":null,"parentid":"1594","c":"dish","a":"order_list","data":"","listorder":"3","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1595","name":"信息查询","cname":null,"parentid":"1564","c":"dish","a":"p_info","data":"","listorder":"3","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1597","name":"净料规格表","cname":null,"parentid":"1595","c":"dish","a":"purity_standard","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1598","name":"菜品主辅料","cname":null,"parentid":"1595","c":"dish","a":"dish_stock","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1899","name":"商品导出","cname":null,"parentid":"1595","c":"dish","a":"dish_one_hundred_six","data":"","listorder":"0","display":"1","url":"/admin.php?c=Report&a=common_search&id=47","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1565","name":"基本设置","cname":null,"parentid":"1564","c":"dish","a":"p_setting","data":"","listorder":"4","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1566","name":"计量单位","cname":null,"parentid":"1565","c":"Dish","a":"unit_list","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1870","name":"部门商品属性设置","cname":null,"parentid":"1565","c":"dish","a":"dep_stock_all","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]}]},{"id":"1601","name":"统计分析","cname":null,"parentid":"0","c":"Statistics","a":"init","data":"","listorder":"2","display":"1","url":null,"data_leave":"./skin/images/nav_icon/icon_tjfx_h.png","data_on":"./skin/images/nav_icon/icon_tjfx_n.png","child":[{"id":"1602","name":"菜品统计","cname":null,"parentid":"1601","c":"Statistics","a":"p_stat","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1604","name":"供应菜单","cname":null,"parentid":"1602","c":"Statistics","a":"supply_menu","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1603","name":"菜品排行","cname":null,"parentid":"1602","c":"Statistics","a":"dish_rank","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1863","name":"日常统计","cname":null,"parentid":"1601","c":"dish","a":"","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1901","name":"营业收入统计表","cname":null,"parentid":"1863","c":"dish","a":"dish_sixteen","data":"","listorder":"0","display":"1","url":"/admin.php?c=Report&a=common_search&id=19&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1902","name":"费用支出汇总表","cname":null,"parentid":"1863","c":"dish","a":"dish_fourteen","data":"","listorder":"0","display":"1","url":"/admin.php?c=Report&a=common_search&id=17&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1907","name":"存货分类账","cname":null,"parentid":"1863","c":"dish","a":"dish_one_hundred_nighe","data":"","listorder":"0","display":"1","url":"/admin.php?c=Report&a=common_search&id=18&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1890","name":"部门应付账","cname":null,"parentid":"1863","c":"dish","a":"dish_twenty_one","data":"","listorder":"1","display":"1","url":"/admin.php?c=Report&a=common_search&id=27&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1889","name":"部门应收账","cname":null,"parentid":"1863","c":"dish","a":"dish_twenty","data":"","listorder":"2","display":"1","url":"/admin.php?c=Report&a=common_search&id=28&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1877","name":" 应付账明细表","cname":null,"parentid":"1863","c":"dish","a":"dish_seven","data":"","listorder":"3","display":"1","url":"/admin.php?c=Report&a=common_search&id=10&finance=1&datatable=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1876","name":"应收帐明细表","cname":null,"parentid":"1863","c":"dish","a":"dish_eight","data":"","listorder":"4","display":"1","url":"/admin.php?c=Report&a=common_search&id=11&finance=1&datatable=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1875","name":"进货入库统计表","cname":null,"parentid":"1863","c":"dish","a":"dish_one","data":"","listorder":"5","display":"1","url":"/admin.php?c=Report&a=common_search&id=2&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1886","name":"进货价格历史表","cname":null,"parentid":"1863","c":"dish","a":"dish_seven","data":"","listorder":"6","display":"1","url":"/admin.php?c=Report&a=common_search&id=24&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1888","name":"入库统计表","cname":null,"parentid":"1863","c":"dish","a":"dish_nineteen","data":"","listorder":"7","display":"1","url":"/admin.php?c=Report&a=common_search&id=26&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1887","name":"出库统计表","cname":null,"parentid":"1863","c":"dish","a":"dish_sixteen","data":"","listorder":"8","display":"1","url":"/admin.php?c=Report&a=common_search&id=25&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1864","name":"部门入库统计表","cname":null,"parentid":"1863","c":"dish","a":"dish_three","data":"","listorder":"9","display":"1","url":"/admin.php?c=Report&a=common_search&id=6&finance=1","data_leave":"/skin/AmazeUI/images/tongjibiao@3x.png","data_on":""},{"id":"1878","name":"部门出库统计表","cname":null,"parentid":"1863","c":"dish","a":"dish_thirteen","data":"","listorder":"10","display":"1","url":"/admin.php?c=Report&a=common_search&id=16&finance=1&datetable=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1891","name":"净料价格表","cname":null,"parentid":"1863","c":"dish","a":"dish_twenty_two","data":"","listorder":"11","display":"1","url":"/admin.php?c=Report&a=common_search&id=31&finance=1&datatable=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1880","name":"商品库存","cname":null,"parentid":"1863","c":"dish","a":"dish_two_1","data":"","listorder":"12","display":"1","url":"/admin.php?c=Report&a=common_search&id=4&finance=1&datatable=1&datatable=1&test=2","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]}]},{"id":"1730","name":"库存管理","cname":null,"parentid":"0","c":"Store","a":"init","data":"","listorder":"4","display":"1","url":"","data_leave":"./skin/images/nav_icon/icon_kcgl_h.png","data_on":"./skin/images/nav_icon/icon_kcgl_n.png","child":[{"id":"1731","name":"日常业务","cname":null,"parentid":"1730","c":"Store","a":"","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1720","name":"采购入库","cname":null,"parentid":"1731","c":"store","a":"store_in_list","data":"","listorder":"1","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1728","name":"出库管理","cname":null,"parentid":"1731","c":"Store","a":"store_out_list","data":"","listorder":"2","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1894","name":"退货单","cname":null,"parentid":"1731","c":"Store","a":"store_back_list","data":"","listorder":"4","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1879","name":"盘点单","cname":null,"parentid":"1731","c":"Store","a":"store_adjust_list","data":"","listorder":"5","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1732","name":"查询报表","cname":null,"parentid":"1730","c":"Store","a":"","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[]}]},{"id":"1605","name":"任务单系统","cname":null,"parentid":"0","c":"Task","a":"init","data":"","listorder":"88","display":"1","url":null,"data_leave":"/skin/images/nav_icon/icon_rwd_h.png","data_on":"/skin/images/nav_icon/icon_rwd_n.png","child":[{"id":"1606","name":"任务单管理","cname":null,"parentid":"1605","c":"Task","a":"p_task","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1706","name":"加工明细表","cname":null,"parentid":"1606","c":"","a":"","data":"","listorder":"0","display":"1","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fjgmxb.cpt","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1705","name":"加工汇总表","cname":null,"parentid":"1606","c":"","a":"","data":"","listorder":"0","display":"1","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fjgwcqkb.cpt","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1707","name":"出库明细表","cname":null,"parentid":"1606","c":"","a":"","data":"","listorder":"0","display":"1","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fbmckmxb.cpt","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1708","name":"出库汇总表","cname":null,"parentid":"1606","c":"","a":"","data":"","listorder":"0","display":"1","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fbmckhzb.cpt","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1609","name":"任务单列表","cname":null,"parentid":"1606","c":"task","a":"task_list","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1615","name":"净料分配表","cname":null,"parentid":"1606","c":"Task","a":"stock_assign","data":"","listorder":"2","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1619","name":"显示屏","cname":null,"parentid":"1605","c":"task","a":"task_show","data":"","listorder":"1","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1620","name":"显示屏页面","cname":null,"parentid":"1619","c":"task","a":"screen","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1610","name":"基本设置","cname":null,"parentid":"1605","c":"Task","a":"p_config","data":"","listorder":"2","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1613","name":"系统信息","cname":null,"parentid":"1610","c":"Task","a":"task_sys_info","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1614","name":"加工时间设置","cname":null,"parentid":"1610","c":"Task","a":"task_time_config","data":"","listorder":"3","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1629","name":"加工操作管理","cname":null,"parentid":"1605","c":"task","a":"","data":"","listorder":"3","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1630","name":"操作台设置","cname":null,"parentid":"1629","c":"task","a":"machine_config","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1633","name":"加工日志","cname":null,"parentid":"1629","c":"task","a":"task_log","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1634","name":"RFID设置","cname":null,"parentid":"1629","c":"task","a":"rfid_config","data":"","listorder":"3","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]}]}]}
         * priv : {"Buy":{"buy_order_list":{"priv_view":0,"priv_add":0,"priv_edit":0,"priv_set_in_use":0,"priv_delete":0,"priv_audit":0,"priv_confirm":0,"priv_send":0,"priv_create_store_in":0,"priv_create_order":0,"priv_copy":0,"priv_enroll":0,"priv_adjust_price":0}},"Store":{"store_in_list":{"priv_view":1,"priv_add":1,"priv_edit":1,"priv_set_in_use":0,"priv_delete":1,"priv_audit":1,"priv_confirm":1,"priv_send":0,"priv_create_store_in":0,"priv_create_order":0,"priv_copy":0,"priv_enroll":0,"priv_adjust_price":0}}}
         */

        private String token;
        private UserInfoBean user_info;
        private PrivBean priv;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public UserInfoBean getUser_info() {
            return user_info;
        }

        public void setUser_info(UserInfoBean user_info) {
            this.user_info = user_info;
        }

        public PrivBean getPriv() {
            return priv;
        }

        public void setPriv(PrivBean priv) {
            this.priv = priv;
        }

        public static class UserInfoBean {
            /**
             * my_dep_list : [0,"54","63","62","61","60","59","58","57","56","55","93","92","21","20","19","18","17","16","15","12","11","80","10","9","65","66","13","67","64","14","8","1","1","1","1"]
             * userid : 13867
             * loginname : 002dxf
             * roleid : 142,144,113,116,114
             * mobile_phone : 13761075310
             * rolename : js食堂保管员,js汇总单管理,js总仓,任务单系统,统计模块查看(全部)
             * mobile_interface : {"1720":"store_in_list"}
             * role_page : [{"page_url":"/admin.php?c=index&a=public_main_echarts1","name":"今日入库情况统计","p_menu_id":null,"pp_menu_id":null,"ajax_url":null}]
             * dep_info : {"supply_id":null,"dep_id":"1","dep_name":"第一餐饮中心（紫金港）","com_id":"1","com_name":"浙大饮食中心"}
             * menu : [{"id":"10","name":"panel","cname":"我的面板","parentid":"0","c":"Index","a":"public_main","data":"","listorder":"0","display":"1","url":"","data_leave":"./skin/images/nav_icon/icon_mb_h.png","data_on":"./skin/images/nav_icon/icon_mb_n.png","child":[{"id":"970","name":"admininfo","cname":"admininfo","parentid":"10","c":"admin_manage","a":"self_info","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"972","name":"editinfo","cname":null,"parentid":"970","c":"admin_manage","a":"public_edit_info","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1903","name":"意见反馈","cname":null,"parentid":"970","c":"dish","a":"submit_bug","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1980","name":"安全中心","cname":null,"parentid":"970","c":"Admin_manage","a":"public_edit_tel","data":"","listorder":"0","display":"1","url":"","data_leave":"","data_on":""},{"id":"971","name":"editpwd","cname":null,"parentid":"970","c":"admin_manage","a":"public_edit_pwd","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]}]},{"id":"1564","name":"数据中心","cname":null,"parentid":"0","c":"Dish","a":"init","data":"","listorder":"1","display":"1","url":null,"data_leave":"./skin/images/nav_icon/icon_date_h.png","data_on":"./skin/images/nav_icon/icon_date_n.png","child":[{"id":"1588","name":"存货管理","cname":null,"parentid":"1564","c":"dish","a":"p_stock","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1960","name":"商品净料表","cname":null,"parentid":"1588","c":"dish","a":"stock_list_jl","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1961","name":"商品毛料表","cname":null,"parentid":"1588","c":"dish","a":"stock_list_ml","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1962","name":"商品菜品表","cname":null,"parentid":"1588","c":"dish","a":"stock_list_cp","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1589","name":"存货列表","cname":null,"parentid":"1588","c":"dish","a":"stock_list","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1591","name":"存货组合","cname":null,"parentid":"1588","c":"dish","a":"composition","data":"","listorder":"2","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1851","name":"日常业务","cname":null,"parentid":"1564","c":"dish","a":"p_business","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1893","name":" 部门盈亏日报表","cname":null,"parentid":"1851","c":"finance","a":"dep_bep","data":"","listorder":"2","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1881","name":"营业收入","cname":null,"parentid":"1851","c":"finance","a":"finance_income","data":"","listorder":"3","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1852","name":"费用支出","cname":null,"parentid":"1851","c":"finance","a":"cost","data":"","listorder":"4","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1594","name":"订单管理","cname":null,"parentid":"1564","c":"dish","a":"p_order","data":"","listorder":"2","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1959","name":"订单追踪","cname":null,"parentid":"1594","c":"Buy","a":"view_order_store_status","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1592","name":"菜单计划","cname":null,"parentid":"1594","c":"dish","a":"menu_plan","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1593","name":"请购单管理","cname":null,"parentid":"1594","c":"dish","a":"request_list","data":"","listorder":"2","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1599","name":"采购汇总单管理","cname":null,"parentid":"1594","c":"dish","a":"order_list","data":"","listorder":"3","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1595","name":"信息查询","cname":null,"parentid":"1564","c":"dish","a":"p_info","data":"","listorder":"3","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1597","name":"净料规格表","cname":null,"parentid":"1595","c":"dish","a":"purity_standard","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1598","name":"菜品主辅料","cname":null,"parentid":"1595","c":"dish","a":"dish_stock","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1899","name":"商品导出","cname":null,"parentid":"1595","c":"dish","a":"dish_one_hundred_six","data":"","listorder":"0","display":"1","url":"/admin.php?c=Report&a=common_search&id=47","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1565","name":"基本设置","cname":null,"parentid":"1564","c":"dish","a":"p_setting","data":"","listorder":"4","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1566","name":"计量单位","cname":null,"parentid":"1565","c":"Dish","a":"unit_list","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1870","name":"部门商品属性设置","cname":null,"parentid":"1565","c":"dish","a":"dep_stock_all","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]}]},{"id":"1601","name":"统计分析","cname":null,"parentid":"0","c":"Statistics","a":"init","data":"","listorder":"2","display":"1","url":null,"data_leave":"./skin/images/nav_icon/icon_tjfx_h.png","data_on":"./skin/images/nav_icon/icon_tjfx_n.png","child":[{"id":"1602","name":"菜品统计","cname":null,"parentid":"1601","c":"Statistics","a":"p_stat","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1604","name":"供应菜单","cname":null,"parentid":"1602","c":"Statistics","a":"supply_menu","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1603","name":"菜品排行","cname":null,"parentid":"1602","c":"Statistics","a":"dish_rank","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1863","name":"日常统计","cname":null,"parentid":"1601","c":"dish","a":"","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1901","name":"营业收入统计表","cname":null,"parentid":"1863","c":"dish","a":"dish_sixteen","data":"","listorder":"0","display":"1","url":"/admin.php?c=Report&a=common_search&id=19&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1902","name":"费用支出汇总表","cname":null,"parentid":"1863","c":"dish","a":"dish_fourteen","data":"","listorder":"0","display":"1","url":"/admin.php?c=Report&a=common_search&id=17&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1907","name":"存货分类账","cname":null,"parentid":"1863","c":"dish","a":"dish_one_hundred_nighe","data":"","listorder":"0","display":"1","url":"/admin.php?c=Report&a=common_search&id=18&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1890","name":"部门应付账","cname":null,"parentid":"1863","c":"dish","a":"dish_twenty_one","data":"","listorder":"1","display":"1","url":"/admin.php?c=Report&a=common_search&id=27&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1889","name":"部门应收账","cname":null,"parentid":"1863","c":"dish","a":"dish_twenty","data":"","listorder":"2","display":"1","url":"/admin.php?c=Report&a=common_search&id=28&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1877","name":" 应付账明细表","cname":null,"parentid":"1863","c":"dish","a":"dish_seven","data":"","listorder":"3","display":"1","url":"/admin.php?c=Report&a=common_search&id=10&finance=1&datatable=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1876","name":"应收帐明细表","cname":null,"parentid":"1863","c":"dish","a":"dish_eight","data":"","listorder":"4","display":"1","url":"/admin.php?c=Report&a=common_search&id=11&finance=1&datatable=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1875","name":"进货入库统计表","cname":null,"parentid":"1863","c":"dish","a":"dish_one","data":"","listorder":"5","display":"1","url":"/admin.php?c=Report&a=common_search&id=2&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1886","name":"进货价格历史表","cname":null,"parentid":"1863","c":"dish","a":"dish_seven","data":"","listorder":"6","display":"1","url":"/admin.php?c=Report&a=common_search&id=24&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1888","name":"入库统计表","cname":null,"parentid":"1863","c":"dish","a":"dish_nineteen","data":"","listorder":"7","display":"1","url":"/admin.php?c=Report&a=common_search&id=26&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1887","name":"出库统计表","cname":null,"parentid":"1863","c":"dish","a":"dish_sixteen","data":"","listorder":"8","display":"1","url":"/admin.php?c=Report&a=common_search&id=25&finance=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1864","name":"部门入库统计表","cname":null,"parentid":"1863","c":"dish","a":"dish_three","data":"","listorder":"9","display":"1","url":"/admin.php?c=Report&a=common_search&id=6&finance=1","data_leave":"/skin/AmazeUI/images/tongjibiao@3x.png","data_on":""},{"id":"1878","name":"部门出库统计表","cname":null,"parentid":"1863","c":"dish","a":"dish_thirteen","data":"","listorder":"10","display":"1","url":"/admin.php?c=Report&a=common_search&id=16&finance=1&datetable=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1891","name":"净料价格表","cname":null,"parentid":"1863","c":"dish","a":"dish_twenty_two","data":"","listorder":"11","display":"1","url":"/admin.php?c=Report&a=common_search&id=31&finance=1&datatable=1","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1880","name":"商品库存","cname":null,"parentid":"1863","c":"dish","a":"dish_two_1","data":"","listorder":"12","display":"1","url":"/admin.php?c=Report&a=common_search&id=4&finance=1&datatable=1&datatable=1&test=2","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]}]},{"id":"1730","name":"库存管理","cname":null,"parentid":"0","c":"Store","a":"init","data":"","listorder":"4","display":"1","url":"","data_leave":"./skin/images/nav_icon/icon_kcgl_h.png","data_on":"./skin/images/nav_icon/icon_kcgl_n.png","child":[{"id":"1731","name":"日常业务","cname":null,"parentid":"1730","c":"Store","a":"","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1720","name":"采购入库","cname":null,"parentid":"1731","c":"store","a":"store_in_list","data":"","listorder":"1","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1728","name":"出库管理","cname":null,"parentid":"1731","c":"Store","a":"store_out_list","data":"","listorder":"2","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1894","name":"退货单","cname":null,"parentid":"1731","c":"Store","a":"store_back_list","data":"","listorder":"4","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1879","name":"盘点单","cname":null,"parentid":"1731","c":"Store","a":"store_adjust_list","data":"","listorder":"5","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1732","name":"查询报表","cname":null,"parentid":"1730","c":"Store","a":"","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[]}]},{"id":"1605","name":"任务单系统","cname":null,"parentid":"0","c":"Task","a":"init","data":"","listorder":"88","display":"1","url":null,"data_leave":"/skin/images/nav_icon/icon_rwd_h.png","data_on":"/skin/images/nav_icon/icon_rwd_n.png","child":[{"id":"1606","name":"任务单管理","cname":null,"parentid":"1605","c":"Task","a":"p_task","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1706","name":"加工明细表","cname":null,"parentid":"1606","c":"","a":"","data":"","listorder":"0","display":"1","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fjgmxb.cpt","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1705","name":"加工汇总表","cname":null,"parentid":"1606","c":"","a":"","data":"","listorder":"0","display":"1","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fjgwcqkb.cpt","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1707","name":"出库明细表","cname":null,"parentid":"1606","c":"","a":"","data":"","listorder":"0","display":"1","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fbmckmxb.cpt","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1708","name":"出库汇总表","cname":null,"parentid":"1606","c":"","a":"","data":"","listorder":"0","display":"1","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fbmckhzb.cpt","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1609","name":"任务单列表","cname":null,"parentid":"1606","c":"task","a":"task_list","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1615","name":"净料分配表","cname":null,"parentid":"1606","c":"Task","a":"stock_assign","data":"","listorder":"2","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1619","name":"显示屏","cname":null,"parentid":"1605","c":"task","a":"task_show","data":"","listorder":"1","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1620","name":"显示屏页面","cname":null,"parentid":"1619","c":"task","a":"screen","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1610","name":"基本设置","cname":null,"parentid":"1605","c":"Task","a":"p_config","data":"","listorder":"2","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1613","name":"系统信息","cname":null,"parentid":"1610","c":"Task","a":"task_sys_info","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1614","name":"加工时间设置","cname":null,"parentid":"1610","c":"Task","a":"task_time_config","data":"","listorder":"3","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]},{"id":"1629","name":"加工操作管理","cname":null,"parentid":"1605","c":"task","a":"","data":"","listorder":"3","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"1630","name":"操作台设置","cname":null,"parentid":"1629","c":"task","a":"machine_config","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1633","name":"加工日志","cname":null,"parentid":"1629","c":"task","a":"task_log","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1634","name":"RFID设置","cname":null,"parentid":"1629","c":"task","a":"rfid_config","data":"","listorder":"3","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]}]}]
             */

            private String userid;
            private String loginname;
            private String roleid;
            private String mobile_phone;
            private String rolename;
            private MobileInterfaceBean mobile_interface;
            private DepInfoBean dep_info;
            private List<Integer> my_dep_list;
            private List<RolePageBean> role_page;
            private List<MenuBean> menu;

            public String getUserid() {
                return userid;
            }

            public void setUserid(String userid) {
                this.userid = userid;
            }

            public String getLoginname() {
                return loginname;
            }

            public void setLoginname(String loginname) {
                this.loginname = loginname;
            }

            public String getRoleid() {
                return roleid;
            }

            public void setRoleid(String roleid) {
                this.roleid = roleid;
            }

            public String getMobile_phone() {
                return mobile_phone;
            }

            public void setMobile_phone(String mobile_phone) {
                this.mobile_phone = mobile_phone;
            }

            public String getRolename() {
                return rolename;
            }

            public void setRolename(String rolename) {
                this.rolename = rolename;
            }

            public MobileInterfaceBean getMobile_interface() {
                return mobile_interface;
            }

            public void setMobile_interface(MobileInterfaceBean mobile_interface) {
                this.mobile_interface = mobile_interface;
            }

            public DepInfoBean getDep_info() {
                return dep_info;
            }

            public void setDep_info(DepInfoBean dep_info) {
                this.dep_info = dep_info;
            }

            public List<Integer> getMy_dep_list() {
                return my_dep_list;
            }

            public void setMy_dep_list(List<Integer> my_dep_list) {
                this.my_dep_list = my_dep_list;
            }

            public List<RolePageBean> getRole_page() {
                return role_page;
            }

            public void setRole_page(List<RolePageBean> role_page) {
                this.role_page = role_page;
            }

            public List<MenuBean> getMenu() {
                return menu;
            }

            public void setMenu(List<MenuBean> menu) {
                this.menu = menu;
            }

            public static class MobileInterfaceBean {
                /**
                 * 1720 : store_in_list
                 */

                @SerializedName("1720")
                private String _$1720;

                public String get_$1720() {
                    return _$1720;
                }

                public void set_$1720(String _$1720) {
                    this._$1720 = _$1720;
                }
            }

            public static class DepInfoBean {
                /**
                 * supply_id : null
                 * dep_id : 1
                 * dep_name : 第一餐饮中心（紫金港）
                 * com_id : 1
                 * com_name : 浙大饮食中心
                 */

                private Object supply_id;
                private String dep_id;
                private String dep_name;
                private String com_id;
                private String com_name;

                public Object getSupply_id() {
                    return supply_id;
                }

                public void setSupply_id(Object supply_id) {
                    this.supply_id = supply_id;
                }

                public String getDep_id() {
                    return dep_id;
                }

                public void setDep_id(String dep_id) {
                    this.dep_id = dep_id;
                }

                public String getDep_name() {
                    return dep_name;
                }

                public void setDep_name(String dep_name) {
                    this.dep_name = dep_name;
                }

                public String getCom_id() {
                    return com_id;
                }

                public void setCom_id(String com_id) {
                    this.com_id = com_id;
                }

                public String getCom_name() {
                    return com_name;
                }

                public void setCom_name(String com_name) {
                    this.com_name = com_name;
                }
            }

            public static class RolePageBean {
                /**
                 * page_url : /admin.php?c=index&a=public_main_echarts1
                 * name : 今日入库情况统计
                 * p_menu_id : null
                 * pp_menu_id : null
                 * ajax_url : null
                 */

                private String page_url;
                private String name;
                private Object p_menu_id;
                private Object pp_menu_id;
                private Object ajax_url;

                public String getPage_url() {
                    return page_url;
                }

                public void setPage_url(String page_url) {
                    this.page_url = page_url;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public Object getP_menu_id() {
                    return p_menu_id;
                }

                public void setP_menu_id(Object p_menu_id) {
                    this.p_menu_id = p_menu_id;
                }

                public Object getPp_menu_id() {
                    return pp_menu_id;
                }

                public void setPp_menu_id(Object pp_menu_id) {
                    this.pp_menu_id = pp_menu_id;
                }

                public Object getAjax_url() {
                    return ajax_url;
                }

                public void setAjax_url(Object ajax_url) {
                    this.ajax_url = ajax_url;
                }
            }

            public static class MenuBean {
                /**
                 * id : 10
                 * name : panel
                 * cname : 我的面板
                 * parentid : 0
                 * c : Index
                 * a : public_main
                 * data :
                 * listorder : 0
                 * display : 1
                 * url :
                 * data_leave : ./skin/images/nav_icon/icon_mb_h.png
                 * data_on : ./skin/images/nav_icon/icon_mb_n.png
                 * child : [{"id":"970","name":"admininfo","cname":"admininfo","parentid":"10","c":"admin_manage","a":"self_info","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","child":[{"id":"972","name":"editinfo","cname":null,"parentid":"970","c":"admin_manage","a":"public_edit_info","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1903","name":"意见反馈","cname":null,"parentid":"970","c":"dish","a":"submit_bug","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1980","name":"安全中心","cname":null,"parentid":"970","c":"Admin_manage","a":"public_edit_tel","data":"","listorder":"0","display":"1","url":"","data_leave":"","data_on":""},{"id":"971","name":"editpwd","cname":null,"parentid":"970","c":"admin_manage","a":"public_edit_pwd","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]}]
                 */

                private String id;
                private String name;
                private String cname;
                private String parentid;
                private String c;
                private String a;
                private String data;
                private String listorder;
                private String display;
                private String url;
                private String data_leave;
                private String data_on;
                private List<ChildBeanX> child;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getCname() {
                    return cname;
                }

                public void setCname(String cname) {
                    this.cname = cname;
                }

                public String getParentid() {
                    return parentid;
                }

                public void setParentid(String parentid) {
                    this.parentid = parentid;
                }

                public String getC() {
                    return c;
                }

                public void setC(String c) {
                    this.c = c;
                }

                public String getA() {
                    return a;
                }

                public void setA(String a) {
                    this.a = a;
                }

                public String getData() {
                    return data;
                }

                public void setData(String data) {
                    this.data = data;
                }

                public String getListorder() {
                    return listorder;
                }

                public void setListorder(String listorder) {
                    this.listorder = listorder;
                }

                public String getDisplay() {
                    return display;
                }

                public void setDisplay(String display) {
                    this.display = display;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getData_leave() {
                    return data_leave;
                }

                public void setData_leave(String data_leave) {
                    this.data_leave = data_leave;
                }

                public String getData_on() {
                    return data_on;
                }

                public void setData_on(String data_on) {
                    this.data_on = data_on;
                }

                public List<ChildBeanX> getChild() {
                    return child;
                }

                public void setChild(List<ChildBeanX> child) {
                    this.child = child;
                }

                public static class ChildBeanX {
                    /**
                     * id : 970
                     * name : admininfo
                     * cname : admininfo
                     * parentid : 10
                     * c : admin_manage
                     * a : self_info
                     * data :
                     * listorder : 0
                     * display : 1
                     * url : null
                     * data_leave : /skin/AmazeUI/images/CAOZUO@3x.png
                     * data_on :
                     * child : [{"id":"972","name":"editinfo","cname":null,"parentid":"970","c":"admin_manage","a":"public_edit_info","data":"","listorder":"0","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1903","name":"意见反馈","cname":null,"parentid":"970","c":"dish","a":"submit_bug","data":"","listorder":"0","display":"1","url":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""},{"id":"1980","name":"安全中心","cname":null,"parentid":"970","c":"Admin_manage","a":"public_edit_tel","data":"","listorder":"0","display":"1","url":"","data_leave":"","data_on":""},{"id":"971","name":"editpwd","cname":null,"parentid":"970","c":"admin_manage","a":"public_edit_pwd","data":"","listorder":"1","display":"1","url":null,"data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":""}]
                     */

                    private String id;
                    private String name;
                    private String cname;
                    private String parentid;
                    private String c;
                    private String a;
                    private String data;
                    private String listorder;
                    private String display;
                    private Object url;
                    private String data_leave;
                    private String data_on;
                    private List<ChildBean> child;

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getCname() {
                        return cname;
                    }

                    public void setCname(String cname) {
                        this.cname = cname;
                    }

                    public String getParentid() {
                        return parentid;
                    }

                    public void setParentid(String parentid) {
                        this.parentid = parentid;
                    }

                    public String getC() {
                        return c;
                    }

                    public void setC(String c) {
                        this.c = c;
                    }

                    public String getA() {
                        return a;
                    }

                    public void setA(String a) {
                        this.a = a;
                    }

                    public String getData() {
                        return data;
                    }

                    public void setData(String data) {
                        this.data = data;
                    }

                    public String getListorder() {
                        return listorder;
                    }

                    public void setListorder(String listorder) {
                        this.listorder = listorder;
                    }

                    public String getDisplay() {
                        return display;
                    }

                    public void setDisplay(String display) {
                        this.display = display;
                    }

                    public Object getUrl() {
                        return url;
                    }

                    public void setUrl(Object url) {
                        this.url = url;
                    }

                    public String getData_leave() {
                        return data_leave;
                    }

                    public void setData_leave(String data_leave) {
                        this.data_leave = data_leave;
                    }

                    public String getData_on() {
                        return data_on;
                    }

                    public void setData_on(String data_on) {
                        this.data_on = data_on;
                    }

                    public List<ChildBean> getChild() {
                        return child;
                    }

                    public void setChild(List<ChildBean> child) {
                        this.child = child;
                    }

                    public static class ChildBean {
                        /**
                         * id : 972
                         * name : editinfo
                         * cname : null
                         * parentid : 970
                         * c : admin_manage
                         * a : public_edit_info
                         * data :
                         * listorder : 0
                         * display : 1
                         * url : null
                         * data_leave : /skin/AmazeUI/images/CAOZUO@3x.png
                         * data_on :
                         */

                        private String id;
                        private String name;
                        private Object cname;
                        private String parentid;
                        private String c;
                        private String a;
                        private String data;
                        private String listorder;
                        private String display;
                        private Object url;
                        private String data_leave;
                        private String data_on;

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public Object getCname() {
                            return cname;
                        }

                        public void setCname(Object cname) {
                            this.cname = cname;
                        }

                        public String getParentid() {
                            return parentid;
                        }

                        public void setParentid(String parentid) {
                            this.parentid = parentid;
                        }

                        public String getC() {
                            return c;
                        }

                        public void setC(String c) {
                            this.c = c;
                        }

                        public String getA() {
                            return a;
                        }

                        public void setA(String a) {
                            this.a = a;
                        }

                        public String getData() {
                            return data;
                        }

                        public void setData(String data) {
                            this.data = data;
                        }

                        public String getListorder() {
                            return listorder;
                        }

                        public void setListorder(String listorder) {
                            this.listorder = listorder;
                        }

                        public String getDisplay() {
                            return display;
                        }

                        public void setDisplay(String display) {
                            this.display = display;
                        }

                        public Object getUrl() {
                            return url;
                        }

                        public void setUrl(Object url) {
                            this.url = url;
                        }

                        public String getData_leave() {
                            return data_leave;
                        }

                        public void setData_leave(String data_leave) {
                            this.data_leave = data_leave;
                        }

                        public String getData_on() {
                            return data_on;
                        }

                        public void setData_on(String data_on) {
                            this.data_on = data_on;
                        }
                    }
                }
            }
        }

        public static class PrivBean {
            /**
             * Buy : {"buy_order_list":{"priv_view":0,"priv_add":0,"priv_edit":0,"priv_set_in_use":0,"priv_delete":0,"priv_audit":0,"priv_confirm":0,"priv_send":0,"priv_create_store_in":0,"priv_create_order":0,"priv_copy":0,"priv_enroll":0,"priv_adjust_price":0}}
             * Store : {"store_in_list":{"priv_view":1,"priv_add":1,"priv_edit":1,"priv_set_in_use":0,"priv_delete":1,"priv_audit":1,"priv_confirm":1,"priv_send":0,"priv_create_store_in":0,"priv_create_order":0,"priv_copy":0,"priv_enroll":0,"priv_adjust_price":0}}
             */

            private BuyBean Buy;
            private StoreBean Store;

            public BuyBean getBuy() {
                return Buy;
            }

            public void setBuy(BuyBean Buy) {
                this.Buy = Buy;
            }

            public StoreBean getStore() {
                return Store;
            }

            public void setStore(StoreBean Store) {
                this.Store = Store;
            }

            public static class BuyBean {
                /**
                 * buy_order_list : {"priv_view":0,"priv_add":0,"priv_edit":0,"priv_set_in_use":0,"priv_delete":0,"priv_audit":0,"priv_confirm":0,"priv_send":0,"priv_create_store_in":0,"priv_create_order":0,"priv_copy":0,"priv_enroll":0,"priv_adjust_price":0}
                 */

                private BuyOrderListBean buy_order_list;

                public BuyOrderListBean getBuy_order_list() {
                    return buy_order_list;
                }

                public void setBuy_order_list(BuyOrderListBean buy_order_list) {
                    this.buy_order_list = buy_order_list;
                }

                public static class BuyOrderListBean {
                    /**
                     * priv_view : 0
                     * priv_add : 0
                     * priv_edit : 0
                     * priv_set_in_use : 0
                     * priv_delete : 0
                     * priv_audit : 0
                     * priv_confirm : 0
                     * priv_send : 0
                     * priv_create_store_in : 0
                     * priv_create_order : 0
                     * priv_copy : 0
                     * priv_enroll : 0
                     * priv_adjust_price : 0
                     */

                    private int priv_view;
                    private int priv_add;
                    private int priv_edit;
                    private int priv_set_in_use;
                    private int priv_delete;
                    private int priv_audit;
                    private int priv_confirm;
                    private int priv_send;
                    private int priv_create_store_in;
                    private int priv_create_order;
                    private int priv_copy;
                    private int priv_enroll;
                    private int priv_adjust_price;

                    public int getPriv_view() {
                        return priv_view;
                    }

                    public void setPriv_view(int priv_view) {
                        this.priv_view = priv_view;
                    }

                    public int getPriv_add() {
                        return priv_add;
                    }

                    public void setPriv_add(int priv_add) {
                        this.priv_add = priv_add;
                    }

                    public int getPriv_edit() {
                        return priv_edit;
                    }

                    public void setPriv_edit(int priv_edit) {
                        this.priv_edit = priv_edit;
                    }

                    public int getPriv_set_in_use() {
                        return priv_set_in_use;
                    }

                    public void setPriv_set_in_use(int priv_set_in_use) {
                        this.priv_set_in_use = priv_set_in_use;
                    }

                    public int getPriv_delete() {
                        return priv_delete;
                    }

                    public void setPriv_delete(int priv_delete) {
                        this.priv_delete = priv_delete;
                    }

                    public int getPriv_audit() {
                        return priv_audit;
                    }

                    public void setPriv_audit(int priv_audit) {
                        this.priv_audit = priv_audit;
                    }

                    public int getPriv_confirm() {
                        return priv_confirm;
                    }

                    public void setPriv_confirm(int priv_confirm) {
                        this.priv_confirm = priv_confirm;
                    }

                    public int getPriv_send() {
                        return priv_send;
                    }

                    public void setPriv_send(int priv_send) {
                        this.priv_send = priv_send;
                    }

                    public int getPriv_create_store_in() {
                        return priv_create_store_in;
                    }

                    public void setPriv_create_store_in(int priv_create_store_in) {
                        this.priv_create_store_in = priv_create_store_in;
                    }

                    public int getPriv_create_order() {
                        return priv_create_order;
                    }

                    public void setPriv_create_order(int priv_create_order) {
                        this.priv_create_order = priv_create_order;
                    }

                    public int getPriv_copy() {
                        return priv_copy;
                    }

                    public void setPriv_copy(int priv_copy) {
                        this.priv_copy = priv_copy;
                    }

                    public int getPriv_enroll() {
                        return priv_enroll;
                    }

                    public void setPriv_enroll(int priv_enroll) {
                        this.priv_enroll = priv_enroll;
                    }

                    public int getPriv_adjust_price() {
                        return priv_adjust_price;
                    }

                    public void setPriv_adjust_price(int priv_adjust_price) {
                        this.priv_adjust_price = priv_adjust_price;
                    }
                }
            }

            public static class StoreBean {
                /**
                 * store_in_list : {"priv_view":1,"priv_add":1,"priv_edit":1,"priv_set_in_use":0,"priv_delete":1,"priv_audit":1,"priv_confirm":1,"priv_send":0,"priv_create_store_in":0,"priv_create_order":0,"priv_copy":0,"priv_enroll":0,"priv_adjust_price":0}
                 */

                private StoreInListBean store_in_list;

                public StoreInListBean getStore_in_list() {
                    return store_in_list;
                }

                public void setStore_in_list(StoreInListBean store_in_list) {
                    this.store_in_list = store_in_list;
                }

                public static class StoreInListBean {
                    /**
                     * priv_view : 1
                     * priv_add : 1
                     * priv_edit : 1
                     * priv_set_in_use : 0
                     * priv_delete : 1
                     * priv_audit : 1
                     * priv_confirm : 1
                     * priv_send : 0
                     * priv_create_store_in : 0
                     * priv_create_order : 0
                     * priv_copy : 0
                     * priv_enroll : 0
                     * priv_adjust_price : 0
                     */

                    private int priv_view;
                    private int priv_add;
                    private int priv_edit;
                    private int priv_set_in_use;
                    private int priv_delete;
                    private int priv_audit;
                    private int priv_confirm;
                    private int priv_send;
                    private int priv_create_store_in;
                    private int priv_create_order;
                    private int priv_copy;
                    private int priv_enroll;
                    private int priv_adjust_price;

                    public int getPriv_view() {
                        return priv_view;
                    }

                    public void setPriv_view(int priv_view) {
                        this.priv_view = priv_view;
                    }

                    public int getPriv_add() {
                        return priv_add;
                    }

                    public void setPriv_add(int priv_add) {
                        this.priv_add = priv_add;
                    }

                    public int getPriv_edit() {
                        return priv_edit;
                    }

                    public void setPriv_edit(int priv_edit) {
                        this.priv_edit = priv_edit;
                    }

                    public int getPriv_set_in_use() {
                        return priv_set_in_use;
                    }

                    public void setPriv_set_in_use(int priv_set_in_use) {
                        this.priv_set_in_use = priv_set_in_use;
                    }

                    public int getPriv_delete() {
                        return priv_delete;
                    }

                    public void setPriv_delete(int priv_delete) {
                        this.priv_delete = priv_delete;
                    }

                    public int getPriv_audit() {
                        return priv_audit;
                    }

                    public void setPriv_audit(int priv_audit) {
                        this.priv_audit = priv_audit;
                    }

                    public int getPriv_confirm() {
                        return priv_confirm;
                    }

                    public void setPriv_confirm(int priv_confirm) {
                        this.priv_confirm = priv_confirm;
                    }

                    public int getPriv_send() {
                        return priv_send;
                    }

                    public void setPriv_send(int priv_send) {
                        this.priv_send = priv_send;
                    }

                    public int getPriv_create_store_in() {
                        return priv_create_store_in;
                    }

                    public void setPriv_create_store_in(int priv_create_store_in) {
                        this.priv_create_store_in = priv_create_store_in;
                    }

                    public int getPriv_create_order() {
                        return priv_create_order;
                    }

                    public void setPriv_create_order(int priv_create_order) {
                        this.priv_create_order = priv_create_order;
                    }

                    public int getPriv_copy() {
                        return priv_copy;
                    }

                    public void setPriv_copy(int priv_copy) {
                        this.priv_copy = priv_copy;
                    }

                    public int getPriv_enroll() {
                        return priv_enroll;
                    }

                    public void setPriv_enroll(int priv_enroll) {
                        this.priv_enroll = priv_enroll;
                    }

                    public int getPriv_adjust_price() {
                        return priv_adjust_price;
                    }

                    public void setPriv_adjust_price(int priv_adjust_price) {
                        this.priv_adjust_price = priv_adjust_price;
                    }
                }
            }
        }
    }
}