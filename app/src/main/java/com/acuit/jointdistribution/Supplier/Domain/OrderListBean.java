package com.acuit.jointdistribution.Supplier.Domain;

import java.util.List;

/**
 * 类名: OrderListBean <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/8/24 0024 14:29 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class OrderListBean {


    /**
     * code : 200
     * data : {"count":"107","rows":[{"cat_name":"鲜肉类","code":"CGDD1709289847","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-09-28","dep_brief_name":"紫金","dep_ids":"10","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3843","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"","contact_person":"","dep_name":"西区食堂"}],"plan_date":"2017-09-29 09:00","realname":"系统管理员","request_dep_strs":"西区食堂","status":"5","supply_name":"杭州蔬菜物流有限公司","total_amount":"242.00","total_money":"2802.36"},{"cat_name":"鲜肉类","code":"CGDD1709289846","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-09-28","dep_brief_name":"紫金","dep_ids":"10","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3842","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"","contact_person":"","dep_name":"西区食堂"}],"plan_date":"2017-09-29 09:00","realname":"系统管理员","request_dep_strs":"西区食堂","status":"5","supply_name":"杭州蔬菜物流有限公司","total_amount":"12.00","total_money":"138.96"},{"cat_name":"鲜肉类","code":"CGDD1709289845","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-09-28","dep_brief_name":"紫金","dep_ids":"9","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3841","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"668","contact_person":"张三","dep_name":"东区食堂"}],"plan_date":"2017-09-29 09:00","realname":"系统管理员","request_dep_strs":"东区食堂","status":"5","supply_name":"杭州蔬菜物流有限公司","total_amount":"100.00","total_money":"1158.00"},{"cat_name":"鲜肉类","code":"CGDD1709289844","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-09-28","dep_brief_name":"紫金","dep_ids":"10","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3840","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"","contact_person":"","dep_name":"西区食堂"}],"plan_date":"2017-09-28 00:00","realname":"系统管理员","request_dep_strs":"西区食堂","status":"5","supply_name":"杭州杨大妈农副产品配送有限公司","total_amount":"32.00","total_money":"1622.72"},{"cat_name":"半成品类","code":"CGDD1709289843","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-09-28","dep_brief_name":"紫金","dep_ids":"10","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3839","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"","contact_person":"","dep_name":"西区食堂"}],"plan_date":"2017-09-28 00:00","realname":"系统管理员","request_dep_strs":"西区食堂","status":"1","supply_name":"杭州绿萌食品有限公司","total_amount":"2.00","total_money":"8.40"},{"cat_name":"果蔬类","code":"CGDD1709289828","com_brief_name":"交通","com_id":"6","com_name":"浙江交通学院","create_date":"2017-09-28","dep_brief_name":"浙交饮食","dep_ids":"125","dep_root_id":"121","dep_root_name":"浙江交通学院饮食中心","id":"3836","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"","contact_person":"","dep_name":"乐雅苑"}],"plan_date":"2017-09-28 00:00","realname":"余爽","request_dep_strs":"乐雅苑","status":"5","supply_name":"杭州蔬菜物流有限公司","total_amount":"20.00","total_money":"190.00"},{"cat_name":"水果类","code":"CGDD1709289829","com_brief_name":"交通","com_id":"6","com_name":"浙江交通学院","create_date":"2017-09-28","dep_brief_name":"浙交饮食","dep_ids":"125","dep_root_id":"121","dep_root_name":"浙江交通学院饮食中心","id":"3837","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"","contact_person":"","dep_name":"乐雅苑"}],"plan_date":"2017-09-28 00:00","realname":"余爽","request_dep_strs":"乐雅苑","status":"5","supply_name":"杭州羊皮卷贸易有限公司","total_amount":"30.00","total_money":"240.00"},{"cat_name":"粮油类","code":"CGDD1709289830","com_brief_name":"交通","com_id":"6","com_name":"浙江交通学院","create_date":"2017-09-28","dep_brief_name":"浙交饮食","dep_ids":"125","dep_root_id":"121","dep_root_name":"浙江交通学院饮食中心","id":"3838","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"","contact_person":"","dep_name":"乐雅苑"}],"plan_date":"2017-09-28 00:00","realname":"余爽","request_dep_strs":"乐雅苑","status":"2","supply_name":"杭州粮油食品有限公司","total_amount":"40.00","total_money":"320.00"},{"cat_name":"果蔬类","code":"CGDD1709289823","com_brief_name":"交通","com_id":"6","com_name":"浙江交通学院","create_date":"2017-09-28","dep_brief_name":"浙交饮食","dep_ids":"125","dep_root_id":"121","dep_root_name":"浙江交通学院饮食中心","id":"3834","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"","contact_person":"","dep_name":"乐雅苑"}],"plan_date":"2017-09-29 09:00","realname":"余爽","request_dep_strs":"乐雅苑","status":"5","supply_name":"杭州蔬菜物流有限公司","total_amount":"300.00","total_money":"1380.00"},{"cat_name":"粮油类","code":"CGDD1709289824","com_brief_name":"交通","com_id":"6","com_name":"浙江交通学院","create_date":"2017-09-28","dep_brief_name":"浙交饮食","dep_ids":"125","dep_root_id":"121","dep_root_name":"浙江交通学院饮食中心","id":"3835","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"","contact_person":"","dep_name":"乐雅苑"}],"plan_date":"2017-09-29 09:00","realname":"余爽","request_dep_strs":"乐雅苑","status":"5","supply_name":"杭州粮油食品有限公司","total_amount":"300.00","total_money":"2400.00"}],"total":"107","total_amount":"33895.00","total_money":"203422.97"}
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
         * count : 107
         * rows : [{"cat_name":"鲜肉类","code":"CGDD1709289847","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-09-28","dep_brief_name":"紫金","dep_ids":"10","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3843","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"","contact_person":"","dep_name":"西区食堂"}],"plan_date":"2017-09-29 09:00","realname":"系统管理员","request_dep_strs":"西区食堂","status":"5","supply_name":"杭州蔬菜物流有限公司","total_amount":"242.00","total_money":"2802.36"},{"cat_name":"鲜肉类","code":"CGDD1709289846","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-09-28","dep_brief_name":"紫金","dep_ids":"10","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3842","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"","contact_person":"","dep_name":"西区食堂"}],"plan_date":"2017-09-29 09:00","realname":"系统管理员","request_dep_strs":"西区食堂","status":"5","supply_name":"杭州蔬菜物流有限公司","total_amount":"12.00","total_money":"138.96"},{"cat_name":"鲜肉类","code":"CGDD1709289845","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-09-28","dep_brief_name":"紫金","dep_ids":"9","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3841","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"668","contact_person":"张三","dep_name":"东区食堂"}],"plan_date":"2017-09-29 09:00","realname":"系统管理员","request_dep_strs":"东区食堂","status":"5","supply_name":"杭州蔬菜物流有限公司","total_amount":"100.00","total_money":"1158.00"},{"cat_name":"鲜肉类","code":"CGDD1709289844","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-09-28","dep_brief_name":"紫金","dep_ids":"10","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3840","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"","contact_person":"","dep_name":"西区食堂"}],"plan_date":"2017-09-28 00:00","realname":"系统管理员","request_dep_strs":"西区食堂","status":"5","supply_name":"杭州杨大妈农副产品配送有限公司","total_amount":"32.00","total_money":"1622.72"},{"cat_name":"半成品类","code":"CGDD1709289843","com_brief_name":"浙大","com_id":"1","com_name":"浙大饮食中心","create_date":"2017-09-28","dep_brief_name":"紫金","dep_ids":"10","dep_root_id":"1","dep_root_name":"第一餐饮中心（紫金港）","id":"3839","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"","contact_person":"","dep_name":"西区食堂"}],"plan_date":"2017-09-28 00:00","realname":"系统管理员","request_dep_strs":"西区食堂","status":"1","supply_name":"杭州绿萌食品有限公司","total_amount":"2.00","total_money":"8.40"},{"cat_name":"果蔬类","code":"CGDD1709289828","com_brief_name":"交通","com_id":"6","com_name":"浙江交通学院","create_date":"2017-09-28","dep_brief_name":"浙交饮食","dep_ids":"125","dep_root_id":"121","dep_root_name":"浙江交通学院饮食中心","id":"3836","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"","contact_person":"","dep_name":"乐雅苑"}],"plan_date":"2017-09-28 00:00","realname":"余爽","request_dep_strs":"乐雅苑","status":"5","supply_name":"杭州蔬菜物流有限公司","total_amount":"20.00","total_money":"190.00"},{"cat_name":"水果类","code":"CGDD1709289829","com_brief_name":"交通","com_id":"6","com_name":"浙江交通学院","create_date":"2017-09-28","dep_brief_name":"浙交饮食","dep_ids":"125","dep_root_id":"121","dep_root_name":"浙江交通学院饮食中心","id":"3837","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"","contact_person":"","dep_name":"乐雅苑"}],"plan_date":"2017-09-28 00:00","realname":"余爽","request_dep_strs":"乐雅苑","status":"5","supply_name":"杭州羊皮卷贸易有限公司","total_amount":"30.00","total_money":"240.00"},{"cat_name":"粮油类","code":"CGDD1709289830","com_brief_name":"交通","com_id":"6","com_name":"浙江交通学院","create_date":"2017-09-28","dep_brief_name":"浙交饮食","dep_ids":"125","dep_root_id":"121","dep_root_name":"浙江交通学院饮食中心","id":"3838","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"","contact_person":"","dep_name":"乐雅苑"}],"plan_date":"2017-09-28 00:00","realname":"余爽","request_dep_strs":"乐雅苑","status":"2","supply_name":"杭州粮油食品有限公司","total_amount":"40.00","total_money":"320.00"},{"cat_name":"果蔬类","code":"CGDD1709289823","com_brief_name":"交通","com_id":"6","com_name":"浙江交通学院","create_date":"2017-09-28","dep_brief_name":"浙交饮食","dep_ids":"125","dep_root_id":"121","dep_root_name":"浙江交通学院饮食中心","id":"3834","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"","contact_person":"","dep_name":"乐雅苑"}],"plan_date":"2017-09-29 09:00","realname":"余爽","request_dep_strs":"乐雅苑","status":"5","supply_name":"杭州蔬菜物流有限公司","total_amount":"300.00","total_money":"1380.00"},{"cat_name":"粮油类","code":"CGDD1709289824","com_brief_name":"交通","com_id":"6","com_name":"浙江交通学院","create_date":"2017-09-28","dep_brief_name":"浙交饮食","dep_ids":"125","dep_root_id":"121","dep_root_name":"浙江交通学院饮食中心","id":"3835","is_del":"0","is_new":0,"is_used":"0","phone":[{"address":"","contact_number":"","contact_person":"","dep_name":"乐雅苑"}],"plan_date":"2017-09-29 09:00","realname":"余爽","request_dep_strs":"乐雅苑","status":"5","supply_name":"杭州粮油食品有限公司","total_amount":"300.00","total_money":"2400.00"}]
         * total : 107
         * total_amount : 33895.00
         * total_money : 203422.97
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
             * cat_name : 鲜肉类
             * code : CGDD1709289847
             * com_brief_name : 浙大
             * com_id : 1
             * com_name : 浙大饮食中心
             * create_date : 2017-09-28
             * dep_brief_name : 紫金
             * dep_ids : 10
             * dep_root_id : 1
             * dep_root_name : 第一餐饮中心（紫金港）
             * id : 3843
             * is_del : 0
             * is_new : 0
             * is_used : 0
             * phone : [{"address":"","contact_number":"","contact_person":"","dep_name":"西区食堂"}]
             * plan_date : 2017-09-29 09:00
             * realname : 系统管理员
             * request_dep_strs : 西区食堂
             * status : 5
             * supply_name : 杭州蔬菜物流有限公司
             * total_amount : 242.00
             * total_money : 2802.36
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
                 * address :
                 * contact_number :
                 * contact_person :
                 * dep_name : 西区食堂
                 */

                private String address;
                private String contact_number;
                private String contact_person;
                private String dep_name;

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
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
