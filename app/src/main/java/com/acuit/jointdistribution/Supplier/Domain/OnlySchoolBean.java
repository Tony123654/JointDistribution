package com.acuit.jointdistribution.Supplier.Domain;

import java.util.List;

/**
 * 类名: OnlySchoolBean <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/9/19 0019 17:06 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class OnlySchoolBean {


    /**
     * code : 200
     * data : {"rows":[{"brief":"浙大","code":"zdyszx","id":"1","is_bid":"1","is_bid_two":"是","is_contract_cycle":"1","is_del":"0","is_open_system":"1","list_order":"0","logo_url":"upload/stock/show/1505092051693.png","max_emergency_order_time":"15:30:00","menu_price_leve1":"2.00","menu_price_leve2":"3.50","menu_request_same_day":"1","name":"浙大饮食中心","request_order_same_day":"1","send_order_after_divide":"0","task_create_buy_order":"0","task_create_order":"0","task_create_request":"0"},{"code":"CSGS","id":"16","is_bid":"0","is_bid_two":"否","is_contract_cycle":"0","is_del":"0","is_open_system":"0","list_order":"99","logo_url":"upload/stock/show/1502316203792.jpg","max_emergency_order_time":"0","menu_price_leve1":"0.00","menu_price_leve2":"0.00","menu_request_same_day":"0","name":"测试公司","request_order_same_day":"0","send_order_after_divide":"0","task_create_buy_order":"0","task_create_order":"0","task_create_request":"0"},{"brief":"同力","code":"ZJTLJYHQGLYXGS","id":"4","is_bid":"1","is_bid_two":"是","is_contract_cycle":"0","is_del":"0","is_open_system":"1","list_order":"99","logo_url":"","max_emergency_order_time":"0","menu_price_leve1":"2.00","menu_price_leve2":"3.50","menu_request_same_day":"0","name":"浙江同力教育后勤管理有限公司","request_order_same_day":"0","send_order_after_divide":"1","task_create_buy_order":"0","task_create_order":"1","task_create_request":"0"},{"brief":"工大","code":"gdyszx","id":"2","is_bid":"1","is_bid_two":"是","is_contract_cycle":"0","is_del":"0","is_open_system":"1","list_order":"99","logo_url":"","max_emergency_order_time":"0","menu_price_leve1":"2.00","menu_price_leve2":"3.50","menu_request_same_day":"0","name":"工大饮食中心","request_order_same_day":"0","send_order_after_divide":"1","task_create_buy_order":"0","task_create_order":"0","task_create_request":"0"},{"code":"ZJLP","id":"24","is_bid":"0","is_bid_two":"否","is_contract_cycle":"0","is_del":"0","is_open_system":"0","list_order":"99","logo_url":"","max_emergency_order_time":"0","menu_price_leve1":"0.00","menu_price_leve2":"0.00","menu_request_same_day":"0","name":"浙江联配","request_order_same_day":"0","send_order_after_divide":"0","task_create_buy_order":"0","task_create_order":"0","task_create_request":"0"},{"brief":"交通","code":"ZJJTXY","id":"6","is_bid":"0","is_bid_two":"否","is_contract_cycle":"1","is_del":"0","is_open_system":"1","list_order":"99","logo_url":"","max_emergency_order_time":"0","menu_price_leve1":"2.00","menu_price_leve2":"3.50","menu_request_same_day":"1","name":"浙江交通学院","request_order_same_day":"1","send_order_after_divide":"1","task_create_buy_order":"0","task_create_order":"1","task_create_request":"0"},{"code":"ZJHZ00006","id":"28","is_bid":"0","is_bid_two":"否","is_contract_cycle":"1","is_del":"0","is_open_system":"0","list_order":"99","logo_url":"","max_emergency_order_time":"0","menu_price_leve1":"1.00","menu_price_leve2":"1.00","menu_request_same_day":"0","name":"杭州电视广播大学","request_order_same_day":"0","send_order_after_divide":"1","task_create_buy_order":"0","task_create_order":"1","task_create_request":"0"},{"code":"ZA002","id":"31","is_bid":"1","is_bid_two":"是","is_contract_cycle":"0","is_del":"0","is_open_system":"0","list_order":"99","logo_url":"upload/stock/show/1505084479479.png","max_emergency_order_time":"0","menu_price_leve1":"5.00","menu_price_leve2":"10.00","menu_request_same_day":"0","name":"浙江理工大学","request_order_same_day":"0","send_order_after_divide":"1","task_create_buy_order":"0","task_create_order":"1","task_create_request":"0"},{"brief":"联配","code":"zjlpzx","id":"3","is_bid":"1","is_bid_two":"是","is_contract_cycle":"0","is_del":"0","is_open_system":"1","list_order":"99","logo_url":"upload/stock/show/1505084302225.png","max_emergency_order_time":"15:30","menu_price_leve1":"2.00","menu_price_leve2":"3.50","menu_request_same_day":"0","name":"浙江联配中心","request_order_same_day":"0","send_order_after_divide":"0","task_create_buy_order":"0","task_create_order":"1","task_create_request":"0"}],"total":14}
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
         * rows : [{"brief":"浙大","code":"zdyszx","id":"1","is_bid":"1","is_bid_two":"是","is_contract_cycle":"1","is_del":"0","is_open_system":"1","list_order":"0","logo_url":"upload/stock/show/1505092051693.png","max_emergency_order_time":"15:30:00","menu_price_leve1":"2.00","menu_price_leve2":"3.50","menu_request_same_day":"1","name":"浙大饮食中心","request_order_same_day":"1","send_order_after_divide":"0","task_create_buy_order":"0","task_create_order":"0","task_create_request":"0"},{"code":"CSGS","id":"16","is_bid":"0","is_bid_two":"否","is_contract_cycle":"0","is_del":"0","is_open_system":"0","list_order":"99","logo_url":"upload/stock/show/1502316203792.jpg","max_emergency_order_time":"0","menu_price_leve1":"0.00","menu_price_leve2":"0.00","menu_request_same_day":"0","name":"测试公司","request_order_same_day":"0","send_order_after_divide":"0","task_create_buy_order":"0","task_create_order":"0","task_create_request":"0"},{"brief":"同力","code":"ZJTLJYHQGLYXGS","id":"4","is_bid":"1","is_bid_two":"是","is_contract_cycle":"0","is_del":"0","is_open_system":"1","list_order":"99","logo_url":"","max_emergency_order_time":"0","menu_price_leve1":"2.00","menu_price_leve2":"3.50","menu_request_same_day":"0","name":"浙江同力教育后勤管理有限公司","request_order_same_day":"0","send_order_after_divide":"1","task_create_buy_order":"0","task_create_order":"1","task_create_request":"0"},{"brief":"工大","code":"gdyszx","id":"2","is_bid":"1","is_bid_two":"是","is_contract_cycle":"0","is_del":"0","is_open_system":"1","list_order":"99","logo_url":"","max_emergency_order_time":"0","menu_price_leve1":"2.00","menu_price_leve2":"3.50","menu_request_same_day":"0","name":"工大饮食中心","request_order_same_day":"0","send_order_after_divide":"1","task_create_buy_order":"0","task_create_order":"0","task_create_request":"0"},{"code":"ZJLP","id":"24","is_bid":"0","is_bid_two":"否","is_contract_cycle":"0","is_del":"0","is_open_system":"0","list_order":"99","logo_url":"","max_emergency_order_time":"0","menu_price_leve1":"0.00","menu_price_leve2":"0.00","menu_request_same_day":"0","name":"浙江联配","request_order_same_day":"0","send_order_after_divide":"0","task_create_buy_order":"0","task_create_order":"0","task_create_request":"0"},{"brief":"交通","code":"ZJJTXY","id":"6","is_bid":"0","is_bid_two":"否","is_contract_cycle":"1","is_del":"0","is_open_system":"1","list_order":"99","logo_url":"","max_emergency_order_time":"0","menu_price_leve1":"2.00","menu_price_leve2":"3.50","menu_request_same_day":"1","name":"浙江交通学院","request_order_same_day":"1","send_order_after_divide":"1","task_create_buy_order":"0","task_create_order":"1","task_create_request":"0"},{"code":"ZJHZ00006","id":"28","is_bid":"0","is_bid_two":"否","is_contract_cycle":"1","is_del":"0","is_open_system":"0","list_order":"99","logo_url":"","max_emergency_order_time":"0","menu_price_leve1":"1.00","menu_price_leve2":"1.00","menu_request_same_day":"0","name":"杭州电视广播大学","request_order_same_day":"0","send_order_after_divide":"1","task_create_buy_order":"0","task_create_order":"1","task_create_request":"0"},{"code":"ZA002","id":"31","is_bid":"1","is_bid_two":"是","is_contract_cycle":"0","is_del":"0","is_open_system":"0","list_order":"99","logo_url":"upload/stock/show/1505084479479.png","max_emergency_order_time":"0","menu_price_leve1":"5.00","menu_price_leve2":"10.00","menu_request_same_day":"0","name":"浙江理工大学","request_order_same_day":"0","send_order_after_divide":"1","task_create_buy_order":"0","task_create_order":"1","task_create_request":"0"},{"brief":"联配","code":"zjlpzx","id":"3","is_bid":"1","is_bid_two":"是","is_contract_cycle":"0","is_del":"0","is_open_system":"1","list_order":"99","logo_url":"upload/stock/show/1505084302225.png","max_emergency_order_time":"15:30","menu_price_leve1":"2.00","menu_price_leve2":"3.50","menu_request_same_day":"0","name":"浙江联配中心","request_order_same_day":"0","send_order_after_divide":"0","task_create_buy_order":"0","task_create_order":"1","task_create_request":"0"}]
         * total : 14
         */

        private int total;
        private List<RowsBean> rows;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<RowsBean> getRows() {
            return rows;
        }

        public void setRows(List<RowsBean> rows) {
            this.rows = rows;
        }

        public static class RowsBean {
            /**
             * brief : 浙大
             * code : zdyszx
             * id : 1
             * is_bid : 1
             * is_bid_two : 是
             * is_contract_cycle : 1
             * is_del : 0
             * is_open_system : 1
             * list_order : 0
             * logo_url : upload/stock/show/1505092051693.png
             * max_emergency_order_time : 15:30:00
             * menu_price_leve1 : 2.00
             * menu_price_leve2 : 3.50
             * menu_request_same_day : 1
             * name : 浙大饮食中心
             * request_order_same_day : 1
             * send_order_after_divide : 0
             * task_create_buy_order : 0
             * task_create_order : 0
             * task_create_request : 0
             */

            private String brief;
            private String code;
            private String id;
            private String is_bid;
            private String is_bid_two;
            private String is_contract_cycle;
            private String is_del;
            private String is_open_system;
            private String list_order;
            private String logo_url;
            private String max_emergency_order_time;
            private String menu_price_leve1;
            private String menu_price_leve2;
            private String menu_request_same_day;
            private String name;
            private String request_order_same_day;
            private String send_order_after_divide;
            private String task_create_buy_order;
            private String task_create_order;
            private String task_create_request;

            public String getBrief() {
                return brief;
            }

            public void setBrief(String brief) {
                this.brief = brief;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getIs_bid() {
                return is_bid;
            }

            public void setIs_bid(String is_bid) {
                this.is_bid = is_bid;
            }

            public String getIs_bid_two() {
                return is_bid_two;
            }

            public void setIs_bid_two(String is_bid_two) {
                this.is_bid_two = is_bid_two;
            }

            public String getIs_contract_cycle() {
                return is_contract_cycle;
            }

            public void setIs_contract_cycle(String is_contract_cycle) {
                this.is_contract_cycle = is_contract_cycle;
            }

            public String getIs_del() {
                return is_del;
            }

            public void setIs_del(String is_del) {
                this.is_del = is_del;
            }

            public String getIs_open_system() {
                return is_open_system;
            }

            public void setIs_open_system(String is_open_system) {
                this.is_open_system = is_open_system;
            }

            public String getList_order() {
                return list_order;
            }

            public void setList_order(String list_order) {
                this.list_order = list_order;
            }

            public String getLogo_url() {
                return logo_url;
            }

            public void setLogo_url(String logo_url) {
                this.logo_url = logo_url;
            }

            public String getMax_emergency_order_time() {
                return max_emergency_order_time;
            }

            public void setMax_emergency_order_time(String max_emergency_order_time) {
                this.max_emergency_order_time = max_emergency_order_time;
            }

            public String getMenu_price_leve1() {
                return menu_price_leve1;
            }

            public void setMenu_price_leve1(String menu_price_leve1) {
                this.menu_price_leve1 = menu_price_leve1;
            }

            public String getMenu_price_leve2() {
                return menu_price_leve2;
            }

            public void setMenu_price_leve2(String menu_price_leve2) {
                this.menu_price_leve2 = menu_price_leve2;
            }

            public String getMenu_request_same_day() {
                return menu_request_same_day;
            }

            public void setMenu_request_same_day(String menu_request_same_day) {
                this.menu_request_same_day = menu_request_same_day;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRequest_order_same_day() {
                return request_order_same_day;
            }

            public void setRequest_order_same_day(String request_order_same_day) {
                this.request_order_same_day = request_order_same_day;
            }

            public String getSend_order_after_divide() {
                return send_order_after_divide;
            }

            public void setSend_order_after_divide(String send_order_after_divide) {
                this.send_order_after_divide = send_order_after_divide;
            }

            public String getTask_create_buy_order() {
                return task_create_buy_order;
            }

            public void setTask_create_buy_order(String task_create_buy_order) {
                this.task_create_buy_order = task_create_buy_order;
            }

            public String getTask_create_order() {
                return task_create_order;
            }

            public void setTask_create_order(String task_create_order) {
                this.task_create_order = task_create_order;
            }

            public String getTask_create_request() {
                return task_create_request;
            }

            public void setTask_create_request(String task_create_request) {
                this.task_create_request = task_create_request;
            }
        }
    }
}
