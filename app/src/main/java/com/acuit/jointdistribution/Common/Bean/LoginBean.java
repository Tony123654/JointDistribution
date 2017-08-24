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
     * data : {"priv":{"Buy":{"buy_order_list":{"priv_add":1,"priv_adjust_price":1,"priv_audit":1,"priv_confirm":1,"priv_copy":1,"priv_create_order":1,"priv_create_store_in":1,"priv_delete":1,"priv_edit":1,"priv_enroll":1,"priv_send":1,"priv_set_in_use":1,"priv_view":1}},"Store":{"store_in_list":{"priv_add":1,"priv_adjust_price":1,"priv_audit":1,"priv_confirm":1,"priv_copy":1,"priv_create_order":1,"priv_create_store_in":1,"priv_delete":1,"priv_edit":1,"priv_enroll":1,"priv_send":1,"priv_set_in_use":1,"priv_view":1}}},"token":"smart_e7b2da982c1d27e7f003e3ce00d3ffd9","user_info":{"dep_info":{"com_id":"1","com_name":"浙大饮食中心","dep_id":"1","dep_name":"第一餐饮中心（紫金港）"},"loginname":"admin","menu":[{"a":"public_main","c":"Index","child":[{"a":"self_info","c":"admin_manage","child":[{"a":"public_edit_info","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"972","listorder":"0","name":"editinfo","parentid":"970"},{"a":"submit_bug","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1903","listorder":"0","name":"意见反馈","parentid":"970","url":""},{"a":"public_edit_tel","c":"Admin_manage","data":"","data_leave":"","data_on":"","display":"1","id":"1980","listorder":"0","name":"安全中心","parentid":"970","url":""},{"a":"public_edit_pwd","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"971","listorder":"1","name":"editpwd","parentid":"970"}],"cname":"admininfo","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"970","listorder":"0","name":"admininfo","parentid":"10"}],"cname":"我的面板","data":"","data_leave":"./skin/images/nav_icon/icon_mb_h.png","data_on":"./skin/images/nav_icon/icon_mb_n.png","display":"1","id":"10","listorder":"0","name":"panel","parentid":"0","url":""},{"a":"init","c":"Dish","child":[{"a":"p_stock","c":"dish","child":[{"a":"stock_list_jl","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1960","listorder":"0","name":"商品净料表","parentid":"1588","url":""},{"a":"stock_list_ml","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1961","listorder":"0","name":"商品毛料表","parentid":"1588","url":""},{"a":"stock_list_cp","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1962","listorder":"0","name":"商品菜品表","parentid":"1588","url":""},{"a":"import_nutri_excel","c":"Nutri","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1975","listorder":"0","name":"excel导入食材","parentid":"1588","url":""},{"a":"stock_material_list","c":"Nutri","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1976","listorder":"0","name":"食材营养素","parentid":"1588","url":""},{"a":"stock_list","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1589","listorder":"1","name":"存货列表","parentid":"1588"},{"a":"composition","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1591","listorder":"2","name":"存货组合","parentid":"1588"},{"a":"type_list&test=1","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1590","listorder":"3","name":"分类管理","parentid":"1588","url":""},{"a":"zhufuliao_fun","c":"zhufuliao","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1671","listorder":"4","name":"主辅料查询","parentid":"1588","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fstock%2Fcpzfl.cpt"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1588","listorder":"0","name":"存货管理","parentid":"1564"},{"a":"p_business","c":"dish","child":[{"a":"add_income_and_out","c":"finance","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1895","listorder":"1","name":"添加收入和支出","parentid":"1851","url":""},{"a":"dep_bep","c":"finance","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1893","listorder":"2","name":" 部门盈亏日报表","parentid":"1851","url":""},{"a":"finance_income","c":"finance","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1881","listorder":"3","name":"营业收入","parentid":"1851","url":""},{"a":"cost","c":"finance","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1852","listorder":"4","name":"费用支出","parentid":"1851","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1851","listorder":"0","name":"日常业务","parentid":"1564","url":""},{"a":"p_order","c":"dish","child":[{"a":"dish_10","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1918","listorder":"0","name":"部门采购汇总表","parentid":"1594","url":"/admin.php?c=Report&a=common_search&id=57&finance=1"},{"a":"view_order_store_status","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1959","listorder":"0","name":"订单追踪","parentid":"1594","url":""},{"a":"menu_plan","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1592","listorder":"1","name":"菜单计划","parentid":"1594"},{"a":"request_list","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1593","listorder":"2","name":"请购单管理","parentid":"1594"},{"a":"order_list","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1599","listorder":"3","name":"采购汇总单管理","parentid":"1594","url":""},{"a":"menu_plan_alter_list","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1964","listorder":"4","name":"菜单变更","parentid":"1594","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1594","listorder":"2","name":"订单管理","parentid":"1564"},{"a":"p_info","c":"dish","child":[{"a":"purity_standard","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1597","listorder":"0","name":"净料规格表","parentid":"1595"},{"a":"dish_stock","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1598","listorder":"0","name":"菜品主辅料","parentid":"1595"},{"a":"dish_one_hundred_six","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1899","listorder":"0","name":"商品导出","parentid":"1595","url":"/admin.php?c=Report&a=common_search&id=47"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1595","listorder":"3","name":"信息查询","parentid":"1564"},{"a":"p_setting","c":"dish","child":[{"a":"unit_list","c":"Dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1566","listorder":"0","name":"计量单位","parentid":"1565"},{"a":"dep_stock_all","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1870","listorder":"0","name":"部门商品属性设置","parentid":"1565","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1565","listorder":"4","name":"基本设置","parentid":"1564"}],"data":"","data_leave":"./skin/images/nav_icon/icon_date_h.png","data_on":"./skin/images/nav_icon/icon_date_n.png","display":"1","id":"1564","listorder":"1","name":"数据中心","parentid":"0"},{"a":"init","c":"Statistics","child":[{"a":"p_stat","c":"Statistics","child":[{"a":"supply_menu","c":"Statistics","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1604","listorder":"0","name":"供应菜单","parentid":"1602"},{"a":"dish_rank","c":"Statistics","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1603","listorder":"1","name":"菜品排行","parentid":"1602"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1602","listorder":"0","name":"菜品统计","parentid":"1601"},{"a":"","c":"dish","child":[{"a":"dish_sixteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1901","listorder":"0","name":"营业收入统计表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=19&finance=1"},{"a":"dish_fourteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1902","listorder":"0","name":"费用支出汇总表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=17&finance=1"},{"a":"dish_one_hundred_nighe","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1907","listorder":"0","name":"存货分类账","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=18&finance=1"},{"a":"dish_50","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1965","listorder":"0","name":"销货清单","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=59&finance=1"},{"a":"dish_59","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1969","listorder":"0","name":"供应商商品报表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=70&finance=2"},{"a":"dish_71","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1970","listorder":"0","name":"分公司采购汇总量","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=71&finance=2"},{"a":"dish_72","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1971","listorder":"0","name":"各部门采购汇总量","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=72&finance=2"},{"a":"dish_73","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1972","listorder":"0","name":"公司部门采购汇总","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=73&finance=2"},{"a":"echarts","c":"Index","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1974","listorder":"0","name":"报表分析","parentid":"1863","url":""},{"a":"dish_twenty_one","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1890","listorder":"1","name":"部门应付账","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=27&finance=1"},{"a":"dish_twenty","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1889","listorder":"2","name":"部门应收账","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=28&finance=1"},{"a":"dish_seven","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1877","listorder":"3","name":" 应付账明细表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=10&finance=1&datatable=1"},{"a":"dish_eight","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1876","listorder":"4","name":"应收帐明细表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=11&finance=1&datatable=1"},{"a":"dish_one","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1875","listorder":"5","name":"进货入库统计表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=2&finance=1"},{"a":"dish_seven","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1886","listorder":"6","name":"进货价格历史表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=24&finance=1"},{"a":"dish_nineteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1888","listorder":"7","name":"入库统计表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=26&finance=1"},{"a":"dish_sixteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1887","listorder":"8","name":"出库统计表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=25&finance=1"},{"a":"dish_three","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/tongjibiao@3x.png","data_on":"","display":"1","id":"1864","listorder":"9","name":"部门入库统计表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=6&finance=1"},{"a":"dish_thirteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1878","listorder":"10","name":"部门出库统计表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=16&finance=1&datetable=1"},{"a":"dish_twenty_two","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1891","listorder":"11","name":"净料价格表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=31&finance=1&datatable=1"},{"a":"dish_two_1","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1880","listorder":"12","name":"商品库存","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=4&finance=1&datatable=1&datatable=1&test=2"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1863","listorder":"0","name":"日常统计","parentid":"1601","url":""},{"a":"dish_one_hundred_ten","c":"dish","child":[{"a":"dish_one_hundred_seven","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1905","listorder":"0","name":"菜品成本参考表","parentid":"1904","url":"/admin.php?c=Report&a=common_search&id=49&finance=1"},{"a":"dish_one_hundred_eight","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1906","listorder":"0","name":"部门菜品成本表","parentid":"1904","url":"/admin.php?c=Report&a=common_search&id=51&finance=1&datatable=1"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1904","listorder":"0","name":"决策分析","parentid":"1601","url":""},{"a":"dish_60","c":"dish","child":[{"a":"dish_4","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1915","listorder":"0","name":"部门毛料需求汇总","parentid":"1914","url":"/admin.php?c=Report&a=common_search&id=56&finance=1"},{"a":"dish_3","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1916","listorder":"0","name":"部门净料需求汇总","parentid":"1914","url":"/admin.php?c=Report&a=common_search&id=54&finance=1"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1914","listorder":"0","name":"需求分析","parentid":"1601","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_tjfx_h.png","data_on":"./skin/images/nav_icon/icon_tjfx_n.png","display":"1","id":"1601","listorder":"2","name":"统计分析","parentid":"0"},{"a":"init","c":"Buy","child":[{"a":"buy_2","c":"Buy","child":[{"a":"stock_list&abc=1","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1711","listorder":"0","name":"商品信息","parentid":"1808","url":""},{"a":"type_list","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1712","listorder":"0","name":"商品分类","parentid":"1808","url":""},{"a":"supply_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1719","listorder":"0","name":"供应商信息","parentid":"1808","url":""},{"a":"unit_list","c":"Dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1898","listorder":"0","name":"计量单位","parentid":"1808","url":""},{"a":"price_region_list","c":"Admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1963","listorder":"0","name":"价格执行区域","parentid":"1808","url":""},{"a":"execute_region_list","c":"Admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1724","listorder":"1","name":"执行配送区域","parentid":"1808","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1808","listorder":"0","name":"基本信息","parentid":"1803","url":""},{"a":"","c":"Buy","child":[{"a":"balance_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1721","listorder":"1","name":"采购结算","parentid":"1709","url":""},{"a":"adjust_price_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1725","listorder":"4","name":"调价管理","parentid":"1709","url":""},{"a":"contract_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1805","listorder":"5","name":"采购合同","parentid":"1709","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1839","listorder":"6","name":"采购汇总单管理","parentid":"1709","url":"/?c=Dish&a=order_list&menu_id=1599"},{"a":"buy_order_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1807","listorder":"7","name":"采购订单","parentid":"1709","url":""},{"a":"buy_order_alter","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1841","listorder":"8","name":"采购变更单","parentid":"1709","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1709","listorder":"5","name":"日常业务","parentid":"1803","url":""},{"a":"buy_1","c":"Buy","child":[{"a":"check_menu_stock","c":"Buystatis","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1739","listorder":"0","name":"菜品毛料检查","parentid":"1710","url":""},{"a":"dish_one_hundred","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1897","listorder":"0","name":"商品价格查询统计表","parentid":"1710","url":"/admin.php?c=Report&a=common_search&id=40&finance=2"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1710","listorder":"6","name":"查询统计","parentid":"1803","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_cggl_h.png","data_on":"./skin/images/nav_icon/icon_cggl_n.png","display":"1","id":"1803","listorder":"3","name":"采购管理","parentid":"0","url":""},{"a":"init","c":"Store","child":[{"a":"","c":"Store","child":[{"a":"market_store_in_list","c":"store","data":"99","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1741","listorder":"0","name":"市场应急入库","parentid":"1731","url":""},{"a":"store_in_list","c":"store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1720","listorder":"1","name":"采购入库","parentid":"1731","url":""},{"a":"store_out_list","c":"Store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1728","listorder":"2","name":"出库管理","parentid":"1731","url":""},{"a":"store_back_list","c":"Store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1894","listorder":"4","name":"退货单","parentid":"1731","url":""},{"a":"store_adjust_list","c":"Store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1879","listorder":"5","name":"盘点单","parentid":"1731","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1731","listorder":"0","name":"日常业务","parentid":"1730","url":""},{"a":"","c":"Store","child":[{"a":"dish_two_2","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1885","listorder":"0","name":" 商品库存","parentid":"1732","url":"/admin.php?c=Report&a=common_search&id=4&finance=1&test=4"},{"a":"dish_one_hundred_five","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1900","listorder":"0","name":"库存比对表","parentid":"1732","url":"/admin.php?c=Report&a=common_search&id=41&finance=1"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1732","listorder":"0","name":"查询报表","parentid":"1730","url":""},{"a":"delegate_buy","c":"Store","child":[{"a":"delegate_buy","c":"Store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1738","listorder":"0","name":"委托采购","parentid":"1737","url":""},{"a":"account_period_list","c":"Store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1742","listorder":"0","name":"会计年度设置","parentid":"1737","url":""},{"a":"carryover","c":"store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1967","listorder":"0","name":"月底结转","parentid":"1737","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1737","listorder":"0","name":"基本配置","parentid":"1730","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_kcgl_h.png","data_on":"./skin/images/nav_icon/icon_kcgl_n.png","display":"1","id":"1730","listorder":"4","name":"库存管理","parentid":"0","url":""},{"a":"init","c":"Supply","child":[{"a":"supply_cer_list_","c":"Supply","child":[{"a":"supply_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1736","listorder":"0","name":"供应商信息","parentid":"1735","url":""},{"a":"supply_cer_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1842","listorder":"0","name":"供应商证件管理","parentid":"1735","url":""},{"a":"supply_cer_alter_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1843","listorder":"0","name":"供应商证件审核","parentid":"1735","url":""},{"a":"Scoring_criteria","c":"supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1848","listorder":"0","name":"考核大类管理","parentid":"1735","url":""},{"a":"rated_item","c":"supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1844","listorder":"0","name":"评分项目管理","parentid":"1735","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1735","listorder":"0","name":"基础信息","parentid":"1733","url":""},{"a":"Supply___","c":"Supply","child":[{"a":"buy_order_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1856","listorder":"0","name":"订单管理","parentid":"1855","url":""},{"a":"store_in_list","c":"store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1857","listorder":"0","name":"配送管理","parentid":"1855","url":""},{"a":"buy_order_alter","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1858","listorder":"0","name":"采购变更单","parentid":"1855","url":""},{"a":"balance_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1912","listorder":"0","name":"采购结算","parentid":"1855","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1855","listorder":"0","name":"日常业务","parentid":"1733","url":""},{"a":"dish_one_hundred_11","c":"dish","child":[{"a":"dish_one_hundred_12","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1909","listorder":"0","name":"送货单统计表","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=22&finance=1"},{"a":"dish_one_hundred_13","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1910","listorder":"0","name":"入库单统计表","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=23&finance=1"},{"a":"dish_one_hundred_14","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1911","listorder":"0","name":"应收账统计表","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=52&finance=1"},{"a":"dish_7","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1917","listorder":"0","name":"送货单明细表","parentid":"1908","url":"admin.php?c=Report&a=common_search&id=53&finance=1"},{"a":"dish_51","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1966","listorder":"0","name":"销货清单","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=60&finance=1"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1908","listorder":"0","name":"查询统计","parentid":"1733","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_psgl_h.png","data_on":"./skin/images/nav_icon/icon_psgl_n.png","display":"1","id":"1733","listorder":"5","name":"配送管理","parentid":"0","url":""},{"a":"init","c":"finance","child":[{"a":"","c":"dish","child":[{"a":"dep_bep","c":"finance","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1892","listorder":"0","name":"部门盈亏日报表","parentid":"1860","url":""},{"a":"dish_110","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1968","listorder":"0","name":"按供应商统计表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=66&finance=1"},{"a":"dish_two_3","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1861","listorder":"1","name":"商品库存","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=4&finance=1&test=1"},{"a":"dish_one","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1862","listorder":"2","name":"进货渠道入库表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=2&finance=2"},{"a":"dish_nine","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1869","listorder":"3","name":"实物消耗表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=30&finance=1"},{"a":"dish_five","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1866","listorder":"4","name":"未付已付合并查询","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=9&finance=1"},{"a":"dish_four","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1865","listorder":"5","name":"部门应收账报表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=28&finance=1"},{"a":"dish_ten","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1871","listorder":"6","name":"部门应付账报表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=13&finance=1"},{"a":"dish_eight","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1868","listorder":"7","name":"应收帐明细表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=29&finance=1"},{"a":"dish_seven","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1867","listorder":"8","name":"应付账明细表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=10&finance=1"},{"a":"dish_fourteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1872","listorder":"9","name":"费用支出汇总表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=17&finance=1"},{"a":"dish_sixteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1883","listorder":"10","name":"营业收入统计表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=19&finance=1"},{"a":"dish_fiveteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1882","listorder":"11","name":"存货分类账","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=18&finance=1"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1860","listorder":"0","name":"财务报表","parentid":"1859","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_cwgl_h.png","data_on":"./skin/images/nav_icon/icon_cwgl_n.png","display":"1","id":"1859","listorder":"6","name":"财务管理","parentid":"0","url":""},{"a":"init_init","c":"Role","child":[{"a":"update2","c":"Z_setting2","child":[{"a":"manage","c":"Z_seat","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1700","listorder":"0","name":"推荐位管理","parentid":"1694","url":""},{"a":"update","c":"Z_setting2","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1695","listorder":"0","name":"站点管理","parentid":"1694","url":""},{"a":"manage","c":"Z_database","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1696","listorder":"0","name":"数据备份","parentid":"1694","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1694","listorder":"1","name":"站点管理","parentid":"1","url":""},{"a":"ad_manage","c":"Admin_manage","child":[{"a":"admin_company","c":"Admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1896","listorder":"0","name":"单位管理","parentid":"49","url":""},{"a":"tag_list","c":"Admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1977","listorder":"0","name":"菜品标签维护","parentid":"49","url":""},{"a":"com_cat_attr_list","c":"Admin_manage","data":"","data_leave":"","data_on":"","display":"1","id":"1979","listorder":"0","name":"公司类别属性","parentid":"49","url":""},{"a":"init","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"54","listorder":"1","name":"用户管理","parentid":"49"},{"a":"init","c":"role","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"50","listorder":"2","name":"role_manage","parentid":"49"},{"a":"dep_list","c":"Admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1626","listorder":"3","name":"部门管理","parentid":"49"},{"a":"init","c":"menu","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"31","listorder":"4","name":"menu_manage","parentid":"49"},{"a":"update","c":"Z_setting","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1670","listorder":"22","name":"微信管理","parentid":"49","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"49","listorder":"2","name":"admin_setting","parentid":"1"},{"a":"init","c":"Z_ad","child":[{"a":"seat_manage","c":"Z_ad","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1699","listorder":"0","name":"广告位管理","parentid":"1697","url":""},{"a":"manage","c":"Z_ad","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1698","listorder":"0","name":"广告管理","parentid":"1697","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1697","listorder":"3","name":"广告管理","parentid":"1","url":""},{"a":"","c":"","child":[{"a":"init","c":"log","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"997","listorder":"3","name":"log","parentid":"1621"},{"a":"lock_list","c":"OrderLock","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1600","listorder":"5","name":"订单锁管理","parentid":"1621"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1621","listorder":"11","name":"系统监视","parentid":"1"},{"a":"","c":"","child":[{"a":"area_list","c":"area","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1623","listorder":"0","name":"区域列表","parentid":"1622"},{"a":"canteen_list","c":"area","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1625","listorder":"2","name":"食堂列表","parentid":"1622"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1622","listorder":"22","name":"区域管理","parentid":"1"}],"data":"","data_leave":"./skin/images/nav_icon/icon_xtsz_h.png","data_on":"./skin/images/nav_icon/icon_xtsz_n.png","display":"1","id":"1","listorder":"7","name":"系统设置","parentid":"0","url":""},{"a":"guide_page","c":"Bidweb","child":[{"a":"","c":"Bidweb","child":[{"a":"bid_plan_list","c":"Bidweb","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1921","listorder":"0","name":"招标计划","parentid":"1920","url":""},{"a":"bid_region_dep_list","c":"Bidweb","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1922","listorder":"0","name":"部门需求","parentid":"1920","url":""},{"a":"bid_region_list","c":"Bidweb","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1923","listorder":"0","name":"配送区域需求","parentid":"1920","url":""},{"a":"bid_plan_confirmed_list","c":"Bidweb","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1924","listorder":"0","name":"招标项目维护","parentid":"1920","url":""},{"a":"bid_result_list","c":"Bidweb","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1925","listorder":"0","name":"中标供应商管理","parentid":"1920","url":""},{"a":"adjust_price_list&is_bid=1","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1926","listorder":"0","name":"调价管理","parentid":"1920","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1920","listorder":"0","name":"日常业务","parentid":"1919","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_zbgl_h.png","data_on":"./skin/images/nav_icon/icon_zbgl_n.png","display":"1","id":"1919","listorder":"8","name":"招标管理","parentid":"0","url":""},{"a":"init","c":"employee","child":[{"a":"","c":"","child":[{"a":"list_query_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1934","listorder":"0","name":"列表查询","parentid":"1928","url":""},{"a":"employee_turnover_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1936","listorder":"0","name":"查看离职员工","parentid":"1928","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1928","listorder":"0","name":"人员查看","parentid":"1927","url":""},{"a":"","c":"","child":[{"a":"new_add_employer_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1937","listorder":"0","name":"新增员工","parentid":"1929","url":""},{"a":"dismiss_employees_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1938","listorder":"0","name":"辞退员工","parentid":"1929","url":""},{"a":"employee_files_html","c":"employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1939","listorder":"0","name":"员工档案","parentid":"1929","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1929","listorder":"0","name":"人员管理","parentid":"1927","url":""},{"a":"","c":"","child":[{"a":"attendance_record_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1941","listorder":"0","name":"考勤记录","parentid":"1930","url":""},{"a":"schedu","c":"employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1942","listorder":"0","name":"排班","parentid":"1930","url":""},{"a":"shift_set_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1943","listorder":"0","name":"班次设置","parentid":"1930","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1944","listorder":"0","name":"查看考勤统计","parentid":"1930","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1930","listorder":"0","name":"考勤管理","parentid":"1927","url":""},{"a":"","c":"","child":[{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1945","listorder":"0","name":"培训记录","parentid":"1931","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1946","listorder":"0","name":"查看培训记录","parentid":"1931","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1947","listorder":"0","name":"奖惩记录","parentid":"1931","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1948","listorder":"0","name":"查看奖惩记录","parentid":"1931","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1949","listorder":"0","name":"其他记录","parentid":"1931","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1950","listorder":"0","name":"查看其他记录","parentid":"1931","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1931","listorder":"0","name":"信息管理","parentid":"1927","url":""},{"a":"","c":"","child":[{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1951","listorder":"0","name":"工资标准","parentid":"1932","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1952","listorder":"0","name":"工资计算","parentid":"1932","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1953","listorder":"0","name":"工资统计","parentid":"1932","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1954","listorder":"0","name":"工资发放","parentid":"1932","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1932","listorder":"0","name":"工资管理","parentid":"1927","url":""},{"a":"","c":"","child":[{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1955","listorder":"0","name":"生日提醒","parentid":"1933","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1956","listorder":"0","name":"合同到期提醒","parentid":"1933","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1957","listorder":"0","name":"公司基本信息","parentid":"1933","url":""},{"a":"dep_infos_manage_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1958","listorder":"0","name":"部门职务管理","parentid":"1933","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1933","listorder":"0","name":"部门管理","parentid":"1927","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_rlzy_h.png","data_on":"./skin/images/nav_icon/icon_rlzy_n.png","display":"1","id":"1927","listorder":"9","name":"人力资源","parentid":"0","url":""},{"a":"init","c":"Z_card","child":[{"a":"inits","c":"Z_card","child":[{"a":"examine","c":"Z_card","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1850","listorder":"0","name":"食堂审核","parentid":"1636","url":""},{"a":"manage","c":"Z_card_criterion","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1853","listorder":"0","name":"用餐标准","parentid":"1636","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1854","listorder":"0","name":"餐费统计日报","parentid":"1636","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fpxbbk.cpt"},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1913","listorder":"0","name":"餐次消费统计表","parentid":"1636","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fccxfactj.cpt"},{"a":"manage","c":"Z_card","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1637","listorder":"1","name":"数据录入","parentid":"1636","url":""},{"a":"report","c":"Z_card","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1638","listorder":"2","name":"每日预约人数汇总","parentid":"1636","url":""},{"a":"reportInfo","c":"Z_card","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1639","listorder":"3","name":"每日预约人数明细","parentid":"1636","url":""},{"a":"doUserReport","c":"Z_card","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1668","listorder":"4","name":"操作员办卡统计","parentid":"1636","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1636","listorder":"0","name":"集体办卡","parentid":"1635"}],"data":"","data_leave":"./skin/images/nav_icon/icon_jtbk_h.png","data_on":"./skin/images/nav_icon/icon_jtbk_n.png","display":"1","id":"1635","listorder":"55","name":"集体办卡","parentid":"0"},{"a":"produce_dish","c":"z_braindisc","child":[{"a":"one","c":"z_braindisc","child":[{"a":"six","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1663","listorder":"0","name":"菜品排行","parentid":"1652","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fcpph.cpt"},{"a":"two","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1667","listorder":"0","name":"餐次报表","parentid":"1652","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fcctj.cpt"},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1884","listorder":"0","name":"销售进度","parentid":"1652","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fxsjd.cpt"},{"a":"seven","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1654","listorder":"1","name":"人员交易流水查询","parentid":"1652","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2FF108.cpt"},{"a":"nine","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1657","listorder":"3","name":"营业报表查询","parentid":"1652","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2FR301.cpt"},{"a":"fourteen","c":"thirteen","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1661","listorder":"8","name":"人员消费分餐查询","parentid":"1652","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2FR304.cpt"},{"a":"init","c":"Z_braindisc_update","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1675","listorder":"55","name":"数据更新","parentid":"1652","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1652","listorder":"0","name":"统计报表","parentid":"1640","url":""},{"a":"produce","c":"z_braindisc","child":[{"a":"produce_dish","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1644","listorder":"1","name":"出品排菜","parentid":"1643","url":""},{"a":"produce_panel","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1645","listorder":"2","name":"出品面板","parentid":"1643","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1643","listorder":"1","name":"出品管理","parentid":"1640"},{"a":"init2","c":"z_braindisc","child":[{"a":"manage_card","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1642","listorder":"1","name":"卡片管理","parentid":"1641"},{"a":"lists","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1646","listorder":"2","name":"流水日志","parentid":"1641"},{"a":"sixteen","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1672","listorder":"3","name":"微信记录","parentid":"1641","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fstock%2Fwxfs.cpt"},{"a":"manage","c":"Z_b_produce_log","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1704","listorder":"6","name":"出品日志","parentid":"1641","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1641","listorder":"2","name":"卡片管理","parentid":"1640"},{"a":"seventeen","c":"z_braindisc","child":[{"a":"manage_card_id","c":"Z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1701","listorder":"0","name":"身份对照表","parentid":"1647","url":""},{"a":"manage_card_type","c":"Z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1648","listorder":"1","name":"卡类型维护","parentid":"1647"},{"a":"manage_window","c":"Z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1650","listorder":"3","name":"窗口管理","parentid":"1647"},{"a":"manage_terminal","c":"Z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1651","listorder":"4","name":"终端管理","parentid":"1647"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1647","listorder":"3","name":"基础信息","parentid":"1640","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_zpxt_h.png","data_on":"./skin/images/nav_icon/icon_zpxt_n.png","display":"1","id":"1640","listorder":"66","name":"智盘系统","parentid":"0","url":""},{"a":"init","c":"App","child":[{"a":"init","c":"Z_activitie","child":[{"a":"manage","c":"Z_activitie","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1674","listorder":"0","name":"活动管理","parentid":"1673","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1673","listorder":"0","name":"活动管理","parentid":"1616","url":""},{"a":"p_app","c":"app","child":[{"a":"app_menu_list","c":"app","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1618","listorder":"0","name":"微信排菜单","parentid":"1617"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1617","listorder":"0","name":"排菜管理","parentid":"1616"},{"a":"p_info","c":"app","child":[{"a":"student_list","c":"app","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1627","listorder":"0","name":"学生名单","parentid":"1628"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1628","listorder":"0","name":"信息管理","parentid":"1616"},{"a":"p_app","c":"AppView","child":[{"a":"app_view_list","c":"AppView","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1632","listorder":"0","name":"排菜管理","parentid":"1631"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1631","listorder":"0","name":"看看菜单","parentid":"1616"}],"data":"","data_leave":"./skin/images/nav_icon/icon_app_h.png","data_on":"./skin/images/nav_icon/icon_app_n.png","display":"1","id":"1616","listorder":"77","name":"APP","parentid":"0"},{"a":"init","c":"Task","child":[{"a":"p_task","c":"Task","child":[{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1706","listorder":"0","name":"加工明细表","parentid":"1606","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fjgmxb.cpt"},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1705","listorder":"0","name":"加工汇总表","parentid":"1606","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fjgwcqkb.cpt"},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1707","listorder":"0","name":"出库明细表","parentid":"1606","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fbmckmxb.cpt"},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1708","listorder":"0","name":"出库汇总表","parentid":"1606","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fbmckhzb.cpt"},{"a":"task_list","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1609","listorder":"1","name":"任务单列表","parentid":"1606"},{"a":"stock_assign","c":"Task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1615","listorder":"2","name":"净料分配表","parentid":"1606"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1606","listorder":"0","name":"任务单管理","parentid":"1605"},{"a":"task_show","c":"task","child":[{"a":"screen","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1620","listorder":"0","name":"显示屏页面","parentid":"1619"},{"a":"screen_config","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1669","listorder":"1","name":"显示屏设置","parentid":"1619","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1619","listorder":"1","name":"显示屏","parentid":"1605","url":""},{"a":"p_config","c":"Task","child":[{"a":"task_sys_info","c":"Task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1613","listorder":"0","name":"系统信息","parentid":"1610"},{"a":"task_time_config","c":"Task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1614","listorder":"3","name":"加工时间设置","parentid":"1610"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1610","listorder":"2","name":"基本设置","parentid":"1605"},{"a":"","c":"task","child":[{"a":"machine_config","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1630","listorder":"0","name":"操作台设置","parentid":"1629"},{"a":"task_log","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1633","listorder":"1","name":"加工日志","parentid":"1629"},{"a":"out_storage","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1702","listorder":"2","name":"出库日志","parentid":"1629","url":""},{"a":"rfid_config","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1634","listorder":"3","name":"RFID设置","parentid":"1629"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1629","listorder":"3","name":"加工操作管理","parentid":"1605"}],"data":"","data_leave":"/skin/images/nav_icon/icon_rwd_h.png","data_on":"/skin/images/nav_icon/icon_rwd_n.png","display":"1","id":"1605","listorder":"88","name":"任务单系统","parentid":"0"}],"mobile_interface":{"1720":"store_in_list","1807":"buy_order_list","1856":"buy_order_list","1857":"store_in_list"},"mobile_phone":"15669915802","my_dep_list":[0,"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","54","55","56","57","58","59","60","61","62","63","64","65","66","67","71","72","73","74","75","76","77","78","79","80","81","83","85","86","87","88","89","90","91","92","93","95","96","97","98","99","100","101","102","103","105","106","107","108","109","110","111","112","114","116","117","118","119","120","121","122","123","124","125","126","127","128","129","130","131","132","133","134","135","136","137","138","139","140","147","148","149","150","151","152","153","154","155","156","157","158","159","160","161","162","163","164","1","1","1"],"roleid":"1,154,155,157,158,159,160,161,162","rolename":"超级管理员,厨师长1.0,采购部1.0,保管员1.0,食堂主任1.0,财务部1.0,总仓1.0,单位管理员1.0,单位联配管理员1.0","userid":"1"}}
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
         * priv : {"Buy":{"buy_order_list":{"priv_add":1,"priv_adjust_price":1,"priv_audit":1,"priv_confirm":1,"priv_copy":1,"priv_create_order":1,"priv_create_store_in":1,"priv_delete":1,"priv_edit":1,"priv_enroll":1,"priv_send":1,"priv_set_in_use":1,"priv_view":1}},"Store":{"store_in_list":{"priv_add":1,"priv_adjust_price":1,"priv_audit":1,"priv_confirm":1,"priv_copy":1,"priv_create_order":1,"priv_create_store_in":1,"priv_delete":1,"priv_edit":1,"priv_enroll":1,"priv_send":1,"priv_set_in_use":1,"priv_view":1}}}
         * token : smart_e7b2da982c1d27e7f003e3ce00d3ffd9
         * user_info : {"dep_info":{"com_id":"1","com_name":"浙大饮食中心","dep_id":"1","dep_name":"第一餐饮中心（紫金港）"},"loginname":"admin","menu":[{"a":"public_main","c":"Index","child":[{"a":"self_info","c":"admin_manage","child":[{"a":"public_edit_info","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"972","listorder":"0","name":"editinfo","parentid":"970"},{"a":"submit_bug","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1903","listorder":"0","name":"意见反馈","parentid":"970","url":""},{"a":"public_edit_tel","c":"Admin_manage","data":"","data_leave":"","data_on":"","display":"1","id":"1980","listorder":"0","name":"安全中心","parentid":"970","url":""},{"a":"public_edit_pwd","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"971","listorder":"1","name":"editpwd","parentid":"970"}],"cname":"admininfo","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"970","listorder":"0","name":"admininfo","parentid":"10"}],"cname":"我的面板","data":"","data_leave":"./skin/images/nav_icon/icon_mb_h.png","data_on":"./skin/images/nav_icon/icon_mb_n.png","display":"1","id":"10","listorder":"0","name":"panel","parentid":"0","url":""},{"a":"init","c":"Dish","child":[{"a":"p_stock","c":"dish","child":[{"a":"stock_list_jl","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1960","listorder":"0","name":"商品净料表","parentid":"1588","url":""},{"a":"stock_list_ml","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1961","listorder":"0","name":"商品毛料表","parentid":"1588","url":""},{"a":"stock_list_cp","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1962","listorder":"0","name":"商品菜品表","parentid":"1588","url":""},{"a":"import_nutri_excel","c":"Nutri","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1975","listorder":"0","name":"excel导入食材","parentid":"1588","url":""},{"a":"stock_material_list","c":"Nutri","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1976","listorder":"0","name":"食材营养素","parentid":"1588","url":""},{"a":"stock_list","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1589","listorder":"1","name":"存货列表","parentid":"1588"},{"a":"composition","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1591","listorder":"2","name":"存货组合","parentid":"1588"},{"a":"type_list&test=1","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1590","listorder":"3","name":"分类管理","parentid":"1588","url":""},{"a":"zhufuliao_fun","c":"zhufuliao","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1671","listorder":"4","name":"主辅料查询","parentid":"1588","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fstock%2Fcpzfl.cpt"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1588","listorder":"0","name":"存货管理","parentid":"1564"},{"a":"p_business","c":"dish","child":[{"a":"add_income_and_out","c":"finance","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1895","listorder":"1","name":"添加收入和支出","parentid":"1851","url":""},{"a":"dep_bep","c":"finance","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1893","listorder":"2","name":" 部门盈亏日报表","parentid":"1851","url":""},{"a":"finance_income","c":"finance","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1881","listorder":"3","name":"营业收入","parentid":"1851","url":""},{"a":"cost","c":"finance","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1852","listorder":"4","name":"费用支出","parentid":"1851","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1851","listorder":"0","name":"日常业务","parentid":"1564","url":""},{"a":"p_order","c":"dish","child":[{"a":"dish_10","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1918","listorder":"0","name":"部门采购汇总表","parentid":"1594","url":"/admin.php?c=Report&a=common_search&id=57&finance=1"},{"a":"view_order_store_status","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1959","listorder":"0","name":"订单追踪","parentid":"1594","url":""},{"a":"menu_plan","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1592","listorder":"1","name":"菜单计划","parentid":"1594"},{"a":"request_list","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1593","listorder":"2","name":"请购单管理","parentid":"1594"},{"a":"order_list","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1599","listorder":"3","name":"采购汇总单管理","parentid":"1594","url":""},{"a":"menu_plan_alter_list","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1964","listorder":"4","name":"菜单变更","parentid":"1594","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1594","listorder":"2","name":"订单管理","parentid":"1564"},{"a":"p_info","c":"dish","child":[{"a":"purity_standard","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1597","listorder":"0","name":"净料规格表","parentid":"1595"},{"a":"dish_stock","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1598","listorder":"0","name":"菜品主辅料","parentid":"1595"},{"a":"dish_one_hundred_six","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1899","listorder":"0","name":"商品导出","parentid":"1595","url":"/admin.php?c=Report&a=common_search&id=47"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1595","listorder":"3","name":"信息查询","parentid":"1564"},{"a":"p_setting","c":"dish","child":[{"a":"unit_list","c":"Dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1566","listorder":"0","name":"计量单位","parentid":"1565"},{"a":"dep_stock_all","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1870","listorder":"0","name":"部门商品属性设置","parentid":"1565","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1565","listorder":"4","name":"基本设置","parentid":"1564"}],"data":"","data_leave":"./skin/images/nav_icon/icon_date_h.png","data_on":"./skin/images/nav_icon/icon_date_n.png","display":"1","id":"1564","listorder":"1","name":"数据中心","parentid":"0"},{"a":"init","c":"Statistics","child":[{"a":"p_stat","c":"Statistics","child":[{"a":"supply_menu","c":"Statistics","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1604","listorder":"0","name":"供应菜单","parentid":"1602"},{"a":"dish_rank","c":"Statistics","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1603","listorder":"1","name":"菜品排行","parentid":"1602"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1602","listorder":"0","name":"菜品统计","parentid":"1601"},{"a":"","c":"dish","child":[{"a":"dish_sixteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1901","listorder":"0","name":"营业收入统计表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=19&finance=1"},{"a":"dish_fourteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1902","listorder":"0","name":"费用支出汇总表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=17&finance=1"},{"a":"dish_one_hundred_nighe","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1907","listorder":"0","name":"存货分类账","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=18&finance=1"},{"a":"dish_50","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1965","listorder":"0","name":"销货清单","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=59&finance=1"},{"a":"dish_59","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1969","listorder":"0","name":"供应商商品报表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=70&finance=2"},{"a":"dish_71","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1970","listorder":"0","name":"分公司采购汇总量","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=71&finance=2"},{"a":"dish_72","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1971","listorder":"0","name":"各部门采购汇总量","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=72&finance=2"},{"a":"dish_73","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1972","listorder":"0","name":"公司部门采购汇总","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=73&finance=2"},{"a":"echarts","c":"Index","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1974","listorder":"0","name":"报表分析","parentid":"1863","url":""},{"a":"dish_twenty_one","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1890","listorder":"1","name":"部门应付账","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=27&finance=1"},{"a":"dish_twenty","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1889","listorder":"2","name":"部门应收账","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=28&finance=1"},{"a":"dish_seven","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1877","listorder":"3","name":" 应付账明细表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=10&finance=1&datatable=1"},{"a":"dish_eight","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1876","listorder":"4","name":"应收帐明细表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=11&finance=1&datatable=1"},{"a":"dish_one","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1875","listorder":"5","name":"进货入库统计表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=2&finance=1"},{"a":"dish_seven","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1886","listorder":"6","name":"进货价格历史表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=24&finance=1"},{"a":"dish_nineteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1888","listorder":"7","name":"入库统计表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=26&finance=1"},{"a":"dish_sixteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1887","listorder":"8","name":"出库统计表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=25&finance=1"},{"a":"dish_three","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/tongjibiao@3x.png","data_on":"","display":"1","id":"1864","listorder":"9","name":"部门入库统计表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=6&finance=1"},{"a":"dish_thirteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1878","listorder":"10","name":"部门出库统计表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=16&finance=1&datetable=1"},{"a":"dish_twenty_two","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1891","listorder":"11","name":"净料价格表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=31&finance=1&datatable=1"},{"a":"dish_two_1","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1880","listorder":"12","name":"商品库存","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=4&finance=1&datatable=1&datatable=1&test=2"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1863","listorder":"0","name":"日常统计","parentid":"1601","url":""},{"a":"dish_one_hundred_ten","c":"dish","child":[{"a":"dish_one_hundred_seven","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1905","listorder":"0","name":"菜品成本参考表","parentid":"1904","url":"/admin.php?c=Report&a=common_search&id=49&finance=1"},{"a":"dish_one_hundred_eight","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1906","listorder":"0","name":"部门菜品成本表","parentid":"1904","url":"/admin.php?c=Report&a=common_search&id=51&finance=1&datatable=1"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1904","listorder":"0","name":"决策分析","parentid":"1601","url":""},{"a":"dish_60","c":"dish","child":[{"a":"dish_4","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1915","listorder":"0","name":"部门毛料需求汇总","parentid":"1914","url":"/admin.php?c=Report&a=common_search&id=56&finance=1"},{"a":"dish_3","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1916","listorder":"0","name":"部门净料需求汇总","parentid":"1914","url":"/admin.php?c=Report&a=common_search&id=54&finance=1"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1914","listorder":"0","name":"需求分析","parentid":"1601","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_tjfx_h.png","data_on":"./skin/images/nav_icon/icon_tjfx_n.png","display":"1","id":"1601","listorder":"2","name":"统计分析","parentid":"0"},{"a":"init","c":"Buy","child":[{"a":"buy_2","c":"Buy","child":[{"a":"stock_list&abc=1","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1711","listorder":"0","name":"商品信息","parentid":"1808","url":""},{"a":"type_list","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1712","listorder":"0","name":"商品分类","parentid":"1808","url":""},{"a":"supply_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1719","listorder":"0","name":"供应商信息","parentid":"1808","url":""},{"a":"unit_list","c":"Dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1898","listorder":"0","name":"计量单位","parentid":"1808","url":""},{"a":"price_region_list","c":"Admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1963","listorder":"0","name":"价格执行区域","parentid":"1808","url":""},{"a":"execute_region_list","c":"Admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1724","listorder":"1","name":"执行配送区域","parentid":"1808","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1808","listorder":"0","name":"基本信息","parentid":"1803","url":""},{"a":"","c":"Buy","child":[{"a":"balance_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1721","listorder":"1","name":"采购结算","parentid":"1709","url":""},{"a":"adjust_price_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1725","listorder":"4","name":"调价管理","parentid":"1709","url":""},{"a":"contract_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1805","listorder":"5","name":"采购合同","parentid":"1709","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1839","listorder":"6","name":"采购汇总单管理","parentid":"1709","url":"/?c=Dish&a=order_list&menu_id=1599"},{"a":"buy_order_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1807","listorder":"7","name":"采购订单","parentid":"1709","url":""},{"a":"buy_order_alter","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1841","listorder":"8","name":"采购变更单","parentid":"1709","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1709","listorder":"5","name":"日常业务","parentid":"1803","url":""},{"a":"buy_1","c":"Buy","child":[{"a":"check_menu_stock","c":"Buystatis","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1739","listorder":"0","name":"菜品毛料检查","parentid":"1710","url":""},{"a":"dish_one_hundred","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1897","listorder":"0","name":"商品价格查询统计表","parentid":"1710","url":"/admin.php?c=Report&a=common_search&id=40&finance=2"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1710","listorder":"6","name":"查询统计","parentid":"1803","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_cggl_h.png","data_on":"./skin/images/nav_icon/icon_cggl_n.png","display":"1","id":"1803","listorder":"3","name":"采购管理","parentid":"0","url":""},{"a":"init","c":"Store","child":[{"a":"","c":"Store","child":[{"a":"market_store_in_list","c":"store","data":"99","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1741","listorder":"0","name":"市场应急入库","parentid":"1731","url":""},{"a":"store_in_list","c":"store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1720","listorder":"1","name":"采购入库","parentid":"1731","url":""},{"a":"store_out_list","c":"Store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1728","listorder":"2","name":"出库管理","parentid":"1731","url":""},{"a":"store_back_list","c":"Store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1894","listorder":"4","name":"退货单","parentid":"1731","url":""},{"a":"store_adjust_list","c":"Store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1879","listorder":"5","name":"盘点单","parentid":"1731","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1731","listorder":"0","name":"日常业务","parentid":"1730","url":""},{"a":"","c":"Store","child":[{"a":"dish_two_2","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1885","listorder":"0","name":" 商品库存","parentid":"1732","url":"/admin.php?c=Report&a=common_search&id=4&finance=1&test=4"},{"a":"dish_one_hundred_five","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1900","listorder":"0","name":"库存比对表","parentid":"1732","url":"/admin.php?c=Report&a=common_search&id=41&finance=1"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1732","listorder":"0","name":"查询报表","parentid":"1730","url":""},{"a":"delegate_buy","c":"Store","child":[{"a":"delegate_buy","c":"Store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1738","listorder":"0","name":"委托采购","parentid":"1737","url":""},{"a":"account_period_list","c":"Store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1742","listorder":"0","name":"会计年度设置","parentid":"1737","url":""},{"a":"carryover","c":"store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1967","listorder":"0","name":"月底结转","parentid":"1737","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1737","listorder":"0","name":"基本配置","parentid":"1730","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_kcgl_h.png","data_on":"./skin/images/nav_icon/icon_kcgl_n.png","display":"1","id":"1730","listorder":"4","name":"库存管理","parentid":"0","url":""},{"a":"init","c":"Supply","child":[{"a":"supply_cer_list_","c":"Supply","child":[{"a":"supply_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1736","listorder":"0","name":"供应商信息","parentid":"1735","url":""},{"a":"supply_cer_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1842","listorder":"0","name":"供应商证件管理","parentid":"1735","url":""},{"a":"supply_cer_alter_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1843","listorder":"0","name":"供应商证件审核","parentid":"1735","url":""},{"a":"Scoring_criteria","c":"supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1848","listorder":"0","name":"考核大类管理","parentid":"1735","url":""},{"a":"rated_item","c":"supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1844","listorder":"0","name":"评分项目管理","parentid":"1735","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1735","listorder":"0","name":"基础信息","parentid":"1733","url":""},{"a":"Supply___","c":"Supply","child":[{"a":"buy_order_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1856","listorder":"0","name":"订单管理","parentid":"1855","url":""},{"a":"store_in_list","c":"store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1857","listorder":"0","name":"配送管理","parentid":"1855","url":""},{"a":"buy_order_alter","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1858","listorder":"0","name":"采购变更单","parentid":"1855","url":""},{"a":"balance_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1912","listorder":"0","name":"采购结算","parentid":"1855","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1855","listorder":"0","name":"日常业务","parentid":"1733","url":""},{"a":"dish_one_hundred_11","c":"dish","child":[{"a":"dish_one_hundred_12","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1909","listorder":"0","name":"送货单统计表","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=22&finance=1"},{"a":"dish_one_hundred_13","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1910","listorder":"0","name":"入库单统计表","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=23&finance=1"},{"a":"dish_one_hundred_14","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1911","listorder":"0","name":"应收账统计表","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=52&finance=1"},{"a":"dish_7","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1917","listorder":"0","name":"送货单明细表","parentid":"1908","url":"admin.php?c=Report&a=common_search&id=53&finance=1"},{"a":"dish_51","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1966","listorder":"0","name":"销货清单","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=60&finance=1"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1908","listorder":"0","name":"查询统计","parentid":"1733","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_psgl_h.png","data_on":"./skin/images/nav_icon/icon_psgl_n.png","display":"1","id":"1733","listorder":"5","name":"配送管理","parentid":"0","url":""},{"a":"init","c":"finance","child":[{"a":"","c":"dish","child":[{"a":"dep_bep","c":"finance","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1892","listorder":"0","name":"部门盈亏日报表","parentid":"1860","url":""},{"a":"dish_110","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1968","listorder":"0","name":"按供应商统计表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=66&finance=1"},{"a":"dish_two_3","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1861","listorder":"1","name":"商品库存","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=4&finance=1&test=1"},{"a":"dish_one","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1862","listorder":"2","name":"进货渠道入库表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=2&finance=2"},{"a":"dish_nine","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1869","listorder":"3","name":"实物消耗表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=30&finance=1"},{"a":"dish_five","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1866","listorder":"4","name":"未付已付合并查询","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=9&finance=1"},{"a":"dish_four","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1865","listorder":"5","name":"部门应收账报表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=28&finance=1"},{"a":"dish_ten","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1871","listorder":"6","name":"部门应付账报表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=13&finance=1"},{"a":"dish_eight","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1868","listorder":"7","name":"应收帐明细表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=29&finance=1"},{"a":"dish_seven","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1867","listorder":"8","name":"应付账明细表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=10&finance=1"},{"a":"dish_fourteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1872","listorder":"9","name":"费用支出汇总表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=17&finance=1"},{"a":"dish_sixteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1883","listorder":"10","name":"营业收入统计表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=19&finance=1"},{"a":"dish_fiveteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1882","listorder":"11","name":"存货分类账","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=18&finance=1"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1860","listorder":"0","name":"财务报表","parentid":"1859","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_cwgl_h.png","data_on":"./skin/images/nav_icon/icon_cwgl_n.png","display":"1","id":"1859","listorder":"6","name":"财务管理","parentid":"0","url":""},{"a":"init_init","c":"Role","child":[{"a":"update2","c":"Z_setting2","child":[{"a":"manage","c":"Z_seat","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1700","listorder":"0","name":"推荐位管理","parentid":"1694","url":""},{"a":"update","c":"Z_setting2","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1695","listorder":"0","name":"站点管理","parentid":"1694","url":""},{"a":"manage","c":"Z_database","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1696","listorder":"0","name":"数据备份","parentid":"1694","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1694","listorder":"1","name":"站点管理","parentid":"1","url":""},{"a":"ad_manage","c":"Admin_manage","child":[{"a":"admin_company","c":"Admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1896","listorder":"0","name":"单位管理","parentid":"49","url":""},{"a":"tag_list","c":"Admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1977","listorder":"0","name":"菜品标签维护","parentid":"49","url":""},{"a":"com_cat_attr_list","c":"Admin_manage","data":"","data_leave":"","data_on":"","display":"1","id":"1979","listorder":"0","name":"公司类别属性","parentid":"49","url":""},{"a":"init","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"54","listorder":"1","name":"用户管理","parentid":"49"},{"a":"init","c":"role","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"50","listorder":"2","name":"role_manage","parentid":"49"},{"a":"dep_list","c":"Admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1626","listorder":"3","name":"部门管理","parentid":"49"},{"a":"init","c":"menu","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"31","listorder":"4","name":"menu_manage","parentid":"49"},{"a":"update","c":"Z_setting","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1670","listorder":"22","name":"微信管理","parentid":"49","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"49","listorder":"2","name":"admin_setting","parentid":"1"},{"a":"init","c":"Z_ad","child":[{"a":"seat_manage","c":"Z_ad","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1699","listorder":"0","name":"广告位管理","parentid":"1697","url":""},{"a":"manage","c":"Z_ad","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1698","listorder":"0","name":"广告管理","parentid":"1697","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1697","listorder":"3","name":"广告管理","parentid":"1","url":""},{"a":"","c":"","child":[{"a":"init","c":"log","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"997","listorder":"3","name":"log","parentid":"1621"},{"a":"lock_list","c":"OrderLock","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1600","listorder":"5","name":"订单锁管理","parentid":"1621"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1621","listorder":"11","name":"系统监视","parentid":"1"},{"a":"","c":"","child":[{"a":"area_list","c":"area","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1623","listorder":"0","name":"区域列表","parentid":"1622"},{"a":"canteen_list","c":"area","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1625","listorder":"2","name":"食堂列表","parentid":"1622"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1622","listorder":"22","name":"区域管理","parentid":"1"}],"data":"","data_leave":"./skin/images/nav_icon/icon_xtsz_h.png","data_on":"./skin/images/nav_icon/icon_xtsz_n.png","display":"1","id":"1","listorder":"7","name":"系统设置","parentid":"0","url":""},{"a":"guide_page","c":"Bidweb","child":[{"a":"","c":"Bidweb","child":[{"a":"bid_plan_list","c":"Bidweb","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1921","listorder":"0","name":"招标计划","parentid":"1920","url":""},{"a":"bid_region_dep_list","c":"Bidweb","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1922","listorder":"0","name":"部门需求","parentid":"1920","url":""},{"a":"bid_region_list","c":"Bidweb","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1923","listorder":"0","name":"配送区域需求","parentid":"1920","url":""},{"a":"bid_plan_confirmed_list","c":"Bidweb","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1924","listorder":"0","name":"招标项目维护","parentid":"1920","url":""},{"a":"bid_result_list","c":"Bidweb","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1925","listorder":"0","name":"中标供应商管理","parentid":"1920","url":""},{"a":"adjust_price_list&is_bid=1","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1926","listorder":"0","name":"调价管理","parentid":"1920","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1920","listorder":"0","name":"日常业务","parentid":"1919","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_zbgl_h.png","data_on":"./skin/images/nav_icon/icon_zbgl_n.png","display":"1","id":"1919","listorder":"8","name":"招标管理","parentid":"0","url":""},{"a":"init","c":"employee","child":[{"a":"","c":"","child":[{"a":"list_query_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1934","listorder":"0","name":"列表查询","parentid":"1928","url":""},{"a":"employee_turnover_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1936","listorder":"0","name":"查看离职员工","parentid":"1928","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1928","listorder":"0","name":"人员查看","parentid":"1927","url":""},{"a":"","c":"","child":[{"a":"new_add_employer_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1937","listorder":"0","name":"新增员工","parentid":"1929","url":""},{"a":"dismiss_employees_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1938","listorder":"0","name":"辞退员工","parentid":"1929","url":""},{"a":"employee_files_html","c":"employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1939","listorder":"0","name":"员工档案","parentid":"1929","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1929","listorder":"0","name":"人员管理","parentid":"1927","url":""},{"a":"","c":"","child":[{"a":"attendance_record_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1941","listorder":"0","name":"考勤记录","parentid":"1930","url":""},{"a":"schedu","c":"employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1942","listorder":"0","name":"排班","parentid":"1930","url":""},{"a":"shift_set_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1943","listorder":"0","name":"班次设置","parentid":"1930","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1944","listorder":"0","name":"查看考勤统计","parentid":"1930","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1930","listorder":"0","name":"考勤管理","parentid":"1927","url":""},{"a":"","c":"","child":[{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1945","listorder":"0","name":"培训记录","parentid":"1931","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1946","listorder":"0","name":"查看培训记录","parentid":"1931","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1947","listorder":"0","name":"奖惩记录","parentid":"1931","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1948","listorder":"0","name":"查看奖惩记录","parentid":"1931","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1949","listorder":"0","name":"其他记录","parentid":"1931","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1950","listorder":"0","name":"查看其他记录","parentid":"1931","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1931","listorder":"0","name":"信息管理","parentid":"1927","url":""},{"a":"","c":"","child":[{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1951","listorder":"0","name":"工资标准","parentid":"1932","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1952","listorder":"0","name":"工资计算","parentid":"1932","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1953","listorder":"0","name":"工资统计","parentid":"1932","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1954","listorder":"0","name":"工资发放","parentid":"1932","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1932","listorder":"0","name":"工资管理","parentid":"1927","url":""},{"a":"","c":"","child":[{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1955","listorder":"0","name":"生日提醒","parentid":"1933","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1956","listorder":"0","name":"合同到期提醒","parentid":"1933","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1957","listorder":"0","name":"公司基本信息","parentid":"1933","url":""},{"a":"dep_infos_manage_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1958","listorder":"0","name":"部门职务管理","parentid":"1933","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1933","listorder":"0","name":"部门管理","parentid":"1927","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_rlzy_h.png","data_on":"./skin/images/nav_icon/icon_rlzy_n.png","display":"1","id":"1927","listorder":"9","name":"人力资源","parentid":"0","url":""},{"a":"init","c":"Z_card","child":[{"a":"inits","c":"Z_card","child":[{"a":"examine","c":"Z_card","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1850","listorder":"0","name":"食堂审核","parentid":"1636","url":""},{"a":"manage","c":"Z_card_criterion","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1853","listorder":"0","name":"用餐标准","parentid":"1636","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1854","listorder":"0","name":"餐费统计日报","parentid":"1636","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fpxbbk.cpt"},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1913","listorder":"0","name":"餐次消费统计表","parentid":"1636","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fccxfactj.cpt"},{"a":"manage","c":"Z_card","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1637","listorder":"1","name":"数据录入","parentid":"1636","url":""},{"a":"report","c":"Z_card","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1638","listorder":"2","name":"每日预约人数汇总","parentid":"1636","url":""},{"a":"reportInfo","c":"Z_card","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1639","listorder":"3","name":"每日预约人数明细","parentid":"1636","url":""},{"a":"doUserReport","c":"Z_card","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1668","listorder":"4","name":"操作员办卡统计","parentid":"1636","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1636","listorder":"0","name":"集体办卡","parentid":"1635"}],"data":"","data_leave":"./skin/images/nav_icon/icon_jtbk_h.png","data_on":"./skin/images/nav_icon/icon_jtbk_n.png","display":"1","id":"1635","listorder":"55","name":"集体办卡","parentid":"0"},{"a":"produce_dish","c":"z_braindisc","child":[{"a":"one","c":"z_braindisc","child":[{"a":"six","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1663","listorder":"0","name":"菜品排行","parentid":"1652","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fcpph.cpt"},{"a":"two","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1667","listorder":"0","name":"餐次报表","parentid":"1652","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fcctj.cpt"},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1884","listorder":"0","name":"销售进度","parentid":"1652","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fxsjd.cpt"},{"a":"seven","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1654","listorder":"1","name":"人员交易流水查询","parentid":"1652","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2FF108.cpt"},{"a":"nine","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1657","listorder":"3","name":"营业报表查询","parentid":"1652","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2FR301.cpt"},{"a":"fourteen","c":"thirteen","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1661","listorder":"8","name":"人员消费分餐查询","parentid":"1652","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2FR304.cpt"},{"a":"init","c":"Z_braindisc_update","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1675","listorder":"55","name":"数据更新","parentid":"1652","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1652","listorder":"0","name":"统计报表","parentid":"1640","url":""},{"a":"produce","c":"z_braindisc","child":[{"a":"produce_dish","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1644","listorder":"1","name":"出品排菜","parentid":"1643","url":""},{"a":"produce_panel","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1645","listorder":"2","name":"出品面板","parentid":"1643","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1643","listorder":"1","name":"出品管理","parentid":"1640"},{"a":"init2","c":"z_braindisc","child":[{"a":"manage_card","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1642","listorder":"1","name":"卡片管理","parentid":"1641"},{"a":"lists","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1646","listorder":"2","name":"流水日志","parentid":"1641"},{"a":"sixteen","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1672","listorder":"3","name":"微信记录","parentid":"1641","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fstock%2Fwxfs.cpt"},{"a":"manage","c":"Z_b_produce_log","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1704","listorder":"6","name":"出品日志","parentid":"1641","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1641","listorder":"2","name":"卡片管理","parentid":"1640"},{"a":"seventeen","c":"z_braindisc","child":[{"a":"manage_card_id","c":"Z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1701","listorder":"0","name":"身份对照表","parentid":"1647","url":""},{"a":"manage_card_type","c":"Z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1648","listorder":"1","name":"卡类型维护","parentid":"1647"},{"a":"manage_window","c":"Z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1650","listorder":"3","name":"窗口管理","parentid":"1647"},{"a":"manage_terminal","c":"Z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1651","listorder":"4","name":"终端管理","parentid":"1647"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1647","listorder":"3","name":"基础信息","parentid":"1640","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_zpxt_h.png","data_on":"./skin/images/nav_icon/icon_zpxt_n.png","display":"1","id":"1640","listorder":"66","name":"智盘系统","parentid":"0","url":""},{"a":"init","c":"App","child":[{"a":"init","c":"Z_activitie","child":[{"a":"manage","c":"Z_activitie","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1674","listorder":"0","name":"活动管理","parentid":"1673","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1673","listorder":"0","name":"活动管理","parentid":"1616","url":""},{"a":"p_app","c":"app","child":[{"a":"app_menu_list","c":"app","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1618","listorder":"0","name":"微信排菜单","parentid":"1617"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1617","listorder":"0","name":"排菜管理","parentid":"1616"},{"a":"p_info","c":"app","child":[{"a":"student_list","c":"app","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1627","listorder":"0","name":"学生名单","parentid":"1628"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1628","listorder":"0","name":"信息管理","parentid":"1616"},{"a":"p_app","c":"AppView","child":[{"a":"app_view_list","c":"AppView","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1632","listorder":"0","name":"排菜管理","parentid":"1631"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1631","listorder":"0","name":"看看菜单","parentid":"1616"}],"data":"","data_leave":"./skin/images/nav_icon/icon_app_h.png","data_on":"./skin/images/nav_icon/icon_app_n.png","display":"1","id":"1616","listorder":"77","name":"APP","parentid":"0"},{"a":"init","c":"Task","child":[{"a":"p_task","c":"Task","child":[{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1706","listorder":"0","name":"加工明细表","parentid":"1606","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fjgmxb.cpt"},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1705","listorder":"0","name":"加工汇总表","parentid":"1606","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fjgwcqkb.cpt"},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1707","listorder":"0","name":"出库明细表","parentid":"1606","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fbmckmxb.cpt"},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1708","listorder":"0","name":"出库汇总表","parentid":"1606","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fbmckhzb.cpt"},{"a":"task_list","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1609","listorder":"1","name":"任务单列表","parentid":"1606"},{"a":"stock_assign","c":"Task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1615","listorder":"2","name":"净料分配表","parentid":"1606"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1606","listorder":"0","name":"任务单管理","parentid":"1605"},{"a":"task_show","c":"task","child":[{"a":"screen","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1620","listorder":"0","name":"显示屏页面","parentid":"1619"},{"a":"screen_config","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1669","listorder":"1","name":"显示屏设置","parentid":"1619","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1619","listorder":"1","name":"显示屏","parentid":"1605","url":""},{"a":"p_config","c":"Task","child":[{"a":"task_sys_info","c":"Task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1613","listorder":"0","name":"系统信息","parentid":"1610"},{"a":"task_time_config","c":"Task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1614","listorder":"3","name":"加工时间设置","parentid":"1610"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1610","listorder":"2","name":"基本设置","parentid":"1605"},{"a":"","c":"task","child":[{"a":"machine_config","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1630","listorder":"0","name":"操作台设置","parentid":"1629"},{"a":"task_log","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1633","listorder":"1","name":"加工日志","parentid":"1629"},{"a":"out_storage","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1702","listorder":"2","name":"出库日志","parentid":"1629","url":""},{"a":"rfid_config","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1634","listorder":"3","name":"RFID设置","parentid":"1629"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1629","listorder":"3","name":"加工操作管理","parentid":"1605"}],"data":"","data_leave":"/skin/images/nav_icon/icon_rwd_h.png","data_on":"/skin/images/nav_icon/icon_rwd_n.png","display":"1","id":"1605","listorder":"88","name":"任务单系统","parentid":"0"}],"mobile_interface":{"1720":"store_in_list","1807":"buy_order_list","1856":"buy_order_list","1857":"store_in_list"},"mobile_phone":"15669915802","my_dep_list":[0,"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","54","55","56","57","58","59","60","61","62","63","64","65","66","67","71","72","73","74","75","76","77","78","79","80","81","83","85","86","87","88","89","90","91","92","93","95","96","97","98","99","100","101","102","103","105","106","107","108","109","110","111","112","114","116","117","118","119","120","121","122","123","124","125","126","127","128","129","130","131","132","133","134","135","136","137","138","139","140","147","148","149","150","151","152","153","154","155","156","157","158","159","160","161","162","163","164","1","1","1"],"roleid":"1,154,155,157,158,159,160,161,162","rolename":"超级管理员,厨师长1.0,采购部1.0,保管员1.0,食堂主任1.0,财务部1.0,总仓1.0,单位管理员1.0,单位联配管理员1.0","userid":"1"}
         */

        private PrivBean priv;
        private String token;
        private UserInfoBean user_info;

        public PrivBean getPriv() {
            return priv;
        }

        public void setPriv(PrivBean priv) {
            this.priv = priv;
        }

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

        public static class PrivBean {
            /**
             * Buy : {"buy_order_list":{"priv_add":1,"priv_adjust_price":1,"priv_audit":1,"priv_confirm":1,"priv_copy":1,"priv_create_order":1,"priv_create_store_in":1,"priv_delete":1,"priv_edit":1,"priv_enroll":1,"priv_send":1,"priv_set_in_use":1,"priv_view":1}}
             * Store : {"store_in_list":{"priv_add":1,"priv_adjust_price":1,"priv_audit":1,"priv_confirm":1,"priv_copy":1,"priv_create_order":1,"priv_create_store_in":1,"priv_delete":1,"priv_edit":1,"priv_enroll":1,"priv_send":1,"priv_set_in_use":1,"priv_view":1}}
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
                 * buy_order_list : {"priv_add":1,"priv_adjust_price":1,"priv_audit":1,"priv_confirm":1,"priv_copy":1,"priv_create_order":1,"priv_create_store_in":1,"priv_delete":1,"priv_edit":1,"priv_enroll":1,"priv_send":1,"priv_set_in_use":1,"priv_view":1}
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
                     * priv_add : 1
                     * priv_adjust_price : 1
                     * priv_audit : 1
                     * priv_confirm : 1
                     * priv_copy : 1
                     * priv_create_order : 1
                     * priv_create_store_in : 1
                     * priv_delete : 1
                     * priv_edit : 1
                     * priv_enroll : 1
                     * priv_send : 1
                     * priv_set_in_use : 1
                     * priv_view : 1
                     */

                    private int priv_add;
                    private int priv_adjust_price;
                    private int priv_audit;
                    private int priv_confirm;
                    private int priv_copy;
                    private int priv_create_order;
                    private int priv_create_store_in;
                    private int priv_delete;
                    private int priv_edit;
                    private int priv_enroll;
                    private int priv_send;
                    private int priv_set_in_use;
                    private int priv_view;

                    public int getPriv_add() {
                        return priv_add;
                    }

                    public void setPriv_add(int priv_add) {
                        this.priv_add = priv_add;
                    }

                    public int getPriv_adjust_price() {
                        return priv_adjust_price;
                    }

                    public void setPriv_adjust_price(int priv_adjust_price) {
                        this.priv_adjust_price = priv_adjust_price;
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

                    public int getPriv_copy() {
                        return priv_copy;
                    }

                    public void setPriv_copy(int priv_copy) {
                        this.priv_copy = priv_copy;
                    }

                    public int getPriv_create_order() {
                        return priv_create_order;
                    }

                    public void setPriv_create_order(int priv_create_order) {
                        this.priv_create_order = priv_create_order;
                    }

                    public int getPriv_create_store_in() {
                        return priv_create_store_in;
                    }

                    public void setPriv_create_store_in(int priv_create_store_in) {
                        this.priv_create_store_in = priv_create_store_in;
                    }

                    public int getPriv_delete() {
                        return priv_delete;
                    }

                    public void setPriv_delete(int priv_delete) {
                        this.priv_delete = priv_delete;
                    }

                    public int getPriv_edit() {
                        return priv_edit;
                    }

                    public void setPriv_edit(int priv_edit) {
                        this.priv_edit = priv_edit;
                    }

                    public int getPriv_enroll() {
                        return priv_enroll;
                    }

                    public void setPriv_enroll(int priv_enroll) {
                        this.priv_enroll = priv_enroll;
                    }

                    public int getPriv_send() {
                        return priv_send;
                    }

                    public void setPriv_send(int priv_send) {
                        this.priv_send = priv_send;
                    }

                    public int getPriv_set_in_use() {
                        return priv_set_in_use;
                    }

                    public void setPriv_set_in_use(int priv_set_in_use) {
                        this.priv_set_in_use = priv_set_in_use;
                    }

                    public int getPriv_view() {
                        return priv_view;
                    }

                    public void setPriv_view(int priv_view) {
                        this.priv_view = priv_view;
                    }
                }
            }

            public static class StoreBean {
                /**
                 * store_in_list : {"priv_add":1,"priv_adjust_price":1,"priv_audit":1,"priv_confirm":1,"priv_copy":1,"priv_create_order":1,"priv_create_store_in":1,"priv_delete":1,"priv_edit":1,"priv_enroll":1,"priv_send":1,"priv_set_in_use":1,"priv_view":1}
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
                     * priv_add : 1
                     * priv_adjust_price : 1
                     * priv_audit : 1
                     * priv_confirm : 1
                     * priv_copy : 1
                     * priv_create_order : 1
                     * priv_create_store_in : 1
                     * priv_delete : 1
                     * priv_edit : 1
                     * priv_enroll : 1
                     * priv_send : 1
                     * priv_set_in_use : 1
                     * priv_view : 1
                     */

                    private int priv_add;
                    private int priv_adjust_price;
                    private int priv_audit;
                    private int priv_confirm;
                    private int priv_copy;
                    private int priv_create_order;
                    private int priv_create_store_in;
                    private int priv_delete;
                    private int priv_edit;
                    private int priv_enroll;
                    private int priv_send;
                    private int priv_set_in_use;
                    private int priv_view;

                    public int getPriv_add() {
                        return priv_add;
                    }

                    public void setPriv_add(int priv_add) {
                        this.priv_add = priv_add;
                    }

                    public int getPriv_adjust_price() {
                        return priv_adjust_price;
                    }

                    public void setPriv_adjust_price(int priv_adjust_price) {
                        this.priv_adjust_price = priv_adjust_price;
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

                    public int getPriv_copy() {
                        return priv_copy;
                    }

                    public void setPriv_copy(int priv_copy) {
                        this.priv_copy = priv_copy;
                    }

                    public int getPriv_create_order() {
                        return priv_create_order;
                    }

                    public void setPriv_create_order(int priv_create_order) {
                        this.priv_create_order = priv_create_order;
                    }

                    public int getPriv_create_store_in() {
                        return priv_create_store_in;
                    }

                    public void setPriv_create_store_in(int priv_create_store_in) {
                        this.priv_create_store_in = priv_create_store_in;
                    }

                    public int getPriv_delete() {
                        return priv_delete;
                    }

                    public void setPriv_delete(int priv_delete) {
                        this.priv_delete = priv_delete;
                    }

                    public int getPriv_edit() {
                        return priv_edit;
                    }

                    public void setPriv_edit(int priv_edit) {
                        this.priv_edit = priv_edit;
                    }

                    public int getPriv_enroll() {
                        return priv_enroll;
                    }

                    public void setPriv_enroll(int priv_enroll) {
                        this.priv_enroll = priv_enroll;
                    }

                    public int getPriv_send() {
                        return priv_send;
                    }

                    public void setPriv_send(int priv_send) {
                        this.priv_send = priv_send;
                    }

                    public int getPriv_set_in_use() {
                        return priv_set_in_use;
                    }

                    public void setPriv_set_in_use(int priv_set_in_use) {
                        this.priv_set_in_use = priv_set_in_use;
                    }

                    public int getPriv_view() {
                        return priv_view;
                    }

                    public void setPriv_view(int priv_view) {
                        this.priv_view = priv_view;
                    }
                }
            }
        }

        public static class UserInfoBean {
            /**
             * dep_info : {"com_id":"1","com_name":"浙大饮食中心","dep_id":"1","dep_name":"第一餐饮中心（紫金港）"}
             * loginname : admin
             * menu : [{"a":"public_main","c":"Index","child":[{"a":"self_info","c":"admin_manage","child":[{"a":"public_edit_info","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"972","listorder":"0","name":"editinfo","parentid":"970"},{"a":"submit_bug","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1903","listorder":"0","name":"意见反馈","parentid":"970","url":""},{"a":"public_edit_tel","c":"Admin_manage","data":"","data_leave":"","data_on":"","display":"1","id":"1980","listorder":"0","name":"安全中心","parentid":"970","url":""},{"a":"public_edit_pwd","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"971","listorder":"1","name":"editpwd","parentid":"970"}],"cname":"admininfo","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"970","listorder":"0","name":"admininfo","parentid":"10"}],"cname":"我的面板","data":"","data_leave":"./skin/images/nav_icon/icon_mb_h.png","data_on":"./skin/images/nav_icon/icon_mb_n.png","display":"1","id":"10","listorder":"0","name":"panel","parentid":"0","url":""},{"a":"init","c":"Dish","child":[{"a":"p_stock","c":"dish","child":[{"a":"stock_list_jl","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1960","listorder":"0","name":"商品净料表","parentid":"1588","url":""},{"a":"stock_list_ml","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1961","listorder":"0","name":"商品毛料表","parentid":"1588","url":""},{"a":"stock_list_cp","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1962","listorder":"0","name":"商品菜品表","parentid":"1588","url":""},{"a":"import_nutri_excel","c":"Nutri","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1975","listorder":"0","name":"excel导入食材","parentid":"1588","url":""},{"a":"stock_material_list","c":"Nutri","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1976","listorder":"0","name":"食材营养素","parentid":"1588","url":""},{"a":"stock_list","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1589","listorder":"1","name":"存货列表","parentid":"1588"},{"a":"composition","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1591","listorder":"2","name":"存货组合","parentid":"1588"},{"a":"type_list&test=1","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1590","listorder":"3","name":"分类管理","parentid":"1588","url":""},{"a":"zhufuliao_fun","c":"zhufuliao","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1671","listorder":"4","name":"主辅料查询","parentid":"1588","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fstock%2Fcpzfl.cpt"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1588","listorder":"0","name":"存货管理","parentid":"1564"},{"a":"p_business","c":"dish","child":[{"a":"add_income_and_out","c":"finance","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1895","listorder":"1","name":"添加收入和支出","parentid":"1851","url":""},{"a":"dep_bep","c":"finance","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1893","listorder":"2","name":" 部门盈亏日报表","parentid":"1851","url":""},{"a":"finance_income","c":"finance","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1881","listorder":"3","name":"营业收入","parentid":"1851","url":""},{"a":"cost","c":"finance","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1852","listorder":"4","name":"费用支出","parentid":"1851","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1851","listorder":"0","name":"日常业务","parentid":"1564","url":""},{"a":"p_order","c":"dish","child":[{"a":"dish_10","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1918","listorder":"0","name":"部门采购汇总表","parentid":"1594","url":"/admin.php?c=Report&a=common_search&id=57&finance=1"},{"a":"view_order_store_status","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1959","listorder":"0","name":"订单追踪","parentid":"1594","url":""},{"a":"menu_plan","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1592","listorder":"1","name":"菜单计划","parentid":"1594"},{"a":"request_list","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1593","listorder":"2","name":"请购单管理","parentid":"1594"},{"a":"order_list","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1599","listorder":"3","name":"采购汇总单管理","parentid":"1594","url":""},{"a":"menu_plan_alter_list","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1964","listorder":"4","name":"菜单变更","parentid":"1594","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1594","listorder":"2","name":"订单管理","parentid":"1564"},{"a":"p_info","c":"dish","child":[{"a":"purity_standard","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1597","listorder":"0","name":"净料规格表","parentid":"1595"},{"a":"dish_stock","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1598","listorder":"0","name":"菜品主辅料","parentid":"1595"},{"a":"dish_one_hundred_six","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1899","listorder":"0","name":"商品导出","parentid":"1595","url":"/admin.php?c=Report&a=common_search&id=47"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1595","listorder":"3","name":"信息查询","parentid":"1564"},{"a":"p_setting","c":"dish","child":[{"a":"unit_list","c":"Dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1566","listorder":"0","name":"计量单位","parentid":"1565"},{"a":"dep_stock_all","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1870","listorder":"0","name":"部门商品属性设置","parentid":"1565","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1565","listorder":"4","name":"基本设置","parentid":"1564"}],"data":"","data_leave":"./skin/images/nav_icon/icon_date_h.png","data_on":"./skin/images/nav_icon/icon_date_n.png","display":"1","id":"1564","listorder":"1","name":"数据中心","parentid":"0"},{"a":"init","c":"Statistics","child":[{"a":"p_stat","c":"Statistics","child":[{"a":"supply_menu","c":"Statistics","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1604","listorder":"0","name":"供应菜单","parentid":"1602"},{"a":"dish_rank","c":"Statistics","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1603","listorder":"1","name":"菜品排行","parentid":"1602"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1602","listorder":"0","name":"菜品统计","parentid":"1601"},{"a":"","c":"dish","child":[{"a":"dish_sixteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1901","listorder":"0","name":"营业收入统计表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=19&finance=1"},{"a":"dish_fourteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1902","listorder":"0","name":"费用支出汇总表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=17&finance=1"},{"a":"dish_one_hundred_nighe","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1907","listorder":"0","name":"存货分类账","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=18&finance=1"},{"a":"dish_50","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1965","listorder":"0","name":"销货清单","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=59&finance=1"},{"a":"dish_59","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1969","listorder":"0","name":"供应商商品报表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=70&finance=2"},{"a":"dish_71","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1970","listorder":"0","name":"分公司采购汇总量","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=71&finance=2"},{"a":"dish_72","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1971","listorder":"0","name":"各部门采购汇总量","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=72&finance=2"},{"a":"dish_73","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1972","listorder":"0","name":"公司部门采购汇总","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=73&finance=2"},{"a":"echarts","c":"Index","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1974","listorder":"0","name":"报表分析","parentid":"1863","url":""},{"a":"dish_twenty_one","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1890","listorder":"1","name":"部门应付账","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=27&finance=1"},{"a":"dish_twenty","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1889","listorder":"2","name":"部门应收账","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=28&finance=1"},{"a":"dish_seven","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1877","listorder":"3","name":" 应付账明细表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=10&finance=1&datatable=1"},{"a":"dish_eight","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1876","listorder":"4","name":"应收帐明细表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=11&finance=1&datatable=1"},{"a":"dish_one","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1875","listorder":"5","name":"进货入库统计表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=2&finance=1"},{"a":"dish_seven","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1886","listorder":"6","name":"进货价格历史表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=24&finance=1"},{"a":"dish_nineteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1888","listorder":"7","name":"入库统计表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=26&finance=1"},{"a":"dish_sixteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1887","listorder":"8","name":"出库统计表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=25&finance=1"},{"a":"dish_three","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/tongjibiao@3x.png","data_on":"","display":"1","id":"1864","listorder":"9","name":"部门入库统计表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=6&finance=1"},{"a":"dish_thirteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1878","listorder":"10","name":"部门出库统计表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=16&finance=1&datetable=1"},{"a":"dish_twenty_two","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1891","listorder":"11","name":"净料价格表","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=31&finance=1&datatable=1"},{"a":"dish_two_1","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1880","listorder":"12","name":"商品库存","parentid":"1863","url":"/admin.php?c=Report&a=common_search&id=4&finance=1&datatable=1&datatable=1&test=2"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1863","listorder":"0","name":"日常统计","parentid":"1601","url":""},{"a":"dish_one_hundred_ten","c":"dish","child":[{"a":"dish_one_hundred_seven","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1905","listorder":"0","name":"菜品成本参考表","parentid":"1904","url":"/admin.php?c=Report&a=common_search&id=49&finance=1"},{"a":"dish_one_hundred_eight","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1906","listorder":"0","name":"部门菜品成本表","parentid":"1904","url":"/admin.php?c=Report&a=common_search&id=51&finance=1&datatable=1"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1904","listorder":"0","name":"决策分析","parentid":"1601","url":""},{"a":"dish_60","c":"dish","child":[{"a":"dish_4","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1915","listorder":"0","name":"部门毛料需求汇总","parentid":"1914","url":"/admin.php?c=Report&a=common_search&id=56&finance=1"},{"a":"dish_3","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1916","listorder":"0","name":"部门净料需求汇总","parentid":"1914","url":"/admin.php?c=Report&a=common_search&id=54&finance=1"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1914","listorder":"0","name":"需求分析","parentid":"1601","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_tjfx_h.png","data_on":"./skin/images/nav_icon/icon_tjfx_n.png","display":"1","id":"1601","listorder":"2","name":"统计分析","parentid":"0"},{"a":"init","c":"Buy","child":[{"a":"buy_2","c":"Buy","child":[{"a":"stock_list&abc=1","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1711","listorder":"0","name":"商品信息","parentid":"1808","url":""},{"a":"type_list","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1712","listorder":"0","name":"商品分类","parentid":"1808","url":""},{"a":"supply_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1719","listorder":"0","name":"供应商信息","parentid":"1808","url":""},{"a":"unit_list","c":"Dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1898","listorder":"0","name":"计量单位","parentid":"1808","url":""},{"a":"price_region_list","c":"Admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1963","listorder":"0","name":"价格执行区域","parentid":"1808","url":""},{"a":"execute_region_list","c":"Admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1724","listorder":"1","name":"执行配送区域","parentid":"1808","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1808","listorder":"0","name":"基本信息","parentid":"1803","url":""},{"a":"","c":"Buy","child":[{"a":"balance_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1721","listorder":"1","name":"采购结算","parentid":"1709","url":""},{"a":"adjust_price_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1725","listorder":"4","name":"调价管理","parentid":"1709","url":""},{"a":"contract_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1805","listorder":"5","name":"采购合同","parentid":"1709","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1839","listorder":"6","name":"采购汇总单管理","parentid":"1709","url":"/?c=Dish&a=order_list&menu_id=1599"},{"a":"buy_order_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1807","listorder":"7","name":"采购订单","parentid":"1709","url":""},{"a":"buy_order_alter","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1841","listorder":"8","name":"采购变更单","parentid":"1709","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1709","listorder":"5","name":"日常业务","parentid":"1803","url":""},{"a":"buy_1","c":"Buy","child":[{"a":"check_menu_stock","c":"Buystatis","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1739","listorder":"0","name":"菜品毛料检查","parentid":"1710","url":""},{"a":"dish_one_hundred","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1897","listorder":"0","name":"商品价格查询统计表","parentid":"1710","url":"/admin.php?c=Report&a=common_search&id=40&finance=2"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1710","listorder":"6","name":"查询统计","parentid":"1803","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_cggl_h.png","data_on":"./skin/images/nav_icon/icon_cggl_n.png","display":"1","id":"1803","listorder":"3","name":"采购管理","parentid":"0","url":""},{"a":"init","c":"Store","child":[{"a":"","c":"Store","child":[{"a":"market_store_in_list","c":"store","data":"99","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1741","listorder":"0","name":"市场应急入库","parentid":"1731","url":""},{"a":"store_in_list","c":"store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1720","listorder":"1","name":"采购入库","parentid":"1731","url":""},{"a":"store_out_list","c":"Store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1728","listorder":"2","name":"出库管理","parentid":"1731","url":""},{"a":"store_back_list","c":"Store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1894","listorder":"4","name":"退货单","parentid":"1731","url":""},{"a":"store_adjust_list","c":"Store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1879","listorder":"5","name":"盘点单","parentid":"1731","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1731","listorder":"0","name":"日常业务","parentid":"1730","url":""},{"a":"","c":"Store","child":[{"a":"dish_two_2","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1885","listorder":"0","name":" 商品库存","parentid":"1732","url":"/admin.php?c=Report&a=common_search&id=4&finance=1&test=4"},{"a":"dish_one_hundred_five","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1900","listorder":"0","name":"库存比对表","parentid":"1732","url":"/admin.php?c=Report&a=common_search&id=41&finance=1"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1732","listorder":"0","name":"查询报表","parentid":"1730","url":""},{"a":"delegate_buy","c":"Store","child":[{"a":"delegate_buy","c":"Store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1738","listorder":"0","name":"委托采购","parentid":"1737","url":""},{"a":"account_period_list","c":"Store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1742","listorder":"0","name":"会计年度设置","parentid":"1737","url":""},{"a":"carryover","c":"store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1967","listorder":"0","name":"月底结转","parentid":"1737","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1737","listorder":"0","name":"基本配置","parentid":"1730","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_kcgl_h.png","data_on":"./skin/images/nav_icon/icon_kcgl_n.png","display":"1","id":"1730","listorder":"4","name":"库存管理","parentid":"0","url":""},{"a":"init","c":"Supply","child":[{"a":"supply_cer_list_","c":"Supply","child":[{"a":"supply_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1736","listorder":"0","name":"供应商信息","parentid":"1735","url":""},{"a":"supply_cer_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1842","listorder":"0","name":"供应商证件管理","parentid":"1735","url":""},{"a":"supply_cer_alter_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1843","listorder":"0","name":"供应商证件审核","parentid":"1735","url":""},{"a":"Scoring_criteria","c":"supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1848","listorder":"0","name":"考核大类管理","parentid":"1735","url":""},{"a":"rated_item","c":"supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1844","listorder":"0","name":"评分项目管理","parentid":"1735","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1735","listorder":"0","name":"基础信息","parentid":"1733","url":""},{"a":"Supply___","c":"Supply","child":[{"a":"buy_order_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1856","listorder":"0","name":"订单管理","parentid":"1855","url":""},{"a":"store_in_list","c":"store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1857","listorder":"0","name":"配送管理","parentid":"1855","url":""},{"a":"buy_order_alter","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1858","listorder":"0","name":"采购变更单","parentid":"1855","url":""},{"a":"balance_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1912","listorder":"0","name":"采购结算","parentid":"1855","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1855","listorder":"0","name":"日常业务","parentid":"1733","url":""},{"a":"dish_one_hundred_11","c":"dish","child":[{"a":"dish_one_hundred_12","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1909","listorder":"0","name":"送货单统计表","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=22&finance=1"},{"a":"dish_one_hundred_13","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1910","listorder":"0","name":"入库单统计表","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=23&finance=1"},{"a":"dish_one_hundred_14","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1911","listorder":"0","name":"应收账统计表","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=52&finance=1"},{"a":"dish_7","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1917","listorder":"0","name":"送货单明细表","parentid":"1908","url":"admin.php?c=Report&a=common_search&id=53&finance=1"},{"a":"dish_51","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1966","listorder":"0","name":"销货清单","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=60&finance=1"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1908","listorder":"0","name":"查询统计","parentid":"1733","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_psgl_h.png","data_on":"./skin/images/nav_icon/icon_psgl_n.png","display":"1","id":"1733","listorder":"5","name":"配送管理","parentid":"0","url":""},{"a":"init","c":"finance","child":[{"a":"","c":"dish","child":[{"a":"dep_bep","c":"finance","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1892","listorder":"0","name":"部门盈亏日报表","parentid":"1860","url":""},{"a":"dish_110","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1968","listorder":"0","name":"按供应商统计表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=66&finance=1"},{"a":"dish_two_3","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1861","listorder":"1","name":"商品库存","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=4&finance=1&test=1"},{"a":"dish_one","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1862","listorder":"2","name":"进货渠道入库表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=2&finance=2"},{"a":"dish_nine","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1869","listorder":"3","name":"实物消耗表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=30&finance=1"},{"a":"dish_five","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1866","listorder":"4","name":"未付已付合并查询","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=9&finance=1"},{"a":"dish_four","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1865","listorder":"5","name":"部门应收账报表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=28&finance=1"},{"a":"dish_ten","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1871","listorder":"6","name":"部门应付账报表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=13&finance=1"},{"a":"dish_eight","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1868","listorder":"7","name":"应收帐明细表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=29&finance=1"},{"a":"dish_seven","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1867","listorder":"8","name":"应付账明细表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=10&finance=1"},{"a":"dish_fourteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1872","listorder":"9","name":"费用支出汇总表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=17&finance=1"},{"a":"dish_sixteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1883","listorder":"10","name":"营业收入统计表","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=19&finance=1"},{"a":"dish_fiveteen","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1882","listorder":"11","name":"存货分类账","parentid":"1860","url":"/admin.php?c=Report&a=common_search&id=18&finance=1"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1860","listorder":"0","name":"财务报表","parentid":"1859","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_cwgl_h.png","data_on":"./skin/images/nav_icon/icon_cwgl_n.png","display":"1","id":"1859","listorder":"6","name":"财务管理","parentid":"0","url":""},{"a":"init_init","c":"Role","child":[{"a":"update2","c":"Z_setting2","child":[{"a":"manage","c":"Z_seat","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1700","listorder":"0","name":"推荐位管理","parentid":"1694","url":""},{"a":"update","c":"Z_setting2","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1695","listorder":"0","name":"站点管理","parentid":"1694","url":""},{"a":"manage","c":"Z_database","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1696","listorder":"0","name":"数据备份","parentid":"1694","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1694","listorder":"1","name":"站点管理","parentid":"1","url":""},{"a":"ad_manage","c":"Admin_manage","child":[{"a":"admin_company","c":"Admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1896","listorder":"0","name":"单位管理","parentid":"49","url":""},{"a":"tag_list","c":"Admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1977","listorder":"0","name":"菜品标签维护","parentid":"49","url":""},{"a":"com_cat_attr_list","c":"Admin_manage","data":"","data_leave":"","data_on":"","display":"1","id":"1979","listorder":"0","name":"公司类别属性","parentid":"49","url":""},{"a":"init","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"54","listorder":"1","name":"用户管理","parentid":"49"},{"a":"init","c":"role","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"50","listorder":"2","name":"role_manage","parentid":"49"},{"a":"dep_list","c":"Admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1626","listorder":"3","name":"部门管理","parentid":"49"},{"a":"init","c":"menu","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"31","listorder":"4","name":"menu_manage","parentid":"49"},{"a":"update","c":"Z_setting","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1670","listorder":"22","name":"微信管理","parentid":"49","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"49","listorder":"2","name":"admin_setting","parentid":"1"},{"a":"init","c":"Z_ad","child":[{"a":"seat_manage","c":"Z_ad","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1699","listorder":"0","name":"广告位管理","parentid":"1697","url":""},{"a":"manage","c":"Z_ad","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1698","listorder":"0","name":"广告管理","parentid":"1697","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1697","listorder":"3","name":"广告管理","parentid":"1","url":""},{"a":"","c":"","child":[{"a":"init","c":"log","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"997","listorder":"3","name":"log","parentid":"1621"},{"a":"lock_list","c":"OrderLock","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1600","listorder":"5","name":"订单锁管理","parentid":"1621"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1621","listorder":"11","name":"系统监视","parentid":"1"},{"a":"","c":"","child":[{"a":"area_list","c":"area","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1623","listorder":"0","name":"区域列表","parentid":"1622"},{"a":"canteen_list","c":"area","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1625","listorder":"2","name":"食堂列表","parentid":"1622"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1622","listorder":"22","name":"区域管理","parentid":"1"}],"data":"","data_leave":"./skin/images/nav_icon/icon_xtsz_h.png","data_on":"./skin/images/nav_icon/icon_xtsz_n.png","display":"1","id":"1","listorder":"7","name":"系统设置","parentid":"0","url":""},{"a":"guide_page","c":"Bidweb","child":[{"a":"","c":"Bidweb","child":[{"a":"bid_plan_list","c":"Bidweb","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1921","listorder":"0","name":"招标计划","parentid":"1920","url":""},{"a":"bid_region_dep_list","c":"Bidweb","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1922","listorder":"0","name":"部门需求","parentid":"1920","url":""},{"a":"bid_region_list","c":"Bidweb","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1923","listorder":"0","name":"配送区域需求","parentid":"1920","url":""},{"a":"bid_plan_confirmed_list","c":"Bidweb","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1924","listorder":"0","name":"招标项目维护","parentid":"1920","url":""},{"a":"bid_result_list","c":"Bidweb","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1925","listorder":"0","name":"中标供应商管理","parentid":"1920","url":""},{"a":"adjust_price_list&is_bid=1","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1926","listorder":"0","name":"调价管理","parentid":"1920","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1920","listorder":"0","name":"日常业务","parentid":"1919","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_zbgl_h.png","data_on":"./skin/images/nav_icon/icon_zbgl_n.png","display":"1","id":"1919","listorder":"8","name":"招标管理","parentid":"0","url":""},{"a":"init","c":"employee","child":[{"a":"","c":"","child":[{"a":"list_query_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1934","listorder":"0","name":"列表查询","parentid":"1928","url":""},{"a":"employee_turnover_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1936","listorder":"0","name":"查看离职员工","parentid":"1928","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1928","listorder":"0","name":"人员查看","parentid":"1927","url":""},{"a":"","c":"","child":[{"a":"new_add_employer_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1937","listorder":"0","name":"新增员工","parentid":"1929","url":""},{"a":"dismiss_employees_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1938","listorder":"0","name":"辞退员工","parentid":"1929","url":""},{"a":"employee_files_html","c":"employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1939","listorder":"0","name":"员工档案","parentid":"1929","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1929","listorder":"0","name":"人员管理","parentid":"1927","url":""},{"a":"","c":"","child":[{"a":"attendance_record_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1941","listorder":"0","name":"考勤记录","parentid":"1930","url":""},{"a":"schedu","c":"employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1942","listorder":"0","name":"排班","parentid":"1930","url":""},{"a":"shift_set_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1943","listorder":"0","name":"班次设置","parentid":"1930","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1944","listorder":"0","name":"查看考勤统计","parentid":"1930","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1930","listorder":"0","name":"考勤管理","parentid":"1927","url":""},{"a":"","c":"","child":[{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1945","listorder":"0","name":"培训记录","parentid":"1931","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1946","listorder":"0","name":"查看培训记录","parentid":"1931","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1947","listorder":"0","name":"奖惩记录","parentid":"1931","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1948","listorder":"0","name":"查看奖惩记录","parentid":"1931","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1949","listorder":"0","name":"其他记录","parentid":"1931","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1950","listorder":"0","name":"查看其他记录","parentid":"1931","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1931","listorder":"0","name":"信息管理","parentid":"1927","url":""},{"a":"","c":"","child":[{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1951","listorder":"0","name":"工资标准","parentid":"1932","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1952","listorder":"0","name":"工资计算","parentid":"1932","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1953","listorder":"0","name":"工资统计","parentid":"1932","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1954","listorder":"0","name":"工资发放","parentid":"1932","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1932","listorder":"0","name":"工资管理","parentid":"1927","url":""},{"a":"","c":"","child":[{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1955","listorder":"0","name":"生日提醒","parentid":"1933","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1956","listorder":"0","name":"合同到期提醒","parentid":"1933","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1957","listorder":"0","name":"公司基本信息","parentid":"1933","url":""},{"a":"dep_infos_manage_html","c":"Employee","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1958","listorder":"0","name":"部门职务管理","parentid":"1933","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1933","listorder":"0","name":"部门管理","parentid":"1927","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_rlzy_h.png","data_on":"./skin/images/nav_icon/icon_rlzy_n.png","display":"1","id":"1927","listorder":"9","name":"人力资源","parentid":"0","url":""},{"a":"init","c":"Z_card","child":[{"a":"inits","c":"Z_card","child":[{"a":"examine","c":"Z_card","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1850","listorder":"0","name":"食堂审核","parentid":"1636","url":""},{"a":"manage","c":"Z_card_criterion","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1853","listorder":"0","name":"用餐标准","parentid":"1636","url":""},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1854","listorder":"0","name":"餐费统计日报","parentid":"1636","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fpxbbk.cpt"},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1913","listorder":"0","name":"餐次消费统计表","parentid":"1636","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fccxfactj.cpt"},{"a":"manage","c":"Z_card","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1637","listorder":"1","name":"数据录入","parentid":"1636","url":""},{"a":"report","c":"Z_card","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1638","listorder":"2","name":"每日预约人数汇总","parentid":"1636","url":""},{"a":"reportInfo","c":"Z_card","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1639","listorder":"3","name":"每日预约人数明细","parentid":"1636","url":""},{"a":"doUserReport","c":"Z_card","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1668","listorder":"4","name":"操作员办卡统计","parentid":"1636","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1636","listorder":"0","name":"集体办卡","parentid":"1635"}],"data":"","data_leave":"./skin/images/nav_icon/icon_jtbk_h.png","data_on":"./skin/images/nav_icon/icon_jtbk_n.png","display":"1","id":"1635","listorder":"55","name":"集体办卡","parentid":"0"},{"a":"produce_dish","c":"z_braindisc","child":[{"a":"one","c":"z_braindisc","child":[{"a":"six","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1663","listorder":"0","name":"菜品排行","parentid":"1652","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fcpph.cpt"},{"a":"two","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1667","listorder":"0","name":"餐次报表","parentid":"1652","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fcctj.cpt"},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1884","listorder":"0","name":"销售进度","parentid":"1652","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fxsjd.cpt"},{"a":"seven","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1654","listorder":"1","name":"人员交易流水查询","parentid":"1652","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2FF108.cpt"},{"a":"nine","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1657","listorder":"3","name":"营业报表查询","parentid":"1652","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2FR301.cpt"},{"a":"fourteen","c":"thirteen","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1661","listorder":"8","name":"人员消费分餐查询","parentid":"1652","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2FR304.cpt"},{"a":"init","c":"Z_braindisc_update","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1675","listorder":"55","name":"数据更新","parentid":"1652","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1652","listorder":"0","name":"统计报表","parentid":"1640","url":""},{"a":"produce","c":"z_braindisc","child":[{"a":"produce_dish","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1644","listorder":"1","name":"出品排菜","parentid":"1643","url":""},{"a":"produce_panel","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1645","listorder":"2","name":"出品面板","parentid":"1643","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1643","listorder":"1","name":"出品管理","parentid":"1640"},{"a":"init2","c":"z_braindisc","child":[{"a":"manage_card","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1642","listorder":"1","name":"卡片管理","parentid":"1641"},{"a":"lists","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1646","listorder":"2","name":"流水日志","parentid":"1641"},{"a":"sixteen","c":"z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1672","listorder":"3","name":"微信记录","parentid":"1641","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fstock%2Fwxfs.cpt"},{"a":"manage","c":"Z_b_produce_log","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1704","listorder":"6","name":"出品日志","parentid":"1641","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1641","listorder":"2","name":"卡片管理","parentid":"1640"},{"a":"seventeen","c":"z_braindisc","child":[{"a":"manage_card_id","c":"Z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1701","listorder":"0","name":"身份对照表","parentid":"1647","url":""},{"a":"manage_card_type","c":"Z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1648","listorder":"1","name":"卡类型维护","parentid":"1647"},{"a":"manage_window","c":"Z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1650","listorder":"3","name":"窗口管理","parentid":"1647"},{"a":"manage_terminal","c":"Z_braindisc","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1651","listorder":"4","name":"终端管理","parentid":"1647"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1647","listorder":"3","name":"基础信息","parentid":"1640","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_zpxt_h.png","data_on":"./skin/images/nav_icon/icon_zpxt_n.png","display":"1","id":"1640","listorder":"66","name":"智盘系统","parentid":"0","url":""},{"a":"init","c":"App","child":[{"a":"init","c":"Z_activitie","child":[{"a":"manage","c":"Z_activitie","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1674","listorder":"0","name":"活动管理","parentid":"1673","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1673","listorder":"0","name":"活动管理","parentid":"1616","url":""},{"a":"p_app","c":"app","child":[{"a":"app_menu_list","c":"app","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1618","listorder":"0","name":"微信排菜单","parentid":"1617"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1617","listorder":"0","name":"排菜管理","parentid":"1616"},{"a":"p_info","c":"app","child":[{"a":"student_list","c":"app","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1627","listorder":"0","name":"学生名单","parentid":"1628"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1628","listorder":"0","name":"信息管理","parentid":"1616"},{"a":"p_app","c":"AppView","child":[{"a":"app_view_list","c":"AppView","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1632","listorder":"0","name":"排菜管理","parentid":"1631"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1631","listorder":"0","name":"看看菜单","parentid":"1616"}],"data":"","data_leave":"./skin/images/nav_icon/icon_app_h.png","data_on":"./skin/images/nav_icon/icon_app_n.png","display":"1","id":"1616","listorder":"77","name":"APP","parentid":"0"},{"a":"init","c":"Task","child":[{"a":"p_task","c":"Task","child":[{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1706","listorder":"0","name":"加工明细表","parentid":"1606","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fjgmxb.cpt"},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1705","listorder":"0","name":"加工汇总表","parentid":"1606","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fjgwcqkb.cpt"},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1707","listorder":"0","name":"出库明细表","parentid":"1606","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fbmckmxb.cpt"},{"a":"","c":"","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1708","listorder":"0","name":"出库汇总表","parentid":"1606","url":"http://10.15.150.215:8080/WebReport/ReportServer?reportlet=smart%2Fjiagong%2Fbmckhzb.cpt"},{"a":"task_list","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1609","listorder":"1","name":"任务单列表","parentid":"1606"},{"a":"stock_assign","c":"Task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1615","listorder":"2","name":"净料分配表","parentid":"1606"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1606","listorder":"0","name":"任务单管理","parentid":"1605"},{"a":"task_show","c":"task","child":[{"a":"screen","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1620","listorder":"0","name":"显示屏页面","parentid":"1619"},{"a":"screen_config","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1669","listorder":"1","name":"显示屏设置","parentid":"1619","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1619","listorder":"1","name":"显示屏","parentid":"1605","url":""},{"a":"p_config","c":"Task","child":[{"a":"task_sys_info","c":"Task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1613","listorder":"0","name":"系统信息","parentid":"1610"},{"a":"task_time_config","c":"Task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1614","listorder":"3","name":"加工时间设置","parentid":"1610"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1610","listorder":"2","name":"基本设置","parentid":"1605"},{"a":"","c":"task","child":[{"a":"machine_config","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1630","listorder":"0","name":"操作台设置","parentid":"1629"},{"a":"task_log","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1633","listorder":"1","name":"加工日志","parentid":"1629"},{"a":"out_storage","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1702","listorder":"2","name":"出库日志","parentid":"1629","url":""},{"a":"rfid_config","c":"task","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1634","listorder":"3","name":"RFID设置","parentid":"1629"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1629","listorder":"3","name":"加工操作管理","parentid":"1605"}],"data":"","data_leave":"/skin/images/nav_icon/icon_rwd_h.png","data_on":"/skin/images/nav_icon/icon_rwd_n.png","display":"1","id":"1605","listorder":"88","name":"任务单系统","parentid":"0"}]
             * mobile_interface : {"1720":"store_in_list","1807":"buy_order_list","1856":"buy_order_list","1857":"store_in_list"}
             * mobile_phone : 15669915802
             * my_dep_list : [0,"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","54","55","56","57","58","59","60","61","62","63","64","65","66","67","71","72","73","74","75","76","77","78","79","80","81","83","85","86","87","88","89","90","91","92","93","95","96","97","98","99","100","101","102","103","105","106","107","108","109","110","111","112","114","116","117","118","119","120","121","122","123","124","125","126","127","128","129","130","131","132","133","134","135","136","137","138","139","140","147","148","149","150","151","152","153","154","155","156","157","158","159","160","161","162","163","164","1","1","1"]
             * roleid : 1,154,155,157,158,159,160,161,162
             * rolename : 超级管理员,厨师长1.0,采购部1.0,保管员1.0,食堂主任1.0,财务部1.0,总仓1.0,单位管理员1.0,单位联配管理员1.0
             * userid : 1
             */

            private DepInfoBean dep_info;
            private String loginname;
            private MobileInterfaceBean mobile_interface;
            private String mobile_phone;
            private String roleid;
            private String rolename;
            private String userid;
            private List<MenuBean> menu;
            private List<Integer> my_dep_list;

            public DepInfoBean getDep_info() {
                return dep_info;
            }

            public void setDep_info(DepInfoBean dep_info) {
                this.dep_info = dep_info;
            }

            public String getLoginname() {
                return loginname;
            }

            public void setLoginname(String loginname) {
                this.loginname = loginname;
            }

            public MobileInterfaceBean getMobile_interface() {
                return mobile_interface;
            }

            public void setMobile_interface(MobileInterfaceBean mobile_interface) {
                this.mobile_interface = mobile_interface;
            }

            public String getMobile_phone() {
                return mobile_phone;
            }

            public void setMobile_phone(String mobile_phone) {
                this.mobile_phone = mobile_phone;
            }

            public String getRoleid() {
                return roleid;
            }

            public void setRoleid(String roleid) {
                this.roleid = roleid;
            }

            public String getRolename() {
                return rolename;
            }

            public void setRolename(String rolename) {
                this.rolename = rolename;
            }

            public String getUserid() {
                return userid;
            }

            public void setUserid(String userid) {
                this.userid = userid;
            }

            public List<MenuBean> getMenu() {
                return menu;
            }

            public void setMenu(List<MenuBean> menu) {
                this.menu = menu;
            }

            public List<Integer> getMy_dep_list() {
                return my_dep_list;
            }

            public void setMy_dep_list(List<Integer> my_dep_list) {
                this.my_dep_list = my_dep_list;
            }

            public static class DepInfoBean {
                /**
                 * com_id : 1
                 * com_name : 浙大饮食中心
                 * dep_id : 1
                 * dep_name : 第一餐饮中心（紫金港）
                 */

                private String com_id;
                private String com_name;
                private String dep_id;
                private String dep_name;

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
            }

            public static class MobileInterfaceBean {
                /**
                 * 1720 : store_in_list
                 * 1807 : buy_order_list
                 * 1856 : buy_order_list
                 * 1857 : store_in_list
                 */

                @SerializedName("1720")
                private String _$1720;
                @SerializedName("1807")
                private String _$1807;
                @SerializedName("1856")
                private String _$1856;
                @SerializedName("1857")
                private String _$1857;

                public String get_$1720() {
                    return _$1720;
                }

                public void set_$1720(String _$1720) {
                    this._$1720 = _$1720;
                }

                public String get_$1807() {
                    return _$1807;
                }

                public void set_$1807(String _$1807) {
                    this._$1807 = _$1807;
                }

                public String get_$1856() {
                    return _$1856;
                }

                public void set_$1856(String _$1856) {
                    this._$1856 = _$1856;
                }

                public String get_$1857() {
                    return _$1857;
                }

                public void set_$1857(String _$1857) {
                    this._$1857 = _$1857;
                }
            }

            public static class MenuBean {
                /**
                 * a : public_main
                 * c : Index
                 * child : [{"a":"self_info","c":"admin_manage","child":[{"a":"public_edit_info","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"972","listorder":"0","name":"editinfo","parentid":"970"},{"a":"submit_bug","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1903","listorder":"0","name":"意见反馈","parentid":"970","url":""},{"a":"public_edit_tel","c":"Admin_manage","data":"","data_leave":"","data_on":"","display":"1","id":"1980","listorder":"0","name":"安全中心","parentid":"970","url":""},{"a":"public_edit_pwd","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"971","listorder":"1","name":"editpwd","parentid":"970"}],"cname":"admininfo","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"970","listorder":"0","name":"admininfo","parentid":"10"}]
                 * cname : 我的面板
                 * data :
                 * data_leave : ./skin/images/nav_icon/icon_mb_h.png
                 * data_on : ./skin/images/nav_icon/icon_mb_n.png
                 * display : 1
                 * id : 10
                 * listorder : 0
                 * name : panel
                 * parentid : 0
                 * url :
                 */

                private String a;
                private String c;
                private String cname;
                private String data;
                private String data_leave;
                private String data_on;
                private String display;
                private String id;
                private String listorder;
                private String name;
                private String parentid;
                private String url;
                private List<ChildBeanX> child;

                public String getA() {
                    return a;
                }

                public void setA(String a) {
                    this.a = a;
                }

                public String getC() {
                    return c;
                }

                public void setC(String c) {
                    this.c = c;
                }

                public String getCname() {
                    return cname;
                }

                public void setCname(String cname) {
                    this.cname = cname;
                }

                public String getData() {
                    return data;
                }

                public void setData(String data) {
                    this.data = data;
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

                public String getDisplay() {
                    return display;
                }

                public void setDisplay(String display) {
                    this.display = display;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getListorder() {
                    return listorder;
                }

                public void setListorder(String listorder) {
                    this.listorder = listorder;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getParentid() {
                    return parentid;
                }

                public void setParentid(String parentid) {
                    this.parentid = parentid;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public List<ChildBeanX> getChild() {
                    return child;
                }

                public void setChild(List<ChildBeanX> child) {
                    this.child = child;
                }

                public static class ChildBeanX {
                    /**
                     * a : self_info
                     * c : admin_manage
                     * child : [{"a":"public_edit_info","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"972","listorder":"0","name":"editinfo","parentid":"970"},{"a":"submit_bug","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1903","listorder":"0","name":"意见反馈","parentid":"970","url":""},{"a":"public_edit_tel","c":"Admin_manage","data":"","data_leave":"","data_on":"","display":"1","id":"1980","listorder":"0","name":"安全中心","parentid":"970","url":""},{"a":"public_edit_pwd","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"971","listorder":"1","name":"editpwd","parentid":"970"}]
                     * cname : admininfo
                     * data :
                     * data_leave : /skin/AmazeUI/images/CAOZUO@3x.png
                     * data_on :
                     * display : 1
                     * id : 970
                     * listorder : 0
                     * name : admininfo
                     * parentid : 10
                     */

                    private String a;
                    private String c;
                    private String cname;
                    private String data;
                    private String data_leave;
                    private String data_on;
                    private String display;
                    private String id;
                    private String listorder;
                    private String name;
                    private String parentid;
                    private List<ChildBean> child;

                    public String getA() {
                        return a;
                    }

                    public void setA(String a) {
                        this.a = a;
                    }

                    public String getC() {
                        return c;
                    }

                    public void setC(String c) {
                        this.c = c;
                    }

                    public String getCname() {
                        return cname;
                    }

                    public void setCname(String cname) {
                        this.cname = cname;
                    }

                    public String getData() {
                        return data;
                    }

                    public void setData(String data) {
                        this.data = data;
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

                    public String getDisplay() {
                        return display;
                    }

                    public void setDisplay(String display) {
                        this.display = display;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getListorder() {
                        return listorder;
                    }

                    public void setListorder(String listorder) {
                        this.listorder = listorder;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getParentid() {
                        return parentid;
                    }

                    public void setParentid(String parentid) {
                        this.parentid = parentid;
                    }

                    public List<ChildBean> getChild() {
                        return child;
                    }

                    public void setChild(List<ChildBean> child) {
                        this.child = child;
                    }

                    public static class ChildBean {
                        /**
                         * a : public_edit_info
                         * c : admin_manage
                         * data :
                         * data_leave : /skin/AmazeUI/images/CAOZUO@3x.png
                         * data_on :
                         * display : 1
                         * id : 972
                         * listorder : 0
                         * name : editinfo
                         * parentid : 970
                         * url :
                         */

                        private String a;
                        private String c;
                        private String data;
                        private String data_leave;
                        private String data_on;
                        private String display;
                        private String id;
                        private String listorder;
                        private String name;
                        private String parentid;
                        private String url;

                        public String getA() {
                            return a;
                        }

                        public void setA(String a) {
                            this.a = a;
                        }

                        public String getC() {
                            return c;
                        }

                        public void setC(String c) {
                            this.c = c;
                        }

                        public String getData() {
                            return data;
                        }

                        public void setData(String data) {
                            this.data = data;
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

                        public String getDisplay() {
                            return display;
                        }

                        public void setDisplay(String display) {
                            this.display = display;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }

                        public String getListorder() {
                            return listorder;
                        }

                        public void setListorder(String listorder) {
                            this.listorder = listorder;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getParentid() {
                            return parentid;
                        }

                        public void setParentid(String parentid) {
                            this.parentid = parentid;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }
                    }
                }
            }
        }
    }
}