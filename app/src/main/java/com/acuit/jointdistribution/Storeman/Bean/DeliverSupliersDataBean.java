package com.acuit.jointdistribution.Storeman.Bean;

import java.util.List;

/**
 * 类名: DeliverSupliersDataBean <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/28 15:30 <p>
 * 描述: 保管员首页信息展示（订单数据、供应商数据）————网络请求结果封装类
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class DeliverSupliersDataBean {

    /**
     * code : 200
     * data : {"data":[{"name":"送货供应商总数","value":0},{"name":"未送货供应商数","value":0},{"name":"部分送货供应商数","value":0}]}
     * msg : 执行成功！
     */

    private int code;
    private DataBeanX data;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBeanX {
        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * name : 送货供应商总数
             * value : 0
             */

            private String name;
            private int value;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }
        }
    }
}
