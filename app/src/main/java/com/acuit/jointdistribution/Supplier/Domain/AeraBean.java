package com.acuit.jointdistribution.Supplier.Domain;

import java.util.List;

/**
 * 类名: AeraBean <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/9/27 0027 14:30 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class AeraBean {


    /**
     * code : 200
     * data : [{"lk_brief":"紫金","lk_option":"第一餐饮中心（紫金港）","lk_value":"1"},{"lk_brief":"玉泉","lk_option":"第二餐饮中心(玉泉)","lk_value":"2"},{"lk_brief":"西溪华家池","lk_option":"第二餐饮中心(西溪华家池)","lk_value":"3"},{"lk_brief":"采购部","lk_option":"采购供应部","lk_value":"4"},{"lk_brief":"信息部","lk_option":"信息技术部","lk_value":"5"},{"lk_brief":"财务","lk_option":"财务部","lk_value":"6"},{"lk_brief":"办公","lk_option":"办公室","lk_value":"7"},{"lk_brief":"海宁","lk_option":"海宁国际校区","lk_value":"88"},{"lk_brief":"舟山","lk_option":"舟山海洋学院校区","lk_value":"89"},{"lk_brief":"师生交流吧","lk_option":"师生交流吧服务部","lk_value":"90"},{"lk_brief":"运保部","lk_option":"运行保障部","lk_value":"99"}]
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
         * lk_brief : 紫金
         * lk_option : 第一餐饮中心（紫金港）
         * lk_value : 1
         */

        private String lk_brief;
        private String lk_option;
        private String lk_value;

        public String getLk_brief() {
            return lk_brief;
        }

        public void setLk_brief(String lk_brief) {
            this.lk_brief = lk_brief;
        }

        public String getLk_option() {
            return lk_option;
        }

        public void setLk_option(String lk_option) {
            this.lk_option = lk_option;
        }

        public String getLk_value() {
            return lk_value;
        }

        public void setLk_value(String lk_value) {
            this.lk_value = lk_value;
        }
    }
}
