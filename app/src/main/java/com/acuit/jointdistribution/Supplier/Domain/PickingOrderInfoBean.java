package com.acuit.jointdistribution.Supplier.Domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 类名: PickingOrderInfoBean <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/9/14 0014 16:53 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class PickingOrderInfoBean {


    /**
     * code : 200
     * data : {"dep_list":{"19":"临湖"},"department_list":{"临湖":{"stock_info":[{"amount":"2.94","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"9","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"36.75","price":"12.50","region_id":"1","request_stock_id":"348567","status":"1","stock_code":"1020100009","stock_id":"30","stock_name":"红椒","sub_cat_code":"201","sub_cat_id":"41","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"15.99","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"10","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"47.97","price":"3.00","region_id":"1","request_stock_id":"348580","status":"1","stock_code":"1020100010","stock_id":"31","stock_name":"黄瓜（袋装）","sub_cat_code":"201","sub_cat_id":"41","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"38.95","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"11","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"124.64","price":"3.20","region_id":"1","request_stock_id":"348569","status":"1","stock_code":"1020100023","stock_id":"52","stock_name":"西南瓜","sub_cat_code":"201","sub_cat_id":"41","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"6.88","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"12","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"33.71","price":"4.90","region_id":"1","request_stock_id":"348592","status":"1","stock_code":"1020100027","stock_id":"56","stock_name":"杂椒","sub_cat_code":"201","sub_cat_id":"41","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"1.55","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"13","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"9.77","price":"6.30","region_id":"1","request_stock_id":"348560","status":"1","stock_code":"1020200002","stock_id":"58","stock_name":"本地葱","sub_cat_code":"201","sub_cat_id":"42","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"14.00","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"14","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"49.00","price":"3.50","region_id":"1","request_stock_id":"348573","status":"1","stock_code":"1020200011","stock_id":"72","stock_name":"津葱","sub_cat_code":"201","sub_cat_id":"42","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"37.50","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"15","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"93.75","price":"2.50","region_id":"1","request_stock_id":"348582","status":"1","stock_code":"1020200016","stock_id":"77","stock_name":"毛毛菜","sub_cat_code":"201","sub_cat_id":"42","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"13.33","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"16","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"59.99","price":"4.50","region_id":"1","request_stock_id":"348593","status":"1","stock_code":"1020200023","stock_id":"84","stock_name":"生菜","sub_cat_code":"201","sub_cat_id":"42","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"13.33","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"17","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"110.64","price":"8.30","region_id":"1","request_stock_id":"348594","status":"1","stock_code":"1020300001","stock_id":"99","stock_name":"草茭白","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"1.07","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"18","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"16.59","price":"15.50","region_id":"1","request_stock_id":"348578","status":"1","stock_code":"1020300004","stock_id":"102","stock_name":"大蒜子","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"54.55","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"19","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"136.38","price":"2.50","region_id":"1","request_stock_id":"348587","status":"1","stock_code":"1020300005","stock_id":"103","stock_name":"大土豆（袋装）","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"15.31","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"20","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"41.34","price":"2.70","region_id":"1","request_stock_id":"348570","status":"1","stock_code":"1020300006","stock_id":"104","stock_name":"丁香萝卜","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"21.89","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"21","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"157.61","price":"7.20","region_id":"1","request_stock_id":"348565","status":"1","stock_code":"1020300010","stock_id":"108","stock_name":"光莴笋","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"30.14","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"22","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"105.49","price":"3.50","region_id":"1","request_stock_id":"348595","status":"1","stock_code":"1020300018","stock_id":"116","stock_name":"藕","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"0.92","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"23","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"7.08","price":"7.70","region_id":"1","request_stock_id":"348583","status":"1","stock_code":"1020300020","stock_id":"118","stock_name":"生姜","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"37.65","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"24","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"169.43","price":"4.50","region_id":"1","request_stock_id":"348590","status":"1","stock_code":"1020500003","stock_id":"138","stock_name":"花菜(白)","sub_cat_code":"201","sub_cat_id":"45","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"}],"total_amount":306,"total_money":1200.14}},"order_info":{"cat_code":"","cat_id":"38","cat_name":"果蔬类","code":"CGDD16110810","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","contact_number":"","contact_person":"","create_date":"2016-11-25 14:28:40","create_user":"1","create_user_phone":"15973143041","dep_brief_name":"紫金","dep_ids":"","dep_root_id":"1","dep_root_name":"紫金港餐饮中心","end_date":"0","id":"5","is_del":"1","is_used":"0","memo":"","order_date":"0","order_id":"1647","plan_date":"2016-11-26 09:00:00","request_dep_strs":"","status":"4","supply_id":"53","supply_name":"杭州蔬菜物流有限公司","supply_phone":"13666666666","total_amount":"306.00","total_money":"1200.12","update_date":"0000-00-00 00:00:00"},"stock_list":{"102":{"amount_all":1.07,"count":"16.59","dep_info":{"19":{"amount":"1.07","dep_name":"临湖","id":"18"}},"price":"15.50","stock_breif":"DSZ","stock_name":"大蒜子","type_id":"43","unit_name":"千克"},"103":{"amount_all":54.55,"count":"136.38","dep_info":{"19":{"amount":"54.55","dep_name":"临湖","id":"19"}},"price":"2.50","stock_breif":"DTD","stock_name":"大土豆（袋装）","type_id":"43","unit_name":"千克"},"104":{"amount_all":15.31,"count":"41.34","dep_info":{"19":{"amount":"15.31","dep_name":"临湖","id":"20"}},"price":"2.70","stock_breif":"HDXLB","stock_name":"胡（丁香）萝卜","type_id":"43","unit_name":"千克"},"108":{"amount_all":21.89,"count":"157.61","dep_info":{"19":{"amount":"21.89","dep_name":"临湖","id":"21"}},"price":"7.20","stock_breif":"GWS","stock_name":"光莴笋","type_id":"43","unit_name":"千克"},"116":{"amount_all":30.14,"count":"105.49","dep_info":{"19":{"amount":"30.14","dep_name":"临湖","id":"22"}},"price":"3.50","stock_breif":"O","stock_name":"藕","type_id":"43","unit_name":"千克"},"118":{"amount_all":0.92,"count":"7.08","dep_info":{"19":{"amount":"0.92","dep_name":"临湖","id":"23"}},"price":"7.70","stock_breif":"SJ","stock_name":"生姜","type_id":"43","unit_name":"千克"},"138":{"amount_all":37.65,"count":"169.42","dep_info":{"19":{"amount":"37.65","dep_name":"临湖","id":"24"}},"price":"4.50","stock_breif":"HC","stock_name":"花菜(白)","type_id":"45","unit_name":"千克"},"30":{"amount_all":2.94,"count":"36.75","dep_info":{"19":{"amount":"2.94","dep_name":"临湖","id":"9"}},"price":"12.50","stock_breif":"HJ","stock_name":"红椒","type_id":"41","unit_name":"千克"},"31":{"amount_all":15.99,"count":"47.97","dep_info":{"19":{"amount":"15.99","dep_name":"临湖","id":"10"}},"price":"3.00","stock_breif":"HG","stock_name":"黄瓜（袋装）","type_id":"41","unit_name":"千克"},"52":{"amount_all":38.95,"count":"124.64","dep_info":{"19":{"amount":"38.95","dep_name":"临湖","id":"11"}},"price":"3.20","stock_breif":"XNG","stock_name":"西南瓜","type_id":"41","unit_name":"千克"},"56":{"amount_all":6.88,"count":"33.71","dep_info":{"19":{"amount":"6.88","dep_name":"临湖","id":"12"}},"price":"4.90","stock_breif":"ZJ","stock_name":"杂椒","type_id":"41","unit_name":"千克"},"58":{"amount_all":1.55,"count":"9.77","dep_info":{"19":{"amount":"1.55","dep_name":"临湖","id":"13"}},"price":"6.30","stock_breif":"BDC","stock_name":"本地葱","type_id":"42","unit_name":"千克"},"72":{"amount_all":14,"count":"49.00","dep_info":{"19":{"amount":"14.00","dep_name":"临湖","id":"14"}},"price":"3.50","stock_breif":"JC","stock_name":"津葱","type_id":"42","unit_name":"千克"},"77":{"amount_all":37.5,"count":"93.75","dep_info":{"19":{"amount":"37.50","dep_name":"临湖","id":"15"}},"price":"2.50","stock_breif":"MMC","stock_name":"毛毛菜","type_id":"42","unit_name":"千克"},"84":{"amount_all":13.33,"count":"59.98","dep_info":{"19":{"amount":"13.33","dep_name":"临湖","id":"16"}},"price":"4.50","stock_breif":"SC","stock_name":"生菜","type_id":"42","unit_name":"千克"},"99":{"amount_all":13.33,"count":"110.64","dep_info":{"19":{"amount":"13.33","dep_name":"临湖","id":"17"}},"price":"8.30","stock_breif":"CJB","stock_name":"草茭白","type_id":"43","unit_name":"千克"}}}
     * msg : 执行成功！
     */

    private int code;
    private DataBean data;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean {
        /**
         * dep_list : {"19":"临湖"}
         * department_list : {"临湖":{"stock_info":[{"amount":"2.94","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"9","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"36.75","price":"12.50","region_id":"1","request_stock_id":"348567","status":"1","stock_code":"1020100009","stock_id":"30","stock_name":"红椒","sub_cat_code":"201","sub_cat_id":"41","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"15.99","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"10","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"47.97","price":"3.00","region_id":"1","request_stock_id":"348580","status":"1","stock_code":"1020100010","stock_id":"31","stock_name":"黄瓜（袋装）","sub_cat_code":"201","sub_cat_id":"41","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"38.95","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"11","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"124.64","price":"3.20","region_id":"1","request_stock_id":"348569","status":"1","stock_code":"1020100023","stock_id":"52","stock_name":"西南瓜","sub_cat_code":"201","sub_cat_id":"41","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"6.88","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"12","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"33.71","price":"4.90","region_id":"1","request_stock_id":"348592","status":"1","stock_code":"1020100027","stock_id":"56","stock_name":"杂椒","sub_cat_code":"201","sub_cat_id":"41","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"1.55","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"13","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"9.77","price":"6.30","region_id":"1","request_stock_id":"348560","status":"1","stock_code":"1020200002","stock_id":"58","stock_name":"本地葱","sub_cat_code":"201","sub_cat_id":"42","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"14.00","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"14","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"49.00","price":"3.50","region_id":"1","request_stock_id":"348573","status":"1","stock_code":"1020200011","stock_id":"72","stock_name":"津葱","sub_cat_code":"201","sub_cat_id":"42","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"37.50","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"15","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"93.75","price":"2.50","region_id":"1","request_stock_id":"348582","status":"1","stock_code":"1020200016","stock_id":"77","stock_name":"毛毛菜","sub_cat_code":"201","sub_cat_id":"42","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"13.33","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"16","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"59.99","price":"4.50","region_id":"1","request_stock_id":"348593","status":"1","stock_code":"1020200023","stock_id":"84","stock_name":"生菜","sub_cat_code":"201","sub_cat_id":"42","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"13.33","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"17","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"110.64","price":"8.30","region_id":"1","request_stock_id":"348594","status":"1","stock_code":"1020300001","stock_id":"99","stock_name":"草茭白","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"1.07","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"18","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"16.59","price":"15.50","region_id":"1","request_stock_id":"348578","status":"1","stock_code":"1020300004","stock_id":"102","stock_name":"大蒜子","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"54.55","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"19","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"136.38","price":"2.50","region_id":"1","request_stock_id":"348587","status":"1","stock_code":"1020300005","stock_id":"103","stock_name":"大土豆（袋装）","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"15.31","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"20","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"41.34","price":"2.70","region_id":"1","request_stock_id":"348570","status":"1","stock_code":"1020300006","stock_id":"104","stock_name":"丁香萝卜","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"21.89","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"21","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"157.61","price":"7.20","region_id":"1","request_stock_id":"348565","status":"1","stock_code":"1020300010","stock_id":"108","stock_name":"光莴笋","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"30.14","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"22","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"105.49","price":"3.50","region_id":"1","request_stock_id":"348595","status":"1","stock_code":"1020300018","stock_id":"116","stock_name":"藕","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"0.92","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"23","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"7.08","price":"7.70","region_id":"1","request_stock_id":"348583","status":"1","stock_code":"1020300020","stock_id":"118","stock_name":"生姜","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"37.65","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"24","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"169.43","price":"4.50","region_id":"1","request_stock_id":"348590","status":"1","stock_code":"1020500003","stock_id":"138","stock_name":"花菜(白)","sub_cat_code":"201","sub_cat_id":"45","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"}],"total_amount":306,"total_money":1200.14}}
         * order_info : {"cat_code":"","cat_id":"38","cat_name":"果蔬类","code":"CGDD16110810","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","contact_number":"","contact_person":"","create_date":"2016-11-25 14:28:40","create_user":"1","create_user_phone":"15973143041","dep_brief_name":"紫金","dep_ids":"","dep_root_id":"1","dep_root_name":"紫金港餐饮中心","end_date":"0","id":"5","is_del":"1","is_used":"0","memo":"","order_date":"0","order_id":"1647","plan_date":"2016-11-26 09:00:00","request_dep_strs":"","status":"4","supply_id":"53","supply_name":"杭州蔬菜物流有限公司","supply_phone":"13666666666","total_amount":"306.00","total_money":"1200.12","update_date":"0000-00-00 00:00:00"}
         * stock_list : {"102":{"amount_all":1.07,"count":"16.59","dep_info":{"19":{"amount":"1.07","dep_name":"临湖","id":"18"}},"price":"15.50","stock_breif":"DSZ","stock_name":"大蒜子","type_id":"43","unit_name":"千克"},"103":{"amount_all":54.55,"count":"136.38","dep_info":{"19":{"amount":"54.55","dep_name":"临湖","id":"19"}},"price":"2.50","stock_breif":"DTD","stock_name":"大土豆（袋装）","type_id":"43","unit_name":"千克"},"104":{"amount_all":15.31,"count":"41.34","dep_info":{"19":{"amount":"15.31","dep_name":"临湖","id":"20"}},"price":"2.70","stock_breif":"HDXLB","stock_name":"胡（丁香）萝卜","type_id":"43","unit_name":"千克"},"108":{"amount_all":21.89,"count":"157.61","dep_info":{"19":{"amount":"21.89","dep_name":"临湖","id":"21"}},"price":"7.20","stock_breif":"GWS","stock_name":"光莴笋","type_id":"43","unit_name":"千克"},"116":{"amount_all":30.14,"count":"105.49","dep_info":{"19":{"amount":"30.14","dep_name":"临湖","id":"22"}},"price":"3.50","stock_breif":"O","stock_name":"藕","type_id":"43","unit_name":"千克"},"118":{"amount_all":0.92,"count":"7.08","dep_info":{"19":{"amount":"0.92","dep_name":"临湖","id":"23"}},"price":"7.70","stock_breif":"SJ","stock_name":"生姜","type_id":"43","unit_name":"千克"},"138":{"amount_all":37.65,"count":"169.42","dep_info":{"19":{"amount":"37.65","dep_name":"临湖","id":"24"}},"price":"4.50","stock_breif":"HC","stock_name":"花菜(白)","type_id":"45","unit_name":"千克"},"30":{"amount_all":2.94,"count":"36.75","dep_info":{"19":{"amount":"2.94","dep_name":"临湖","id":"9"}},"price":"12.50","stock_breif":"HJ","stock_name":"红椒","type_id":"41","unit_name":"千克"},"31":{"amount_all":15.99,"count":"47.97","dep_info":{"19":{"amount":"15.99","dep_name":"临湖","id":"10"}},"price":"3.00","stock_breif":"HG","stock_name":"黄瓜（袋装）","type_id":"41","unit_name":"千克"},"52":{"amount_all":38.95,"count":"124.64","dep_info":{"19":{"amount":"38.95","dep_name":"临湖","id":"11"}},"price":"3.20","stock_breif":"XNG","stock_name":"西南瓜","type_id":"41","unit_name":"千克"},"56":{"amount_all":6.88,"count":"33.71","dep_info":{"19":{"amount":"6.88","dep_name":"临湖","id":"12"}},"price":"4.90","stock_breif":"ZJ","stock_name":"杂椒","type_id":"41","unit_name":"千克"},"58":{"amount_all":1.55,"count":"9.77","dep_info":{"19":{"amount":"1.55","dep_name":"临湖","id":"13"}},"price":"6.30","stock_breif":"BDC","stock_name":"本地葱","type_id":"42","unit_name":"千克"},"72":{"amount_all":14,"count":"49.00","dep_info":{"19":{"amount":"14.00","dep_name":"临湖","id":"14"}},"price":"3.50","stock_breif":"JC","stock_name":"津葱","type_id":"42","unit_name":"千克"},"77":{"amount_all":37.5,"count":"93.75","dep_info":{"19":{"amount":"37.50","dep_name":"临湖","id":"15"}},"price":"2.50","stock_breif":"MMC","stock_name":"毛毛菜","type_id":"42","unit_name":"千克"},"84":{"amount_all":13.33,"count":"59.98","dep_info":{"19":{"amount":"13.33","dep_name":"临湖","id":"16"}},"price":"4.50","stock_breif":"SC","stock_name":"生菜","type_id":"42","unit_name":"千克"},"99":{"amount_all":13.33,"count":"110.64","dep_info":{"19":{"amount":"13.33","dep_name":"临湖","id":"17"}},"price":"8.30","stock_breif":"CJB","stock_name":"草茭白","type_id":"43","unit_name":"千克"}}
         */

        private DepListBean dep_list;
        private DepartmentListBean department_list;
        private OrderInfoBean order_info;
        private StockListBean stock_list;

        public DepListBean getDep_list() {
            return dep_list;
        }

        public void setDep_list(DepListBean dep_list) {
            this.dep_list = dep_list;
        }

        public DepartmentListBean getDepartment_list() {
            return department_list;
        }

        public void setDepartment_list(DepartmentListBean department_list) {
            this.department_list = department_list;
        }

        public OrderInfoBean getOrder_info() {
            return order_info;
        }

        public void setOrder_info(OrderInfoBean order_info) {
            this.order_info = order_info;
        }

        public StockListBean getStock_list() {
            return stock_list;
        }

        public void setStock_list(StockListBean stock_list) {
            this.stock_list = stock_list;
        }

        public static class DepListBean {
            /**
             * 19 : 临湖
             */

            @SerializedName("19")
            private String _$19;

            public String get_$19() {
                return _$19;
            }

            public void set_$19(String _$19) {
                this._$19 = _$19;
            }
        }

        public static class DepartmentListBean {
            /**
             * 临湖 : {"stock_info":[{"amount":"2.94","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"9","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"36.75","price":"12.50","region_id":"1","request_stock_id":"348567","status":"1","stock_code":"1020100009","stock_id":"30","stock_name":"红椒","sub_cat_code":"201","sub_cat_id":"41","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"15.99","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"10","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"47.97","price":"3.00","region_id":"1","request_stock_id":"348580","status":"1","stock_code":"1020100010","stock_id":"31","stock_name":"黄瓜（袋装）","sub_cat_code":"201","sub_cat_id":"41","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"38.95","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"11","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"124.64","price":"3.20","region_id":"1","request_stock_id":"348569","status":"1","stock_code":"1020100023","stock_id":"52","stock_name":"西南瓜","sub_cat_code":"201","sub_cat_id":"41","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"6.88","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"12","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"33.71","price":"4.90","region_id":"1","request_stock_id":"348592","status":"1","stock_code":"1020100027","stock_id":"56","stock_name":"杂椒","sub_cat_code":"201","sub_cat_id":"41","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"1.55","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"13","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"9.77","price":"6.30","region_id":"1","request_stock_id":"348560","status":"1","stock_code":"1020200002","stock_id":"58","stock_name":"本地葱","sub_cat_code":"201","sub_cat_id":"42","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"14.00","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"14","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"49.00","price":"3.50","region_id":"1","request_stock_id":"348573","status":"1","stock_code":"1020200011","stock_id":"72","stock_name":"津葱","sub_cat_code":"201","sub_cat_id":"42","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"37.50","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"15","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"93.75","price":"2.50","region_id":"1","request_stock_id":"348582","status":"1","stock_code":"1020200016","stock_id":"77","stock_name":"毛毛菜","sub_cat_code":"201","sub_cat_id":"42","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"13.33","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"16","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"59.99","price":"4.50","region_id":"1","request_stock_id":"348593","status":"1","stock_code":"1020200023","stock_id":"84","stock_name":"生菜","sub_cat_code":"201","sub_cat_id":"42","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"13.33","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"17","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"110.64","price":"8.30","region_id":"1","request_stock_id":"348594","status":"1","stock_code":"1020300001","stock_id":"99","stock_name":"草茭白","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"1.07","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"18","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"16.59","price":"15.50","region_id":"1","request_stock_id":"348578","status":"1","stock_code":"1020300004","stock_id":"102","stock_name":"大蒜子","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"54.55","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"19","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"136.38","price":"2.50","region_id":"1","request_stock_id":"348587","status":"1","stock_code":"1020300005","stock_id":"103","stock_name":"大土豆（袋装）","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"15.31","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"20","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"41.34","price":"2.70","region_id":"1","request_stock_id":"348570","status":"1","stock_code":"1020300006","stock_id":"104","stock_name":"丁香萝卜","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"21.89","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"21","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"157.61","price":"7.20","region_id":"1","request_stock_id":"348565","status":"1","stock_code":"1020300010","stock_id":"108","stock_name":"光莴笋","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"30.14","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"22","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"105.49","price":"3.50","region_id":"1","request_stock_id":"348595","status":"1","stock_code":"1020300018","stock_id":"116","stock_name":"藕","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"0.92","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"23","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"7.08","price":"7.70","region_id":"1","request_stock_id":"348583","status":"1","stock_code":"1020300020","stock_id":"118","stock_name":"生姜","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"37.65","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"24","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"169.43","price":"4.50","region_id":"1","request_stock_id":"348590","status":"1","stock_code":"1020500003","stock_id":"138","stock_name":"花菜(白)","sub_cat_code":"201","sub_cat_id":"45","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"}],"total_amount":306,"total_money":1200.14}
             */

            private 临湖Bean 临湖;

            public 临湖Bean get临湖() {
                return 临湖;
            }

            public void set临湖(临湖Bean 临湖) {
                this.临湖 = 临湖;
            }

            public static class 临湖Bean {
                /**
                 * stock_info : [{"amount":"2.94","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"9","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"36.75","price":"12.50","region_id":"1","request_stock_id":"348567","status":"1","stock_code":"1020100009","stock_id":"30","stock_name":"红椒","sub_cat_code":"201","sub_cat_id":"41","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"15.99","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"10","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"47.97","price":"3.00","region_id":"1","request_stock_id":"348580","status":"1","stock_code":"1020100010","stock_id":"31","stock_name":"黄瓜（袋装）","sub_cat_code":"201","sub_cat_id":"41","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"38.95","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"11","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"124.64","price":"3.20","region_id":"1","request_stock_id":"348569","status":"1","stock_code":"1020100023","stock_id":"52","stock_name":"西南瓜","sub_cat_code":"201","sub_cat_id":"41","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"6.88","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"12","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"33.71","price":"4.90","region_id":"1","request_stock_id":"348592","status":"1","stock_code":"1020100027","stock_id":"56","stock_name":"杂椒","sub_cat_code":"201","sub_cat_id":"41","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"1.55","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"13","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"9.77","price":"6.30","region_id":"1","request_stock_id":"348560","status":"1","stock_code":"1020200002","stock_id":"58","stock_name":"本地葱","sub_cat_code":"201","sub_cat_id":"42","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"14.00","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"14","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"49.00","price":"3.50","region_id":"1","request_stock_id":"348573","status":"1","stock_code":"1020200011","stock_id":"72","stock_name":"津葱","sub_cat_code":"201","sub_cat_id":"42","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"37.50","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"15","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"93.75","price":"2.50","region_id":"1","request_stock_id":"348582","status":"1","stock_code":"1020200016","stock_id":"77","stock_name":"毛毛菜","sub_cat_code":"201","sub_cat_id":"42","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"13.33","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"16","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"59.99","price":"4.50","region_id":"1","request_stock_id":"348593","status":"1","stock_code":"1020200023","stock_id":"84","stock_name":"生菜","sub_cat_code":"201","sub_cat_id":"42","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"13.33","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"17","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"110.64","price":"8.30","region_id":"1","request_stock_id":"348594","status":"1","stock_code":"1020300001","stock_id":"99","stock_name":"草茭白","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"1.07","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"18","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"16.59","price":"15.50","region_id":"1","request_stock_id":"348578","status":"1","stock_code":"1020300004","stock_id":"102","stock_name":"大蒜子","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"54.55","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"19","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"136.38","price":"2.50","region_id":"1","request_stock_id":"348587","status":"1","stock_code":"1020300005","stock_id":"103","stock_name":"大土豆（袋装）","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"15.31","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"20","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"41.34","price":"2.70","region_id":"1","request_stock_id":"348570","status":"1","stock_code":"1020300006","stock_id":"104","stock_name":"丁香萝卜","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"21.89","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"21","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"157.61","price":"7.20","region_id":"1","request_stock_id":"348565","status":"1","stock_code":"1020300010","stock_id":"108","stock_name":"光莴笋","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"30.14","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"22","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"105.49","price":"3.50","region_id":"1","request_stock_id":"348595","status":"1","stock_code":"1020300018","stock_id":"116","stock_name":"藕","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"0.92","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"23","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"7.08","price":"7.70","region_id":"1","request_stock_id":"348583","status":"1","stock_code":"1020300020","stock_id":"118","stock_name":"生姜","sub_cat_code":"201","sub_cat_id":"43","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"37.65","big_region_id":"15","busy_amount":"0.00","buy_order_id":"5","code":"","create_date":"1480055320","dep_code":"","dep_id":"19","direct_in_out":"0","id":"24","in_amount":"0.00","in_money":"0.00","is_del":"0","is_used":"0","lot_control":"0","money":"169.43","price":"4.50","region_id":"1","request_stock_id":"348590","status":"1","stock_code":"1020500003","stock_id":"138","stock_name":"花菜(白)","sub_cat_code":"201","sub_cat_id":"45","sub_cat_name":"大众食品","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"}]
                 * total_amount : 306
                 * total_money : 1200.14
                 */

                private int total_amount;
                private double total_money;
                private List<StockInfoBean> stock_info;

                public int getTotal_amount() {
                    return total_amount;
                }

                public void setTotal_amount(int total_amount) {
                    this.total_amount = total_amount;
                }

                public double getTotal_money() {
                    return total_money;
                }

                public void setTotal_money(double total_money) {
                    this.total_money = total_money;
                }

                public List<StockInfoBean> getStock_info() {
                    return stock_info;
                }

                public void setStock_info(List<StockInfoBean> stock_info) {
                    this.stock_info = stock_info;
                }

                public static class StockInfoBean {
                    /**
                     * amount : 2.94
                     * big_region_id : 15
                     * busy_amount : 0.00
                     * buy_order_id : 5
                     * code :
                     * create_date : 1480055320
                     * dep_code :
                     * dep_id : 19
                     * direct_in_out : 0
                     * id : 9
                     * in_amount : 0.00
                     * in_money : 0.00
                     * is_del : 0
                     * is_used : 0
                     * lot_control : 0
                     * money : 36.75
                     * price : 12.50
                     * region_id : 1
                     * request_stock_id : 348567
                     * status : 1
                     * stock_code : 1020100009
                     * stock_id : 30
                     * stock_name : 红椒
                     * sub_cat_code : 201
                     * sub_cat_id : 41
                     * sub_cat_name : 大众食品
                     * unit_conv : 0.00
                     * unit_id : 6
                     * unit_name : 千克
                     * wait_store_in : 0
                     */

                    private String amount;
                    private String big_region_id;
                    private String busy_amount;
                    private String buy_order_id;
                    private String code;
                    private String create_date;
                    private String dep_code;
                    private String dep_id;
                    private String direct_in_out;
                    private String id;
                    private String in_amount;
                    private String in_money;
                    private String is_del;
                    private String is_used;
                    private String lot_control;
                    private String money;
                    private String price;
                    private String region_id;
                    private String request_stock_id;
                    private String status;
                    private String stock_code;
                    private String stock_id;
                    private String stock_name;
                    private String sub_cat_code;
                    private String sub_cat_id;
                    private String sub_cat_name;
                    private String unit_conv;
                    private String unit_id;
                    private String unit_name;
                    private String wait_store_in;

                    public String getAmount() {
                        return amount;
                    }

                    public void setAmount(String amount) {
                        this.amount = amount;
                    }

                    public String getBig_region_id() {
                        return big_region_id;
                    }

                    public void setBig_region_id(String big_region_id) {
                        this.big_region_id = big_region_id;
                    }

                    public String getBusy_amount() {
                        return busy_amount;
                    }

                    public void setBusy_amount(String busy_amount) {
                        this.busy_amount = busy_amount;
                    }

                    public String getBuy_order_id() {
                        return buy_order_id;
                    }

                    public void setBuy_order_id(String buy_order_id) {
                        this.buy_order_id = buy_order_id;
                    }

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getCreate_date() {
                        return create_date;
                    }

                    public void setCreate_date(String create_date) {
                        this.create_date = create_date;
                    }

                    public String getDep_code() {
                        return dep_code;
                    }

                    public void setDep_code(String dep_code) {
                        this.dep_code = dep_code;
                    }

                    public String getDep_id() {
                        return dep_id;
                    }

                    public void setDep_id(String dep_id) {
                        this.dep_id = dep_id;
                    }

                    public String getDirect_in_out() {
                        return direct_in_out;
                    }

                    public void setDirect_in_out(String direct_in_out) {
                        this.direct_in_out = direct_in_out;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getIn_amount() {
                        return in_amount;
                    }

                    public void setIn_amount(String in_amount) {
                        this.in_amount = in_amount;
                    }

                    public String getIn_money() {
                        return in_money;
                    }

                    public void setIn_money(String in_money) {
                        this.in_money = in_money;
                    }

                    public String getIs_del() {
                        return is_del;
                    }

                    public void setIs_del(String is_del) {
                        this.is_del = is_del;
                    }

                    public String getIs_used() {
                        return is_used;
                    }

                    public void setIs_used(String is_used) {
                        this.is_used = is_used;
                    }

                    public String getLot_control() {
                        return lot_control;
                    }

                    public void setLot_control(String lot_control) {
                        this.lot_control = lot_control;
                    }

                    public String getMoney() {
                        return money;
                    }

                    public void setMoney(String money) {
                        this.money = money;
                    }

                    public String getPrice() {
                        return price;
                    }

                    public void setPrice(String price) {
                        this.price = price;
                    }

                    public String getRegion_id() {
                        return region_id;
                    }

                    public void setRegion_id(String region_id) {
                        this.region_id = region_id;
                    }

                    public String getRequest_stock_id() {
                        return request_stock_id;
                    }

                    public void setRequest_stock_id(String request_stock_id) {
                        this.request_stock_id = request_stock_id;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public String getStock_code() {
                        return stock_code;
                    }

                    public void setStock_code(String stock_code) {
                        this.stock_code = stock_code;
                    }

                    public String getStock_id() {
                        return stock_id;
                    }

                    public void setStock_id(String stock_id) {
                        this.stock_id = stock_id;
                    }

                    public String getStock_name() {
                        return stock_name;
                    }

                    public void setStock_name(String stock_name) {
                        this.stock_name = stock_name;
                    }

                    public String getSub_cat_code() {
                        return sub_cat_code;
                    }

                    public void setSub_cat_code(String sub_cat_code) {
                        this.sub_cat_code = sub_cat_code;
                    }

                    public String getSub_cat_id() {
                        return sub_cat_id;
                    }

                    public void setSub_cat_id(String sub_cat_id) {
                        this.sub_cat_id = sub_cat_id;
                    }

                    public String getSub_cat_name() {
                        return sub_cat_name;
                    }

                    public void setSub_cat_name(String sub_cat_name) {
                        this.sub_cat_name = sub_cat_name;
                    }

                    public String getUnit_conv() {
                        return unit_conv;
                    }

                    public void setUnit_conv(String unit_conv) {
                        this.unit_conv = unit_conv;
                    }

                    public String getUnit_id() {
                        return unit_id;
                    }

                    public void setUnit_id(String unit_id) {
                        this.unit_id = unit_id;
                    }

                    public String getUnit_name() {
                        return unit_name;
                    }

                    public void setUnit_name(String unit_name) {
                        this.unit_name = unit_name;
                    }

                    public String getWait_store_in() {
                        return wait_store_in;
                    }

                    public void setWait_store_in(String wait_store_in) {
                        this.wait_store_in = wait_store_in;
                    }
                }
            }
        }

        public static class OrderInfoBean {
            /**
             * cat_code :
             * cat_id : 38
             * cat_name : 果蔬类
             * code : CGDD16110810
             * com_brief_name : 浙大
             * com_id : 1
             * com_name : 浙大饮食中心
             * contact_number :
             * contact_person :
             * create_date : 2016-11-25 14:28:40
             * create_user : 1
             * create_user_phone : 15973143041
             * dep_brief_name : 紫金
             * dep_ids :
             * dep_root_id : 1
             * dep_root_name : 紫金港餐饮中心
             * end_date : 0
             * id : 5
             * is_del : 1
             * is_used : 0
             * memo :
             * order_date : 0
             * order_id : 1647
             * plan_date : 2016-11-26 09:00:00
             * request_dep_strs :
             * status : 4
             * supply_id : 53
             * supply_name : 杭州蔬菜物流有限公司
             * supply_phone : 13666666666
             * total_amount : 306.00
             * total_money : 1200.12
             * update_date : 0000-00-00 00:00:00
             */

            private String cat_code;
            private String cat_id;
            private String cat_name;
            private String code;
            private String com_brief_name;
            private String com_id;
            private String com_name;
            private String contact_number;
            private String contact_person;
            private String create_date;
            private String create_user;
            private String create_user_phone;
            private String dep_brief_name;
            private String dep_ids;
            private String dep_root_id;
            private String dep_root_name;
            private String end_date;
            private String id;
            private String is_del;
            private String is_used;
            private String memo;
            private String order_date;
            private String order_id;
            private String plan_date;
            private String request_dep_strs;
            private String status;
            private String supply_id;
            private String supply_name;
            private String supply_phone;
            private String total_amount;
            private String total_money;
            private String update_date;

            public String getCat_code() {
                return cat_code;
            }

            public void setCat_code(String cat_code) {
                this.cat_code = cat_code;
            }

            public String getCat_id() {
                return cat_id;
            }

            public void setCat_id(String cat_id) {
                this.cat_id = cat_id;
            }

            public String getCat_name() {
                return cat_name;
            }

            public void setCat_name(String cat_name) {
                this.cat_name = cat_name;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getCom_brief_name() {
                return com_brief_name;
            }

            public void setCom_brief_name(String com_brief_name) {
                this.com_brief_name = com_brief_name;
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

            public String getContact_number() {
                return contact_number;
            }

            public void setContact_number(String contact_number) {
                this.contact_number = contact_number;
            }

            public String getContact_person() {
                return contact_person;
            }

            public void setContact_person(String contact_person) {
                this.contact_person = contact_person;
            }

            public String getCreate_date() {
                return create_date;
            }

            public void setCreate_date(String create_date) {
                this.create_date = create_date;
            }

            public String getCreate_user() {
                return create_user;
            }

            public void setCreate_user(String create_user) {
                this.create_user = create_user;
            }

            public String getCreate_user_phone() {
                return create_user_phone;
            }

            public void setCreate_user_phone(String create_user_phone) {
                this.create_user_phone = create_user_phone;
            }

            public String getDep_brief_name() {
                return dep_brief_name;
            }

            public void setDep_brief_name(String dep_brief_name) {
                this.dep_brief_name = dep_brief_name;
            }

            public String getDep_ids() {
                return dep_ids;
            }

            public void setDep_ids(String dep_ids) {
                this.dep_ids = dep_ids;
            }

            public String getDep_root_id() {
                return dep_root_id;
            }

            public void setDep_root_id(String dep_root_id) {
                this.dep_root_id = dep_root_id;
            }

            public String getDep_root_name() {
                return dep_root_name;
            }

            public void setDep_root_name(String dep_root_name) {
                this.dep_root_name = dep_root_name;
            }

            public String getEnd_date() {
                return end_date;
            }

            public void setEnd_date(String end_date) {
                this.end_date = end_date;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getIs_del() {
                return is_del;
            }

            public void setIs_del(String is_del) {
                this.is_del = is_del;
            }

            public String getIs_used() {
                return is_used;
            }

            public void setIs_used(String is_used) {
                this.is_used = is_used;
            }

            public String getMemo() {
                return memo;
            }

            public void setMemo(String memo) {
                this.memo = memo;
            }

            public String getOrder_date() {
                return order_date;
            }

            public void setOrder_date(String order_date) {
                this.order_date = order_date;
            }

            public String getOrder_id() {
                return order_id;
            }

            public void setOrder_id(String order_id) {
                this.order_id = order_id;
            }

            public String getPlan_date() {
                return plan_date;
            }

            public void setPlan_date(String plan_date) {
                this.plan_date = plan_date;
            }

            public String getRequest_dep_strs() {
                return request_dep_strs;
            }

            public void setRequest_dep_strs(String request_dep_strs) {
                this.request_dep_strs = request_dep_strs;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getSupply_id() {
                return supply_id;
            }

            public void setSupply_id(String supply_id) {
                this.supply_id = supply_id;
            }

            public String getSupply_name() {
                return supply_name;
            }

            public void setSupply_name(String supply_name) {
                this.supply_name = supply_name;
            }

            public String getSupply_phone() {
                return supply_phone;
            }

            public void setSupply_phone(String supply_phone) {
                this.supply_phone = supply_phone;
            }

            public String getTotal_amount() {
                return total_amount;
            }

            public void setTotal_amount(String total_amount) {
                this.total_amount = total_amount;
            }

            public String getTotal_money() {
                return total_money;
            }

            public void setTotal_money(String total_money) {
                this.total_money = total_money;
            }

            public String getUpdate_date() {
                return update_date;
            }

            public void setUpdate_date(String update_date) {
                this.update_date = update_date;
            }
        }

        public static class StockListBean {
            /**
             * 102 : {"amount_all":1.07,"count":"16.59","dep_info":{"19":{"amount":"1.07","dep_name":"临湖","id":"18"}},"price":"15.50","stock_breif":"DSZ","stock_name":"大蒜子","type_id":"43","unit_name":"千克"}
             * 103 : {"amount_all":54.55,"count":"136.38","dep_info":{"19":{"amount":"54.55","dep_name":"临湖","id":"19"}},"price":"2.50","stock_breif":"DTD","stock_name":"大土豆（袋装）","type_id":"43","unit_name":"千克"}
             * 104 : {"amount_all":15.31,"count":"41.34","dep_info":{"19":{"amount":"15.31","dep_name":"临湖","id":"20"}},"price":"2.70","stock_breif":"HDXLB","stock_name":"胡（丁香）萝卜","type_id":"43","unit_name":"千克"}
             * 108 : {"amount_all":21.89,"count":"157.61","dep_info":{"19":{"amount":"21.89","dep_name":"临湖","id":"21"}},"price":"7.20","stock_breif":"GWS","stock_name":"光莴笋","type_id":"43","unit_name":"千克"}
             * 116 : {"amount_all":30.14,"count":"105.49","dep_info":{"19":{"amount":"30.14","dep_name":"临湖","id":"22"}},"price":"3.50","stock_breif":"O","stock_name":"藕","type_id":"43","unit_name":"千克"}
             * 118 : {"amount_all":0.92,"count":"7.08","dep_info":{"19":{"amount":"0.92","dep_name":"临湖","id":"23"}},"price":"7.70","stock_breif":"SJ","stock_name":"生姜","type_id":"43","unit_name":"千克"}
             * 138 : {"amount_all":37.65,"count":"169.42","dep_info":{"19":{"amount":"37.65","dep_name":"临湖","id":"24"}},"price":"4.50","stock_breif":"HC","stock_name":"花菜(白)","type_id":"45","unit_name":"千克"}
             * 30 : {"amount_all":2.94,"count":"36.75","dep_info":{"19":{"amount":"2.94","dep_name":"临湖","id":"9"}},"price":"12.50","stock_breif":"HJ","stock_name":"红椒","type_id":"41","unit_name":"千克"}
             * 31 : {"amount_all":15.99,"count":"47.97","dep_info":{"19":{"amount":"15.99","dep_name":"临湖","id":"10"}},"price":"3.00","stock_breif":"HG","stock_name":"黄瓜（袋装）","type_id":"41","unit_name":"千克"}
             * 52 : {"amount_all":38.95,"count":"124.64","dep_info":{"19":{"amount":"38.95","dep_name":"临湖","id":"11"}},"price":"3.20","stock_breif":"XNG","stock_name":"西南瓜","type_id":"41","unit_name":"千克"}
             * 56 : {"amount_all":6.88,"count":"33.71","dep_info":{"19":{"amount":"6.88","dep_name":"临湖","id":"12"}},"price":"4.90","stock_breif":"ZJ","stock_name":"杂椒","type_id":"41","unit_name":"千克"}
             * 58 : {"amount_all":1.55,"count":"9.77","dep_info":{"19":{"amount":"1.55","dep_name":"临湖","id":"13"}},"price":"6.30","stock_breif":"BDC","stock_name":"本地葱","type_id":"42","unit_name":"千克"}
             * 72 : {"amount_all":14,"count":"49.00","dep_info":{"19":{"amount":"14.00","dep_name":"临湖","id":"14"}},"price":"3.50","stock_breif":"JC","stock_name":"津葱","type_id":"42","unit_name":"千克"}
             * 77 : {"amount_all":37.5,"count":"93.75","dep_info":{"19":{"amount":"37.50","dep_name":"临湖","id":"15"}},"price":"2.50","stock_breif":"MMC","stock_name":"毛毛菜","type_id":"42","unit_name":"千克"}
             * 84 : {"amount_all":13.33,"count":"59.98","dep_info":{"19":{"amount":"13.33","dep_name":"临湖","id":"16"}},"price":"4.50","stock_breif":"SC","stock_name":"生菜","type_id":"42","unit_name":"千克"}
             * 99 : {"amount_all":13.33,"count":"110.64","dep_info":{"19":{"amount":"13.33","dep_name":"临湖","id":"17"}},"price":"8.30","stock_breif":"CJB","stock_name":"草茭白","type_id":"43","unit_name":"千克"}
             */

            @SerializedName("102")
            private _$102Bean _$102;
            @SerializedName("103")
            private _$103Bean _$103;
            @SerializedName("104")
            private _$104Bean _$104;
            @SerializedName("108")
            private _$108Bean _$108;
            @SerializedName("116")
            private _$116Bean _$116;
            @SerializedName("118")
            private _$118Bean _$118;
            @SerializedName("138")
            private _$138Bean _$138;
            @SerializedName("30")
            private _$30Bean _$30;
            @SerializedName("31")
            private _$31Bean _$31;
            @SerializedName("52")
            private _$52Bean _$52;
            @SerializedName("56")
            private _$56Bean _$56;
            @SerializedName("58")
            private _$58Bean _$58;
            @SerializedName("72")
            private _$72Bean _$72;
            @SerializedName("77")
            private _$77Bean _$77;
            @SerializedName("84")
            private _$84Bean _$84;
            @SerializedName("99")
            private _$99Bean _$99;

            public _$102Bean get_$102() {
                return _$102;
            }

            public void set_$102(_$102Bean _$102) {
                this._$102 = _$102;
            }

            public _$103Bean get_$103() {
                return _$103;
            }

            public void set_$103(_$103Bean _$103) {
                this._$103 = _$103;
            }

            public _$104Bean get_$104() {
                return _$104;
            }

            public void set_$104(_$104Bean _$104) {
                this._$104 = _$104;
            }

            public _$108Bean get_$108() {
                return _$108;
            }

            public void set_$108(_$108Bean _$108) {
                this._$108 = _$108;
            }

            public _$116Bean get_$116() {
                return _$116;
            }

            public void set_$116(_$116Bean _$116) {
                this._$116 = _$116;
            }

            public _$118Bean get_$118() {
                return _$118;
            }

            public void set_$118(_$118Bean _$118) {
                this._$118 = _$118;
            }

            public _$138Bean get_$138() {
                return _$138;
            }

            public void set_$138(_$138Bean _$138) {
                this._$138 = _$138;
            }

            public _$30Bean get_$30() {
                return _$30;
            }

            public void set_$30(_$30Bean _$30) {
                this._$30 = _$30;
            }

            public _$31Bean get_$31() {
                return _$31;
            }

            public void set_$31(_$31Bean _$31) {
                this._$31 = _$31;
            }

            public _$52Bean get_$52() {
                return _$52;
            }

            public void set_$52(_$52Bean _$52) {
                this._$52 = _$52;
            }

            public _$56Bean get_$56() {
                return _$56;
            }

            public void set_$56(_$56Bean _$56) {
                this._$56 = _$56;
            }

            public _$58Bean get_$58() {
                return _$58;
            }

            public void set_$58(_$58Bean _$58) {
                this._$58 = _$58;
            }

            public _$72Bean get_$72() {
                return _$72;
            }

            public void set_$72(_$72Bean _$72) {
                this._$72 = _$72;
            }

            public _$77Bean get_$77() {
                return _$77;
            }

            public void set_$77(_$77Bean _$77) {
                this._$77 = _$77;
            }

            public _$84Bean get_$84() {
                return _$84;
            }

            public void set_$84(_$84Bean _$84) {
                this._$84 = _$84;
            }

            public _$99Bean get_$99() {
                return _$99;
            }

            public void set_$99(_$99Bean _$99) {
                this._$99 = _$99;
            }

            public static class _$102Bean {
                /**
                 * amount_all : 1.07
                 * count : 16.59
                 * dep_info : {"19":{"amount":"1.07","dep_name":"临湖","id":"18"}}
                 * price : 15.50
                 * stock_breif : DSZ
                 * stock_name : 大蒜子
                 * type_id : 43
                 * unit_name : 千克
                 */

                private double amount_all;
                private String count;
                private DepInfoBean dep_info;
                private String price;
                private String stock_breif;
                private String stock_name;
                private String type_id;
                private String unit_name;

                public double getAmount_all() {
                    return amount_all;
                }

                public void setAmount_all(double amount_all) {
                    this.amount_all = amount_all;
                }

                public String getCount() {
                    return count;
                }

                public void setCount(String count) {
                    this.count = count;
                }

                public DepInfoBean getDep_info() {
                    return dep_info;
                }

                public void setDep_info(DepInfoBean dep_info) {
                    this.dep_info = dep_info;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getStock_breif() {
                    return stock_breif;
                }

                public void setStock_breif(String stock_breif) {
                    this.stock_breif = stock_breif;
                }

                public String getStock_name() {
                    return stock_name;
                }

                public void setStock_name(String stock_name) {
                    this.stock_name = stock_name;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getUnit_name() {
                    return unit_name;
                }

                public void setUnit_name(String unit_name) {
                    this.unit_name = unit_name;
                }

                public static class DepInfoBean {
                    /**
                     * 19 : {"amount":"1.07","dep_name":"临湖","id":"18"}
                     */

                    @SerializedName("19")
                    private _$19Bean _$19;

                    public _$19Bean get_$19() {
                        return _$19;
                    }

                    public void set_$19(_$19Bean _$19) {
                        this._$19 = _$19;
                    }

                    public static class _$19Bean {
                        /**
                         * amount : 1.07
                         * dep_name : 临湖
                         * id : 18
                         */

                        private String amount;
                        private String dep_name;
                        private String id;

                        public String getAmount() {
                            return amount;
                        }

                        public void setAmount(String amount) {
                            this.amount = amount;
                        }

                        public String getDep_name() {
                            return dep_name;
                        }

                        public void setDep_name(String dep_name) {
                            this.dep_name = dep_name;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }
                    }
                }
            }

            public static class _$103Bean {
                /**
                 * amount_all : 54.55
                 * count : 136.38
                 * dep_info : {"19":{"amount":"54.55","dep_name":"临湖","id":"19"}}
                 * price : 2.50
                 * stock_breif : DTD
                 * stock_name : 大土豆（袋装）
                 * type_id : 43
                 * unit_name : 千克
                 */

                private double amount_all;
                private String count;
                private DepInfoBeanX dep_info;
                private String price;
                private String stock_breif;
                private String stock_name;
                private String type_id;
                private String unit_name;

                public double getAmount_all() {
                    return amount_all;
                }

                public void setAmount_all(double amount_all) {
                    this.amount_all = amount_all;
                }

                public String getCount() {
                    return count;
                }

                public void setCount(String count) {
                    this.count = count;
                }

                public DepInfoBeanX getDep_info() {
                    return dep_info;
                }

                public void setDep_info(DepInfoBeanX dep_info) {
                    this.dep_info = dep_info;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getStock_breif() {
                    return stock_breif;
                }

                public void setStock_breif(String stock_breif) {
                    this.stock_breif = stock_breif;
                }

                public String getStock_name() {
                    return stock_name;
                }

                public void setStock_name(String stock_name) {
                    this.stock_name = stock_name;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getUnit_name() {
                    return unit_name;
                }

                public void setUnit_name(String unit_name) {
                    this.unit_name = unit_name;
                }

                public static class DepInfoBeanX {
                    /**
                     * 19 : {"amount":"54.55","dep_name":"临湖","id":"19"}
                     */

                    @SerializedName("19")
                    private _$19BeanX _$19;

                    public _$19BeanX get_$19() {
                        return _$19;
                    }

                    public void set_$19(_$19BeanX _$19) {
                        this._$19 = _$19;
                    }

                    public static class _$19BeanX {
                        /**
                         * amount : 54.55
                         * dep_name : 临湖
                         * id : 19
                         */

                        private String amount;
                        private String dep_name;
                        private String id;

                        public String getAmount() {
                            return amount;
                        }

                        public void setAmount(String amount) {
                            this.amount = amount;
                        }

                        public String getDep_name() {
                            return dep_name;
                        }

                        public void setDep_name(String dep_name) {
                            this.dep_name = dep_name;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }
                    }
                }
            }

            public static class _$104Bean {
                /**
                 * amount_all : 15.31
                 * count : 41.34
                 * dep_info : {"19":{"amount":"15.31","dep_name":"临湖","id":"20"}}
                 * price : 2.70
                 * stock_breif : HDXLB
                 * stock_name : 胡（丁香）萝卜
                 * type_id : 43
                 * unit_name : 千克
                 */

                private double amount_all;
                private String count;
                private DepInfoBeanXX dep_info;
                private String price;
                private String stock_breif;
                private String stock_name;
                private String type_id;
                private String unit_name;

                public double getAmount_all() {
                    return amount_all;
                }

                public void setAmount_all(double amount_all) {
                    this.amount_all = amount_all;
                }

                public String getCount() {
                    return count;
                }

                public void setCount(String count) {
                    this.count = count;
                }

                public DepInfoBeanXX getDep_info() {
                    return dep_info;
                }

                public void setDep_info(DepInfoBeanXX dep_info) {
                    this.dep_info = dep_info;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getStock_breif() {
                    return stock_breif;
                }

                public void setStock_breif(String stock_breif) {
                    this.stock_breif = stock_breif;
                }

                public String getStock_name() {
                    return stock_name;
                }

                public void setStock_name(String stock_name) {
                    this.stock_name = stock_name;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getUnit_name() {
                    return unit_name;
                }

                public void setUnit_name(String unit_name) {
                    this.unit_name = unit_name;
                }

                public static class DepInfoBeanXX {
                    /**
                     * 19 : {"amount":"15.31","dep_name":"临湖","id":"20"}
                     */

                    @SerializedName("19")
                    private _$19BeanXX _$19;

                    public _$19BeanXX get_$19() {
                        return _$19;
                    }

                    public void set_$19(_$19BeanXX _$19) {
                        this._$19 = _$19;
                    }

                    public static class _$19BeanXX {
                        /**
                         * amount : 15.31
                         * dep_name : 临湖
                         * id : 20
                         */

                        private String amount;
                        private String dep_name;
                        private String id;

                        public String getAmount() {
                            return amount;
                        }

                        public void setAmount(String amount) {
                            this.amount = amount;
                        }

                        public String getDep_name() {
                            return dep_name;
                        }

                        public void setDep_name(String dep_name) {
                            this.dep_name = dep_name;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }
                    }
                }
            }

            public static class _$108Bean {
                /**
                 * amount_all : 21.89
                 * count : 157.61
                 * dep_info : {"19":{"amount":"21.89","dep_name":"临湖","id":"21"}}
                 * price : 7.20
                 * stock_breif : GWS
                 * stock_name : 光莴笋
                 * type_id : 43
                 * unit_name : 千克
                 */

                private double amount_all;
                private String count;
                private DepInfoBeanXXX dep_info;
                private String price;
                private String stock_breif;
                private String stock_name;
                private String type_id;
                private String unit_name;

                public double getAmount_all() {
                    return amount_all;
                }

                public void setAmount_all(double amount_all) {
                    this.amount_all = amount_all;
                }

                public String getCount() {
                    return count;
                }

                public void setCount(String count) {
                    this.count = count;
                }

                public DepInfoBeanXXX getDep_info() {
                    return dep_info;
                }

                public void setDep_info(DepInfoBeanXXX dep_info) {
                    this.dep_info = dep_info;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getStock_breif() {
                    return stock_breif;
                }

                public void setStock_breif(String stock_breif) {
                    this.stock_breif = stock_breif;
                }

                public String getStock_name() {
                    return stock_name;
                }

                public void setStock_name(String stock_name) {
                    this.stock_name = stock_name;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getUnit_name() {
                    return unit_name;
                }

                public void setUnit_name(String unit_name) {
                    this.unit_name = unit_name;
                }

                public static class DepInfoBeanXXX {
                    /**
                     * 19 : {"amount":"21.89","dep_name":"临湖","id":"21"}
                     */

                    @SerializedName("19")
                    private _$19BeanXXX _$19;

                    public _$19BeanXXX get_$19() {
                        return _$19;
                    }

                    public void set_$19(_$19BeanXXX _$19) {
                        this._$19 = _$19;
                    }

                    public static class _$19BeanXXX {
                        /**
                         * amount : 21.89
                         * dep_name : 临湖
                         * id : 21
                         */

                        private String amount;
                        private String dep_name;
                        private String id;

                        public String getAmount() {
                            return amount;
                        }

                        public void setAmount(String amount) {
                            this.amount = amount;
                        }

                        public String getDep_name() {
                            return dep_name;
                        }

                        public void setDep_name(String dep_name) {
                            this.dep_name = dep_name;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }
                    }
                }
            }

            public static class _$116Bean {
                /**
                 * amount_all : 30.14
                 * count : 105.49
                 * dep_info : {"19":{"amount":"30.14","dep_name":"临湖","id":"22"}}
                 * price : 3.50
                 * stock_breif : O
                 * stock_name : 藕
                 * type_id : 43
                 * unit_name : 千克
                 */

                private double amount_all;
                private String count;
                private DepInfoBeanXXXX dep_info;
                private String price;
                private String stock_breif;
                private String stock_name;
                private String type_id;
                private String unit_name;

                public double getAmount_all() {
                    return amount_all;
                }

                public void setAmount_all(double amount_all) {
                    this.amount_all = amount_all;
                }

                public String getCount() {
                    return count;
                }

                public void setCount(String count) {
                    this.count = count;
                }

                public DepInfoBeanXXXX getDep_info() {
                    return dep_info;
                }

                public void setDep_info(DepInfoBeanXXXX dep_info) {
                    this.dep_info = dep_info;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getStock_breif() {
                    return stock_breif;
                }

                public void setStock_breif(String stock_breif) {
                    this.stock_breif = stock_breif;
                }

                public String getStock_name() {
                    return stock_name;
                }

                public void setStock_name(String stock_name) {
                    this.stock_name = stock_name;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getUnit_name() {
                    return unit_name;
                }

                public void setUnit_name(String unit_name) {
                    this.unit_name = unit_name;
                }

                public static class DepInfoBeanXXXX {
                    /**
                     * 19 : {"amount":"30.14","dep_name":"临湖","id":"22"}
                     */

                    @SerializedName("19")
                    private _$19BeanXXXX _$19;

                    public _$19BeanXXXX get_$19() {
                        return _$19;
                    }

                    public void set_$19(_$19BeanXXXX _$19) {
                        this._$19 = _$19;
                    }

                    public static class _$19BeanXXXX {
                        /**
                         * amount : 30.14
                         * dep_name : 临湖
                         * id : 22
                         */

                        private String amount;
                        private String dep_name;
                        private String id;

                        public String getAmount() {
                            return amount;
                        }

                        public void setAmount(String amount) {
                            this.amount = amount;
                        }

                        public String getDep_name() {
                            return dep_name;
                        }

                        public void setDep_name(String dep_name) {
                            this.dep_name = dep_name;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }
                    }
                }
            }

            public static class _$118Bean {
                /**
                 * amount_all : 0.92
                 * count : 7.08
                 * dep_info : {"19":{"amount":"0.92","dep_name":"临湖","id":"23"}}
                 * price : 7.70
                 * stock_breif : SJ
                 * stock_name : 生姜
                 * type_id : 43
                 * unit_name : 千克
                 */

                private double amount_all;
                private String count;
                private DepInfoBeanXXXXX dep_info;
                private String price;
                private String stock_breif;
                private String stock_name;
                private String type_id;
                private String unit_name;

                public double getAmount_all() {
                    return amount_all;
                }

                public void setAmount_all(double amount_all) {
                    this.amount_all = amount_all;
                }

                public String getCount() {
                    return count;
                }

                public void setCount(String count) {
                    this.count = count;
                }

                public DepInfoBeanXXXXX getDep_info() {
                    return dep_info;
                }

                public void setDep_info(DepInfoBeanXXXXX dep_info) {
                    this.dep_info = dep_info;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getStock_breif() {
                    return stock_breif;
                }

                public void setStock_breif(String stock_breif) {
                    this.stock_breif = stock_breif;
                }

                public String getStock_name() {
                    return stock_name;
                }

                public void setStock_name(String stock_name) {
                    this.stock_name = stock_name;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getUnit_name() {
                    return unit_name;
                }

                public void setUnit_name(String unit_name) {
                    this.unit_name = unit_name;
                }

                public static class DepInfoBeanXXXXX {
                    /**
                     * 19 : {"amount":"0.92","dep_name":"临湖","id":"23"}
                     */

                    @SerializedName("19")
                    private _$19BeanXXXXX _$19;

                    public _$19BeanXXXXX get_$19() {
                        return _$19;
                    }

                    public void set_$19(_$19BeanXXXXX _$19) {
                        this._$19 = _$19;
                    }

                    public static class _$19BeanXXXXX {
                        /**
                         * amount : 0.92
                         * dep_name : 临湖
                         * id : 23
                         */

                        private String amount;
                        private String dep_name;
                        private String id;

                        public String getAmount() {
                            return amount;
                        }

                        public void setAmount(String amount) {
                            this.amount = amount;
                        }

                        public String getDep_name() {
                            return dep_name;
                        }

                        public void setDep_name(String dep_name) {
                            this.dep_name = dep_name;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }
                    }
                }
            }

            public static class _$138Bean {
                /**
                 * amount_all : 37.65
                 * count : 169.42
                 * dep_info : {"19":{"amount":"37.65","dep_name":"临湖","id":"24"}}
                 * price : 4.50
                 * stock_breif : HC
                 * stock_name : 花菜(白)
                 * type_id : 45
                 * unit_name : 千克
                 */

                private double amount_all;
                private String count;
                private DepInfoBeanXXXXXX dep_info;
                private String price;
                private String stock_breif;
                private String stock_name;
                private String type_id;
                private String unit_name;

                public double getAmount_all() {
                    return amount_all;
                }

                public void setAmount_all(double amount_all) {
                    this.amount_all = amount_all;
                }

                public String getCount() {
                    return count;
                }

                public void setCount(String count) {
                    this.count = count;
                }

                public DepInfoBeanXXXXXX getDep_info() {
                    return dep_info;
                }

                public void setDep_info(DepInfoBeanXXXXXX dep_info) {
                    this.dep_info = dep_info;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getStock_breif() {
                    return stock_breif;
                }

                public void setStock_breif(String stock_breif) {
                    this.stock_breif = stock_breif;
                }

                public String getStock_name() {
                    return stock_name;
                }

                public void setStock_name(String stock_name) {
                    this.stock_name = stock_name;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getUnit_name() {
                    return unit_name;
                }

                public void setUnit_name(String unit_name) {
                    this.unit_name = unit_name;
                }

                public static class DepInfoBeanXXXXXX {
                    /**
                     * 19 : {"amount":"37.65","dep_name":"临湖","id":"24"}
                     */

                    @SerializedName("19")
                    private _$19BeanXXXXXX _$19;

                    public _$19BeanXXXXXX get_$19() {
                        return _$19;
                    }

                    public void set_$19(_$19BeanXXXXXX _$19) {
                        this._$19 = _$19;
                    }

                    public static class _$19BeanXXXXXX {
                        /**
                         * amount : 37.65
                         * dep_name : 临湖
                         * id : 24
                         */

                        private String amount;
                        private String dep_name;
                        private String id;

                        public String getAmount() {
                            return amount;
                        }

                        public void setAmount(String amount) {
                            this.amount = amount;
                        }

                        public String getDep_name() {
                            return dep_name;
                        }

                        public void setDep_name(String dep_name) {
                            this.dep_name = dep_name;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }
                    }
                }
            }

            public static class _$30Bean {
                /**
                 * amount_all : 2.94
                 * count : 36.75
                 * dep_info : {"19":{"amount":"2.94","dep_name":"临湖","id":"9"}}
                 * price : 12.50
                 * stock_breif : HJ
                 * stock_name : 红椒
                 * type_id : 41
                 * unit_name : 千克
                 */

                private double amount_all;
                private String count;
                private DepInfoBeanXXXXXXX dep_info;
                private String price;
                private String stock_breif;
                private String stock_name;
                private String type_id;
                private String unit_name;

                public double getAmount_all() {
                    return amount_all;
                }

                public void setAmount_all(double amount_all) {
                    this.amount_all = amount_all;
                }

                public String getCount() {
                    return count;
                }

                public void setCount(String count) {
                    this.count = count;
                }

                public DepInfoBeanXXXXXXX getDep_info() {
                    return dep_info;
                }

                public void setDep_info(DepInfoBeanXXXXXXX dep_info) {
                    this.dep_info = dep_info;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getStock_breif() {
                    return stock_breif;
                }

                public void setStock_breif(String stock_breif) {
                    this.stock_breif = stock_breif;
                }

                public String getStock_name() {
                    return stock_name;
                }

                public void setStock_name(String stock_name) {
                    this.stock_name = stock_name;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getUnit_name() {
                    return unit_name;
                }

                public void setUnit_name(String unit_name) {
                    this.unit_name = unit_name;
                }

                public static class DepInfoBeanXXXXXXX {
                    /**
                     * 19 : {"amount":"2.94","dep_name":"临湖","id":"9"}
                     */

                    @SerializedName("19")
                    private _$19BeanXXXXXXX _$19;

                    public _$19BeanXXXXXXX get_$19() {
                        return _$19;
                    }

                    public void set_$19(_$19BeanXXXXXXX _$19) {
                        this._$19 = _$19;
                    }

                    public static class _$19BeanXXXXXXX {
                        /**
                         * amount : 2.94
                         * dep_name : 临湖
                         * id : 9
                         */

                        private String amount;
                        private String dep_name;
                        private String id;

                        public String getAmount() {
                            return amount;
                        }

                        public void setAmount(String amount) {
                            this.amount = amount;
                        }

                        public String getDep_name() {
                            return dep_name;
                        }

                        public void setDep_name(String dep_name) {
                            this.dep_name = dep_name;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }
                    }
                }
            }

            public static class _$31Bean {
                /**
                 * amount_all : 15.99
                 * count : 47.97
                 * dep_info : {"19":{"amount":"15.99","dep_name":"临湖","id":"10"}}
                 * price : 3.00
                 * stock_breif : HG
                 * stock_name : 黄瓜（袋装）
                 * type_id : 41
                 * unit_name : 千克
                 */

                private double amount_all;
                private String count;
                private DepInfoBeanXXXXXXXX dep_info;
                private String price;
                private String stock_breif;
                private String stock_name;
                private String type_id;
                private String unit_name;

                public double getAmount_all() {
                    return amount_all;
                }

                public void setAmount_all(double amount_all) {
                    this.amount_all = amount_all;
                }

                public String getCount() {
                    return count;
                }

                public void setCount(String count) {
                    this.count = count;
                }

                public DepInfoBeanXXXXXXXX getDep_info() {
                    return dep_info;
                }

                public void setDep_info(DepInfoBeanXXXXXXXX dep_info) {
                    this.dep_info = dep_info;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getStock_breif() {
                    return stock_breif;
                }

                public void setStock_breif(String stock_breif) {
                    this.stock_breif = stock_breif;
                }

                public String getStock_name() {
                    return stock_name;
                }

                public void setStock_name(String stock_name) {
                    this.stock_name = stock_name;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getUnit_name() {
                    return unit_name;
                }

                public void setUnit_name(String unit_name) {
                    this.unit_name = unit_name;
                }

                public static class DepInfoBeanXXXXXXXX {
                    /**
                     * 19 : {"amount":"15.99","dep_name":"临湖","id":"10"}
                     */

                    @SerializedName("19")
                    private _$19BeanXXXXXXXX _$19;

                    public _$19BeanXXXXXXXX get_$19() {
                        return _$19;
                    }

                    public void set_$19(_$19BeanXXXXXXXX _$19) {
                        this._$19 = _$19;
                    }

                    public static class _$19BeanXXXXXXXX {
                        /**
                         * amount : 15.99
                         * dep_name : 临湖
                         * id : 10
                         */

                        private String amount;
                        private String dep_name;
                        private String id;

                        public String getAmount() {
                            return amount;
                        }

                        public void setAmount(String amount) {
                            this.amount = amount;
                        }

                        public String getDep_name() {
                            return dep_name;
                        }

                        public void setDep_name(String dep_name) {
                            this.dep_name = dep_name;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }
                    }
                }
            }

            public static class _$52Bean {
                /**
                 * amount_all : 38.95
                 * count : 124.64
                 * dep_info : {"19":{"amount":"38.95","dep_name":"临湖","id":"11"}}
                 * price : 3.20
                 * stock_breif : XNG
                 * stock_name : 西南瓜
                 * type_id : 41
                 * unit_name : 千克
                 */

                private double amount_all;
                private String count;
                private DepInfoBeanXXXXXXXXX dep_info;
                private String price;
                private String stock_breif;
                private String stock_name;
                private String type_id;
                private String unit_name;

                public double getAmount_all() {
                    return amount_all;
                }

                public void setAmount_all(double amount_all) {
                    this.amount_all = amount_all;
                }

                public String getCount() {
                    return count;
                }

                public void setCount(String count) {
                    this.count = count;
                }

                public DepInfoBeanXXXXXXXXX getDep_info() {
                    return dep_info;
                }

                public void setDep_info(DepInfoBeanXXXXXXXXX dep_info) {
                    this.dep_info = dep_info;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getStock_breif() {
                    return stock_breif;
                }

                public void setStock_breif(String stock_breif) {
                    this.stock_breif = stock_breif;
                }

                public String getStock_name() {
                    return stock_name;
                }

                public void setStock_name(String stock_name) {
                    this.stock_name = stock_name;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getUnit_name() {
                    return unit_name;
                }

                public void setUnit_name(String unit_name) {
                    this.unit_name = unit_name;
                }

                public static class DepInfoBeanXXXXXXXXX {
                    /**
                     * 19 : {"amount":"38.95","dep_name":"临湖","id":"11"}
                     */

                    @SerializedName("19")
                    private _$19BeanXXXXXXXXX _$19;

                    public _$19BeanXXXXXXXXX get_$19() {
                        return _$19;
                    }

                    public void set_$19(_$19BeanXXXXXXXXX _$19) {
                        this._$19 = _$19;
                    }

                    public static class _$19BeanXXXXXXXXX {
                        /**
                         * amount : 38.95
                         * dep_name : 临湖
                         * id : 11
                         */

                        private String amount;
                        private String dep_name;
                        private String id;

                        public String getAmount() {
                            return amount;
                        }

                        public void setAmount(String amount) {
                            this.amount = amount;
                        }

                        public String getDep_name() {
                            return dep_name;
                        }

                        public void setDep_name(String dep_name) {
                            this.dep_name = dep_name;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }
                    }
                }
            }

            public static class _$56Bean {
                /**
                 * amount_all : 6.88
                 * count : 33.71
                 * dep_info : {"19":{"amount":"6.88","dep_name":"临湖","id":"12"}}
                 * price : 4.90
                 * stock_breif : ZJ
                 * stock_name : 杂椒
                 * type_id : 41
                 * unit_name : 千克
                 */

                private double amount_all;
                private String count;
                private DepInfoBeanXXXXXXXXXX dep_info;
                private String price;
                private String stock_breif;
                private String stock_name;
                private String type_id;
                private String unit_name;

                public double getAmount_all() {
                    return amount_all;
                }

                public void setAmount_all(double amount_all) {
                    this.amount_all = amount_all;
                }

                public String getCount() {
                    return count;
                }

                public void setCount(String count) {
                    this.count = count;
                }

                public DepInfoBeanXXXXXXXXXX getDep_info() {
                    return dep_info;
                }

                public void setDep_info(DepInfoBeanXXXXXXXXXX dep_info) {
                    this.dep_info = dep_info;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getStock_breif() {
                    return stock_breif;
                }

                public void setStock_breif(String stock_breif) {
                    this.stock_breif = stock_breif;
                }

                public String getStock_name() {
                    return stock_name;
                }

                public void setStock_name(String stock_name) {
                    this.stock_name = stock_name;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getUnit_name() {
                    return unit_name;
                }

                public void setUnit_name(String unit_name) {
                    this.unit_name = unit_name;
                }

                public static class DepInfoBeanXXXXXXXXXX {
                    /**
                     * 19 : {"amount":"6.88","dep_name":"临湖","id":"12"}
                     */

                    @SerializedName("19")
                    private _$19BeanXXXXXXXXXX _$19;

                    public _$19BeanXXXXXXXXXX get_$19() {
                        return _$19;
                    }

                    public void set_$19(_$19BeanXXXXXXXXXX _$19) {
                        this._$19 = _$19;
                    }

                    public static class _$19BeanXXXXXXXXXX {
                        /**
                         * amount : 6.88
                         * dep_name : 临湖
                         * id : 12
                         */

                        private String amount;
                        private String dep_name;
                        private String id;

                        public String getAmount() {
                            return amount;
                        }

                        public void setAmount(String amount) {
                            this.amount = amount;
                        }

                        public String getDep_name() {
                            return dep_name;
                        }

                        public void setDep_name(String dep_name) {
                            this.dep_name = dep_name;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }
                    }
                }
            }

            public static class _$58Bean {
                /**
                 * amount_all : 1.55
                 * count : 9.77
                 * dep_info : {"19":{"amount":"1.55","dep_name":"临湖","id":"13"}}
                 * price : 6.30
                 * stock_breif : BDC
                 * stock_name : 本地葱
                 * type_id : 42
                 * unit_name : 千克
                 */

                private double amount_all;
                private String count;
                private DepInfoBeanXXXXXXXXXXX dep_info;
                private String price;
                private String stock_breif;
                private String stock_name;
                private String type_id;
                private String unit_name;

                public double getAmount_all() {
                    return amount_all;
                }

                public void setAmount_all(double amount_all) {
                    this.amount_all = amount_all;
                }

                public String getCount() {
                    return count;
                }

                public void setCount(String count) {
                    this.count = count;
                }

                public DepInfoBeanXXXXXXXXXXX getDep_info() {
                    return dep_info;
                }

                public void setDep_info(DepInfoBeanXXXXXXXXXXX dep_info) {
                    this.dep_info = dep_info;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getStock_breif() {
                    return stock_breif;
                }

                public void setStock_breif(String stock_breif) {
                    this.stock_breif = stock_breif;
                }

                public String getStock_name() {
                    return stock_name;
                }

                public void setStock_name(String stock_name) {
                    this.stock_name = stock_name;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getUnit_name() {
                    return unit_name;
                }

                public void setUnit_name(String unit_name) {
                    this.unit_name = unit_name;
                }

                public static class DepInfoBeanXXXXXXXXXXX {
                    /**
                     * 19 : {"amount":"1.55","dep_name":"临湖","id":"13"}
                     */

                    @SerializedName("19")
                    private _$19BeanXXXXXXXXXXX _$19;

                    public _$19BeanXXXXXXXXXXX get_$19() {
                        return _$19;
                    }

                    public void set_$19(_$19BeanXXXXXXXXXXX _$19) {
                        this._$19 = _$19;
                    }

                    public static class _$19BeanXXXXXXXXXXX {
                        /**
                         * amount : 1.55
                         * dep_name : 临湖
                         * id : 13
                         */

                        private String amount;
                        private String dep_name;
                        private String id;

                        public String getAmount() {
                            return amount;
                        }

                        public void setAmount(String amount) {
                            this.amount = amount;
                        }

                        public String getDep_name() {
                            return dep_name;
                        }

                        public void setDep_name(String dep_name) {
                            this.dep_name = dep_name;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }
                    }
                }
            }

            public static class _$72Bean {
                /**
                 * amount_all : 14
                 * count : 49.00
                 * dep_info : {"19":{"amount":"14.00","dep_name":"临湖","id":"14"}}
                 * price : 3.50
                 * stock_breif : JC
                 * stock_name : 津葱
                 * type_id : 42
                 * unit_name : 千克
                 */

                private int amount_all;
                private String count;
                private DepInfoBeanXXXXXXXXXXXX dep_info;
                private String price;
                private String stock_breif;
                private String stock_name;
                private String type_id;
                private String unit_name;

                public int getAmount_all() {
                    return amount_all;
                }

                public void setAmount_all(int amount_all) {
                    this.amount_all = amount_all;
                }

                public String getCount() {
                    return count;
                }

                public void setCount(String count) {
                    this.count = count;
                }

                public DepInfoBeanXXXXXXXXXXXX getDep_info() {
                    return dep_info;
                }

                public void setDep_info(DepInfoBeanXXXXXXXXXXXX dep_info) {
                    this.dep_info = dep_info;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getStock_breif() {
                    return stock_breif;
                }

                public void setStock_breif(String stock_breif) {
                    this.stock_breif = stock_breif;
                }

                public String getStock_name() {
                    return stock_name;
                }

                public void setStock_name(String stock_name) {
                    this.stock_name = stock_name;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getUnit_name() {
                    return unit_name;
                }

                public void setUnit_name(String unit_name) {
                    this.unit_name = unit_name;
                }

                public static class DepInfoBeanXXXXXXXXXXXX {
                    /**
                     * 19 : {"amount":"14.00","dep_name":"临湖","id":"14"}
                     */

                    @SerializedName("19")
                    private _$19BeanXXXXXXXXXXXX _$19;

                    public _$19BeanXXXXXXXXXXXX get_$19() {
                        return _$19;
                    }

                    public void set_$19(_$19BeanXXXXXXXXXXXX _$19) {
                        this._$19 = _$19;
                    }

                    public static class _$19BeanXXXXXXXXXXXX {
                        /**
                         * amount : 14.00
                         * dep_name : 临湖
                         * id : 14
                         */

                        private String amount;
                        private String dep_name;
                        private String id;

                        public String getAmount() {
                            return amount;
                        }

                        public void setAmount(String amount) {
                            this.amount = amount;
                        }

                        public String getDep_name() {
                            return dep_name;
                        }

                        public void setDep_name(String dep_name) {
                            this.dep_name = dep_name;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }
                    }
                }
            }

            public static class _$77Bean {
                /**
                 * amount_all : 37.5
                 * count : 93.75
                 * dep_info : {"19":{"amount":"37.50","dep_name":"临湖","id":"15"}}
                 * price : 2.50
                 * stock_breif : MMC
                 * stock_name : 毛毛菜
                 * type_id : 42
                 * unit_name : 千克
                 */

                private double amount_all;
                private String count;
                private DepInfoBeanXXXXXXXXXXXXX dep_info;
                private String price;
                private String stock_breif;
                private String stock_name;
                private String type_id;
                private String unit_name;

                public double getAmount_all() {
                    return amount_all;
                }

                public void setAmount_all(double amount_all) {
                    this.amount_all = amount_all;
                }

                public String getCount() {
                    return count;
                }

                public void setCount(String count) {
                    this.count = count;
                }

                public DepInfoBeanXXXXXXXXXXXXX getDep_info() {
                    return dep_info;
                }

                public void setDep_info(DepInfoBeanXXXXXXXXXXXXX dep_info) {
                    this.dep_info = dep_info;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getStock_breif() {
                    return stock_breif;
                }

                public void setStock_breif(String stock_breif) {
                    this.stock_breif = stock_breif;
                }

                public String getStock_name() {
                    return stock_name;
                }

                public void setStock_name(String stock_name) {
                    this.stock_name = stock_name;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getUnit_name() {
                    return unit_name;
                }

                public void setUnit_name(String unit_name) {
                    this.unit_name = unit_name;
                }

                public static class DepInfoBeanXXXXXXXXXXXXX {
                    /**
                     * 19 : {"amount":"37.50","dep_name":"临湖","id":"15"}
                     */

                    @SerializedName("19")
                    private _$19BeanXXXXXXXXXXXXX _$19;

                    public _$19BeanXXXXXXXXXXXXX get_$19() {
                        return _$19;
                    }

                    public void set_$19(_$19BeanXXXXXXXXXXXXX _$19) {
                        this._$19 = _$19;
                    }

                    public static class _$19BeanXXXXXXXXXXXXX {
                        /**
                         * amount : 37.50
                         * dep_name : 临湖
                         * id : 15
                         */

                        private String amount;
                        private String dep_name;
                        private String id;

                        public String getAmount() {
                            return amount;
                        }

                        public void setAmount(String amount) {
                            this.amount = amount;
                        }

                        public String getDep_name() {
                            return dep_name;
                        }

                        public void setDep_name(String dep_name) {
                            this.dep_name = dep_name;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }
                    }
                }
            }

            public static class _$84Bean {
                /**
                 * amount_all : 13.33
                 * count : 59.98
                 * dep_info : {"19":{"amount":"13.33","dep_name":"临湖","id":"16"}}
                 * price : 4.50
                 * stock_breif : SC
                 * stock_name : 生菜
                 * type_id : 42
                 * unit_name : 千克
                 */

                private double amount_all;
                private String count;
                private DepInfoBeanXXXXXXXXXXXXXX dep_info;
                private String price;
                private String stock_breif;
                private String stock_name;
                private String type_id;
                private String unit_name;

                public double getAmount_all() {
                    return amount_all;
                }

                public void setAmount_all(double amount_all) {
                    this.amount_all = amount_all;
                }

                public String getCount() {
                    return count;
                }

                public void setCount(String count) {
                    this.count = count;
                }

                public DepInfoBeanXXXXXXXXXXXXXX getDep_info() {
                    return dep_info;
                }

                public void setDep_info(DepInfoBeanXXXXXXXXXXXXXX dep_info) {
                    this.dep_info = dep_info;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getStock_breif() {
                    return stock_breif;
                }

                public void setStock_breif(String stock_breif) {
                    this.stock_breif = stock_breif;
                }

                public String getStock_name() {
                    return stock_name;
                }

                public void setStock_name(String stock_name) {
                    this.stock_name = stock_name;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getUnit_name() {
                    return unit_name;
                }

                public void setUnit_name(String unit_name) {
                    this.unit_name = unit_name;
                }

                public static class DepInfoBeanXXXXXXXXXXXXXX {
                    /**
                     * 19 : {"amount":"13.33","dep_name":"临湖","id":"16"}
                     */

                    @SerializedName("19")
                    private _$19BeanXXXXXXXXXXXXXX _$19;

                    public _$19BeanXXXXXXXXXXXXXX get_$19() {
                        return _$19;
                    }

                    public void set_$19(_$19BeanXXXXXXXXXXXXXX _$19) {
                        this._$19 = _$19;
                    }

                    public static class _$19BeanXXXXXXXXXXXXXX {
                        /**
                         * amount : 13.33
                         * dep_name : 临湖
                         * id : 16
                         */

                        private String amount;
                        private String dep_name;
                        private String id;

                        public String getAmount() {
                            return amount;
                        }

                        public void setAmount(String amount) {
                            this.amount = amount;
                        }

                        public String getDep_name() {
                            return dep_name;
                        }

                        public void setDep_name(String dep_name) {
                            this.dep_name = dep_name;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }
                    }
                }
            }

            public static class _$99Bean {
                /**
                 * amount_all : 13.33
                 * count : 110.64
                 * dep_info : {"19":{"amount":"13.33","dep_name":"临湖","id":"17"}}
                 * price : 8.30
                 * stock_breif : CJB
                 * stock_name : 草茭白
                 * type_id : 43
                 * unit_name : 千克
                 */

                private double amount_all;
                private String count;
                private DepInfoBeanXXXXXXXXXXXXXXX dep_info;
                private String price;
                private String stock_breif;
                private String stock_name;
                private String type_id;
                private String unit_name;

                public double getAmount_all() {
                    return amount_all;
                }

                public void setAmount_all(double amount_all) {
                    this.amount_all = amount_all;
                }

                public String getCount() {
                    return count;
                }

                public void setCount(String count) {
                    this.count = count;
                }

                public DepInfoBeanXXXXXXXXXXXXXXX getDep_info() {
                    return dep_info;
                }

                public void setDep_info(DepInfoBeanXXXXXXXXXXXXXXX dep_info) {
                    this.dep_info = dep_info;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getStock_breif() {
                    return stock_breif;
                }

                public void setStock_breif(String stock_breif) {
                    this.stock_breif = stock_breif;
                }

                public String getStock_name() {
                    return stock_name;
                }

                public void setStock_name(String stock_name) {
                    this.stock_name = stock_name;
                }

                public String getType_id() {
                    return type_id;
                }

                public void setType_id(String type_id) {
                    this.type_id = type_id;
                }

                public String getUnit_name() {
                    return unit_name;
                }

                public void setUnit_name(String unit_name) {
                    this.unit_name = unit_name;
                }

                public static class DepInfoBeanXXXXXXXXXXXXXXX {
                    /**
                     * 19 : {"amount":"13.33","dep_name":"临湖","id":"17"}
                     */

                    @SerializedName("19")
                    private _$19BeanXXXXXXXXXXXXXXX _$19;

                    public _$19BeanXXXXXXXXXXXXXXX get_$19() {
                        return _$19;
                    }

                    public void set_$19(_$19BeanXXXXXXXXXXXXXXX _$19) {
                        this._$19 = _$19;
                    }

                    public static class _$19BeanXXXXXXXXXXXXXXX {
                        /**
                         * amount : 13.33
                         * dep_name : 临湖
                         * id : 17
                         */

                        private String amount;
                        private String dep_name;
                        private String id;

                        public String getAmount() {
                            return amount;
                        }

                        public void setAmount(String amount) {
                            this.amount = amount;
                        }

                        public String getDep_name() {
                            return dep_name;
                        }

                        public void setDep_name(String dep_name) {
                            this.dep_name = dep_name;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }
                    }
                }
            }
        }
    }
}
