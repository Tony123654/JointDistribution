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
     * data : {"count":"42","rows":[{"cat_name":"果蔬类","code":"CGDD1708289407","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-08-28","dep_brief_name":"紫金","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3731","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-29 09:00","realname":"系统管理员","request_dep_strs":"西区食堂","status":"1","supply_name":"杭州蔬菜物流有限公司"},{"cat_name":"果蔬类","code":"CGDD1708289403","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-08-28","dep_brief_name":"紫金","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3730","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-29 09:00","realname":"系统管理员","request_dep_strs":"总仓","status":"1","supply_name":"杭州蔬菜物流有限公司"},{"cat_name":"果蔬类","code":"CGDD1708269398","com_brief_name":"同力","com_id":"4","com_name":"浙江同力教育后勤管理有限公司","create_date":"2017-08-26","dep_brief_name":"tlyj","dep_root_id":"163","dep_root_name":"同力一级","id":"3729","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-27 09:00","realname":"同保一","request_dep_strs":"同力测试食堂","status":"5","supply_name":"杭州蔬菜物流有限公司"},{"cat_name":"果蔬类","code":"CGDD1708269395","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-08-26","dep_brief_name":"紫金","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3728","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-27 09:00","realname":"系统管理员","request_dep_strs":"东区食堂,一食堂","status":"2","supply_name":"杭州蔬菜物流有限公司"},{"cat_name":"果蔬类","code":"CGDD1708239388","com_brief_name":"同力","com_id":"4","com_name":"浙江同力教育后勤管理有限公司","create_date":"2017-08-23","dep_brief_name":"tlyj","dep_root_id":"163","dep_root_name":"同力一级","id":"3727","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-24 09:00","realname":"系统管理员","request_dep_strs":"同力测试食堂","status":"5","supply_name":"杭州蔬菜物流有限公司"},{"cat_name":"果蔬类","code":"CGDD1708239365","com_brief_name":"同力","com_id":"4","com_name":"浙江同力教育后勤管理有限公司","create_date":"2017-08-23","dep_brief_name":"tlyj","dep_root_id":"163","dep_root_name":"同力一级","id":"3725","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-24 09:00","realname":"","request_dep_strs":"同力测试食堂","status":"2","supply_name":"杭州蔬菜物流有限公司"},{"cat_name":"果蔬类","code":"CGDD1708239362","com_brief_name":"同力","com_id":"4","com_name":"浙江同力教育后勤管理有限公司","create_date":"2017-08-23","dep_brief_name":"tlyj","dep_root_id":"163","dep_root_name":"同力一级","id":"3724","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-24 09:00","realname":"","request_dep_strs":"同力测试食堂","status":"5","supply_name":"杭州蔬菜物流有限公司"},{"cat_name":"鲜肉类","code":"CGDD1708219302","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-08-22","dep_brief_name":"紫金","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3722","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-22 09:00","realname":"系统管理员","request_dep_strs":"总仓","status":"4","supply_name":"杭州蔬菜物流有限公司"},{"cat_name":"果蔬类","code":"CGDD1708219298","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-08-22","dep_brief_name":"紫金","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3720","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-22 09:00","realname":"系统管理员","request_dep_strs":"总仓","status":"5","supply_name":"杭州蔬菜物流有限公司"},{"cat_name":"果蔬类","code":"CGDD1708219293","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-08-22","dep_brief_name":"紫金","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3718","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-22 09:00","realname":"系统管理员","request_dep_strs":"总仓","status":"5","supply_name":"杭州蔬菜物流有限公司"}],"total":"42","total_amount":"2000018187.48","total_money":"2000097134.83"}
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
         * count : 42
         * rows : [{"cat_name":"果蔬类","code":"CGDD1708289407","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-08-28","dep_brief_name":"紫金","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3731","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-29 09:00","realname":"系统管理员","request_dep_strs":"西区食堂","status":"1","supply_name":"杭州蔬菜物流有限公司"},{"cat_name":"果蔬类","code":"CGDD1708289403","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-08-28","dep_brief_name":"紫金","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3730","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-29 09:00","realname":"系统管理员","request_dep_strs":"总仓","status":"1","supply_name":"杭州蔬菜物流有限公司"},{"cat_name":"果蔬类","code":"CGDD1708269398","com_brief_name":"同力","com_id":"4","com_name":"浙江同力教育后勤管理有限公司","create_date":"2017-08-26","dep_brief_name":"tlyj","dep_root_id":"163","dep_root_name":"同力一级","id":"3729","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-27 09:00","realname":"同保一","request_dep_strs":"同力测试食堂","status":"5","supply_name":"杭州蔬菜物流有限公司"},{"cat_name":"果蔬类","code":"CGDD1708269395","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-08-26","dep_brief_name":"紫金","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3728","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-27 09:00","realname":"系统管理员","request_dep_strs":"东区食堂,一食堂","status":"2","supply_name":"杭州蔬菜物流有限公司"},{"cat_name":"果蔬类","code":"CGDD1708239388","com_brief_name":"同力","com_id":"4","com_name":"浙江同力教育后勤管理有限公司","create_date":"2017-08-23","dep_brief_name":"tlyj","dep_root_id":"163","dep_root_name":"同力一级","id":"3727","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-24 09:00","realname":"系统管理员","request_dep_strs":"同力测试食堂","status":"5","supply_name":"杭州蔬菜物流有限公司"},{"cat_name":"果蔬类","code":"CGDD1708239365","com_brief_name":"同力","com_id":"4","com_name":"浙江同力教育后勤管理有限公司","create_date":"2017-08-23","dep_brief_name":"tlyj","dep_root_id":"163","dep_root_name":"同力一级","id":"3725","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-24 09:00","realname":"","request_dep_strs":"同力测试食堂","status":"2","supply_name":"杭州蔬菜物流有限公司"},{"cat_name":"果蔬类","code":"CGDD1708239362","com_brief_name":"同力","com_id":"4","com_name":"浙江同力教育后勤管理有限公司","create_date":"2017-08-23","dep_brief_name":"tlyj","dep_root_id":"163","dep_root_name":"同力一级","id":"3724","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-24 09:00","realname":"","request_dep_strs":"同力测试食堂","status":"5","supply_name":"杭州蔬菜物流有限公司"},{"cat_name":"鲜肉类","code":"CGDD1708219302","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-08-22","dep_brief_name":"紫金","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3722","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-22 09:00","realname":"系统管理员","request_dep_strs":"总仓","status":"4","supply_name":"杭州蔬菜物流有限公司"},{"cat_name":"果蔬类","code":"CGDD1708219298","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-08-22","dep_brief_name":"紫金","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3720","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-22 09:00","realname":"系统管理员","request_dep_strs":"总仓","status":"5","supply_name":"杭州蔬菜物流有限公司"},{"cat_name":"果蔬类","code":"CGDD1708219293","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-08-22","dep_brief_name":"紫金","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3718","is_del":"0","is_new":0,"is_used":"0","plan_date":"2017-08-22 09:00","realname":"系统管理员","request_dep_strs":"总仓","status":"5","supply_name":"杭州蔬菜物流有限公司"}]
         * total : 42
         * total_amount : 2000018187.48
         * total_money : 2000097134.83
         */

        private String count;
        private String total;
        private String total_amount;
        private String total_money;
        private List<RowsBean> rows;

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

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

        public List<RowsBean> getRows() {
            return rows;
        }

        public void setRows(List<RowsBean> rows) {
            this.rows = rows;
        }

        public static class RowsBean {
            /**
             * cat_name : 果蔬类
             * code : CGDD1708289407
             * com_brief_name : 浙大
             * com_id : 1
             * com_name : 浙大饮食中心
             * create_date : 2017-08-28
             * dep_brief_name : 紫金
             * dep_root_id : 1
             * dep_root_name : 第一餐饮中心（紫金港）
             * id : 3731
             * is_del : 0
             * is_new : 0
             * is_used : 0
             * plan_date : 2017-08-29 09:00
             * realname : 系统管理员
             * request_dep_strs : 西区食堂
             * status : 1
             * supply_name : 杭州蔬菜物流有限公司
             */

            private String cat_name;
            private String code;
            private String com_brief_name;
            private String com_id;
            private String com_name;
            private String create_date;
            private String dep_brief_name;
            private String dep_root_id;
            private String dep_root_name;
            private String id;
            private String is_del;
            private int is_new;
            private String is_used;
            private String plan_date;
            private String realname;
            private String request_dep_strs;
            private String status;
            private String supply_name;

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

            public String getCreate_date() {
                return create_date;
            }

            public void setCreate_date(String create_date) {
                this.create_date = create_date;
            }

            public String getDep_brief_name() {
                return dep_brief_name;
            }

            public void setDep_brief_name(String dep_brief_name) {
                this.dep_brief_name = dep_brief_name;
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

            public int getIs_new() {
                return is_new;
            }

            public void setIs_new(int is_new) {
                this.is_new = is_new;
            }

            public String getIs_used() {
                return is_used;
            }

            public void setIs_used(String is_used) {
                this.is_used = is_used;
            }

            public String getPlan_date() {
                return plan_date;
            }

            public void setPlan_date(String plan_date) {
                this.plan_date = plan_date;
            }

            public String getRealname() {
                return realname;
            }

            public void setRealname(String realname) {
                this.realname = realname;
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

            public String getSupply_name() {
                return supply_name;
            }

            public void setSupply_name(String supply_name) {
                this.supply_name = supply_name;
            }
        }
    }
}
