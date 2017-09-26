package com.acuit.jointdistribution.Storeman.Bean;

import java.util.List;

/**
 * 类名: StoreInfoListBean <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/29 14:09 <p>
 * 描述:  入库单列表(某供应商)
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class StoreInListBySupplierBean {

    /**
     * code : 200
     * msg : 执行成功！
     * data : {"total":"132","store_in_list":[{"id":"2078","code":"RKD010817082430","com_id":"1","com_code":"zdyszx","com_name":"浙大饮食中心","dep_id":"1","dep_code":"01","dep_name":"第一餐饮中心（紫金港）","dep_id2":"15","dep_code2":"0108","dep_name2":"总仓","supply_id":"53","supply_code":"HZSCWLYXGS","supply_name":"杭州蔬菜物流有限公司","is_dash_back":"N","dash_back_code":null,"create_date":"2017-08-28","affair_type":"采购入库","affair_brief":null,"dep_id3":"0","dep_code3":null,"dep_name3":null,"statis_num":"4.00","statis_money":"30.53","buy_money":"27.50","money_gap":"3.03","buy_user":"14155","check_user":null,"entering_user":null,"brief":"","update_date":"2017-08-28 16:34:24","year":null,"month":null,"sign_date":"","list_count":null,"is_direct_out":"N","ljtrue":"0","status":"2","is_used":"0","is_del":"0","buy_order_id":"3732","store_in_date":"","return_num":"0.00","return_money":"0.00","rate_star":"0","rate_brief":"","from_where":"0","is_dash_backed":"N","request_id":"0","tax_money":"0.00","price_money":"0.00","balance_id":"0","is_paid":"0","origin_code":"","request_ids":"7155","plan_date":1503849600,"priv":{"priv_view":1,"priv_add":1,"priv_edit":1,"priv_set_in_use":0,"priv_delete":1,"priv_audit":0,"priv_confirm":1,"priv_request_store_out":0,"priv_purity_store_out":0},"is_new":0,"plan_date_str":"2017-08-28","buy_user_name":"测试","com_brief_name":"","dep_brief_name":"紫金港总仓","dep2_address":"紫金港总仓","need_dep_name":"总仓"},{"id":"2065","code":"RKD010817082417","com_id":"1","com_code":"zdyszx","com_name":"浙大饮食中心","dep_id":"1","dep_code":"01","dep_name":"第一餐饮中心（紫金港）","dep_id2":"15","dep_code2":"0108","dep_name2":"总仓","supply_id":"53","supply_code":"HZSCWLYXGS","supply_name":"杭州蔬菜物流有限公司","is_dash_back":"N","dash_back_code":null,"create_date":"2017-08-21","affair_type":"采购入库","affair_brief":null,"dep_id3":"9","dep_code3":"0102","dep_name3":"东区食堂","statis_num":"2.00","statis_money":"21.59","buy_money":"19.45","money_gap":"2.14","buy_user":"1","check_user":"1","entering_user":"1","brief":"","update_date":"0000-00-00 00:00:00","year":"2017","month":"08","sign_date":"","list_count":null,"is_direct_out":"Y","ljtrue":"0","status":"4","is_used":"1","is_del":"0","buy_order_id":"3720","store_in_date":"2017-08-21 18:05:14","return_num":"0.00","return_money":"0.00","rate_star":"0","rate_brief":"","from_where":"0","is_dash_backed":"N","request_id":"0","tax_money":"0.00","price_money":"0.00","balance_id":"46","is_paid":"1","origin_code":"","request_ids":"7125","plan_date":1503363600,"priv":{"priv_view":1,"priv_add":1,"priv_edit":1,"priv_set_in_use":0,"priv_delete":0,"priv_audit":0,"priv_confirm":0,"priv_request_store_out":0,"priv_purity_store_out":0},"is_new":0,"plan_date_str":"2017-08-22","buy_user_name":"系统管理员","check_user_name":"系统管理员","entering_user_name":"系统管理员","com_brief_name":"","dep_brief_name":"紫金港总仓","dep2_address":"紫金港总仓","need_dep_name":"东区"},{"id":"2064","code":"RKD010817082416","com_id":"1","com_code":"zdyszx","com_name":"浙大饮食中心","dep_id":"1","dep_code":"01","dep_name":"第一餐饮中心（紫金港）","dep_id2":"15","dep_code2":"0108","dep_name2":"总仓","supply_id":"53","supply_code":"HZSCWLYXGS","supply_name":"杭州蔬菜物流有限公司","is_dash_back":"N","dash_back_code":null,"create_date":"2017-08-21","affair_type":"采购入库","affair_brief":null,"dep_id3":"10","dep_code3":"0103","dep_name3":"西区食堂","statis_num":"4.50","statis_money":"14.32","buy_money":"12.90","money_gap":"1.42","buy_user":"1","check_user":"1","entering_user":"1","brief":"","update_date":"0000-00-00 00:00:00","year":"2017","month":"08","sign_date":"","list_count":null,"is_direct_out":"Y","ljtrue":"0","status":"4","is_used":"1","is_del":"0","buy_order_id":"3718","store_in_date":"2017-08-21 17:29:32","return_num":"0.00","return_money":"0.00","rate_star":"0","rate_brief":"","from_where":"0","is_dash_backed":"N","request_id":"0","tax_money":"0.00","price_money":"0.00","balance_id":"45","is_paid":"1","origin_code":"","request_ids":"7124","plan_date":1503363600,"priv":{"priv_view":1,"priv_add":1,"priv_edit":1,"priv_set_in_use":0,"priv_delete":0,"priv_audit":0,"priv_confirm":0,"priv_request_store_out":0,"priv_purity_store_out":0},"is_new":0,"plan_date_str":"2017-08-22","buy_user_name":"系统管理员","check_user_name":"系统管理员","entering_user_name":"系统管理员","com_brief_name":"","dep_brief_name":"紫金港总仓","dep2_address":"紫金港总仓","need_dep_name":"西区"}]}
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
         * total : 132
         * store_in_list : [{"id":"2078","code":"RKD010817082430","com_id":"1","com_code":"zdyszx","com_name":"浙大饮食中心","dep_id":"1","dep_code":"01","dep_name":"第一餐饮中心（紫金港）","dep_id2":"15","dep_code2":"0108","dep_name2":"总仓","supply_id":"53","supply_code":"HZSCWLYXGS","supply_name":"杭州蔬菜物流有限公司","is_dash_back":"N","dash_back_code":null,"create_date":"2017-08-28","affair_type":"采购入库","affair_brief":null,"dep_id3":"0","dep_code3":null,"dep_name3":null,"statis_num":"4.00","statis_money":"30.53","buy_money":"27.50","money_gap":"3.03","buy_user":"14155","check_user":null,"entering_user":null,"brief":"","update_date":"2017-08-28 16:34:24","year":null,"month":null,"sign_date":"","list_count":null,"is_direct_out":"N","ljtrue":"0","status":"2","is_used":"0","is_del":"0","buy_order_id":"3732","store_in_date":"","return_num":"0.00","return_money":"0.00","rate_star":"0","rate_brief":"","from_where":"0","is_dash_backed":"N","request_id":"0","tax_money":"0.00","price_money":"0.00","balance_id":"0","is_paid":"0","origin_code":"","request_ids":"7155","plan_date":1503849600,"priv":{"priv_view":1,"priv_add":1,"priv_edit":1,"priv_set_in_use":0,"priv_delete":1,"priv_audit":0,"priv_confirm":1,"priv_request_store_out":0,"priv_purity_store_out":0},"is_new":0,"plan_date_str":"2017-08-28","buy_user_name":"测试","com_brief_name":"","dep_brief_name":"紫金港总仓","dep2_address":"紫金港总仓","need_dep_name":"总仓"},{"id":"2065","code":"RKD010817082417","com_id":"1","com_code":"zdyszx","com_name":"浙大饮食中心","dep_id":"1","dep_code":"01","dep_name":"第一餐饮中心（紫金港）","dep_id2":"15","dep_code2":"0108","dep_name2":"总仓","supply_id":"53","supply_code":"HZSCWLYXGS","supply_name":"杭州蔬菜物流有限公司","is_dash_back":"N","dash_back_code":null,"create_date":"2017-08-21","affair_type":"采购入库","affair_brief":null,"dep_id3":"9","dep_code3":"0102","dep_name3":"东区食堂","statis_num":"2.00","statis_money":"21.59","buy_money":"19.45","money_gap":"2.14","buy_user":"1","check_user":"1","entering_user":"1","brief":"","update_date":"0000-00-00 00:00:00","year":"2017","month":"08","sign_date":"","list_count":null,"is_direct_out":"Y","ljtrue":"0","status":"4","is_used":"1","is_del":"0","buy_order_id":"3720","store_in_date":"2017-08-21 18:05:14","return_num":"0.00","return_money":"0.00","rate_star":"0","rate_brief":"","from_where":"0","is_dash_backed":"N","request_id":"0","tax_money":"0.00","price_money":"0.00","balance_id":"46","is_paid":"1","origin_code":"","request_ids":"7125","plan_date":1503363600,"priv":{"priv_view":1,"priv_add":1,"priv_edit":1,"priv_set_in_use":0,"priv_delete":0,"priv_audit":0,"priv_confirm":0,"priv_request_store_out":0,"priv_purity_store_out":0},"is_new":0,"plan_date_str":"2017-08-22","buy_user_name":"系统管理员","check_user_name":"系统管理员","entering_user_name":"系统管理员","com_brief_name":"","dep_brief_name":"紫金港总仓","dep2_address":"紫金港总仓","need_dep_name":"东区"},{"id":"2064","code":"RKD010817082416","com_id":"1","com_code":"zdyszx","com_name":"浙大饮食中心","dep_id":"1","dep_code":"01","dep_name":"第一餐饮中心（紫金港）","dep_id2":"15","dep_code2":"0108","dep_name2":"总仓","supply_id":"53","supply_code":"HZSCWLYXGS","supply_name":"杭州蔬菜物流有限公司","is_dash_back":"N","dash_back_code":null,"create_date":"2017-08-21","affair_type":"采购入库","affair_brief":null,"dep_id3":"10","dep_code3":"0103","dep_name3":"西区食堂","statis_num":"4.50","statis_money":"14.32","buy_money":"12.90","money_gap":"1.42","buy_user":"1","check_user":"1","entering_user":"1","brief":"","update_date":"0000-00-00 00:00:00","year":"2017","month":"08","sign_date":"","list_count":null,"is_direct_out":"Y","ljtrue":"0","status":"4","is_used":"1","is_del":"0","buy_order_id":"3718","store_in_date":"2017-08-21 17:29:32","return_num":"0.00","return_money":"0.00","rate_star":"0","rate_brief":"","from_where":"0","is_dash_backed":"N","request_id":"0","tax_money":"0.00","price_money":"0.00","balance_id":"45","is_paid":"1","origin_code":"","request_ids":"7124","plan_date":1503363600,"priv":{"priv_view":1,"priv_add":1,"priv_edit":1,"priv_set_in_use":0,"priv_delete":0,"priv_audit":0,"priv_confirm":0,"priv_request_store_out":0,"priv_purity_store_out":0},"is_new":0,"plan_date_str":"2017-08-22","buy_user_name":"系统管理员","check_user_name":"系统管理员","entering_user_name":"系统管理员","com_brief_name":"","dep_brief_name":"紫金港总仓","dep2_address":"紫金港总仓","need_dep_name":"西区"}]
         */

        private String total;
        private List<StoreInListBean> store_in_list;

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public List<StoreInListBean> getStore_in_list() {
            return store_in_list;
        }

        public void setStore_in_list(List<StoreInListBean> store_in_list) {
            this.store_in_list = store_in_list;
        }

        public static class StoreInListBean {
            /**
             * id : 2078
             * code : RKD010817082430
             * com_id : 1
             * com_code : zdyszx
             * com_name : 浙大饮食中心
             * dep_id : 1
             * dep_code : 01
             * dep_name : 第一餐饮中心（紫金港）
             * dep_id2 : 15
             * dep_code2 : 0108
             * dep_name2 : 总仓
             * supply_id : 53
             * supply_code : HZSCWLYXGS
             * supply_name : 杭州蔬菜物流有限公司
             * is_dash_back : N
             * dash_back_code : null
             * create_date : 2017-08-28
             * affair_type : 采购入库
             * affair_brief : null
             * dep_id3 : 0
             * dep_code3 : null
             * dep_name3 : null
             * statis_num : 4.00
             * statis_money : 30.53
             * buy_money : 27.50
             * money_gap : 3.03
             * buy_user : 14155
             * check_user : null
             * entering_user : null
             * brief :
             * update_date : 2017-08-28 16:34:24
             * year : null
             * month : null
             * sign_date :
             * list_count : null
             * is_direct_out : N
             * ljtrue : 0
             * status : 2
             * is_used : 0
             * is_del : 0
             * buy_order_id : 3732
             * store_in_date :
             * return_num : 0.00
             * return_money : 0.00
             * rate_star : 0
             * rate_brief :
             * from_where : 0
             * is_dash_backed : N
             * request_id : 0
             * tax_money : 0.00
             * price_money : 0.00
             * balance_id : 0
             * is_paid : 0
             * origin_code :
             * request_ids : 7155
             * plan_date : 1503849600
             * priv : {"priv_view":1,"priv_add":1,"priv_edit":1,"priv_set_in_use":0,"priv_delete":1,"priv_audit":0,"priv_confirm":1,"priv_request_store_out":0,"priv_purity_store_out":0}
             * is_new : 0
             * plan_date_str : 2017-08-28
             * buy_user_name : 测试
             * com_brief_name :
             * dep_brief_name : 紫金港总仓
             * dep2_address : 紫金港总仓
             * need_dep_name : 总仓
             * check_user_name : 系统管理员
             * entering_user_name : 系统管理员
             */

            private String id;
            private String code;
            private String com_id;
            private String com_code;
            private String com_name;
            private String dep_id;
            private String dep_code;
            private String dep_name;
            private String dep_id2;
            private String dep_code2;
            private String dep_name2;
            private String supply_id;
            private String supply_code;
            private String supply_name;
            private String is_dash_back;
            private Object dash_back_code;
            private String create_date;
            private String affair_type;
            private Object affair_brief;
            private String dep_id3;
            private Object dep_code3;
            private Object dep_name3;
            private String statis_num;
            private String statis_money;
            private String buy_money;
            private String money_gap;
            private String buy_user;
            private Object check_user;
            private Object entering_user;
            private String brief;
            private String update_date;
            private Object year;
            private Object month;
            private String sign_date;
            private Object list_count;
            private String is_direct_out;
            private String ljtrue;
            private String status;
            private String is_used;
            private String is_del;
            private String buy_order_id;
            private String store_in_date;
            private String return_num;
            private String return_money;
            private String rate_star;
            private String rate_brief;
            private String from_where;
            private String is_dash_backed;
            private String request_id;
            private String tax_money;
            private String price_money;
            private String balance_id;
            private String is_paid;
            private String origin_code;
            private String request_ids;
            private int plan_date;
            private PrivBean priv;
            private int is_new;
            private String plan_date_str;
            private String buy_user_name;
            private String com_brief_name;
            private String dep_brief_name;
            private String dep2_address;
            private String need_dep_name;
            private String check_user_name;
            private String entering_user_name;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getCom_id() {
                return com_id;
            }

            public void setCom_id(String com_id) {
                this.com_id = com_id;
            }

            public String getCom_code() {
                return com_code;
            }

            public void setCom_code(String com_code) {
                this.com_code = com_code;
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

            public String getDep_code() {
                return dep_code;
            }

            public void setDep_code(String dep_code) {
                this.dep_code = dep_code;
            }

            public String getDep_name() {
                return dep_name;
            }

            public void setDep_name(String dep_name) {
                this.dep_name = dep_name;
            }

            public String getDep_id2() {
                return dep_id2;
            }

            public void setDep_id2(String dep_id2) {
                this.dep_id2 = dep_id2;
            }

            public String getDep_code2() {
                return dep_code2;
            }

            public void setDep_code2(String dep_code2) {
                this.dep_code2 = dep_code2;
            }

            public String getDep_name2() {
                return dep_name2;
            }

            public void setDep_name2(String dep_name2) {
                this.dep_name2 = dep_name2;
            }

            public String getSupply_id() {
                return supply_id;
            }

            public void setSupply_id(String supply_id) {
                this.supply_id = supply_id;
            }

            public String getSupply_code() {
                return supply_code;
            }

            public void setSupply_code(String supply_code) {
                this.supply_code = supply_code;
            }

            public String getSupply_name() {
                return supply_name;
            }

            public void setSupply_name(String supply_name) {
                this.supply_name = supply_name;
            }

            public String getIs_dash_back() {
                return is_dash_back;
            }

            public void setIs_dash_back(String is_dash_back) {
                this.is_dash_back = is_dash_back;
            }

            public Object getDash_back_code() {
                return dash_back_code;
            }

            public void setDash_back_code(Object dash_back_code) {
                this.dash_back_code = dash_back_code;
            }

            public String getCreate_date() {
                return create_date;
            }

            public void setCreate_date(String create_date) {
                this.create_date = create_date;
            }

            public String getAffair_type() {
                return affair_type;
            }

            public void setAffair_type(String affair_type) {
                this.affair_type = affair_type;
            }

            public Object getAffair_brief() {
                return affair_brief;
            }

            public void setAffair_brief(Object affair_brief) {
                this.affair_brief = affair_brief;
            }

            public String getDep_id3() {
                return dep_id3;
            }

            public void setDep_id3(String dep_id3) {
                this.dep_id3 = dep_id3;
            }

            public Object getDep_code3() {
                return dep_code3;
            }

            public void setDep_code3(Object dep_code3) {
                this.dep_code3 = dep_code3;
            }

            public Object getDep_name3() {
                return dep_name3;
            }

            public void setDep_name3(Object dep_name3) {
                this.dep_name3 = dep_name3;
            }

            public String getStatis_num() {
                return statis_num;
            }

            public void setStatis_num(String statis_num) {
                this.statis_num = statis_num;
            }

            public String getStatis_money() {
                return statis_money;
            }

            public void setStatis_money(String statis_money) {
                this.statis_money = statis_money;
            }

            public String getBuy_money() {
                return buy_money;
            }

            public void setBuy_money(String buy_money) {
                this.buy_money = buy_money;
            }

            public String getMoney_gap() {
                return money_gap;
            }

            public void setMoney_gap(String money_gap) {
                this.money_gap = money_gap;
            }

            public String getBuy_user() {
                return buy_user;
            }

            public void setBuy_user(String buy_user) {
                this.buy_user = buy_user;
            }

            public Object getCheck_user() {
                return check_user;
            }

            public void setCheck_user(Object check_user) {
                this.check_user = check_user;
            }

            public Object getEntering_user() {
                return entering_user;
            }

            public void setEntering_user(Object entering_user) {
                this.entering_user = entering_user;
            }

            public String getBrief() {
                return brief;
            }

            public void setBrief(String brief) {
                this.brief = brief;
            }

            public String getUpdate_date() {
                return update_date;
            }

            public void setUpdate_date(String update_date) {
                this.update_date = update_date;
            }

            public Object getYear() {
                return year;
            }

            public void setYear(Object year) {
                this.year = year;
            }

            public Object getMonth() {
                return month;
            }

            public void setMonth(Object month) {
                this.month = month;
            }

            public String getSign_date() {
                return sign_date;
            }

            public void setSign_date(String sign_date) {
                this.sign_date = sign_date;
            }

            public Object getList_count() {
                return list_count;
            }

            public void setList_count(Object list_count) {
                this.list_count = list_count;
            }

            public String getIs_direct_out() {
                return is_direct_out;
            }

            public void setIs_direct_out(String is_direct_out) {
                this.is_direct_out = is_direct_out;
            }

            public String getLjtrue() {
                return ljtrue;
            }

            public void setLjtrue(String ljtrue) {
                this.ljtrue = ljtrue;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getIs_used() {
                return is_used;
            }

            public void setIs_used(String is_used) {
                this.is_used = is_used;
            }

            public String getIs_del() {
                return is_del;
            }

            public void setIs_del(String is_del) {
                this.is_del = is_del;
            }

            public String getBuy_order_id() {
                return buy_order_id;
            }

            public void setBuy_order_id(String buy_order_id) {
                this.buy_order_id = buy_order_id;
            }

            public String getStore_in_date() {
                return store_in_date;
            }

            public void setStore_in_date(String store_in_date) {
                this.store_in_date = store_in_date;
            }

            public String getReturn_num() {
                return return_num;
            }

            public void setReturn_num(String return_num) {
                this.return_num = return_num;
            }

            public String getReturn_money() {
                return return_money;
            }

            public void setReturn_money(String return_money) {
                this.return_money = return_money;
            }

            public String getRate_star() {
                return rate_star;
            }

            public void setRate_star(String rate_star) {
                this.rate_star = rate_star;
            }

            public String getRate_brief() {
                return rate_brief;
            }

            public void setRate_brief(String rate_brief) {
                this.rate_brief = rate_brief;
            }

            public String getFrom_where() {
                return from_where;
            }

            public void setFrom_where(String from_where) {
                this.from_where = from_where;
            }

            public String getIs_dash_backed() {
                return is_dash_backed;
            }

            public void setIs_dash_backed(String is_dash_backed) {
                this.is_dash_backed = is_dash_backed;
            }

            public String getRequest_id() {
                return request_id;
            }

            public void setRequest_id(String request_id) {
                this.request_id = request_id;
            }

            public String getTax_money() {
                return tax_money;
            }

            public void setTax_money(String tax_money) {
                this.tax_money = tax_money;
            }

            public String getPrice_money() {
                return price_money;
            }

            public void setPrice_money(String price_money) {
                this.price_money = price_money;
            }

            public String getBalance_id() {
                return balance_id;
            }

            public void setBalance_id(String balance_id) {
                this.balance_id = balance_id;
            }

            public String getIs_paid() {
                return is_paid;
            }

            public void setIs_paid(String is_paid) {
                this.is_paid = is_paid;
            }

            public String getOrigin_code() {
                return origin_code;
            }

            public void setOrigin_code(String origin_code) {
                this.origin_code = origin_code;
            }

            public String getRequest_ids() {
                return request_ids;
            }

            public void setRequest_ids(String request_ids) {
                this.request_ids = request_ids;
            }

            public int getPlan_date() {
                return plan_date;
            }

            public void setPlan_date(int plan_date) {
                this.plan_date = plan_date;
            }

            public PrivBean getPriv() {
                return priv;
            }

            public void setPriv(PrivBean priv) {
                this.priv = priv;
            }

            public int getIs_new() {
                return is_new;
            }

            public void setIs_new(int is_new) {
                this.is_new = is_new;
            }

            public String getPlan_date_str() {
                return plan_date_str;
            }

            public void setPlan_date_str(String plan_date_str) {
                this.plan_date_str = plan_date_str;
            }

            public String getBuy_user_name() {
                return buy_user_name;
            }

            public void setBuy_user_name(String buy_user_name) {
                this.buy_user_name = buy_user_name;
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

            public String getDep2_address() {
                return dep2_address;
            }

            public void setDep2_address(String dep2_address) {
                this.dep2_address = dep2_address;
            }

            public String getNeed_dep_name() {
                return need_dep_name;
            }

            public void setNeed_dep_name(String need_dep_name) {
                this.need_dep_name = need_dep_name;
            }

            public String getCheck_user_name() {
                return check_user_name;
            }

            public void setCheck_user_name(String check_user_name) {
                this.check_user_name = check_user_name;
            }

            public String getEntering_user_name() {
                return entering_user_name;
            }

            public void setEntering_user_name(String entering_user_name) {
                this.entering_user_name = entering_user_name;
            }

            public static class PrivBean {
                /**
                 * priv_view : 1
                 * priv_add : 1
                 * priv_edit : 1
                 * priv_set_in_use : 0
                 * priv_delete : 1
                 * priv_audit : 0
                 * priv_confirm : 1
                 * priv_request_store_out : 0
                 * priv_purity_store_out : 0
                 */

                private int priv_view;
                private int priv_add;
                private int priv_edit;
                private int priv_set_in_use;
                private int priv_delete;
                private int priv_audit;
                private int priv_confirm;
                private int priv_request_store_out;
                private int priv_purity_store_out;

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

                public int getPriv_request_store_out() {
                    return priv_request_store_out;
                }

                public void setPriv_request_store_out(int priv_request_store_out) {
                    this.priv_request_store_out = priv_request_store_out;
                }

                public int getPriv_purity_store_out() {
                    return priv_purity_store_out;
                }

                public void setPriv_purity_store_out(int priv_purity_store_out) {
                    this.priv_purity_store_out = priv_purity_store_out;
                }
            }
        }
    }
}
