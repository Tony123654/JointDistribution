package com.acuit.jointdistribution.Supplier.Domain;

import java.util.List;

/**
 * 类名: AlterOrderInfoBean <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/9/18 0018 11:18 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class AlterOrderInfoBean {

    /**
     * code : 200
     * data : {"alter_code":"CGBG1709140114","alter_create_date":"2017-09-18","alter_create_user":"1","alter_flag":"2","alter_id":"80","alter_status":"2","cat_code":"","cat_id":"38","cat_name":"果蔬类","code":"CGDD1709149532","com_code":"zdyszx","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-09-18","create_user":"1","dep_root_code":"01","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","end_date":"0","id":"3792","is_del":"0","is_used":"0","list":[{"alter_id":"80","amount":"1902.00","big_region_id":"0","buy_amount":"100.00","buy_order_id":"0","buy_order_list_id":"28530","dep_code":"","dep_id":"0","dep_name":"","e_amount":"2002.00","id":"135","money":"18069.00","price":"9.50","region_id":"0","request_stock_id":"0","s_amount":"100.00","status":"0","stock_code":"1020100004","stock_id":"23","stock_name":"刀豆","sub_cat_code":"","sub_cat_id":"0","sub_cat_name":"大众食品","unit2_id":"0","unit_conv":"0","unit_id":"0","unit_name":"千克"},{"alter_id":"80","amount":"-801.00","big_region_id":"0","buy_amount":"1001.00","buy_order_id":"0","buy_order_list_id":"28531","dep_code":"","dep_id":"0","dep_name":"","e_amount":"200.00","id":"136","money":"-2563.20","price":"3.20","region_id":"0","request_stock_id":"0","s_amount":"1001.00","status":"0","stock_code":"1020300018","stock_id":"116","stock_name":"藕","sub_cat_code":"","sub_cat_id":"0","sub_cat_name":"大众食品","unit2_id":"0","unit_conv":"0","unit_id":"0","unit_name":"千克"}],"memo":"","order_date":"0","order_id":"2777","plan_date":"2017-09-18 11:13","status":"5","supply_code":"HZSCWLYXGS","supply_id":"53","supply_name":"杭州蔬菜物流有限公司","total_amount":"1101.00","total_money":"4153.20","update_date":"2017-09-14 15:48:32"}
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
         * alter_code : CGBG1709140114
         * alter_create_date : 2017-09-18
         * alter_create_user : 1
         * alter_flag : 2
         * alter_id : 80
         * alter_status : 2
         * cat_code :
         * cat_id : 38
         * cat_name : 果蔬类
         * code : CGDD1709149532
         * com_code : zdyszx
         * com_id : 1
         * com_name : 浙大饮食中心
         * create_date : 2017-09-18
         * create_user : 1
         * dep_root_code : 01
         * dep_root_id : 1
         * dep_root_name : 第一餐饮中心（紫金港）
         * end_date : 0
         * id : 3792
         * is_del : 0
         * is_used : 0
         * list : [{"alter_id":"80","amount":"1902.00","big_region_id":"0","buy_amount":"100.00","buy_order_id":"0","buy_order_list_id":"28530","dep_code":"","dep_id":"0","dep_name":"","e_amount":"2002.00","id":"135","money":"18069.00","price":"9.50","region_id":"0","request_stock_id":"0","s_amount":"100.00","status":"0","stock_code":"1020100004","stock_id":"23","stock_name":"刀豆","sub_cat_code":"","sub_cat_id":"0","sub_cat_name":"大众食品","unit2_id":"0","unit_conv":"0","unit_id":"0","unit_name":"千克"},{"alter_id":"80","amount":"-801.00","big_region_id":"0","buy_amount":"1001.00","buy_order_id":"0","buy_order_list_id":"28531","dep_code":"","dep_id":"0","dep_name":"","e_amount":"200.00","id":"136","money":"-2563.20","price":"3.20","region_id":"0","request_stock_id":"0","s_amount":"1001.00","status":"0","stock_code":"1020300018","stock_id":"116","stock_name":"藕","sub_cat_code":"","sub_cat_id":"0","sub_cat_name":"大众食品","unit2_id":"0","unit_conv":"0","unit_id":"0","unit_name":"千克"}]
         * memo :
         * order_date : 0
         * order_id : 2777
         * plan_date : 2017-09-18 11:13
         * status : 5
         * supply_code : HZSCWLYXGS
         * supply_id : 53
         * supply_name : 杭州蔬菜物流有限公司
         * total_amount : 1101.00
         * total_money : 4153.20
         * update_date : 2017-09-14 15:48:32
         */

        private String alter_code;
        private String alter_create_date;
        private String alter_create_user;
        private String alter_flag;
        private String alter_id;
        private String alter_status;
        private String cat_code;
        private String cat_id;
        private String cat_name;
        private String code;
        private String com_code;
        private String com_id;
        private String com_name;
        private String create_date;
        private String create_user;
        private String dep_root_code;
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
        private String status;
        private String supply_code;
        private String supply_id;
        private String supply_name;
        private String total_amount;
        private String total_money;
        private String update_date;
        private List<ListBean> list;

        public String getAlter_code() {
            return alter_code;
        }

        public void setAlter_code(String alter_code) {
            this.alter_code = alter_code;
        }

        public String getAlter_create_date() {
            return alter_create_date;
        }

        public void setAlter_create_date(String alter_create_date) {
            this.alter_create_date = alter_create_date;
        }

        public String getAlter_create_user() {
            return alter_create_user;
        }

        public void setAlter_create_user(String alter_create_user) {
            this.alter_create_user = alter_create_user;
        }

        public String getAlter_flag() {
            return alter_flag;
        }

        public void setAlter_flag(String alter_flag) {
            this.alter_flag = alter_flag;
        }

        public String getAlter_id() {
            return alter_id;
        }

        public void setAlter_id(String alter_id) {
            this.alter_id = alter_id;
        }

        public String getAlter_status() {
            return alter_status;
        }

        public void setAlter_status(String alter_status) {
            this.alter_status = alter_status;
        }

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

        public String getCom_code() {
            return com_code;
        }

        public void setCom_code(String com_code) {
            this.com_code = com_code;
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

        public String getDep_root_code() {
            return dep_root_code;
        }

        public void setDep_root_code(String dep_root_code) {
            this.dep_root_code = dep_root_code;
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

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getSupply_code() {
            return supply_code;
        }

        public void setSupply_code(String supply_code) {
            this.supply_code = supply_code;
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

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * alter_id : 80
             * amount : 1902.00
             * big_region_id : 0
             * buy_amount : 100.00
             * buy_order_id : 0
             * buy_order_list_id : 28530
             * dep_code :
             * dep_id : 0
             * dep_name :
             * e_amount : 2002.00
             * id : 135
             * money : 18069.00
             * price : 9.50
             * region_id : 0
             * request_stock_id : 0
             * s_amount : 100.00
             * status : 0
             * stock_code : 1020100004
             * stock_id : 23
             * stock_name : 刀豆
             * sub_cat_code :
             * sub_cat_id : 0
             * sub_cat_name : 大众食品
             * unit2_id : 0
             * unit_conv : 0
             * unit_id : 0
             * unit_name : 千克
             */

            private String alter_id;
            private String amount;
            private String big_region_id;
            private String buy_amount;
            private String buy_order_id;
            private String buy_order_list_id;
            private String dep_code;
            private String dep_id;
            private String dep_name;
            private String e_amount;
            private String id;
            private String money;
            private String price;
            private String region_id;
            private String request_stock_id;
            private String s_amount;
            private String status;
            private String stock_code;
            private String stock_id;
            private String stock_name;
            private String sub_cat_code;
            private String sub_cat_id;
            private String sub_cat_name;
            private String unit2_id;
            private String unit_conv;
            private String unit_id;
            private String unit_name;

            public String getAlter_id() {
                return alter_id;
            }

            public void setAlter_id(String alter_id) {
                this.alter_id = alter_id;
            }

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

            public String getBuy_amount() {
                return buy_amount;
            }

            public void setBuy_amount(String buy_amount) {
                this.buy_amount = buy_amount;
            }

            public String getBuy_order_id() {
                return buy_order_id;
            }

            public void setBuy_order_id(String buy_order_id) {
                this.buy_order_id = buy_order_id;
            }

            public String getBuy_order_list_id() {
                return buy_order_list_id;
            }

            public void setBuy_order_list_id(String buy_order_list_id) {
                this.buy_order_list_id = buy_order_list_id;
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

            public String getDep_name() {
                return dep_name;
            }

            public void setDep_name(String dep_name) {
                this.dep_name = dep_name;
            }

            public String getE_amount() {
                return e_amount;
            }

            public void setE_amount(String e_amount) {
                this.e_amount = e_amount;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
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

            public String getS_amount() {
                return s_amount;
            }

            public void setS_amount(String s_amount) {
                this.s_amount = s_amount;
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

            public String getUnit2_id() {
                return unit2_id;
            }

            public void setUnit2_id(String unit2_id) {
                this.unit2_id = unit2_id;
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
        }
    }
}
