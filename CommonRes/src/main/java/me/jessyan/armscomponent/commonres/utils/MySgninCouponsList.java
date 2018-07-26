package me.jessyan.armscomponent.commonres.utils;

import java.util.List;

public class MySgninCouponsList {


    /**
     * code : 200
     * msg : 数据获取成功
     * data : [{"date":"2018-07-01","is_sign":false},{"date":"2018-07-02","is_sign":false},{"date":"2018-07-03","is_sign":false},{"date":"2018-07-04","is_sign":false},{"date":"2018-07-05","is_sign":false},{"date":"2018-07-06","is_sign":false},{"date":"2018-07-07","is_sign":false},{"date":"2018-07-08","is_sign":false},{"date":"2018-07-09","is_sign":false},{"date":"2018-07-10","is_sign":false},{"date":"2018-07-11","is_sign":false},{"date":"2018-07-12","is_sign":false},{"date":"2018-07-13","is_sign":false},{"date":"2018-07-14","is_sign":false},{"date":"2018-07-15","is_sign":false},{"date":"2018-07-16","is_sign":false},{"date":"2018-07-17","is_sign":false},{"date":"2018-07-18","is_sign":false},{"date":"2018-07-19","is_sign":false},{"date":"2018-07-20","is_sign":false},{"date":"2018-07-21","is_sign":false},{"date":"2018-07-22","is_sign":false},{"date":"2018-07-23","is_sign":false},{"date":"2018-07-24","is_sign":false},{"date":"2018-07-25","is_sign":false},{"date":"2018-07-26","is_sign":false},{"date":"2018-07-27","is_sign":false},{"date":"2018-07-28","is_sign":false},{"date":"2018-07-29","is_sign":false},{"date":"2018-07-30","is_sign":false},{"date":"2018-07-31","is_sign":false}]
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
         * date : 2018-07-01
         * is_sign : false
         */

        private String date;
        private boolean is_sign;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public boolean isIs_sign() {
            return is_sign;
        }

        public void setIs_sign(boolean is_sign) {
            this.is_sign = is_sign;
        }
    }
}
