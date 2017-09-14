package com.acuit.jointdistribution.Storeman.Bean;

import java.util.List;

/**
 * 类名: SeachSupplyByKeyBean <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/9/14 9:57 <p>
 * 描述: 搜索供应商（通过关键字）
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class SeachSupplyByKeyBean {

    /**
     * code : 200
     * data : [{"com_id":"1","com_name":"浙大饮食中心","id":"147","name":"杭州市西湖区鼎盛机电维修部"},{"com_id":"1","com_name":"浙大饮食中心","id":"165","name":"杭州市西湖区双桥蔬菜种植场"},{"com_id":"1","com_name":"浙大饮食中心","id":"136","name":"杭州市西湖区居佳五金电料商店"}]
     * msg : 执行成功！
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
         * com_id : 1
         * com_name : 浙大饮食中心
         * id : 147
         * name : 杭州市西湖区鼎盛机电维修部
         */

        private String com_id;
        private String com_name;
        private String id;
        private String name;

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

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
