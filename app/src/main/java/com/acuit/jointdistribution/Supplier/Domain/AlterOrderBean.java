package com.acuit.jointdistribution.Supplier.Domain;

import java.util.List;

/**
 * 类名: AlterOrderBean <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/9/16 0016 9:56 <p>
 * 描述:
 * <p> 采购变更单
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class AlterOrderBean {


    /**
     * code : 200
     * data : {"alter":[{"alter_code":"CGBG1709140117","alter_create_date":"2017-09-14","alter_flag":"2","alter_id":"83","alter_status":"4","cat_name":"果蔬类","code":"CGDD1709149546","com_name":"浙江理工大学","create_date":"1970-01-01","dep_root_name":"浙理下沙校区","id":"3801","is_new":0,"is_used":"0","plan_date":"2017-09-15 09:00","priv":{"priv_add":1,"priv_audit":0,"priv_confirm":0,"priv_delete":0,"priv_edit":0,"priv_view":1},"realname":"新川线","supply_name":"杭州蔬菜物流有限公司"},{"alter_code":"CGBG1709140116","alter_create_date":"2017-09-14","alter_flag":"2","alter_id":"82","alter_status":"4","cat_name":"果蔬类","code":"CGDD1709149536","com_name":"浙大饮食中心","create_date":"1970-01-01","dep_root_name":"第一餐饮中心（紫金港）","id":"3794","is_new":0,"is_used":"0","plan_date":"2017-09-15 09:00","priv":{"priv_add":1,"priv_audit":0,"priv_confirm":0,"priv_delete":0,"priv_edit":0,"priv_view":1},"realname":"系统管理员","supply_name":"杭州蔬菜物流有限公司"},{"alter_code":"CGBG1709140114","alter_create_date":"2017-09-14","alter_flag":"2","alter_id":"80","alter_status":"2","cat_name":"果蔬类","code":"CGDD1709149532","com_name":"浙大饮食中心","create_date":"1970-01-01","dep_root_name":"第一餐饮中心（紫金港）","id":"3792","is_new":0,"is_used":"0","plan_date":"2017-09-15 09:00","priv":{"priv_add":1,"priv_audit":0,"priv_confirm":1,"priv_delete":0,"priv_edit":0,"priv_view":1},"realname":"系统管理员","supply_name":"杭州蔬菜物流有限公司"},{"alter_code":"CGBG1709140111","alter_create_date":"2017-09-14","alter_flag":"2","alter_id":"77","alter_status":"4","cat_name":"果蔬类","code":"CGDD1709149488","com_name":"浙大饮食中心","create_date":"1970-01-01","dep_root_name":"第一餐饮中心（紫金港）","id":"3765","is_new":0,"is_used":"0","plan_date":"2017-09-15 09:00","priv":{"priv_add":1,"priv_audit":0,"priv_confirm":0,"priv_delete":0,"priv_edit":0,"priv_view":1},"realname":"系统管理员","supply_name":"杭州蔬菜物流有限公司"},{"alter_code":"CGBG1709140110","alter_create_date":"2017-09-14","alter_flag":"2","alter_id":"76","alter_status":"4","cat_name":"果蔬类","code":"CGDD1709149483","com_name":"浙江交通学院","create_date":"1970-01-01","dep_root_name":"浙江交通学院饮食中心","id":"3763","is_new":0,"is_used":"0","plan_date":"2017-09-15 09:00","priv":{"priv_add":1,"priv_audit":0,"priv_confirm":0,"priv_delete":0,"priv_edit":0,"priv_view":1},"realname":"余爽","supply_name":"杭州蔬菜物流有限公司"},{"alter_code":"CGBG1709140109","alter_create_date":"2017-09-14","alter_flag":"2","alter_id":"75","alter_status":"4","cat_name":"果蔬类","code":"CGDD1707187948","com_name":"浙大饮食中心","create_date":"1970-01-01","dep_root_name":"第一餐饮中心（紫金港）","id":"3622","is_new":0,"is_used":"0","plan_date":"2017-07-19 09:00","priv":{"priv_add":1,"priv_audit":0,"priv_confirm":0,"priv_delete":0,"priv_edit":0,"priv_view":1},"realname":"采购测试","supply_name":"杭州蔬菜物流有限公司"},{"alter_code":"CGBG1709130108","alter_create_date":"2017-09-13","alter_flag":"2","alter_id":"74","alter_status":"4","cat_name":"果蔬类","code":"CGDD1709139480","com_name":"浙大饮食中心","create_date":"1970-01-01","dep_root_name":"第一餐饮中心（紫金港）","id":"3762","is_new":0,"is_used":"0","plan_date":"2017-09-14 09:00","priv":{"priv_add":1,"priv_audit":0,"priv_confirm":0,"priv_delete":0,"priv_edit":0,"priv_view":1},"realname":"采购测试","supply_name":"杭州蔬菜物流有限公司"},{"alter_code":"CGBG1709130107","alter_create_date":"2017-09-13","alter_flag":"2","alter_id":"73","alter_status":"1","cat_name":"果蔬类","code":"CGDD1709139478","com_name":"浙大饮食中心","create_date":"1970-01-01","dep_root_name":"第一餐饮中心（紫金港）","id":"3760","is_new":0,"is_used":"0","plan_date":"2017-09-14 09:00","priv":{"priv_add":1,"priv_audit":0,"priv_confirm":0,"priv_delete":1,"priv_edit":0,"priv_view":1},"realname":"采购测试","supply_name":"杭州蔬菜物流有限公司"},{"alter_code":"CGBG1709130106","alter_create_date":"2017-09-13","alter_flag":"2","alter_id":"72","alter_status":"4","cat_name":"果蔬类","code":"CGDD1707187948","com_name":"浙大饮食中心","create_date":"1970-01-01","dep_root_name":"第一餐饮中心（紫金港）","id":"3622","is_new":0,"is_used":"0","plan_date":"2017-07-19 09:00","priv":{"priv_add":1,"priv_audit":0,"priv_confirm":0,"priv_delete":0,"priv_edit":0,"priv_view":1},"realname":"采购测试","supply_name":"杭州蔬菜物流有限公司"}],"total":"9"}
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
         * alter : [{"alter_code":"CGBG1709140117","alter_create_date":"2017-09-14","alter_flag":"2","alter_id":"83","alter_status":"4","cat_name":"果蔬类","code":"CGDD1709149546","com_name":"浙江理工大学","create_date":"1970-01-01","dep_root_name":"浙理下沙校区","id":"3801","is_new":0,"is_used":"0","plan_date":"2017-09-15 09:00","priv":{"priv_add":1,"priv_audit":0,"priv_confirm":0,"priv_delete":0,"priv_edit":0,"priv_view":1},"realname":"新川线","supply_name":"杭州蔬菜物流有限公司"},{"alter_code":"CGBG1709140116","alter_create_date":"2017-09-14","alter_flag":"2","alter_id":"82","alter_status":"4","cat_name":"果蔬类","code":"CGDD1709149536","com_name":"浙大饮食中心","create_date":"1970-01-01","dep_root_name":"第一餐饮中心（紫金港）","id":"3794","is_new":0,"is_used":"0","plan_date":"2017-09-15 09:00","priv":{"priv_add":1,"priv_audit":0,"priv_confirm":0,"priv_delete":0,"priv_edit":0,"priv_view":1},"realname":"系统管理员","supply_name":"杭州蔬菜物流有限公司"},{"alter_code":"CGBG1709140114","alter_create_date":"2017-09-14","alter_flag":"2","alter_id":"80","alter_status":"2","cat_name":"果蔬类","code":"CGDD1709149532","com_name":"浙大饮食中心","create_date":"1970-01-01","dep_root_name":"第一餐饮中心（紫金港）","id":"3792","is_new":0,"is_used":"0","plan_date":"2017-09-15 09:00","priv":{"priv_add":1,"priv_audit":0,"priv_confirm":1,"priv_delete":0,"priv_edit":0,"priv_view":1},"realname":"系统管理员","supply_name":"杭州蔬菜物流有限公司"},{"alter_code":"CGBG1709140111","alter_create_date":"2017-09-14","alter_flag":"2","alter_id":"77","alter_status":"4","cat_name":"果蔬类","code":"CGDD1709149488","com_name":"浙大饮食中心","create_date":"1970-01-01","dep_root_name":"第一餐饮中心（紫金港）","id":"3765","is_new":0,"is_used":"0","plan_date":"2017-09-15 09:00","priv":{"priv_add":1,"priv_audit":0,"priv_confirm":0,"priv_delete":0,"priv_edit":0,"priv_view":1},"realname":"系统管理员","supply_name":"杭州蔬菜物流有限公司"},{"alter_code":"CGBG1709140110","alter_create_date":"2017-09-14","alter_flag":"2","alter_id":"76","alter_status":"4","cat_name":"果蔬类","code":"CGDD1709149483","com_name":"浙江交通学院","create_date":"1970-01-01","dep_root_name":"浙江交通学院饮食中心","id":"3763","is_new":0,"is_used":"0","plan_date":"2017-09-15 09:00","priv":{"priv_add":1,"priv_audit":0,"priv_confirm":0,"priv_delete":0,"priv_edit":0,"priv_view":1},"realname":"余爽","supply_name":"杭州蔬菜物流有限公司"},{"alter_code":"CGBG1709140109","alter_create_date":"2017-09-14","alter_flag":"2","alter_id":"75","alter_status":"4","cat_name":"果蔬类","code":"CGDD1707187948","com_name":"浙大饮食中心","create_date":"1970-01-01","dep_root_name":"第一餐饮中心（紫金港）","id":"3622","is_new":0,"is_used":"0","plan_date":"2017-07-19 09:00","priv":{"priv_add":1,"priv_audit":0,"priv_confirm":0,"priv_delete":0,"priv_edit":0,"priv_view":1},"realname":"采购测试","supply_name":"杭州蔬菜物流有限公司"},{"alter_code":"CGBG1709130108","alter_create_date":"2017-09-13","alter_flag":"2","alter_id":"74","alter_status":"4","cat_name":"果蔬类","code":"CGDD1709139480","com_name":"浙大饮食中心","create_date":"1970-01-01","dep_root_name":"第一餐饮中心（紫金港）","id":"3762","is_new":0,"is_used":"0","plan_date":"2017-09-14 09:00","priv":{"priv_add":1,"priv_audit":0,"priv_confirm":0,"priv_delete":0,"priv_edit":0,"priv_view":1},"realname":"采购测试","supply_name":"杭州蔬菜物流有限公司"},{"alter_code":"CGBG1709130107","alter_create_date":"2017-09-13","alter_flag":"2","alter_id":"73","alter_status":"1","cat_name":"果蔬类","code":"CGDD1709139478","com_name":"浙大饮食中心","create_date":"1970-01-01","dep_root_name":"第一餐饮中心（紫金港）","id":"3760","is_new":0,"is_used":"0","plan_date":"2017-09-14 09:00","priv":{"priv_add":1,"priv_audit":0,"priv_confirm":0,"priv_delete":1,"priv_edit":0,"priv_view":1},"realname":"采购测试","supply_name":"杭州蔬菜物流有限公司"},{"alter_code":"CGBG1709130106","alter_create_date":"2017-09-13","alter_flag":"2","alter_id":"72","alter_status":"4","cat_name":"果蔬类","code":"CGDD1707187948","com_name":"浙大饮食中心","create_date":"1970-01-01","dep_root_name":"第一餐饮中心（紫金港）","id":"3622","is_new":0,"is_used":"0","plan_date":"2017-07-19 09:00","priv":{"priv_add":1,"priv_audit":0,"priv_confirm":0,"priv_delete":0,"priv_edit":0,"priv_view":1},"realname":"采购测试","supply_name":"杭州蔬菜物流有限公司"}]
         * total : 9
         */

        private String total;
        private List<AlterBean> alter;

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public List<AlterBean> getAlter() {
            return alter;
        }

        public void setAlter(List<AlterBean> alter) {
            this.alter = alter;
        }

        public static class AlterBean {
            /**
             * alter_code : CGBG1709140117
             * alter_create_date : 2017-09-14
             * alter_flag : 2
             * alter_id : 83
             * alter_status : 4
             * cat_name : 果蔬类
             * code : CGDD1709149546
             * com_name : 浙江理工大学
             * create_date : 1970-01-01
             * dep_root_name : 浙理下沙校区
             * id : 3801
             * is_new : 0
             * is_used : 0
             * plan_date : 2017-09-15 09:00
             * priv : {"priv_add":1,"priv_audit":0,"priv_confirm":0,"priv_delete":0,"priv_edit":0,"priv_view":1}
             * realname : 新川线
             * supply_name : 杭州蔬菜物流有限公司
             */

            private String alter_code;
            private String alter_create_date;
            private String alter_flag;
            private String alter_id;
            private String alter_status;
            private String cat_name;
            private String code;
            private String com_name;
            private String create_date;
            private String dep_root_name;
            private String id;
            private int is_new;
            private String is_used;
            private String plan_date;
            private PrivBean priv;
            private String realname;
            private String supply_name;

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

            public PrivBean getPriv() {
                return priv;
            }

            public void setPriv(PrivBean priv) {
                this.priv = priv;
            }

            public String getRealname() {
                return realname;
            }

            public void setRealname(String realname) {
                this.realname = realname;
            }

            public String getSupply_name() {
                return supply_name;
            }

            public void setSupply_name(String supply_name) {
                this.supply_name = supply_name;
            }

            public static class PrivBean {
                /**
                 * priv_add : 1
                 * priv_audit : 0
                 * priv_confirm : 0
                 * priv_delete : 0
                 * priv_edit : 0
                 * priv_view : 1
                 */

                private int priv_add;
                private int priv_audit;
                private int priv_confirm;
                private int priv_delete;
                private int priv_edit;
                private int priv_view;

                public int getPriv_add() {
                    return priv_add;
                }

                public void setPriv_add(int priv_add) {
                    this.priv_add = priv_add;
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

                public int getPriv_view() {
                    return priv_view;
                }

                public void setPriv_view(int priv_view) {
                    this.priv_view = priv_view;
                }
            }
        }
    }
}
