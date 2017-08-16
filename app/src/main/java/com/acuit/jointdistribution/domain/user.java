package com.acuit.jointdistribution.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 类名: user <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/12 0012 15:49 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class user {

    /**
     * code : 200
     * data : {"priv":{"Buy":{"buy_order_list":{"priv_add":0,"priv_adjust_price":0,"priv_audit":0,"priv_confirm":1,"priv_copy":0,"priv_create_order":0,"priv_create_store_in":1,"priv_delete":0,"priv_edit":0,"priv_enroll":0,"priv_send":0,"priv_set_in_use":0,"priv_view":1}},"Store":{"store_in_list":{"priv_add":0,"priv_adjust_price":0,"priv_audit":1,"priv_confirm":0,"priv_copy":0,"priv_create_order":0,"priv_create_store_in":0,"priv_delete":0,"priv_edit":0,"priv_enroll":0,"priv_send":0,"priv_set_in_use":0,"priv_view":1}}},"token":"smart_07f9fd98d5a531788d9a26c7bdda2651","user_info":{"dep_info":{"class":"0","classification":"2","code":"HZSCWLYXGS","com_name":"杭州蔬菜物流有限公司","contact_person":"","contact_phone":"","create_date":"1474250090","create_user":"13967","dep_name":"杭州蔬菜物流有限公司","fee_ratio":"3.00","id":"53","is_charge":"1","is_del":"0","is_display":"Y","is_front":"0","is_tax":"0","list_order":"99","name":"杭州蔬菜物流有限公司","pid":"0","serv_com_id":"0","status":"4","supply_id":"53","tax_ratio":"0.00","type":"3","update_date":"1498546627","update_user":"13995"},"loginname":"HZSCWLYXGS","menu":[{"a":"public_main","c":"Index","child":[{"a":"self_info","c":"admin_manage","child":[{"a":"public_edit_info","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"972","listorder":"0","name":"editinfo","parentid":"970"},{"a":"submit_bug","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1903","listorder":"0","name":"意见反馈","parentid":"970","url":""},{"a":"public_edit_pwd","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"971","listorder":"1","name":"editpwd","parentid":"970"}],"cname":"admininfo","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"970","listorder":"0","name":"admininfo","parentid":"10"}],"cname":"我的面板","data":"","data_leave":"./skin/images/nav_icon/icon_mb_h.png","data_on":"./skin/images/nav_icon/icon_mb_n.png","display":"1","id":"10","listorder":"0","name":"panel","parentid":"0","url":""},{"a":"init","c":"Supply","child":[{"a":"supply_cer_list_","c":"Supply","child":[{"a":"supply_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1736","listorder":"0","name":"供应商信息","parentid":"1735","url":""},{"a":"supply_cer_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1842","listorder":"0","name":"供应商证件管理","parentid":"1735","url":""},{"a":"supply_cer_alter_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1843","listorder":"0","name":"供应商证件审核","parentid":"1735","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1735","listorder":"0","name":"基础信息","parentid":"1733","url":""},{"a":"Supply___","c":"Supply","child":[{"a":"buy_order_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1856","listorder":"0","name":"订单管理","parentid":"1855","url":""},{"a":"store_in_list","c":"store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1857","listorder":"0","name":"配送管理","parentid":"1855","url":""},{"a":"buy_order_alter","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1858","listorder":"0","name":"采购变更单","parentid":"1855","url":""},{"a":"balance_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1912","listorder":"0","name":"采购结算","parentid":"1855","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1855","listorder":"0","name":"日常业务","parentid":"1733","url":""},{"a":"dish_one_hundred_11","c":"dish","child":[{"a":"dish_one_hundred_12","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1909","listorder":"0","name":"送货单统计表","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=22&finance=1"},{"a":"dish_one_hundred_14","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1911","listorder":"0","name":"应收账统计表","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=52&finance=1"},{"a":"dish_7","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1917","listorder":"0","name":"送货单明细表","parentid":"1908","url":"admin.php?c=Report&a=common_search&id=53&finance=1"},{"a":"dish_51","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1966","listorder":"0","name":"销货清单","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=60&finance=1"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1908","listorder":"0","name":"查询统计","parentid":"1733","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_psgl_h.png","data_on":"./skin/images/nav_icon/icon_psgl_n.png","display":"1","id":"1733","listorder":"5","name":"配送管理","parentid":"0","url":""},{"a":"guide_page","c":"Bidweb","child":[{"a":"","c":"Bidweb","child":[{"a":"bid_plan_confirmed_list","c":"Bidweb","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1924","listorder":"0","name":"招标项目维护","parentid":"1920","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1920","listorder":"0","name":"日常业务","parentid":"1919","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_zbgl_h.png","data_on":"./skin/images/nav_icon/icon_zbgl_n.png","display":"1","id":"1919","listorder":"8","name":"招标管理","parentid":"0","url":""}],"mobile_interface":{"1856":"buy_order_list","1857":"store_in_list"},"my_dep_list":[0],"roleid":"0","userid":"13995"}}
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
         * priv : {"Buy":{"buy_order_list":{"priv_add":0,"priv_adjust_price":0,"priv_audit":0,"priv_confirm":1,"priv_copy":0,"priv_create_order":0,"priv_create_store_in":1,"priv_delete":0,"priv_edit":0,"priv_enroll":0,"priv_send":0,"priv_set_in_use":0,"priv_view":1}},"Store":{"store_in_list":{"priv_add":0,"priv_adjust_price":0,"priv_audit":1,"priv_confirm":0,"priv_copy":0,"priv_create_order":0,"priv_create_store_in":0,"priv_delete":0,"priv_edit":0,"priv_enroll":0,"priv_send":0,"priv_set_in_use":0,"priv_view":1}}}
         * token : smart_07f9fd98d5a531788d9a26c7bdda2651
         * user_info : {"dep_info":{"class":"0","classification":"2","code":"HZSCWLYXGS","com_name":"杭州蔬菜物流有限公司","contact_person":"","contact_phone":"","create_date":"1474250090","create_user":"13967","dep_name":"杭州蔬菜物流有限公司","fee_ratio":"3.00","id":"53","is_charge":"1","is_del":"0","is_display":"Y","is_front":"0","is_tax":"0","list_order":"99","name":"杭州蔬菜物流有限公司","pid":"0","serv_com_id":"0","status":"4","supply_id":"53","tax_ratio":"0.00","type":"3","update_date":"1498546627","update_user":"13995"},"loginname":"HZSCWLYXGS","menu":[{"a":"public_main","c":"Index","child":[{"a":"self_info","c":"admin_manage","child":[{"a":"public_edit_info","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"972","listorder":"0","name":"editinfo","parentid":"970"},{"a":"submit_bug","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1903","listorder":"0","name":"意见反馈","parentid":"970","url":""},{"a":"public_edit_pwd","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"971","listorder":"1","name":"editpwd","parentid":"970"}],"cname":"admininfo","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"970","listorder":"0","name":"admininfo","parentid":"10"}],"cname":"我的面板","data":"","data_leave":"./skin/images/nav_icon/icon_mb_h.png","data_on":"./skin/images/nav_icon/icon_mb_n.png","display":"1","id":"10","listorder":"0","name":"panel","parentid":"0","url":""},{"a":"init","c":"Supply","child":[{"a":"supply_cer_list_","c":"Supply","child":[{"a":"supply_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1736","listorder":"0","name":"供应商信息","parentid":"1735","url":""},{"a":"supply_cer_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1842","listorder":"0","name":"供应商证件管理","parentid":"1735","url":""},{"a":"supply_cer_alter_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1843","listorder":"0","name":"供应商证件审核","parentid":"1735","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1735","listorder":"0","name":"基础信息","parentid":"1733","url":""},{"a":"Supply___","c":"Supply","child":[{"a":"buy_order_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1856","listorder":"0","name":"订单管理","parentid":"1855","url":""},{"a":"store_in_list","c":"store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1857","listorder":"0","name":"配送管理","parentid":"1855","url":""},{"a":"buy_order_alter","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1858","listorder":"0","name":"采购变更单","parentid":"1855","url":""},{"a":"balance_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1912","listorder":"0","name":"采购结算","parentid":"1855","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1855","listorder":"0","name":"日常业务","parentid":"1733","url":""},{"a":"dish_one_hundred_11","c":"dish","child":[{"a":"dish_one_hundred_12","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1909","listorder":"0","name":"送货单统计表","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=22&finance=1"},{"a":"dish_one_hundred_14","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1911","listorder":"0","name":"应收账统计表","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=52&finance=1"},{"a":"dish_7","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1917","listorder":"0","name":"送货单明细表","parentid":"1908","url":"admin.php?c=Report&a=common_search&id=53&finance=1"},{"a":"dish_51","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1966","listorder":"0","name":"销货清单","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=60&finance=1"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1908","listorder":"0","name":"查询统计","parentid":"1733","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_psgl_h.png","data_on":"./skin/images/nav_icon/icon_psgl_n.png","display":"1","id":"1733","listorder":"5","name":"配送管理","parentid":"0","url":""},{"a":"guide_page","c":"Bidweb","child":[{"a":"","c":"Bidweb","child":[{"a":"bid_plan_confirmed_list","c":"Bidweb","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1924","listorder":"0","name":"招标项目维护","parentid":"1920","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1920","listorder":"0","name":"日常业务","parentid":"1919","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_zbgl_h.png","data_on":"./skin/images/nav_icon/icon_zbgl_n.png","display":"1","id":"1919","listorder":"8","name":"招标管理","parentid":"0","url":""}],"mobile_interface":{"1856":"buy_order_list","1857":"store_in_list"},"my_dep_list":[0],"roleid":"0","userid":"13995"}
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
             * Buy : {"buy_order_list":{"priv_add":0,"priv_adjust_price":0,"priv_audit":0,"priv_confirm":1,"priv_copy":0,"priv_create_order":0,"priv_create_store_in":1,"priv_delete":0,"priv_edit":0,"priv_enroll":0,"priv_send":0,"priv_set_in_use":0,"priv_view":1}}
             * Store : {"store_in_list":{"priv_add":0,"priv_adjust_price":0,"priv_audit":1,"priv_confirm":0,"priv_copy":0,"priv_create_order":0,"priv_create_store_in":0,"priv_delete":0,"priv_edit":0,"priv_enroll":0,"priv_send":0,"priv_set_in_use":0,"priv_view":1}}
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
                 * buy_order_list : {"priv_add":0,"priv_adjust_price":0,"priv_audit":0,"priv_confirm":1,"priv_copy":0,"priv_create_order":0,"priv_create_store_in":1,"priv_delete":0,"priv_edit":0,"priv_enroll":0,"priv_send":0,"priv_set_in_use":0,"priv_view":1}
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
                     * priv_add : 0
                     * priv_adjust_price : 0
                     * priv_audit : 0
                     * priv_confirm : 1
                     * priv_copy : 0
                     * priv_create_order : 0
                     * priv_create_store_in : 1
                     * priv_delete : 0
                     * priv_edit : 0
                     * priv_enroll : 0
                     * priv_send : 0
                     * priv_set_in_use : 0
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
                 * store_in_list : {"priv_add":0,"priv_adjust_price":0,"priv_audit":1,"priv_confirm":0,"priv_copy":0,"priv_create_order":0,"priv_create_store_in":0,"priv_delete":0,"priv_edit":0,"priv_enroll":0,"priv_send":0,"priv_set_in_use":0,"priv_view":1}
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
                     * priv_add : 0
                     * priv_adjust_price : 0
                     * priv_audit : 1
                     * priv_confirm : 0
                     * priv_copy : 0
                     * priv_create_order : 0
                     * priv_create_store_in : 0
                     * priv_delete : 0
                     * priv_edit : 0
                     * priv_enroll : 0
                     * priv_send : 0
                     * priv_set_in_use : 0
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
             * dep_info : {"class":"0","classification":"2","code":"HZSCWLYXGS","com_name":"杭州蔬菜物流有限公司","contact_person":"","contact_phone":"","create_date":"1474250090","create_user":"13967","dep_name":"杭州蔬菜物流有限公司","fee_ratio":"3.00","id":"53","is_charge":"1","is_del":"0","is_display":"Y","is_front":"0","is_tax":"0","list_order":"99","name":"杭州蔬菜物流有限公司","pid":"0","serv_com_id":"0","status":"4","supply_id":"53","tax_ratio":"0.00","type":"3","update_date":"1498546627","update_user":"13995"}
             * loginname : HZSCWLYXGS
             * menu : [{"a":"public_main","c":"Index","child":[{"a":"self_info","c":"admin_manage","child":[{"a":"public_edit_info","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"972","listorder":"0","name":"editinfo","parentid":"970"},{"a":"submit_bug","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1903","listorder":"0","name":"意见反馈","parentid":"970","url":""},{"a":"public_edit_pwd","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"971","listorder":"1","name":"editpwd","parentid":"970"}],"cname":"admininfo","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"970","listorder":"0","name":"admininfo","parentid":"10"}],"cname":"我的面板","data":"","data_leave":"./skin/images/nav_icon/icon_mb_h.png","data_on":"./skin/images/nav_icon/icon_mb_n.png","display":"1","id":"10","listorder":"0","name":"panel","parentid":"0","url":""},{"a":"init","c":"Supply","child":[{"a":"supply_cer_list_","c":"Supply","child":[{"a":"supply_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1736","listorder":"0","name":"供应商信息","parentid":"1735","url":""},{"a":"supply_cer_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1842","listorder":"0","name":"供应商证件管理","parentid":"1735","url":""},{"a":"supply_cer_alter_list","c":"Supply","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1843","listorder":"0","name":"供应商证件审核","parentid":"1735","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1735","listorder":"0","name":"基础信息","parentid":"1733","url":""},{"a":"Supply___","c":"Supply","child":[{"a":"buy_order_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1856","listorder":"0","name":"订单管理","parentid":"1855","url":""},{"a":"store_in_list","c":"store","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1857","listorder":"0","name":"配送管理","parentid":"1855","url":""},{"a":"buy_order_alter","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1858","listorder":"0","name":"采购变更单","parentid":"1855","url":""},{"a":"balance_list","c":"Buy","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1912","listorder":"0","name":"采购结算","parentid":"1855","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1855","listorder":"0","name":"日常业务","parentid":"1733","url":""},{"a":"dish_one_hundred_11","c":"dish","child":[{"a":"dish_one_hundred_12","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1909","listorder":"0","name":"送货单统计表","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=22&finance=1"},{"a":"dish_one_hundred_14","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1911","listorder":"0","name":"应收账统计表","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=52&finance=1"},{"a":"dish_7","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1917","listorder":"0","name":"送货单明细表","parentid":"1908","url":"admin.php?c=Report&a=common_search&id=53&finance=1"},{"a":"dish_51","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1966","listorder":"0","name":"销货清单","parentid":"1908","url":"/admin.php?c=Report&a=common_search&id=60&finance=1"}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1908","listorder":"0","name":"查询统计","parentid":"1733","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_psgl_h.png","data_on":"./skin/images/nav_icon/icon_psgl_n.png","display":"1","id":"1733","listorder":"5","name":"配送管理","parentid":"0","url":""},{"a":"guide_page","c":"Bidweb","child":[{"a":"","c":"Bidweb","child":[{"a":"bid_plan_confirmed_list","c":"Bidweb","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1924","listorder":"0","name":"招标项目维护","parentid":"1920","url":""}],"data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1920","listorder":"0","name":"日常业务","parentid":"1919","url":""}],"data":"","data_leave":"./skin/images/nav_icon/icon_zbgl_h.png","data_on":"./skin/images/nav_icon/icon_zbgl_n.png","display":"1","id":"1919","listorder":"8","name":"招标管理","parentid":"0","url":""}]
             * mobile_interface : {"1856":"buy_order_list","1857":"store_in_list"}
             * my_dep_list : [0]
             * roleid : 0
             * userid : 13995
             */

            private DepInfoBean dep_info;
            private String loginname;
            private MobileInterfaceBean mobile_interface;
            private String roleid;
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

            public String getRoleid() {
                return roleid;
            }

            public void setRoleid(String roleid) {
                this.roleid = roleid;
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
                 * class : 0
                 * classification : 2
                 * code : HZSCWLYXGS
                 * com_name : 杭州蔬菜物流有限公司
                 * contact_person :
                 * contact_phone :
                 * create_date : 1474250090
                 * create_user : 13967
                 * dep_name : 杭州蔬菜物流有限公司
                 * fee_ratio : 3.00
                 * id : 53
                 * is_charge : 1
                 * is_del : 0
                 * is_display : Y
                 * is_front : 0
                 * is_tax : 0
                 * list_order : 99
                 * name : 杭州蔬菜物流有限公司
                 * pid : 0
                 * serv_com_id : 0
                 * status : 4
                 * supply_id : 53
                 * tax_ratio : 0.00
                 * type : 3
                 * update_date : 1498546627
                 * update_user : 13995
                 */

                @SerializedName("class")
                private String classX;
                private String classification;
                private String code;
                private String com_name;
                private String contact_person;
                private String contact_phone;
                private String create_date;
                private String create_user;
                private String dep_name;
                private String fee_ratio;
                private String id;
                private String is_charge;
                private String is_del;
                private String is_display;
                private String is_front;
                private String is_tax;
                private String list_order;
                private String name;
                private String pid;
                private String serv_com_id;
                private String status;
                private String supply_id;
                private String tax_ratio;
                private String type;
                private String update_date;
                private String update_user;

                public String getClassX() {
                    return classX;
                }

                public void setClassX(String classX) {
                    this.classX = classX;
                }

                public String getClassification() {
                    return classification;
                }

                public void setClassification(String classification) {
                    this.classification = classification;
                }

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getCom_name() {
                    return com_name;
                }

                public void setCom_name(String com_name) {
                    this.com_name = com_name;
                }

                public String getContact_person() {
                    return contact_person;
                }

                public void setContact_person(String contact_person) {
                    this.contact_person = contact_person;
                }

                public String getContact_phone() {
                    return contact_phone;
                }

                public void setContact_phone(String contact_phone) {
                    this.contact_phone = contact_phone;
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

                public String getDep_name() {
                    return dep_name;
                }

                public void setDep_name(String dep_name) {
                    this.dep_name = dep_name;
                }

                public String getFee_ratio() {
                    return fee_ratio;
                }

                public void setFee_ratio(String fee_ratio) {
                    this.fee_ratio = fee_ratio;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getIs_charge() {
                    return is_charge;
                }

                public void setIs_charge(String is_charge) {
                    this.is_charge = is_charge;
                }

                public String getIs_del() {
                    return is_del;
                }

                public void setIs_del(String is_del) {
                    this.is_del = is_del;
                }

                public String getIs_display() {
                    return is_display;
                }

                public void setIs_display(String is_display) {
                    this.is_display = is_display;
                }

                public String getIs_front() {
                    return is_front;
                }

                public void setIs_front(String is_front) {
                    this.is_front = is_front;
                }

                public String getIs_tax() {
                    return is_tax;
                }

                public void setIs_tax(String is_tax) {
                    this.is_tax = is_tax;
                }

                public String getList_order() {
                    return list_order;
                }

                public void setList_order(String list_order) {
                    this.list_order = list_order;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPid() {
                    return pid;
                }

                public void setPid(String pid) {
                    this.pid = pid;
                }

                public String getServ_com_id() {
                    return serv_com_id;
                }

                public void setServ_com_id(String serv_com_id) {
                    this.serv_com_id = serv_com_id;
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

                public String getTax_ratio() {
                    return tax_ratio;
                }

                public void setTax_ratio(String tax_ratio) {
                    this.tax_ratio = tax_ratio;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getUpdate_date() {
                    return update_date;
                }

                public void setUpdate_date(String update_date) {
                    this.update_date = update_date;
                }

                public String getUpdate_user() {
                    return update_user;
                }

                public void setUpdate_user(String update_user) {
                    this.update_user = update_user;
                }
            }

            public static class MobileInterfaceBean {
                /**
                 * 1856 : buy_order_list
                 * 1857 : store_in_list
                 */

                @SerializedName("1856")
                private String _$1856;
                @SerializedName("1857")
                private String _$1857;

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
                 * child : [{"a":"self_info","c":"admin_manage","child":[{"a":"public_edit_info","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"972","listorder":"0","name":"editinfo","parentid":"970"},{"a":"submit_bug","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1903","listorder":"0","name":"意见反馈","parentid":"970","url":""},{"a":"public_edit_pwd","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"971","listorder":"1","name":"editpwd","parentid":"970"}],"cname":"admininfo","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"970","listorder":"0","name":"admininfo","parentid":"10"}]
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
                     * child : [{"a":"public_edit_info","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"972","listorder":"0","name":"editinfo","parentid":"970"},{"a":"submit_bug","c":"dish","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"1903","listorder":"0","name":"意见反馈","parentid":"970","url":""},{"a":"public_edit_pwd","c":"admin_manage","data":"","data_leave":"/skin/AmazeUI/images/CAOZUO@3x.png","data_on":"","display":"1","id":"971","listorder":"1","name":"editpwd","parentid":"970"}]
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
