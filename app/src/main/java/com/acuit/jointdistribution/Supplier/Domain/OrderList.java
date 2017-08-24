package com.acuit.jointdistribution.Supplier.Domain;

import java.util.List;

/**
 * 类名: OrderList <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/8/24 0024 14:29 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class OrderList {
    /**
     * code : 200
     * msg : 执行成功！
     * data : {"total":"40","rows":[{"is_del":"0","code":"CGDD1708239388","realname":"系统管理员","plan_date":"2017-08-24 09:00","id":"3727","create_date":"2017-08-23","status":"2","com_name":"浙江同力教育后勤管理有限公司","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"同力一级","dep_root_id":"163","com_id":"4","is_new":0,"com_brief_name":"同力","dep_brief_name":"tlyj","request_dep_strs":"同力测试食堂"},{"is_del":"0","code":"CGDD1708239365","realname":"","plan_date":"2017-08-24 09:00","id":"3725","create_date":"2017-08-23","status":"2","com_name":"浙江同力教育后勤管理有限公司","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"同力一级","dep_root_id":"163","com_id":"4","is_new":0,"com_brief_name":"同力","dep_brief_name":"tlyj","request_dep_strs":"同力测试食堂"},{"is_del":"0","code":"CGDD1708239362","realname":"","plan_date":"2017-08-24 09:00","id":"3724","create_date":"2017-08-23","status":"2","com_name":"浙江同力教育后勤管理有限公司","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"同力一级","dep_root_id":"163","com_id":"4","is_new":0,"com_brief_name":"同力","dep_brief_name":"tlyj","request_dep_strs":"同力测试食堂"},{"is_del":"0","code":"CGDD1708219302","realname":"系统管理员","plan_date":"2017-08-22 09:00","id":"3722","create_date":"2017-08-22","status":"2","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"鲜肉类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","code":"CGDD1708219298","realname":"系统管理员","plan_date":"2017-08-22 09:00","id":"3720","create_date":"2017-08-22","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","code":"CGDD1708219293","realname":"系统管理员","plan_date":"2017-08-22 09:00","id":"3718","create_date":"2017-08-22","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","code":"CGDD1708219291","realname":"系统管理员","plan_date":"2017-08-22 09:00","id":"3717","create_date":"2017-08-22","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","code":"CGDD1708199270","realname":"陈燕华","plan_date":"2017-08-20 09:00","id":"3716","create_date":"2017-08-19","status":"2","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"西区食堂,休闲餐厅"},{"is_del":"0","code":"CGDD1708199208","realname":"系统管理员","plan_date":"2017-08-19 00:00","id":"3712","create_date":"2017-08-19","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"鲜肉类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","code":"CGDD1708199205","realname":"系统管理员","plan_date":"2017-08-19 00:00","id":"3710","create_date":"2017-08-19","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"}],"total_amount":"2000016752.48","total_money":"2000089134.23","count":"40"}
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
         * total : 40
         * rows : [{"is_del":"0","code":"CGDD1708239388","realname":"系统管理员","plan_date":"2017-08-24 09:00","id":"3727","create_date":"2017-08-23","status":"2","com_name":"浙江同力教育后勤管理有限公司","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"同力一级","dep_root_id":"163","com_id":"4","is_new":0,"com_brief_name":"同力","dep_brief_name":"tlyj","request_dep_strs":"同力测试食堂"},{"is_del":"0","code":"CGDD1708239365","realname":"","plan_date":"2017-08-24 09:00","id":"3725","create_date":"2017-08-23","status":"2","com_name":"浙江同力教育后勤管理有限公司","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"同力一级","dep_root_id":"163","com_id":"4","is_new":0,"com_brief_name":"同力","dep_brief_name":"tlyj","request_dep_strs":"同力测试食堂"},{"is_del":"0","code":"CGDD1708239362","realname":"","plan_date":"2017-08-24 09:00","id":"3724","create_date":"2017-08-23","status":"2","com_name":"浙江同力教育后勤管理有限公司","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"同力一级","dep_root_id":"163","com_id":"4","is_new":0,"com_brief_name":"同力","dep_brief_name":"tlyj","request_dep_strs":"同力测试食堂"},{"is_del":"0","code":"CGDD1708219302","realname":"系统管理员","plan_date":"2017-08-22 09:00","id":"3722","create_date":"2017-08-22","status":"2","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"鲜肉类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","code":"CGDD1708219298","realname":"系统管理员","plan_date":"2017-08-22 09:00","id":"3720","create_date":"2017-08-22","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","code":"CGDD1708219293","realname":"系统管理员","plan_date":"2017-08-22 09:00","id":"3718","create_date":"2017-08-22","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","code":"CGDD1708219291","realname":"系统管理员","plan_date":"2017-08-22 09:00","id":"3717","create_date":"2017-08-22","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","code":"CGDD1708199270","realname":"陈燕华","plan_date":"2017-08-20 09:00","id":"3716","create_date":"2017-08-19","status":"2","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"西区食堂,休闲餐厅"},{"is_del":"0","code":"CGDD1708199208","realname":"系统管理员","plan_date":"2017-08-19 00:00","id":"3712","create_date":"2017-08-19","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"鲜肉类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"},{"is_del":"0","code":"CGDD1708199205","realname":"系统管理员","plan_date":"2017-08-19 00:00","id":"3710","create_date":"2017-08-19","status":"5","com_name":"浙大饮食中心","is_used":"0","supply_name":"杭州蔬菜物流有限公司","cat_name":"果蔬类","dep_root_name":"第一餐饮中心（紫金港）","dep_root_id":"1","com_id":"1","is_new":0,"com_brief_name":"浙大","dep_brief_name":"紫金","request_dep_strs":"总仓"}]
         * total_amount : 2000016752.48
         * total_money : 2000089134.23
         * count : 40
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
             * code : CGDD1708239388
             * realname : 系统管理员
             * plan_date : 2017-08-24 09:00
             * id : 3727
             * create_date : 2017-08-23
             * status : 2
             * com_name : 浙江同力教育后勤管理有限公司
             * is_used : 0
             * supply_name : 杭州蔬菜物流有限公司
             * cat_name : 果蔬类
             * dep_root_name : 同力一级
             * dep_root_id : 163
             * com_id : 4
             * is_new : 0
             * com_brief_name : 同力
             * dep_brief_name : tlyj
             * request_dep_strs : 同力测试食堂
             */

            private String is_del;
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
            private int is_new;
            private String com_brief_name;
            private String dep_brief_name;
            private String request_dep_strs;

            public String getIs_del() {
                return is_del;
            }

            public void setIs_del(String is_del) {
                this.is_del = is_del;
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
        }
    }
}
