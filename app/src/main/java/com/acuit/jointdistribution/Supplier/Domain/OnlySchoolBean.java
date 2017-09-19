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
     * data : [{"count":"5","id":"1","name":"浙大饮食中心"},{"count":"0","id":"2","name":"工大饮食中心"},{"count":"0","id":"3","name":"浙江联配中心"},{"count":"1","id":"4","name":"浙江同力教育后勤管理有限公司"},{"count":"0","id":"5","name":"浙江理工大学餐饮中心"},{"count":"0","id":"11","name":"杭州生产"},{"count":"0","id":"13","name":"杭州蔬菜"}]
     * msg : 获取数据成功
     */

    private String code;
    private String msg;
    private List<DataBean> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
         * count : 5
         * id : 1
         * name : 浙大饮食中心
         */

        private String count;
        private String id;
        private String name;

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
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
