package com.acuit.jointdistribution.Storeman.Bean;

import com.google.gson.annotations.SerializedName;

/**
 * 类名: UnaccpetOrdersAndSuppliersBean <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/9/15 11:35 <p>
 * 描述: 保管员首页 —— 未接单订单数和供应商数
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class UnaccpetOrdersAndSuppliersBean {

    /**
     * code : 200
     * data : {"data":{"0":{"name":"待发送订单数","value":0},"1":{"name":"待供应商确认订单数","value":0},"2":{"name":"待配货订单数","value":0},"3":{"name":"待发货订单数","value":0},"4":{"name":"已入库订单数","value":0},"5":{"name":"待确认供应商数","value":0}}}
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
        /**
         * data : {"0":{"name":"待发送订单数","value":0},"1":{"name":"待供应商确认订单数","value":0},"2":{"name":"待配货订单数","value":0},"3":{"name":"待发货订单数","value":0},"4":{"name":"已入库订单数","value":0},"5":{"name":"待确认供应商数","value":0}}
         */

        private DataBean data;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * 0 : {"name":"待发送订单数","value":0}
             * 1 : {"name":"待供应商确认订单数","value":0}
             * 2 : {"name":"待配货订单数","value":0}
             * 3 : {"name":"待发货订单数","value":0}
             * 4 : {"name":"已入库订单数","value":0}
             * 5 : {"name":"待确认供应商数","value":0}
             */

            @SerializedName("0")
            private _$0Bean _$0;
            @SerializedName("1")
            private _$1Bean _$1;
            @SerializedName("2")
            private _$2Bean _$2;
            @SerializedName("3")
            private _$3Bean _$3;
            @SerializedName("4")
            private _$4Bean _$4;
            @SerializedName("5")
            private _$5Bean _$5;

            public _$0Bean get_$0() {
                return _$0;
            }

            public void set_$0(_$0Bean _$0) {
                this._$0 = _$0;
            }

            public _$1Bean get_$1() {
                return _$1;
            }

            public void set_$1(_$1Bean _$1) {
                this._$1 = _$1;
            }

            public _$2Bean get_$2() {
                return _$2;
            }

            public void set_$2(_$2Bean _$2) {
                this._$2 = _$2;
            }

            public _$3Bean get_$3() {
                return _$3;
            }

            public void set_$3(_$3Bean _$3) {
                this._$3 = _$3;
            }

            public _$4Bean get_$4() {
                return _$4;
            }

            public void set_$4(_$4Bean _$4) {
                this._$4 = _$4;
            }

            public _$5Bean get_$5() {
                return _$5;
            }

            public void set_$5(_$5Bean _$5) {
                this._$5 = _$5;
            }

            public static class _$0Bean {
                /**
                 * name : 待发送订单数
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

            public static class _$1Bean {
                /**
                 * name : 待供应商确认订单数
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

            public static class _$2Bean {
                /**
                 * name : 待配货订单数
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

            public static class _$3Bean {
                /**
                 * name : 待发货订单数
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

            public static class _$4Bean {
                /**
                 * name : 已入库订单数
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

            public static class _$5Bean {
                /**
                 * name : 待确认供应商数
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
}
