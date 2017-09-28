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
     * data : [{"lk_brief":"紫金","lk_option":"第一餐饮中心（紫金港）","lk_value":"1"},{"lk_brief":"玉泉","lk_option":"第二餐饮中心(玉泉)","lk_value":"2"},{"lk_brief":"西溪华家池","lk_option":"第二餐饮中心(西溪华家池)","lk_value":"3"},{"lk_brief":"采购部","lk_option":"采购供应部","lk_value":"4"},{"lk_brief":"信息部","lk_option":"信息技术部","lk_value":"5"},{"lk_brief":"财务","lk_option":"财务部","lk_value":"6"},{"lk_brief":"办公","lk_option":"办公室","lk_value":"7"},{"lk_brief":"海宁","lk_option":"海宁国际校区","lk_value":"88"},{"lk_brief":"舟山","lk_option":"舟山海洋学院校区","lk_value":"89"},{"lk_brief":"师生交流吧","lk_option":"师生交流吧服务部","lk_value":"90"},{"lk_brief":"运保部","lk_option":"运行保障部","lk_value":"99"},{"lk_brief":"tlls","lk_option":"同力丽水分公司","lk_value":"109"},{"lk_brief":"下沙校区","lk_option":"下沙校区","lk_value":"116"},{"lk_brief":"文三校区","lk_option":"文三校区","lk_value":"117"},{"lk_brief":"213546","lk_option":"理工大一级部门","lk_value":"118"},{"lk_brief":"浙交饮食","lk_option":"浙江交通学院饮食中心","lk_value":"121"},{"lk_brief":"浙交综合部","lk_option":"浙江交通学院综合部","lk_value":"130"},{"lk_brief":"浙交财务部","lk_option":"浙江交通学院财务部","lk_value":"131"},{"lk_brief":"浙交场馆","lk_option":"浙江交通学院场馆中心","lk_value":"132"},{"lk_brief":"浙交招待所","lk_option":"浙江交通学院招待所","lk_value":"133"},{"lk_brief":"浙交驾培","lk_option":"浙江交通学院驾培","lk_value":"134"},{"lk_brief":"一","lk_option":"第一分公司","lk_value":"148"},{"lk_brief":"测校","lk_option":"测试校区","lk_value":"150"},{"lk_brief":"同华西湖","lk_option":"西湖校区","lk_value":"152"},{"lk_brief":"同华下沙","lk_option":"下沙校区","lk_value":"153"},{"lk_brief":"979887","lk_option":"465465","lk_value":"160"},{"lk_brief":"tlyj","lk_option":"同力一级","lk_value":"163"},{"lk_brief":"lpzx","lk_option":"联配中心","lk_value":"165"},{"lk_brief":"老河山","lk_option":"老河山校区","lk_value":"168"},{"lk_brief":"周山","lk_option":"周山郡","lk_value":"171"},{"lk_brief":"浙理","lk_option":"浙理下沙校区","lk_value":"176"},{"lk_brief":"文一校区","lk_option":"浙理文一校区","lk_value":"180"},{"lk_brief":"测试","lk_option":"浙理测试校区","lk_value":"182"},{"lk_brief":"滨江校区","lk_option":"浙理滨江校区","lk_value":"183"},{"lk_brief":"滨江校区","lk_option":"交通滨江校区","lk_value":"184"}]
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
