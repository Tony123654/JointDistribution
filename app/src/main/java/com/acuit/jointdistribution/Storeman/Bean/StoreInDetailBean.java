package com.acuit.jointdistribution.Storeman.Bean;

import java.io.Serializable;
import java.util.List;

/**
 * 类名: StoreInDetailBean <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/30 10:56 <p>
 * 描述: 入库单详情 封装类
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class StoreInDetailBean {

    /**
     * code : 200
     * msg : 执行成功！
     * data : [{"id":"2063","code":"RKD010817082415","com_id":"1","com_code":"zdyszx","com_name":"浙大饮食中心","dep_id":"1","dep_code":"01","dep_name":"第一餐饮中心（紫金港）","dep_id2":"15","dep_code2":"0108","dep_name2":"总仓","supply_id":"53","supply_code":"HZSCWLYXGS","supply_name":"杭州蔬菜物流有限公司","is_dash_back":"N","dash_back_code":null,"create_date":"2017-08-22 01:08:57","affair_type":"1","affair_brief":null,"dep_id3":"0","dep_code3":null,"dep_name3":null,"statis_num":"0.50","statis_money":"2.78","buy_money":"2.50","money_gap":"0.28","buy_user":"1","check_user":null,"entering_user":null,"brief":"","update_date":"2017-08-21 17:03:57","year":null,"month":null,"sign_date":"","list_count":null,"is_direct_out":"N","ljtrue":"0","status":"2","is_used":"0","is_del":"0","buy_order_id":"3717","store_in_date":"","return_num":"0.00","return_money":"0.00","rate_star":"0","rate_brief":"","from_where":"0","is_dash_backed":"N","request_id":"0","tax_money":"0.00","price_money":"0.00","balance_id":"0","is_paid":"0","origin_code":"","request_ids":"7123","plan_date":"1503334800","list":[{"id":"15407","store_in_id":"2063","code":"RKD01081708241501","stock_id":"58","stock_code":"1020200002","stock_name":"本地葱","unit_id":"6","cat_id":"38","cat_name":"果蔬类","buy_order_id":"3717","request_stock_id":"469116","order_amount":"0.50","already_in_amount":"0.00","left_in_amount":"0.50","dep_id":"15","dep_code":"0108","dep_name":"总仓","in_amount":"0.50","in_price":"5.5500","in_money":"2.5000","total_money":"2.7750","price_gap_ratio":"11.00","money_gap":"0.2750","cost_code":null,"cost_property":null,"budget":"支","hang_num":"0","buy_order_list_id":"28384","back_brief":"","pic_url":"","back_amount":"0.00","storage_unit":"6","unit_conv":"1.00","price_unit":"6","buy_price":"5.0000","unit":"千克"}],"contact_person":"杭州蔬菜","contact_phone":"13666666666","item_count":1,"need_dep_name":"","direct_info":{"can_direct_select":1,"direct_in_out":"1","direct_out_info":[{"dep_id":"9","dep_name":"东区食堂"}]}}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 2063
         * code : RKD010817082415
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
         * create_date : 2017-08-22 01:08:57
         * affair_type : 1
         * affair_brief : null
         * dep_id3 : 0
         * dep_code3 : null
         * dep_name3 : null
         * statis_num : 0.50
         * statis_money : 2.78
         * buy_money : 2.50
         * money_gap : 0.28
         * buy_user : 1
         * check_user : null
         * entering_user : null
         * brief :
         * update_date : 2017-08-21 17:03:57
         * year : null
         * month : null
         * sign_date :
         * list_count : null
         * is_direct_out : N
         * ljtrue : 0
         * status : 2
         * is_used : 0
         * is_del : 0
         * buy_order_id : 3717
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
         * request_ids : 7123
         * plan_date : 1503334800
         * list : [{"id":"15407","store_in_id":"2063","code":"RKD01081708241501","stock_id":"58","stock_code":"1020200002","stock_name":"本地葱","unit_id":"6","cat_id":"38","cat_name":"果蔬类","buy_order_id":"3717","request_stock_id":"469116","order_amount":"0.50","already_in_amount":"0.00","left_in_amount":"0.50","dep_id":"15","dep_code":"0108","dep_name":"总仓","in_amount":"0.50","in_price":"5.5500","in_money":"2.5000","total_money":"2.7750","price_gap_ratio":"11.00","money_gap":"0.2750","cost_code":null,"cost_property":null,"budget":"支","hang_num":"0","buy_order_list_id":"28384","back_brief":"","pic_url":"","back_amount":"0.00","storage_unit":"6","unit_conv":"1.00","price_unit":"6","buy_price":"5.0000","unit":"千克"}]
         * contact_person : 杭州蔬菜
         * contact_phone : 13666666666
         * item_count : 1
         * need_dep_name :
         * direct_info : {"can_direct_select":1,"direct_in_out":"1","direct_out_info":[{"dep_id":"9","dep_name":"东区食堂"}]}
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
        private String plan_date;
        private String contact_person;
        private String contact_phone;
        private int item_count;
        private String need_dep_name;
        private DirectInfoBean direct_info;
        private List<ListBean> list;

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

        public String getPlan_date() {
            return plan_date;
        }

        public void setPlan_date(String plan_date) {
            this.plan_date = plan_date;
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

        public int getItem_count() {
            return item_count;
        }

        public void setItem_count(int item_count) {
            this.item_count = item_count;
        }

        public String getNeed_dep_name() {
            return need_dep_name;
        }

        public void setNeed_dep_name(String need_dep_name) {
            this.need_dep_name = need_dep_name;
        }

        public DirectInfoBean getDirect_info() {
            return direct_info;
        }

        public void setDirect_info(DirectInfoBean direct_info) {
            this.direct_info = direct_info;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class DirectInfoBean {
            /**
             * can_direct_select : 1
             * direct_in_out : 1
             * direct_out_info : [{"dep_id":"9","dep_name":"东区食堂"}]
             */

            private int can_direct_select;
            private String direct_in_out;
            private List<DirectOutInfoBean> direct_out_info;

            public int getCan_direct_select() {
                return can_direct_select;
            }

            public void setCan_direct_select(int can_direct_select) {
                this.can_direct_select = can_direct_select;
            }

            public String getDirect_in_out() {
                return direct_in_out;
            }

            public void setDirect_in_out(String direct_in_out) {
                this.direct_in_out = direct_in_out;
            }

            public List<DirectOutInfoBean> getDirect_out_info() {
                return direct_out_info;
            }

            public void setDirect_out_info(List<DirectOutInfoBean> direct_out_info) {
                this.direct_out_info = direct_out_info;
            }

            public static class DirectOutInfoBean {
                /**
                 * dep_id : 9
                 * dep_name : 东区食堂
                 */

                private String dep_id;
                private String dep_name;

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
        }

        public static class ListBean implements Serializable{
            /**
             * id : 15407
             * store_in_id : 2063
             * code : RKD01081708241501
             * stock_id : 58
             * stock_code : 1020200002
             * stock_name : 本地葱
             * unit_id : 6
             * cat_id : 38
             * cat_name : 果蔬类
             * buy_order_id : 3717
             * request_stock_id : 469116
             * order_amount : 0.50
             * already_in_amount : 0.00
             * left_in_amount : 0.50
             * dep_id : 15
             * dep_code : 0108
             * dep_name : 总仓
             * in_amount : 0.50
             * in_price : 5.5500
             * in_money : 2.5000
             * total_money : 2.7750
             * price_gap_ratio : 11.00
             * money_gap : 0.2750
             * cost_code : null
             * cost_property : null
             * budget : 支
             * hang_num : 0
             * buy_order_list_id : 28384
             * back_brief :
             * pic_url :
             * back_amount : 0.00
             * storage_unit : 6
             * unit_conv : 1.00
             * price_unit : 6
             * buy_price : 5.0000
             * unit : 千克
             */

            private String id;
            private String store_in_id;
            private String code;
            private String stock_id;
            private String stock_code;
            private String stock_name;
            private String unit_id;
            private String cat_id;
            private String cat_name;
            private String buy_order_id;
            private String request_stock_id;
            private String order_amount;
            private String already_in_amount;
            private String left_in_amount;
            private String dep_id;
            private String dep_code;
            private String dep_name;
            private String in_amount;
            private String in_price;
            private String in_money;
            private String total_money;
            private String price_gap_ratio;
            private String money_gap;
            private Object cost_code;
            private Object cost_property;
            private String budget;
            private String hang_num;
            private String buy_order_list_id;
            private String back_brief;
            private String pic_url;
            private String back_amount;
            private String storage_unit;
            private String unit_conv;
            private String price_unit;
            private String buy_price;
            private String unit;

            @Override
            public String toString() {
                return "ListBean{" +
                        "id='" + id + '\'' +
                        ", store_in_id='" + store_in_id + '\'' +
                        ", code='" + code + '\'' +
                        ", stock_id='" + stock_id + '\'' +
                        ", stock_code='" + stock_code + '\'' +
                        ", stock_name='" + stock_name + '\'' +
                        ", unit_id='" + unit_id + '\'' +
                        ", cat_id='" + cat_id + '\'' +
                        ", cat_name='" + cat_name + '\'' +
                        ", buy_order_id='" + buy_order_id + '\'' +
                        ", request_stock_id='" + request_stock_id + '\'' +
                        ", order_amount='" + order_amount + '\'' +
                        ", already_in_amount='" + already_in_amount + '\'' +
                        ", left_in_amount='" + left_in_amount + '\'' +
                        ", dep_id='" + dep_id + '\'' +
                        ", dep_code='" + dep_code + '\'' +
                        ", dep_name='" + dep_name + '\'' +
                        ", in_amount='" + in_amount + '\'' +
                        ", in_price='" + in_price + '\'' +
                        ", in_money='" + in_money + '\'' +
                        ", total_money='" + total_money + '\'' +
                        ", price_gap_ratio='" + price_gap_ratio + '\'' +
                        ", money_gap='" + money_gap + '\'' +
                        ", cost_code=" + cost_code +
                        ", cost_property=" + cost_property +
                        ", budget='" + budget + '\'' +
                        ", hang_num='" + hang_num + '\'' +
                        ", buy_order_list_id='" + buy_order_list_id + '\'' +
                        ", back_brief='" + back_brief + '\'' +
                        ", pic_url='" + pic_url + '\'' +
                        ", back_amount='" + back_amount + '\'' +
                        ", storage_unit='" + storage_unit + '\'' +
                        ", unit_conv='" + unit_conv + '\'' +
                        ", price_unit='" + price_unit + '\'' +
                        ", buy_price='" + buy_price + '\'' +
                        ", unit='" + unit + '\'' +
                        '}';
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getStore_in_id() {
                return store_in_id;
            }

            public void setStore_in_id(String store_in_id) {
                this.store_in_id = store_in_id;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getStock_id() {
                return stock_id;
            }

            public void setStock_id(String stock_id) {
                this.stock_id = stock_id;
            }

            public String getStock_code() {
                return stock_code;
            }

            public void setStock_code(String stock_code) {
                this.stock_code = stock_code;
            }

            public String getStock_name() {
                return stock_name;
            }

            public void setStock_name(String stock_name) {
                this.stock_name = stock_name;
            }

            public String getUnit_id() {
                return unit_id;
            }

            public void setUnit_id(String unit_id) {
                this.unit_id = unit_id;
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

            public String getBuy_order_id() {
                return buy_order_id;
            }

            public void setBuy_order_id(String buy_order_id) {
                this.buy_order_id = buy_order_id;
            }

            public String getRequest_stock_id() {
                return request_stock_id;
            }

            public void setRequest_stock_id(String request_stock_id) {
                this.request_stock_id = request_stock_id;
            }

            public String getOrder_amount() {
                return order_amount;
            }

            public void setOrder_amount(String order_amount) {
                this.order_amount = order_amount;
            }

            public String getAlready_in_amount() {
                return already_in_amount;
            }

            public void setAlready_in_amount(String already_in_amount) {
                this.already_in_amount = already_in_amount;
            }

            public String getLeft_in_amount() {
                return left_in_amount;
            }

            public void setLeft_in_amount(String left_in_amount) {
                this.left_in_amount = left_in_amount;
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

            public String getIn_amount() {
                return in_amount;
            }

            public void setIn_amount(String in_amount) {
                this.in_amount = in_amount;
            }

            public String getIn_price() {
                return in_price;
            }

            public void setIn_price(String in_price) {
                this.in_price = in_price;
            }

            public String getIn_money() {
                return in_money;
            }

            public void setIn_money(String in_money) {
                this.in_money = in_money;
            }

            public String getTotal_money() {
                return total_money;
            }

            public void setTotal_money(String total_money) {
                this.total_money = total_money;
            }

            public String getPrice_gap_ratio() {
                return price_gap_ratio;
            }

            public void setPrice_gap_ratio(String price_gap_ratio) {
                this.price_gap_ratio = price_gap_ratio;
            }

            public String getMoney_gap() {
                return money_gap;
            }

            public void setMoney_gap(String money_gap) {
                this.money_gap = money_gap;
            }

            public Object getCost_code() {
                return cost_code;
            }

            public void setCost_code(Object cost_code) {
                this.cost_code = cost_code;
            }

            public Object getCost_property() {
                return cost_property;
            }

            public void setCost_property(Object cost_property) {
                this.cost_property = cost_property;
            }

            public String getBudget() {
                return budget;
            }

            public void setBudget(String budget) {
                this.budget = budget;
            }

            public String getHang_num() {
                return hang_num;
            }

            public void setHang_num(String hang_num) {
                this.hang_num = hang_num;
            }

            public String getBuy_order_list_id() {
                return buy_order_list_id;
            }

            public void setBuy_order_list_id(String buy_order_list_id) {
                this.buy_order_list_id = buy_order_list_id;
            }

            public String getBack_brief() {
                return back_brief;
            }

            public void setBack_brief(String back_brief) {
                this.back_brief = back_brief;
            }

            public String getPic_url() {
                return pic_url;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
            }

            public String getBack_amount() {
                return back_amount;
            }

            public void setBack_amount(String back_amount) {
                this.back_amount = back_amount;
            }

            public String getStorage_unit() {
                return storage_unit;
            }

            public void setStorage_unit(String storage_unit) {
                this.storage_unit = storage_unit;
            }

            public String getUnit_conv() {
                return unit_conv;
            }

            public void setUnit_conv(String unit_conv) {
                this.unit_conv = unit_conv;
            }

            public String getPrice_unit() {
                return price_unit;
            }

            public void setPrice_unit(String price_unit) {
                this.price_unit = price_unit;
            }

            public String getBuy_price() {
                return buy_price;
            }

            public void setBuy_price(String buy_price) {
                this.buy_price = buy_price;
            }

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }
        }
    }
}
