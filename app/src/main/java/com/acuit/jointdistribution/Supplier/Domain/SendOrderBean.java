package com.acuit.jointdistribution.Supplier.Domain;

import java.util.List;

/**
 * 类名: SendOrderBean <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/9/1 0001 19:08 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class SendOrderBean {

    /**
     * code : 200
     * msg : 执行成功！
     * data : {"total":"42","rows":[{"is_del":"0","dep_ids":"15","code":"CGDD1708309435","realname":"采购测试","plan_date":"2017-08-31 09:00","id":"3735","create_date":"2017-08-30","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"200.00","total_money":"1270.00","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"15","code":"CGDD1708289429","realname":"测试","plan_date":"2017-08-28 00:00","id":"3732","create_date":"2017-08-29","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"4.00","total_money":"27.50","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"10","code":"CGDD1708289407","realname":"系统管理员","plan_date":"2017-08-29 09:00","id":"3731","create_date":"2017-08-28","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"5.00","total_money":"18.10","phone":[{"dep_name":"西区食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"西区食堂"},{"is_del":"0","dep_ids":"15","code":"CGDD1708289403","realname":"系统管理员","plan_date":"2017-08-29 09:00","id":"3730","create_date":"2017-08-28","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"38.00","total_money":"149.50","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"164","code":"CGDD1708269398","realname":"同保一","plan_date":"2017-08-27 09:00","id":"3729","create_date":"2017-08-26","status":"5","com_name":"浙江同力教育后勤管理有限公司","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"同力一级","dep_root_id":"163","com_id":"4","total_amount":"600.00","total_money":"2780.00","phone":[{"dep_name":"同力测试食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"同力","dep_brief_name":"tlyj","request_dep_strs":"同力测试食堂"},{"is_del":"0","dep_ids":"9,22","code":"CGDD1708269395","realname":"系统管理员","plan_date":"2017-08-27 09:00","id":"3728","create_date":"2017-08-26","status":"2","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"1500.00","total_money":"9520.00","phone":[{"dep_name":"东区食堂","contact_person":"张三","contact_number":"668"},{"dep_name":"一食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"东区食堂,一食堂"},{"is_del":"0","dep_ids":"164","code":"CGDD1708239388","realname":"系统管理员","plan_date":"2017-08-24 09:00","id":"3727","create_date":"2017-08-23","status":"5","com_name":"浙江同力教育后勤管理有限公司","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"同力一级","dep_root_id":"163","com_id":"4","total_amount":"66.00","total_money":"344.30","phone":[{"dep_name":"同力测试食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"同力","dep_brief_name":"tlyj","request_dep_strs":"同力测试食堂"},{"is_del":"0","dep_ids":"164","code":"CGDD1708239365","realname":"","plan_date":"2017-08-24 09:00","id":"3725","create_date":"2017-08-23","status":"2","com_name":"浙江同力教育后勤管理有限公司","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"同力一级","dep_root_id":"163","com_id":"4","total_amount":"77.00","total_money":"448.80","phone":[{"dep_name":"同力测试食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"同力","dep_brief_name":"tlyj","request_dep_strs":"同力测试食堂"},{"is_del":"0","dep_ids":"164","code":"CGDD1708239362","realname":"","plan_date":"2017-08-24 09:00","id":"3724","create_date":"2017-08-23","status":"5","com_name":"浙江同力教育后勤管理有限公司","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"同力一级","dep_root_id":"163","com_id":"4","total_amount":"66.00","total_money":"344.30","phone":[{"dep_name":"同力测试食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"同力","dep_brief_name":"tlyj","request_dep_strs":"同力测试食堂"},{"is_del":"0","dep_ids":"15","code":"CGDD1708219298","realname":"系统管理员","plan_date":"2017-08-22 09:00","id":"3720","create_date":"2017-08-22","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"2.00","total_money":"19.45","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"15","code":"CGDD1708219302","realname":"系统管理员","plan_date":"2017-08-22 09:00","id":"3722","create_date":"2017-08-22","status":"4","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"鲜肉类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"16.50","total_money":"196.98","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"15","code":"CGDD1708219293","realname":"系统管理员","plan_date":"2017-08-22 09:00","id":"3718","create_date":"2017-08-22","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"4.50","total_money":"12.90","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"15","code":"CGDD1708219291","realname":"系统管理员","plan_date":"2017-08-22 09:00","id":"3717","create_date":"2017-08-22","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"0.50","total_money":"2.50","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"10,11","code":"CGDD1708199270","realname":"陈燕华","plan_date":"2017-08-20 09:00","id":"3716","create_date":"2017-08-19","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"1800.00","total_money":"9760.00","phone":[{"dep_name":"西区食堂","contact_person":"","contact_number":""},{"dep_name":"休闲餐厅","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"西区食堂,休闲餐厅"},{"is_del":"0","dep_ids":"15","code":"CGDD1708199205","realname":"系统管理员","plan_date":"2017-08-19 00:00","id":"3710","create_date":"2017-08-19","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"319.00","total_money":"1440.40","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"15","code":"CGDD1708199208","realname":"系统管理员","plan_date":"2017-08-19 00:00","id":"3712","create_date":"2017-08-19","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"鲜肉类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"1054.50","total_money":"11768.22","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"15","code":"CGDD1708199130","realname":"系统管理员","plan_date":"2017-08-19 00:00","id":"3709","create_date":"2017-08-19","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"6.00","total_money":"134.50","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"15","code":"CGDD1708199067","realname":"系统管理员","plan_date":"2017-08-20 09:00","id":"3705","create_date":"2017-08-19","status":"4","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"207.50","total_money":"874.20","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"15","code":"CGDD1708199070","realname":"系统管理员","plan_date":"2017-08-20 09:00","id":"3707","create_date":"2017-08-19","status":"4","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"鲜肉类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"366.50","total_money":"4764.50","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"15","code":"CGDD1708178953","realname":"系统管理员","plan_date":"2017-08-18 09:00","id":"3691","create_date":"2017-08-18","status":"2","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"1000.00","total_money":"3200.00","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"9,10,25,26","code":"CGDD1708178946","realname":"系统管理员","plan_date":"2017-08-06 09:00","id":"3681","create_date":"2017-08-17","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"2000.00","total_money":"10920.00","phone":[{"dep_name":"东区食堂","contact_person":"张三","contact_number":"668"},{"dep_name":"西区食堂","contact_person":"","contact_number":""},{"dep_name":"五六食堂","contact_person":"","contact_number":""},{"dep_name":"靓园","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"东区食堂,西区食堂,五六食堂,靓园"},{"is_del":"0","dep_ids":"114","code":"CGDD1708178859","realname":"陈燕华","plan_date":"2017-08-18 09:00","id":"3680","create_date":"2017-08-17","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第二餐饮中心(玉泉)","dep_root_id":"2","com_id":"1","total_amount":"400.00","total_money":"1980.00","phone":[{"dep_name":"玉泉四食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"玉泉","request_dep_strs":"玉泉四食堂"},{"is_del":"0","dep_ids":"114","code":"CGDD1708178854","realname":"陈燕华","plan_date":"2017-08-18 09:00","id":"3678","create_date":"2017-08-17","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第二餐饮中心(玉泉)","dep_root_id":"2","com_id":"1","total_amount":"300.00","total_money":"1540.00","phone":[{"dep_name":"玉泉四食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"玉泉","request_dep_strs":"玉泉四食堂"},{"is_del":"0","dep_ids":"86","code":"CGDD1708178850","realname":"陈燕华","plan_date":"2017-08-18 09:00","id":"3676","create_date":"2017-08-17","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第二餐饮中心(玉泉)","dep_root_id":"2","com_id":"1","total_amount":"30.00","total_money":"180.00","phone":[{"dep_name":"川菜部","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"玉泉","request_dep_strs":"川菜部"},{"is_del":"0","dep_ids":"114","code":"CGDD1708178838","realname":"陈燕华","plan_date":"2017-08-18 09:00","id":"3673","create_date":"2017-08-17","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第二餐饮中心(玉泉)","dep_root_id":"2","com_id":"1","total_amount":"40.00","total_money":"267.00","phone":[{"dep_name":"玉泉四食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"玉泉","request_dep_strs":"玉泉四食堂"},{"is_del":"0","dep_ids":"15","code":"CGDD1708148826","realname":"陈燕华","plan_date":"2017-08-15 09:00","id":"3670","create_date":"2017-08-15","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"447.00","total_money":"1520.10","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"19","code":"CGDD1708128814","realname":"陈燕华","plan_date":"2017-08-13 09:00","id":"3668","create_date":"2017-08-12","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"400.00","total_money":"2750.00","phone":[{"dep_name":"临湖餐厅","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"临湖餐厅"},{"is_del":"0","dep_ids":"19","code":"CGDD1708128809","realname":"陈燕华","plan_date":"2017-08-13 09:00","id":"3666","create_date":"2017-08-12","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"3.50","total_money":"17.50","phone":[{"dep_name":"临湖餐厅","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"临湖餐厅"},{"is_del":"0","dep_ids":"9","code":"CGDD1708118772","realname":"采购测试","plan_date":"2017-08-12 09:00","id":"3665","create_date":"2017-08-12","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"1100.00","total_money":"2780.00","phone":[{"dep_name":"东区食堂","contact_person":"张三","contact_number":"668"}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"东区食堂"},{"is_del":"0","dep_ids":"9","code":"CGDD1708118769","realname":"系统管理员","plan_date":"2017-08-12 09:00","id":"3663","create_date":"2017-08-11","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"100.00","total_money":"320.00","phone":[{"dep_name":"东区食堂","contact_person":"张三","contact_number":"668"}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"东区食堂"},{"is_del":"0","dep_ids":"9","code":"CGDD1708108762","realname":"系统管理员","plan_date":"2017-08-11 09:00","id":"3661","create_date":"2017-08-10","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"20.00","total_money":"127.00","phone":[{"dep_name":"东区食堂","contact_person":"张三","contact_number":"668"}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"东区食堂"},{"is_del":"0","dep_ids":"14","code":"CGDD1708098678","realname":"系统管理员","plan_date":"2017-08-10 09:00","id":"3658","create_date":"2017-08-10","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"10.00","total_money":"61.00","phone":[{"dep_name":"外卖配送部","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"外卖配送部"},{"is_del":"0","dep_ids":"11","code":"CGDD1708098671","realname":"系统管理员","plan_date":"2017-08-10 09:00","id":"3656","create_date":"2017-08-10","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"1.00","total_money":"2.20","phone":[{"dep_name":"休闲餐厅","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"休闲餐厅"},{"is_del":"0","dep_ids":"9","code":"CGDD1708098667","realname":"系统管理员","plan_date":"2017-08-10 09:00","id":"3654","create_date":"2017-08-10","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"1.00","total_money":"3.20","phone":[{"dep_name":"东区食堂","contact_person":"张三","contact_number":"668"}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"东区食堂"},{"is_del":"0","dep_ids":"9","code":"CGDD1708088449","realname":"系统管理员","plan_date":"2017-08-09 09:00","id":"3653","create_date":"2017-08-08","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"1100.00","total_money":"2780.00","phone":[{"dep_name":"东区食堂","contact_person":"张三","contact_number":"668"}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"东区食堂"},{"is_del":"0","dep_ids":"9","code":"CGDD1708078344","realname":"系统管理员","plan_date":"2017-08-08 09:00","id":"3651","create_date":"2017-08-08","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"121.00","total_money":"440.20","phone":[{"dep_name":"东区食堂","contact_person":"张三","contact_number":"668"}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"东区食堂"},{"is_del":"0","dep_ids":"11","code":"CGDD1708058318","realname":"系统管理员","plan_date":"2017-08-06 09:00","id":"3649","create_date":"2017-08-05","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"40.00","total_money":"506.00","phone":[{"dep_name":"休闲餐厅","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"休闲餐厅"},{"is_del":"0","dep_ids":"10","code":"CGDD1708058310","realname":"系统管理员","plan_date":"2017-08-06 09:00","id":"3646","create_date":"2017-08-05","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"40.00","total_money":"167.00","phone":[{"dep_name":"西区食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"西区食堂"},{"is_del":"0","dep_ids":"15","code":"CGDD1708038306","realname":"系统管理员","plan_date":"2017-08-04 00:00","id":"3645","create_date":"2017-08-04","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"999999999.99","total_money":"999999999.99","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"9","code":"CGDD1708038291","realname":"系统管理员","plan_date":"2017-08-04 09:00","id":"3641","create_date":"2017-08-03","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"300.00","total_money":"1540.00","phone":[{"dep_name":"东区食堂","contact_person":"张三","contact_number":"668"}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"东区食堂"}],"total_amount":"1000014346.49","total_money":"1000078207.34","count":"42"}
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
         * total : 42
         * rows : [{"is_del":"0","dep_ids":"15","code":"CGDD1708309435","realname":"采购测试","plan_date":"2017-08-31 09:00","id":"3735","create_date":"2017-08-30","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"200.00","total_money":"1270.00","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"15","code":"CGDD1708289429","realname":"测试","plan_date":"2017-08-28 00:00","id":"3732","create_date":"2017-08-29","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"4.00","total_money":"27.50","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"10","code":"CGDD1708289407","realname":"系统管理员","plan_date":"2017-08-29 09:00","id":"3731","create_date":"2017-08-28","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"5.00","total_money":"18.10","phone":[{"dep_name":"西区食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"西区食堂"},{"is_del":"0","dep_ids":"15","code":"CGDD1708289403","realname":"系统管理员","plan_date":"2017-08-29 09:00","id":"3730","create_date":"2017-08-28","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"38.00","total_money":"149.50","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"164","code":"CGDD1708269398","realname":"同保一","plan_date":"2017-08-27 09:00","id":"3729","create_date":"2017-08-26","status":"5","com_name":"浙江同力教育后勤管理有限公司","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"同力一级","dep_root_id":"163","com_id":"4","total_amount":"600.00","total_money":"2780.00","phone":[{"dep_name":"同力测试食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"同力","dep_brief_name":"tlyj","request_dep_strs":"同力测试食堂"},{"is_del":"0","dep_ids":"9,22","code":"CGDD1708269395","realname":"系统管理员","plan_date":"2017-08-27 09:00","id":"3728","create_date":"2017-08-26","status":"2","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"1500.00","total_money":"9520.00","phone":[{"dep_name":"东区食堂","contact_person":"张三","contact_number":"668"},{"dep_name":"一食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"东区食堂,一食堂"},{"is_del":"0","dep_ids":"164","code":"CGDD1708239388","realname":"系统管理员","plan_date":"2017-08-24 09:00","id":"3727","create_date":"2017-08-23","status":"5","com_name":"浙江同力教育后勤管理有限公司","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"同力一级","dep_root_id":"163","com_id":"4","total_amount":"66.00","total_money":"344.30","phone":[{"dep_name":"同力测试食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"同力","dep_brief_name":"tlyj","request_dep_strs":"同力测试食堂"},{"is_del":"0","dep_ids":"164","code":"CGDD1708239365","realname":"","plan_date":"2017-08-24 09:00","id":"3725","create_date":"2017-08-23","status":"2","com_name":"浙江同力教育后勤管理有限公司","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"同力一级","dep_root_id":"163","com_id":"4","total_amount":"77.00","total_money":"448.80","phone":[{"dep_name":"同力测试食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"同力","dep_brief_name":"tlyj","request_dep_strs":"同力测试食堂"},{"is_del":"0","dep_ids":"164","code":"CGDD1708239362","realname":"","plan_date":"2017-08-24 09:00","id":"3724","create_date":"2017-08-23","status":"5","com_name":"浙江同力教育后勤管理有限公司","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"同力一级","dep_root_id":"163","com_id":"4","total_amount":"66.00","total_money":"344.30","phone":[{"dep_name":"同力测试食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"同力","dep_brief_name":"tlyj","request_dep_strs":"同力测试食堂"},{"is_del":"0","dep_ids":"15","code":"CGDD1708219298","realname":"系统管理员","plan_date":"2017-08-22 09:00","id":"3720","create_date":"2017-08-22","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"2.00","total_money":"19.45","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"15","code":"CGDD1708219302","realname":"系统管理员","plan_date":"2017-08-22 09:00","id":"3722","create_date":"2017-08-22","status":"4","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"鲜肉类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"16.50","total_money":"196.98","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"15","code":"CGDD1708219293","realname":"系统管理员","plan_date":"2017-08-22 09:00","id":"3718","create_date":"2017-08-22","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"4.50","total_money":"12.90","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"15","code":"CGDD1708219291","realname":"系统管理员","plan_date":"2017-08-22 09:00","id":"3717","create_date":"2017-08-22","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"0.50","total_money":"2.50","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"10,11","code":"CGDD1708199270","realname":"陈燕华","plan_date":"2017-08-20 09:00","id":"3716","create_date":"2017-08-19","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"1800.00","total_money":"9760.00","phone":[{"dep_name":"西区食堂","contact_person":"","contact_number":""},{"dep_name":"休闲餐厅","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"西区食堂,休闲餐厅"},{"is_del":"0","dep_ids":"15","code":"CGDD1708199205","realname":"系统管理员","plan_date":"2017-08-19 00:00","id":"3710","create_date":"2017-08-19","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"319.00","total_money":"1440.40","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"15","code":"CGDD1708199208","realname":"系统管理员","plan_date":"2017-08-19 00:00","id":"3712","create_date":"2017-08-19","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"鲜肉类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"1054.50","total_money":"11768.22","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"15","code":"CGDD1708199130","realname":"系统管理员","plan_date":"2017-08-19 00:00","id":"3709","create_date":"2017-08-19","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"6.00","total_money":"134.50","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"15","code":"CGDD1708199067","realname":"系统管理员","plan_date":"2017-08-20 09:00","id":"3705","create_date":"2017-08-19","status":"4","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"207.50","total_money":"874.20","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"15","code":"CGDD1708199070","realname":"系统管理员","plan_date":"2017-08-20 09:00","id":"3707","create_date":"2017-08-19","status":"4","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"鲜肉类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"366.50","total_money":"4764.50","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"15","code":"CGDD1708178953","realname":"系统管理员","plan_date":"2017-08-18 09:00","id":"3691","create_date":"2017-08-18","status":"2","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"1000.00","total_money":"3200.00","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"9,10,25,26","code":"CGDD1708178946","realname":"系统管理员","plan_date":"2017-08-06 09:00","id":"3681","create_date":"2017-08-17","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"2000.00","total_money":"10920.00","phone":[{"dep_name":"东区食堂","contact_person":"张三","contact_number":"668"},{"dep_name":"西区食堂","contact_person":"","contact_number":""},{"dep_name":"五六食堂","contact_person":"","contact_number":""},{"dep_name":"靓园","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"东区食堂,西区食堂,五六食堂,靓园"},{"is_del":"0","dep_ids":"114","code":"CGDD1708178859","realname":"陈燕华","plan_date":"2017-08-18 09:00","id":"3680","create_date":"2017-08-17","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第二餐饮中心(玉泉)","dep_root_id":"2","com_id":"1","total_amount":"400.00","total_money":"1980.00","phone":[{"dep_name":"玉泉四食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"玉泉","request_dep_strs":"玉泉四食堂"},{"is_del":"0","dep_ids":"114","code":"CGDD1708178854","realname":"陈燕华","plan_date":"2017-08-18 09:00","id":"3678","create_date":"2017-08-17","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第二餐饮中心(玉泉)","dep_root_id":"2","com_id":"1","total_amount":"300.00","total_money":"1540.00","phone":[{"dep_name":"玉泉四食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"玉泉","request_dep_strs":"玉泉四食堂"},{"is_del":"0","dep_ids":"86","code":"CGDD1708178850","realname":"陈燕华","plan_date":"2017-08-18 09:00","id":"3676","create_date":"2017-08-17","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第二餐饮中心(玉泉)","dep_root_id":"2","com_id":"1","total_amount":"30.00","total_money":"180.00","phone":[{"dep_name":"川菜部","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"玉泉","request_dep_strs":"川菜部"},{"is_del":"0","dep_ids":"114","code":"CGDD1708178838","realname":"陈燕华","plan_date":"2017-08-18 09:00","id":"3673","create_date":"2017-08-17","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第二餐饮中心(玉泉)","dep_root_id":"2","com_id":"1","total_amount":"40.00","total_money":"267.00","phone":[{"dep_name":"玉泉四食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"玉泉","request_dep_strs":"玉泉四食堂"},{"is_del":"0","dep_ids":"15","code":"CGDD1708148826","realname":"陈燕华","plan_date":"2017-08-15 09:00","id":"3670","create_date":"2017-08-15","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"447.00","total_money":"1520.10","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"19","code":"CGDD1708128814","realname":"陈燕华","plan_date":"2017-08-13 09:00","id":"3668","create_date":"2017-08-12","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"400.00","total_money":"2750.00","phone":[{"dep_name":"临湖餐厅","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"临湖餐厅"},{"is_del":"0","dep_ids":"19","code":"CGDD1708128809","realname":"陈燕华","plan_date":"2017-08-13 09:00","id":"3666","create_date":"2017-08-12","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"3.50","total_money":"17.50","phone":[{"dep_name":"临湖餐厅","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"临湖餐厅"},{"is_del":"0","dep_ids":"9","code":"CGDD1708118772","realname":"采购测试","plan_date":"2017-08-12 09:00","id":"3665","create_date":"2017-08-12","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"1100.00","total_money":"2780.00","phone":[{"dep_name":"东区食堂","contact_person":"张三","contact_number":"668"}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"东区食堂"},{"is_del":"0","dep_ids":"9","code":"CGDD1708118769","realname":"系统管理员","plan_date":"2017-08-12 09:00","id":"3663","create_date":"2017-08-11","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"100.00","total_money":"320.00","phone":[{"dep_name":"东区食堂","contact_person":"张三","contact_number":"668"}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"东区食堂"},{"is_del":"0","dep_ids":"9","code":"CGDD1708108762","realname":"系统管理员","plan_date":"2017-08-11 09:00","id":"3661","create_date":"2017-08-10","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"20.00","total_money":"127.00","phone":[{"dep_name":"东区食堂","contact_person":"张三","contact_number":"668"}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"东区食堂"},{"is_del":"0","dep_ids":"14","code":"CGDD1708098678","realname":"系统管理员","plan_date":"2017-08-10 09:00","id":"3658","create_date":"2017-08-10","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"10.00","total_money":"61.00","phone":[{"dep_name":"外卖配送部","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"外卖配送部"},{"is_del":"0","dep_ids":"11","code":"CGDD1708098671","realname":"系统管理员","plan_date":"2017-08-10 09:00","id":"3656","create_date":"2017-08-10","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"1.00","total_money":"2.20","phone":[{"dep_name":"休闲餐厅","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"休闲餐厅"},{"is_del":"0","dep_ids":"9","code":"CGDD1708098667","realname":"系统管理员","plan_date":"2017-08-10 09:00","id":"3654","create_date":"2017-08-10","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"1.00","total_money":"3.20","phone":[{"dep_name":"东区食堂","contact_person":"张三","contact_number":"668"}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"东区食堂"},{"is_del":"0","dep_ids":"9","code":"CGDD1708088449","realname":"系统管理员","plan_date":"2017-08-09 09:00","id":"3653","create_date":"2017-08-08","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"1100.00","total_money":"2780.00","phone":[{"dep_name":"东区食堂","contact_person":"张三","contact_number":"668"}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"东区食堂"},{"is_del":"0","dep_ids":"9","code":"CGDD1708078344","realname":"系统管理员","plan_date":"2017-08-08 09:00","id":"3651","create_date":"2017-08-08","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"121.00","total_money":"440.20","phone":[{"dep_name":"东区食堂","contact_person":"张三","contact_number":"668"}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"东区食堂"},{"is_del":"0","dep_ids":"11","code":"CGDD1708058318","realname":"系统管理员","plan_date":"2017-08-06 09:00","id":"3649","create_date":"2017-08-05","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"40.00","total_money":"506.00","phone":[{"dep_name":"休闲餐厅","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"休闲餐厅"},{"is_del":"0","dep_ids":"10","code":"CGDD1708058310","realname":"系统管理员","plan_date":"2017-08-06 09:00","id":"3646","create_date":"2017-08-05","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"40.00","total_money":"167.00","phone":[{"dep_name":"西区食堂","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"西区食堂"},{"is_del":"0","dep_ids":"15","code":"CGDD1708038306","realname":"系统管理员","plan_date":"2017-08-04 00:00","id":"3645","create_date":"2017-08-04","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"999999999.99","total_money":"999999999.99","phone":[{"dep_name":"总仓","contact_person":"","contact_number":""}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","dep_ids":"9","code":"CGDD1708038291","realname":"系统管理员","plan_date":"2017-08-04 09:00","id":"3641","create_date":"2017-08-03","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","total_amount":"300.00","total_money":"1540.00","phone":[{"dep_name":"东区食堂","contact_person":"张三","contact_number":"668"}],"is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"东区食堂"}]
         * total_amount : 1000014346.49
         * total_money : 1000078207.34
         * count : 42
         */

        private String total;
        private String total_amount;
        private String total_money;
        private String count;
        private List<RowsBean> rows;

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
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

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public List<RowsBean> getRows() {
            return rows;
        }

        public void setRows(List<RowsBean> rows) {
            this.rows = rows;
        }

        public static class RowsBean {
            /**
             * is_del : 0
             * dep_ids : 15
             * code : CGDD1708309435
             * realname : 采购测试
             * plan_date : 2017-08-31 09:00
             * id : 3735
             * create_date : 2017-08-30
             * status : 5
             * com_name : 浙大饮食中心
             * is_used : 0
             * supply_name : 杭州蔬菜物流有限公司
             * cat_name : 果蔬类
             * dep_root_name : 第一餐饮中心（紫金港）
             * dep_root_id : 1
             * com_id : 1
             * total_amount : 200.00
             * total_money : 1270.00
             * phone : [{"dep_name":"总仓","contact_person":"","contact_number":""}]
             * is_new : 0
             * com_brief_name : 浙大
             * dep_brief_name : 紫金
             * request_dep_strs : 总仓
             */

            private String is_del;
            private String dep_ids;
            private String code;
            private String realname;
            private String plan_date;
            private String id;
            private String create_date;
            private String status;
            private String com_name;
            private String is_used;
            private String supply_name;
            private String cat_name;
            private String dep_root_name;
            private String dep_root_id;
            private String com_id;
            private String total_amount;
            private String total_money;
            private int is_new;
            private String com_brief_name;
            private String dep_brief_name;
            private String request_dep_strs;
            private List<PhoneBean> phone;

            public String getIs_del() {
                return is_del;
            }

            public void setIs_del(String is_del) {
                this.is_del = is_del;
            }

            public String getDep_ids() {
                return dep_ids;
            }

            public void setDep_ids(String dep_ids) {
                this.dep_ids = dep_ids;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getRealname() {
                return realname;
            }

            public void setRealname(String realname) {
                this.realname = realname;
            }

            public String getPlan_date() {
                return plan_date;
            }

            public void setPlan_date(String plan_date) {
                this.plan_date = plan_date;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCreate_date() {
                return create_date;
            }

            public void setCreate_date(String create_date) {
                this.create_date = create_date;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getCom_name() {
                return com_name;
            }

            public void setCom_name(String com_name) {
                this.com_name = com_name;
            }

            public String getIs_used() {
                return is_used;
            }

            public void setIs_used(String is_used) {
                this.is_used = is_used;
            }

            public String getSupply_name() {
                return supply_name;
            }

            public void setSupply_name(String supply_name) {
                this.supply_name = supply_name;
            }

            public String getCat_name() {
                return cat_name;
            }

            public void setCat_name(String cat_name) {
                this.cat_name = cat_name;
            }

            public String getDep_root_name() {
                return dep_root_name;
            }

            public void setDep_root_name(String dep_root_name) {
                this.dep_root_name = dep_root_name;
            }

            public String getDep_root_id() {
                return dep_root_id;
            }

            public void setDep_root_id(String dep_root_id) {
                this.dep_root_id = dep_root_id;
            }

            public String getCom_id() {
                return com_id;
            }

            public void setCom_id(String com_id) {
                this.com_id = com_id;
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

            public int getIs_new() {
                return is_new;
            }

            public void setIs_new(int is_new) {
                this.is_new = is_new;
            }

            public String getCom_brief_name() {
                return com_brief_name;
            }

            public void setCom_brief_name(String com_brief_name) {
                this.com_brief_name = com_brief_name;
            }

            public String getDep_brief_name() {
                return dep_brief_name;
            }

            public void setDep_brief_name(String dep_brief_name) {
                this.dep_brief_name = dep_brief_name;
            }

            public String getRequest_dep_strs() {
                return request_dep_strs;
            }

            public void setRequest_dep_strs(String request_dep_strs) {
                this.request_dep_strs = request_dep_strs;
            }

            public List<PhoneBean> getPhone() {
                return phone;
            }

            public void setPhone(List<PhoneBean> phone) {
                this.phone = phone;
            }

            public static class PhoneBean {
                /**
                 * dep_name : 总仓
                 * contact_person :
                 * contact_number :
                 */

                private String dep_name;
                private String contact_person;
                private String contact_number;

                public String getDep_name() {
                    return dep_name;
                }

                public void setDep_name(String dep_name) {
                    this.dep_name = dep_name;
                }

                public String getContact_person() {
                    return contact_person;
                }

                public void setContact_person(String contact_person) {
                    this.contact_person = contact_person;
                }

                public String getContact_number() {
                    return contact_number;
                }

                public void setContact_number(String contact_number) {
                    this.contact_number = contact_number;
                }
            }
        }
    }
}
