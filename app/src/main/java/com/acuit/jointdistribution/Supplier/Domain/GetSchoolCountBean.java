package com.acuit.jointdistribution.Supplier.Domain;

import java.util.List;

/**
 * 类名: getSchoolCountBean <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/9/11 0011 10:39 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class GetSchoolCountBean {


    /**
     * code : 200
     * data : {"count":"0.00","rows":[{"cat_name":"果蔬类","code":"CGDD1709139480","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-09-14","dep_brief_name":"紫金","dep_ids":"10","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3762","is_del":"0","is_new":0,"is_used":"0","phone":[{"contact_number":"","contact_person":"","dep_name":"西区食堂"}],"plan_date":"2017-09-14 09:00","realname":"采购测试","request_dep_strs":"西区食堂","status":"2","supply_name":"杭州蔬菜物流有限公司","total_amount":"200.00","total_money":"640.00"},{"cat_name":"果蔬类","code":"CGDD1709099451","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-09-09","dep_brief_name":"紫金","dep_ids":"15","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3746","is_del":"0","is_new":0,"is_used":"0","phone":[{"contact_number":"","contact_person":"","dep_name":"总仓"}],"plan_date":"2017-09-10 09:00","realname":"采购测试","request_dep_strs":"总仓","status":"2","supply_name":"杭州蔬菜物流有限公司","total_amount":"37.00","total_money":"144.15"},{"cat_name":"果蔬类","code":"CGDD1709049438","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-09-04","dep_brief_name":"紫金","dep_ids":"15","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3738","is_del":"0","is_new":0,"is_used":"0","phone":[{"contact_number":"","contact_person":"","dep_name":"总仓"}],"plan_date":"2017-09-05 07:00","realname":"系统管理员","request_dep_strs":"总仓","status":"2","supply_name":"杭州蔬菜物流有限公司","total_amount":"1.00","total_money":"3.56"},{"cat_name":"果蔬类","code":"CGDD1708269395","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-08-26","dep_brief_name":"紫金","dep_ids":"9,22","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3728","is_del":"0","is_new":0,"is_used":"0","phone":[{"contact_number":"668","contact_person":"张三","dep_name":"东区食堂"},{"contact_number":"","contact_person":"","dep_name":"一食堂"}],"plan_date":"2017-08-27 09:00","realname":"系统管理员","request_dep_strs":"东区食堂,一食堂","status":"2","supply_name":"杭州蔬菜物流有限公司","total_amount":"1500.00","total_money":"9520.00"},{"cat_name":"果蔬类","code":"CGDD1708178953","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-08-18","dep_brief_name":"紫金","dep_ids":"15","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3691","is_del":"0","is_new":0,"is_used":"0","phone":[{"contact_number":"","contact_person":"","dep_name":"总仓"}],"plan_date":"2017-08-18 09:00","realname":"系统管理员","request_dep_strs":"总仓","status":"2","supply_name":"杭州蔬菜物流有限公司","total_amount":"1000.00","total_money":"3200.00"}],"total":"5","total_amount":"0.00","total_money":"0.00"}
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
         * count : 0.00
         * rows : [{"cat_name":"果蔬类","code":"CGDD1709139480","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-09-14","dep_brief_name":"紫金","dep_ids":"10","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3762","is_del":"0","is_new":0,"is_used":"0","phone":[{"contact_number":"","contact_person":"","dep_name":"西区食堂"}],"plan_date":"2017-09-14 09:00","realname":"采购测试","request_dep_strs":"西区食堂","status":"2","supply_name":"杭州蔬菜物流有限公司","total_amount":"200.00","total_money":"640.00"},{"cat_name":"果蔬类","code":"CGDD1709099451","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-09-09","dep_brief_name":"紫金","dep_ids":"15","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3746","is_del":"0","is_new":0,"is_used":"0","phone":[{"contact_number":"","contact_person":"","dep_name":"总仓"}],"plan_date":"2017-09-10 09:00","realname":"采购测试","request_dep_strs":"总仓","status":"2","supply_name":"杭州蔬菜物流有限公司","total_amount":"37.00","total_money":"144.15"},{"cat_name":"果蔬类","code":"CGDD1709049438","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-09-04","dep_brief_name":"紫金","dep_ids":"15","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3738","is_del":"0","is_new":0,"is_used":"0","phone":[{"contact_number":"","contact_person":"","dep_name":"总仓"}],"plan_date":"2017-09-05 07:00","realname":"系统管理员","request_dep_strs":"总仓","status":"2","supply_name":"杭州蔬菜物流有限公司","total_amount":"1.00","total_money":"3.56"},{"cat_name":"果蔬类","code":"CGDD1708269395","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-08-26","dep_brief_name":"紫金","dep_ids":"9,22","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3728","is_del":"0","is_new":0,"is_used":"0","phone":[{"contact_number":"668","contact_person":"张三","dep_name":"东区食堂"},{"contact_number":"","contact_person":"","dep_name":"一食堂"}],"plan_date":"2017-08-27 09:00","realname":"系统管理员","request_dep_strs":"东区食堂,一食堂","status":"2","supply_name":"杭州蔬菜物流有限公司","total_amount":"1500.00","total_money":"9520.00"},{"cat_name":"果蔬类","code":"CGDD1708178953","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-08-18","dep_brief_name":"紫金","dep_ids":"15","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3691","is_del":"0","is_new":0,"is_used":"0","phone":[{"contact_number":"","contact_person":"","dep_name":"总仓"}],"plan_date":"2017-08-18 09:00","realname":"系统管理员","request_dep_strs":"总仓","status":"2","supply_name":"杭州蔬菜物流有限公司","total_amount":"1000.00","total_money":"3200.00"}]
         * total : 5
         * total_amount : 0.00
         * total_money : 0.00
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
             * code : CGDD1709139480
             * com_brief_name : 浙大
             * com_id : 1
             * com_name : 浙大饮食中心
             * create_date : 2017-09-14
             * dep_brief_name : 紫金
             * dep_ids : 10
             * dep_root_id : 1
             * dep_root_name : 第一餐饮中心（紫金港）
             * id : 3762
             * is_del : 0
             * is_new : 0
             * is_used : 0
             * phone : [{"contact_number":"","contact_person":"","dep_name":"西区食堂"}]
             * plan_date : 2017-09-14 09:00
             * realname : 采购测试
             * request_dep_strs : 西区食堂
             * status : 2
             * supply_name : 杭州蔬菜物流有限公司
             * total_amount : 200.00
             * total_money : 640.00
             */

            private String cat_name;
            private String code;
            private String com_brief_name;
            private String com_id;
            private String com_name;
            private String create_date;
            private String dep_brief_name;
            private String dep_ids;
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
            private String total_amount;
            private String total_money;
            private List<PhoneBean> phone;

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

            public List<PhoneBean> getPhone() {
                return phone;
            }

            public void setPhone(List<PhoneBean> phone) {
                this.phone = phone;
            }

            public static class PhoneBean {
                /**
                 * contact_number :
                 * contact_person :
                 * dep_name : 西区食堂
                 */

                private String contact_number;
                private String contact_person;
                private String dep_name;

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

                public String getDep_name() {
                    return dep_name;
                }

                public void setDep_name(String dep_name) {
                    this.dep_name = dep_name;
                }
            }
        }
    }
}
