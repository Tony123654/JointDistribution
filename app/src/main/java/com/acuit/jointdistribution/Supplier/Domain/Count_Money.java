package com.acuit.jointdistribution.Supplier.Domain;

/**
 * 类名: Count_Money <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/8/25 0025 14:01 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class Count_Money {


    /**
     * code : 200
     * data : {"day":{"count":"0","money":0},"mon":{"count":"36","money":2.00006124223E9},"week":{"count":"10","money":16767.93}}
     * msg : 获取数据成功
     */

    private String code;
    private DataBean data;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
         * day : {"count":"0","money":0}
         * mon : {"count":"36","money":2.00006124223E9}
         * week : {"count":"10","money":16767.93}
         */

        private DayBean day;
        private MonBean mon;
        private WeekBean week;

        public DayBean getDay() {
            return day;
        }

        public void setDay(DayBean day) {
            this.day = day;
        }

        public MonBean getMon() {
            return mon;
        }

        public void setMon(MonBean mon) {
            this.mon = mon;
        }

        public WeekBean getWeek() {
            return week;
        }

        public void setWeek(WeekBean week) {
            this.week = week;
        }

        public static class DayBean {
            /**
             * count : 0
             * money : 0
             */

            private String count;
            private int money;

            public String getCount() {
                return count;
            }

            public void setCount(String count) {
                this.count = count;
            }

            public int getMoney() {
                return money;
            }

            public void setMoney(int money) {
                this.money = money;
            }
        }

        public static class MonBean {
            /**
             * count : 36
             * money : 2.00006124223E9
             */

            private String count;
            private double money;

            public String getCount() {
                return count;
            }

            public void setCount(String count) {
                this.count = count;
            }

            public double getMoney() {
                return money;
            }

            public void setMoney(double money) {
                this.money = money;
            }
        }

        public static class WeekBean {
            /**
             * count : 10
             * money : 16767.93
             */

            private String count;
            private double money;

            public String getCount() {
                return count;
            }

            public void setCount(String count) {
                this.count = count;
            }

            public double getMoney() {
                return money;
            }

            public void setMoney(double money) {
                this.money = money;
            }
        }
    }
}
