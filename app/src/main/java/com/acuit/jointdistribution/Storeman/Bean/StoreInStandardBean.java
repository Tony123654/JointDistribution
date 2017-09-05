package com.acuit.jointdistribution.Storeman.Bean;

import java.util.List;

/**
 * 类名: StoreInStandardBean <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/9/5 10:46 <p>
 * 描述:  验收入库——商品拒收原因（验收标准）
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class StoreInStandardBean {


    /**
     * code : 200
     * data : [{"code":"bm","id":"1","name":"质量不通过","type_id":"0"},{"code":"axc","id":"2","name":"产品过期","type_id":"0"},{"code":"td","id":"3","name":"态度差","type_id":"0"}]
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
         * code : bm
         * id : 1
         * name : 质量不通过
         * type_id : 0
         */

        private String code;
        private String id;
        private String name;
        private String type_id;

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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType_id() {
            return type_id;
        }

        public void setType_id(String type_id) {
            this.type_id = type_id;
        }
    }
}
