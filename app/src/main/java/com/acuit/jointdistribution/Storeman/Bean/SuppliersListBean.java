package com.acuit.jointdistribution.Storeman.Bean;

import java.io.Serializable;
import java.util.List;

/**
 * 类名: SuppliersListBean <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/28 18:01 <p>
 * 描述: 送货单所属供应商集合封装类
 * 保管员验收入库界面用
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class SuppliersListBean {

    /**
     * code : 200
     * data : {"store_in_list":[{"count":8,"supply_code":"HZSCWLYXGS","supply_id":"53","supply_name":"杭州蔬菜物流有限公司"},{"count":1,"supply_code":"HZLMSPYXGS","supply_id":"73","supply_name":"杭州绿萌食品有限公司"},{"count":3,"supply_code":"HZYDMNFCPP","supply_id":"91","supply_name":"杭州杨大妈农副产品配送有限公司"},{"count":1,"supply_code":"HZZQNCPYXG","supply_id":"166","supply_name":"杭州昭强农产品有限公司"},{"count":1,"supply_code":"HZYHQLZLSS","supply_id":"167","supply_name":"杭州余杭区良渚罗树生禽产品经营部"},{"count":1,"supply_code":"HZSXHQSQSC","supply_id":"165","supply_name":"杭州市西湖区双桥蔬菜种植场"},{"count":1,"supply_code":"FXMFYXYXGS","supply_id":"46","supply_name":"福新面粉（宜兴）有限公司"},{"count":4,"supply_code":"HZHSLYMYYX","supply_id":"38","supply_name":"杭州宏盛粮油贸易有限公司"}],"total":"709"}
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
         * store_in_list : [{"count":8,"supply_code":"HZSCWLYXGS","supply_id":"53","supply_name":"杭州蔬菜物流有限公司"},{"count":1,"supply_code":"HZLMSPYXGS","supply_id":"73","supply_name":"杭州绿萌食品有限公司"},{"count":3,"supply_code":"HZYDMNFCPP","supply_id":"91","supply_name":"杭州杨大妈农副产品配送有限公司"},{"count":1,"supply_code":"HZZQNCPYXG","supply_id":"166","supply_name":"杭州昭强农产品有限公司"},{"count":1,"supply_code":"HZYHQLZLSS","supply_id":"167","supply_name":"杭州余杭区良渚罗树生禽产品经营部"},{"count":1,"supply_code":"HZSXHQSQSC","supply_id":"165","supply_name":"杭州市西湖区双桥蔬菜种植场"},{"count":1,"supply_code":"FXMFYXYXGS","supply_id":"46","supply_name":"福新面粉（宜兴）有限公司"},{"count":4,"supply_code":"HZHSLYMYYX","supply_id":"38","supply_name":"杭州宏盛粮油贸易有限公司"}]
         * total : 709
         */

        private String total;
        private List<StoreInListBean> store_in_list;

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public List<StoreInListBean> getStore_in_list() {
            return store_in_list;
        }

        public void setStore_in_list(List<StoreInListBean> store_in_list) {
            this.store_in_list = store_in_list;
        }

        public static class StoreInListBean implements Serializable {
            /**
             * count : 8
             * supply_code : HZSCWLYXGS
             * supply_id : 53
             * supply_name : 杭州蔬菜物流有限公司
             */

            private int count;
            private String supply_code;
            private String supply_id;
            private String supply_name;

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getSupply_code() {
                return supply_code;
            }

            public void setSupply_code(String supply_code) {
                this.supply_code = supply_code;
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
        }
    }
}