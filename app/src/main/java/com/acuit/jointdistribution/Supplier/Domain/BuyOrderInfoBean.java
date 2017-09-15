package com.acuit.jointdistribution.Supplier.Domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 类名: BuyOrderInfoBean <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/8/30 0030 19:26 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class BuyOrderInfoBean {


    /**
     * code : 200
     * data : {"dep_list":{"8":"三楼餐厅"},"department_list":{"三楼餐厅":{"stock_info":[{"amount":"999.00","big_region_id":"15","busy_amount":"0.00","buy_order_id":"2","code":"","create_date":"1475041789","dep_code":"","dep_id":"8","direct_in_out":"0","id":"3","in_amount":"999.00","in_money":"8991.00","is_del":"0","is_used":"0","lot_control":"0","money":"8991.00","price":"9.00","region_id":"1","status":"1","stock_code":"1010200002","stock_id":"1257","stock_name":"中筋特一粉","sub_cat_code":"201","sub_cat_id":"56","sub_cat_name":"大众类","unit_conv":"0.00","wait_store_in":"0"},{"amount":"999.00","big_region_id":"15","busy_amount":"0.00","buy_order_id":"2","code":"","create_date":"1475041789","dep_code":"","dep_id":"8","direct_in_out":"0","id":"4","in_amount":"999.00","in_money":"8991.00","is_del":"0","is_used":"0","lot_control":"0","money":"8991.00","price":"9.00","region_id":"1","status":"1","stock_code":"1010200007","stock_id":"3106","stock_name":"金法高面包粉","sub_cat_code":"201","sub_cat_id":"56","sub_cat_name":"大众类","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"999.00","big_region_id":"15","busy_amount":"0.00","buy_order_id":"2","code":"","create_date":"1475041789","dep_code":"","dep_id":"8","direct_in_out":"0","id":"5","in_amount":"999.00","in_money":"8991.00","is_del":"0","is_used":"0","lot_control":"0","money":"8991.00","price":"9.00","region_id":"1","status":"1","stock_code":"1010200012","stock_id":"3111","stock_name":"苏三零特精粉","sub_cat_code":"201","sub_cat_id":"56","sub_cat_name":"大众类","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"}],"total_amount":2997,"total_money":26973}},"order_info":{"cat_code":"","cat_id":"36","cat_name":"粮油类","code":"CGDD16090950","com_id":"0","contact_number":"","contact_person":"","create_date":"2016-09-28 13:49:49","create_user":"1","create_user_phone":"15973143041","dep_brief_name":"紫金","dep_ids":"","dep_root_id":"1","dep_root_name":"紫金港餐饮中心","end_date":"0","id":"2","is_del":"1","is_used":"0","memo":"","order_date":"0","order_id":"1424","plan_date":"2016-09-29 09:00:00","request_dep_strs":"","status":"5","supply_id":"46","supply_name":"福新面粉（宜兴）有限","supply_phone":"","total_amount":"2997.00","total_money":"26973.00","update_date":"0000-00-00 00:00:00"},"stock_list_app":[{"amount_all":999,"count":"8991.00","dep_info":{"8":{"amount":"999.00","dep_name":"三楼餐厅","id":"4"}},"price":"9.00","stock_breif":"JFGMBF","stock_id":3106,"stock_name":"金法高面包粉","type_id":"56","unit_name":"千克"},{"amount_all":999,"count":"8991.00","dep_info":{"8":{"amount":"999.00","dep_name":"三楼餐厅","id":"5"}},"price":"9.00","stock_breif":"SSLTJF","stock_id":3111,"stock_name":"苏三零特精粉","type_id":"56","unit_name":"千克"},{"amount_all":999,"count":"8991.00","dep_info":{"8":{"amount":"999.00","dep_name":"三楼餐厅","id":"3"}},"price":"9.00","stock_breif":"ZJTYF","stock_id":1257,"stock_name":"中筋特一粉","type_id":"56"}]}
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
         * dep_list : {"8":"三楼餐厅"}
         * department_list : {"三楼餐厅":{"stock_info":[{"amount":"999.00","big_region_id":"15","busy_amount":"0.00","buy_order_id":"2","code":"","create_date":"1475041789","dep_code":"","dep_id":"8","direct_in_out":"0","id":"3","in_amount":"999.00","in_money":"8991.00","is_del":"0","is_used":"0","lot_control":"0","money":"8991.00","price":"9.00","region_id":"1","status":"1","stock_code":"1010200002","stock_id":"1257","stock_name":"中筋特一粉","sub_cat_code":"201","sub_cat_id":"56","sub_cat_name":"大众类","unit_conv":"0.00","wait_store_in":"0"},{"amount":"999.00","big_region_id":"15","busy_amount":"0.00","buy_order_id":"2","code":"","create_date":"1475041789","dep_code":"","dep_id":"8","direct_in_out":"0","id":"4","in_amount":"999.00","in_money":"8991.00","is_del":"0","is_used":"0","lot_control":"0","money":"8991.00","price":"9.00","region_id":"1","status":"1","stock_code":"1010200007","stock_id":"3106","stock_name":"金法高面包粉","sub_cat_code":"201","sub_cat_id":"56","sub_cat_name":"大众类","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"999.00","big_region_id":"15","busy_amount":"0.00","buy_order_id":"2","code":"","create_date":"1475041789","dep_code":"","dep_id":"8","direct_in_out":"0","id":"5","in_amount":"999.00","in_money":"8991.00","is_del":"0","is_used":"0","lot_control":"0","money":"8991.00","price":"9.00","region_id":"1","status":"1","stock_code":"1010200012","stock_id":"3111","stock_name":"苏三零特精粉","sub_cat_code":"201","sub_cat_id":"56","sub_cat_name":"大众类","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"}],"total_amount":2997,"total_money":26973}}
         * order_info : {"cat_code":"","cat_id":"36","cat_name":"粮油类","code":"CGDD16090950","com_id":"0","contact_number":"","contact_person":"","create_date":"2016-09-28 13:49:49","create_user":"1","create_user_phone":"15973143041","dep_brief_name":"紫金","dep_ids":"","dep_root_id":"1","dep_root_name":"紫金港餐饮中心","end_date":"0","id":"2","is_del":"1","is_used":"0","memo":"","order_date":"0","order_id":"1424","plan_date":"2016-09-29 09:00:00","request_dep_strs":"","status":"5","supply_id":"46","supply_name":"福新面粉（宜兴）有限","supply_phone":"","total_amount":"2997.00","total_money":"26973.00","update_date":"0000-00-00 00:00:00"}
         * stock_list_app : [{"amount_all":999,"count":"8991.00","dep_info":{"8":{"amount":"999.00","dep_name":"三楼餐厅","id":"4"}},"price":"9.00","stock_breif":"JFGMBF","stock_id":3106,"stock_name":"金法高面包粉","type_id":"56","unit_name":"千克"},{"amount_all":999,"count":"8991.00","dep_info":{"8":{"amount":"999.00","dep_name":"三楼餐厅","id":"5"}},"price":"9.00","stock_breif":"SSLTJF","stock_id":3111,"stock_name":"苏三零特精粉","type_id":"56","unit_name":"千克"},{"amount_all":999,"count":"8991.00","dep_info":{"8":{"amount":"999.00","dep_name":"三楼餐厅","id":"3"}},"price":"9.00","stock_breif":"ZJTYF","stock_id":1257,"stock_name":"中筋特一粉","type_id":"56"}]
         */

        private DepListBean dep_list;
        private DepartmentListBean department_list;
        private OrderInfoBean order_info;
        private List<StockListAppBean> stock_list_app;

        public DepListBean getDep_list() {
            return dep_list;
        }

        public void setDep_list(DepListBean dep_list) {
            this.dep_list = dep_list;
        }

        public DepartmentListBean getDepartment_list() {
            return department_list;
        }

        public void setDepartment_list(DepartmentListBean department_list) {
            this.department_list = department_list;
        }

        public OrderInfoBean getOrder_info() {
            return order_info;
        }

        public void setOrder_info(OrderInfoBean order_info) {
            this.order_info = order_info;
        }

        public List<StockListAppBean> getStock_list_app() {
            return stock_list_app;
        }

        public void setStock_list_app(List<StockListAppBean> stock_list_app) {
            this.stock_list_app = stock_list_app;
        }

        public static class DepListBean {
            /**
             * 8 : 三楼餐厅
             */

            @SerializedName("8")
            private String _$8;

            public String get_$8() {
                return _$8;
            }

            public void set_$8(String _$8) {
                this._$8 = _$8;
            }
        }

        public static class DepartmentListBean {
            /**
             * 三楼餐厅 : {"stock_info":[{"amount":"999.00","big_region_id":"15","busy_amount":"0.00","buy_order_id":"2","code":"","create_date":"1475041789","dep_code":"","dep_id":"8","direct_in_out":"0","id":"3","in_amount":"999.00","in_money":"8991.00","is_del":"0","is_used":"0","lot_control":"0","money":"8991.00","price":"9.00","region_id":"1","status":"1","stock_code":"1010200002","stock_id":"1257","stock_name":"中筋特一粉","sub_cat_code":"201","sub_cat_id":"56","sub_cat_name":"大众类","unit_conv":"0.00","wait_store_in":"0","unit_id":"6","unit_name":"千克"},{"amount":"999.00","big_region_id":"15","busy_amount":"0.00","buy_order_id":"2","code":"","create_date":"1475041789","dep_code":"","dep_id":"8","direct_in_out":"0","id":"4","in_amount":"999.00","in_money":"8991.00","is_del":"0","is_used":"0","lot_control":"0","money":"8991.00","price":"9.00","region_id":"1","status":"1","stock_code":"1010200007","stock_id":"3106","stock_name":"金法高面包粉","sub_cat_code":"201","sub_cat_id":"56","sub_cat_name":"大众类","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"999.00","big_region_id":"15","busy_amount":"0.00","buy_order_id":"2","code":"","create_date":"1475041789","dep_code":"","dep_id":"8","direct_in_out":"0","id":"5","in_amount":"999.00","in_money":"8991.00","is_del":"0","is_used":"0","lot_control":"0","money":"8991.00","price":"9.00","region_id":"1","status":"1","stock_code":"1010200012","stock_id":"3111","stock_name":"苏三零特精粉","sub_cat_code":"201","sub_cat_id":"56","sub_cat_name":"大众类","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"}],"total_amount":2997,"total_money":26973}
             */

            private 三楼餐厅Bean 三楼餐厅;

            public 三楼餐厅Bean get三楼餐厅() {
                return 三楼餐厅;
            }

            public void set三楼餐厅(三楼餐厅Bean 三楼餐厅) {
                this.三楼餐厅 = 三楼餐厅;
            }

            public static class 三楼餐厅Bean {
                /**
                 * stock_info : [{"amount":"999.00","big_region_id":"15","busy_amount":"0.00","buy_order_id":"2","code":"","create_date":"1475041789","dep_code":"","dep_id":"8","direct_in_out":"0","id":"3","in_amount":"999.00","in_money":"8991.00","is_del":"0","is_used":"0","lot_control":"0","money":"8991.00","price":"9.00","region_id":"1","status":"1","stock_code":"1010200002","stock_id":"1257","stock_name":"中筋特一粉","sub_cat_code":"201","sub_cat_id":"56","sub_cat_name":"大众类","unit_conv":"0.00","wait_store_in":"0"},{"amount":"999.00","big_region_id":"15","busy_amount":"0.00","buy_order_id":"2","code":"","create_date":"1475041789","dep_code":"","dep_id":"8","direct_in_out":"0","id":"4","in_amount":"999.00","in_money":"8991.00","is_del":"0","is_used":"0","lot_control":"0","money":"8991.00","price":"9.00","region_id":"1","status":"1","stock_code":"1010200007","stock_id":"3106","stock_name":"金法高面包粉","sub_cat_code":"201","sub_cat_id":"56","sub_cat_name":"大众类","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"},{"amount":"999.00","big_region_id":"15","busy_amount":"0.00","buy_order_id":"2","code":"","create_date":"1475041789","dep_code":"","dep_id":"8","direct_in_out":"0","id":"5","in_amount":"999.00","in_money":"8991.00","is_del":"0","is_used":"0","lot_control":"0","money":"8991.00","price":"9.00","region_id":"1","status":"1","stock_code":"1010200012","stock_id":"3111","stock_name":"苏三零特精粉","sub_cat_code":"201","sub_cat_id":"56","sub_cat_name":"大众类","unit_conv":"0.00","unit_id":"6","unit_name":"千克","wait_store_in":"0"}]
                 * total_amount : 2997
                 * total_money : 26973
                 */

                private int total_amount;
                private int total_money;
                private List<StockInfoBean> stock_info;

                public int getTotal_amount() {
                    return total_amount;
                }

                public void setTotal_amount(int total_amount) {
                    this.total_amount = total_amount;
                }

                public int getTotal_money() {
                    return total_money;
                }

                public void setTotal_money(int total_money) {
                    this.total_money = total_money;
                }

                public List<StockInfoBean> getStock_info() {
                    return stock_info;
                }

                public void setStock_info(List<StockInfoBean> stock_info) {
                    this.stock_info = stock_info;
                }

                public static class StockInfoBean {
                    /**
                     * amount : 999.00
                     * big_region_id : 15
                     * busy_amount : 0.00
                     * buy_order_id : 2
                     * code :
                     * create_date : 1475041789
                     * dep_code :
                     * dep_id : 8
                     * direct_in_out : 0
                     * id : 3
                     * in_amount : 999.00
                     * in_money : 8991.00
                     * is_del : 0
                     * is_used : 0
                     * lot_control : 0
                     * money : 8991.00
                     * price : 9.00
                     * region_id : 1
                     * status : 1
                     * stock_code : 1010200002
                     * stock_id : 1257
                     * stock_name : 中筋特一粉
                     * sub_cat_code : 201
                     * sub_cat_id : 56
                     * sub_cat_name : 大众类
                     * unit_conv : 0.00
                     * wait_store_in : 0
                     * unit_id : 6
                     * unit_name : 千克
                     */

                    private String amount;
                    private String big_region_id;
                    private String busy_amount;
                    private String buy_order_id;
                    private String code;
                    private String create_date;
                    private String dep_code;
                    private String dep_id;
                    private String direct_in_out;
                    private String id;
                    private String in_amount;
                    private String in_money;
                    private String is_del;
                    private String is_used;
                    private String lot_control;
                    private String money;
                    private String price;
                    private String region_id;
                    private String status;
                    private String stock_code;
                    private String stock_id;
                    private String stock_name;
                    private String sub_cat_code;
                    private String sub_cat_id;
                    private String sub_cat_name;
                    private String unit_conv;
                    private String wait_store_in;
                    private String unit_id;
                    private String unit_name;

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

                    public String getBusy_amount() {
                        return busy_amount;
                    }

                    public void setBusy_amount(String busy_amount) {
                        this.busy_amount = busy_amount;
                    }

                    public String getBuy_order_id() {
                        return buy_order_id;
                    }

                    public void setBuy_order_id(String buy_order_id) {
                        this.buy_order_id = buy_order_id;
                    }

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getCreate_date() {
                        return create_date;
                    }

                    public void setCreate_date(String create_date) {
                        this.create_date = create_date;
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

                    public String getDirect_in_out() {
                        return direct_in_out;
                    }

                    public void setDirect_in_out(String direct_in_out) {
                        this.direct_in_out = direct_in_out;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getIn_amount() {
                        return in_amount;
                    }

                    public void setIn_amount(String in_amount) {
                        this.in_amount = in_amount;
                    }

                    public String getIn_money() {
                        return in_money;
                    }

                    public void setIn_money(String in_money) {
                        this.in_money = in_money;
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

                    public String getLot_control() {
                        return lot_control;
                    }

                    public void setLot_control(String lot_control) {
                        this.lot_control = lot_control;
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

                    public String getUnit_conv() {
                        return unit_conv;
                    }

                    public void setUnit_conv(String unit_conv) {
                        this.unit_conv = unit_conv;
                    }

                    public String getWait_store_in() {
                        return wait_store_in;
                    }

                    public void setWait_store_in(String wait_store_in) {
                        this.wait_store_in = wait_store_in;
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

        public static class OrderInfoBean {
            /**
             * cat_code :
             * cat_id : 36
             * cat_name : 粮油类
             * code : CGDD16090950
             * com_id : 0
             * contact_number :
             * contact_person :
             * create_date : 2016-09-28 13:49:49
             * create_user : 1
             * create_user_phone : 15973143041
             * dep_brief_name : 紫金
             * dep_ids :
             * dep_root_id : 1
             * dep_root_name : 紫金港餐饮中心
             * end_date : 0
             * id : 2
             * is_del : 1
             * is_used : 0
             * memo :
             * order_date : 0
             * order_id : 1424
             * plan_date : 2016-09-29 09:00:00
             * request_dep_strs :
             * status : 5
             * supply_id : 46
             * supply_name : 福新面粉（宜兴）有限
             * supply_phone :
             * total_amount : 2997.00
             * total_money : 26973.00
             * update_date : 0000-00-00 00:00:00
             */

            private String cat_code;
            private String cat_id;
            private String cat_name;
            private String code;
            private String com_id;
            private String contact_number;
            private String contact_person;
            private String create_date;
            private String create_user;
            private String create_user_phone;
            private String dep_brief_name;
            private String dep_ids;
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
            private String request_dep_strs;
            private String status;
            private String supply_id;
            private String supply_name;
            private String supply_phone;
            private String total_amount;
            private String total_money;
            private String update_date;

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

            public String getCom_id() {
                return com_id;
            }

            public void setCom_id(String com_id) {
                this.com_id = com_id;
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

            public String getCreate_user_phone() {
                return create_user_phone;
            }

            public void setCreate_user_phone(String create_user_phone) {
                this.create_user_phone = create_user_phone;
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

            public String getSupply_phone() {
                return supply_phone;
            }

            public void setSupply_phone(String supply_phone) {
                this.supply_phone = supply_phone;
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
        }

        public static class StockListAppBean {
            /**
             * amount_all : 999
             * count : 8991.00
             * dep_info : {"8":{"amount":"999.00","dep_name":"三楼餐厅","id":"4"}}
             * price : 9.00
             * stock_breif : JFGMBF
             * stock_id : 3106
             * stock_name : 金法高面包粉
             * type_id : 56
             * unit_name : 千克
             */

            private int amount_all;
            private String count;
            private DepInfoBean dep_info;
            private String price;
            private String stock_breif;
            private int stock_id;
            private String stock_name;
            private String type_id;
            private String unit_name;

            public int getAmount_all() {
                return amount_all;
            }

            public void setAmount_all(int amount_all) {
                this.amount_all = amount_all;
            }

            public String getCount() {
                return count;
            }

            public void setCount(String count) {
                this.count = count;
            }

            public DepInfoBean getDep_info() {
                return dep_info;
            }

            public void setDep_info(DepInfoBean dep_info) {
                this.dep_info = dep_info;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getStock_breif() {
                return stock_breif;
            }

            public void setStock_breif(String stock_breif) {
                this.stock_breif = stock_breif;
            }

            public int getStock_id() {
                return stock_id;
            }

            public void setStock_id(int stock_id) {
                this.stock_id = stock_id;
            }

            public String getStock_name() {
                return stock_name;
            }

            public void setStock_name(String stock_name) {
                this.stock_name = stock_name;
            }

            public String getType_id() {
                return type_id;
            }

            public void setType_id(String type_id) {
                this.type_id = type_id;
            }

            public String getUnit_name() {
                return unit_name;
            }

            public void setUnit_name(String unit_name) {
                this.unit_name = unit_name;
            }

            public static class DepInfoBean {
                /**
                 * 8 : {"amount":"999.00","dep_name":"三楼餐厅","id":"4"}
                 */

                @SerializedName("8")
                private _$8Bean _$8;

                public _$8Bean get_$8() {
                    return _$8;
                }

                public void set_$8(_$8Bean _$8) {
                    this._$8 = _$8;
                }

                public static class _$8Bean {
                    /**
                     * amount : 999.00
                     * dep_name : 三楼餐厅
                     * id : 4
                     */

                    private String amount;
                    private String dep_name;
                    private String id;

                    public String getAmount() {
                        return amount;
                    }

                    public void setAmount(String amount) {
                        this.amount = amount;
                    }

                    public String getDep_name() {
                        return dep_name;
                    }

                    public void setDep_name(String dep_name) {
                        this.dep_name = dep_name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }
            }
        }
    }
}
