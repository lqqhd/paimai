package me.jessyan.armscomponent.commonres.utils;

import java.util.List;

public class MyCouponsList {


    /**
     * code : 200
     * msg : 数据获取成功
     * data : {"no_use_count":4,"yes_use_count":0,"yes_time_count":0,"no_use":[{"cou_id":"1","cou_name":"注册立即赠100元优惠券","cou_total":"200","cou_man":"2000","cou_money":"100","cou_user_num":"1","cou_goods":"","spec_cat":"","cou_start_time":"1488268800","cou_end_time":"1616400000","cou_type":"1","cou_get_man":"0","cou_ok_user":"6,9,10,7,8,3","cou_ok_goods":"0","cou_ok_cat":"","cou_intro":"","cou_add_time":"1490220618","ru_id":"0","cou_order":"0","cou_title":"注册立即赠100元优惠券","review_status":"3","review_content":"","uc_id":"53","user_id":"84","is_use":"0","uc_sn":"153194253681","order_id":"0","is_use_time":"0","receive_time":"0","order_sn":null,"add_time":"2018-07-31","shop_name":"乐拍","cou_start_time_date":"2017-03-01","cou_end_time_date":"2021-03-23","cou_type_name":null},{"cou_id":"11","cou_name":"每日签到","cou_total":"6000","cou_man":"0","cou_money":"5","cou_user_num":"30","cou_goods":"","spec_cat":"","cou_start_time":"1532422219","cou_end_time":"1535097600","cou_type":"5","cou_get_man":"0","cou_ok_user":"0","cou_ok_goods":"0","cou_ok_cat":"","cou_intro":"","cou_add_time":"1532422606","ru_id":"0","cou_order":"0","cou_title":"每日签到","review_status":"3","review_content":"","uc_id":"69","user_id":"84","is_use":"0","uc_sn":"153263003816","order_id":"0","is_use_time":"0","receive_time":"1532630038","order_sn":null,"add_time":"2018-07-31","shop_name":"乐拍","cou_start_time_date":"2018-07-25","cou_end_time_date":"2018-08-25","cou_type_name":null},{"cou_id":"11","cou_name":"每日签到","cou_total":"6000","cou_man":"0","cou_money":"5","cou_user_num":"30","cou_goods":"","spec_cat":"","cou_start_time":"1532422219","cou_end_time":"1535097600","cou_type":"5","cou_get_man":"0","cou_ok_user":"0","cou_ok_goods":"0","cou_ok_cat":"","cou_intro":"","cou_add_time":"1532422606","ru_id":"0","cou_order":"0","cou_title":"每日签到","review_status":"3","review_content":"","uc_id":"87","user_id":"84","is_use":"0","uc_sn":"153288267329","order_id":"0","is_use_time":"0","receive_time":"1532882673","order_sn":null,"add_time":"2018-07-31","shop_name":"乐拍","cou_start_time_date":"2018-07-25","cou_end_time_date":"2018-08-25","cou_type_name":null},{"cou_id":"11","cou_name":"每日签到","cou_total":"6000","cou_man":"0","cou_money":"5","cou_user_num":"30","cou_goods":"","spec_cat":"","cou_start_time":"1532422219","cou_end_time":"1535097600","cou_type":"5","cou_get_man":"0","cou_ok_user":"0","cou_ok_goods":"0","cou_ok_cat":"","cou_intro":"","cou_add_time":"1532422606","ru_id":"0","cou_order":"0","cou_title":"每日签到","review_status":"3","review_content":"","uc_id":"91","user_id":"84","is_use":"0","uc_sn":"153297208923","order_id":"0","is_use_time":"0","receive_time":"1532972089","order_sn":null,"add_time":"2018-07-31","shop_name":"乐拍","cou_start_time_date":"2018-07-25","cou_end_time_date":"2018-08-25","cou_type_name":null}],"yes_use":null,"yes_time":null,"no_time":null}
     */

    private int code;
    private String msg;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * no_use_count : 4
         * yes_use_count : 0
         * yes_time_count : 0
         * no_use : [{"cou_id":"1","cou_name":"注册立即赠100元优惠券","cou_total":"200","cou_man":"2000","cou_money":"100","cou_user_num":"1","cou_goods":"","spec_cat":"","cou_start_time":"1488268800","cou_end_time":"1616400000","cou_type":"1","cou_get_man":"0","cou_ok_user":"6,9,10,7,8,3","cou_ok_goods":"0","cou_ok_cat":"","cou_intro":"","cou_add_time":"1490220618","ru_id":"0","cou_order":"0","cou_title":"注册立即赠100元优惠券","review_status":"3","review_content":"","uc_id":"53","user_id":"84","is_use":"0","uc_sn":"153194253681","order_id":"0","is_use_time":"0","receive_time":"0","order_sn":null,"add_time":"2018-07-31","shop_name":"乐拍","cou_start_time_date":"2017-03-01","cou_end_time_date":"2021-03-23","cou_type_name":null},{"cou_id":"11","cou_name":"每日签到","cou_total":"6000","cou_man":"0","cou_money":"5","cou_user_num":"30","cou_goods":"","spec_cat":"","cou_start_time":"1532422219","cou_end_time":"1535097600","cou_type":"5","cou_get_man":"0","cou_ok_user":"0","cou_ok_goods":"0","cou_ok_cat":"","cou_intro":"","cou_add_time":"1532422606","ru_id":"0","cou_order":"0","cou_title":"每日签到","review_status":"3","review_content":"","uc_id":"69","user_id":"84","is_use":"0","uc_sn":"153263003816","order_id":"0","is_use_time":"0","receive_time":"1532630038","order_sn":null,"add_time":"2018-07-31","shop_name":"乐拍","cou_start_time_date":"2018-07-25","cou_end_time_date":"2018-08-25","cou_type_name":null},{"cou_id":"11","cou_name":"每日签到","cou_total":"6000","cou_man":"0","cou_money":"5","cou_user_num":"30","cou_goods":"","spec_cat":"","cou_start_time":"1532422219","cou_end_time":"1535097600","cou_type":"5","cou_get_man":"0","cou_ok_user":"0","cou_ok_goods":"0","cou_ok_cat":"","cou_intro":"","cou_add_time":"1532422606","ru_id":"0","cou_order":"0","cou_title":"每日签到","review_status":"3","review_content":"","uc_id":"87","user_id":"84","is_use":"0","uc_sn":"153288267329","order_id":"0","is_use_time":"0","receive_time":"1532882673","order_sn":null,"add_time":"2018-07-31","shop_name":"乐拍","cou_start_time_date":"2018-07-25","cou_end_time_date":"2018-08-25","cou_type_name":null},{"cou_id":"11","cou_name":"每日签到","cou_total":"6000","cou_man":"0","cou_money":"5","cou_user_num":"30","cou_goods":"","spec_cat":"","cou_start_time":"1532422219","cou_end_time":"1535097600","cou_type":"5","cou_get_man":"0","cou_ok_user":"0","cou_ok_goods":"0","cou_ok_cat":"","cou_intro":"","cou_add_time":"1532422606","ru_id":"0","cou_order":"0","cou_title":"每日签到","review_status":"3","review_content":"","uc_id":"91","user_id":"84","is_use":"0","uc_sn":"153297208923","order_id":"0","is_use_time":"0","receive_time":"1532972089","order_sn":null,"add_time":"2018-07-31","shop_name":"乐拍","cou_start_time_date":"2018-07-25","cou_end_time_date":"2018-08-25","cou_type_name":null}]
         * yes_use : null
         * yes_time : null
         * no_time : null
         */

        private int no_use_count;
        private int yes_use_count;
        private int yes_time_count;
        private Object yes_use;
        private Object yes_time;
        private Object no_time;
        private List<NoUseBean> no_use;

        public int getNo_use_count() {
            return no_use_count;
        }

        public void setNo_use_count(int no_use_count) {
            this.no_use_count = no_use_count;
        }

        public int getYes_use_count() {
            return yes_use_count;
        }

        public void setYes_use_count(int yes_use_count) {
            this.yes_use_count = yes_use_count;
        }

        public int getYes_time_count() {
            return yes_time_count;
        }

        public void setYes_time_count(int yes_time_count) {
            this.yes_time_count = yes_time_count;
        }

        public Object getYes_use() {
            return yes_use;
        }

        public void setYes_use(Object yes_use) {
            this.yes_use = yes_use;
        }

        public Object getYes_time() {
            return yes_time;
        }

        public void setYes_time(Object yes_time) {
            this.yes_time = yes_time;
        }

        public Object getNo_time() {
            return no_time;
        }

        public void setNo_time(Object no_time) {
            this.no_time = no_time;
        }

        public List<NoUseBean> getNo_use() {
            return no_use;
        }

        public void setNo_use(List<NoUseBean> no_use) {
            this.no_use = no_use;
        }

        public static class NoUseBean {
            /**
             * cou_id : 1
             * cou_name : 注册立即赠100元优惠券
             * cou_total : 200
             * cou_man : 2000
             * cou_money : 100
             * cou_user_num : 1
             * cou_goods :
             * spec_cat :
             * cou_start_time : 1488268800
             * cou_end_time : 1616400000
             * cou_type : 1
             * cou_get_man : 0
             * cou_ok_user : 6,9,10,7,8,3
             * cou_ok_goods : 0
             * cou_ok_cat :
             * cou_intro :
             * cou_add_time : 1490220618
             * ru_id : 0
             * cou_order : 0
             * cou_title : 注册立即赠100元优惠券
             * review_status : 3
             * review_content :
             * uc_id : 53
             * user_id : 84
             * is_use : 0
             * uc_sn : 153194253681
             * order_id : 0
             * is_use_time : 0
             * receive_time : 0
             * order_sn : null
             * add_time : 2018-07-31
             * shop_name : 乐拍
             * cou_start_time_date : 2017-03-01
             * cou_end_time_date : 2021-03-23
             * cou_type_name : null
             */

            private String cou_id;
            private String cou_name;
            private String cou_total;
            private String cou_man;
            private String cou_money;
            private String cou_user_num;
            private String cou_goods;
            private String spec_cat;
            private String cou_start_time;
            private String cou_end_time;
            private String cou_type;
            private String cou_get_man;
            private String cou_ok_user;
            private String cou_ok_goods;
            private String cou_ok_cat;
            private String cou_intro;
            private String cou_add_time;
            private String ru_id;
            private String cou_order;
            private String cou_title;
            private String review_status;
            private String review_content;
            private String uc_id;
            private String user_id;
            private String is_use;
            private String uc_sn;
            private String order_id;
            private String is_use_time;
            private String receive_time;
            private Object order_sn;
            private String add_time;
            private String shop_name;
            private String cou_start_time_date;
            private String cou_end_time_date;
            private Object cou_type_name;

            public String getCou_id() {
                return cou_id;
            }

            public void setCou_id(String cou_id) {
                this.cou_id = cou_id;
            }

            public String getCou_name() {
                return cou_name;
            }

            public void setCou_name(String cou_name) {
                this.cou_name = cou_name;
            }

            public String getCou_total() {
                return cou_total;
            }

            public void setCou_total(String cou_total) {
                this.cou_total = cou_total;
            }

            public String getCou_man() {
                return cou_man;
            }

            public void setCou_man(String cou_man) {
                this.cou_man = cou_man;
            }

            public String getCou_money() {
                return cou_money;
            }

            public void setCou_money(String cou_money) {
                this.cou_money = cou_money;
            }

            public String getCou_user_num() {
                return cou_user_num;
            }

            public void setCou_user_num(String cou_user_num) {
                this.cou_user_num = cou_user_num;
            }

            public String getCou_goods() {
                return cou_goods;
            }

            public void setCou_goods(String cou_goods) {
                this.cou_goods = cou_goods;
            }

            public String getSpec_cat() {
                return spec_cat;
            }

            public void setSpec_cat(String spec_cat) {
                this.spec_cat = spec_cat;
            }

            public String getCou_start_time() {
                return cou_start_time;
            }

            public void setCou_start_time(String cou_start_time) {
                this.cou_start_time = cou_start_time;
            }

            public String getCou_end_time() {
                return cou_end_time;
            }

            public void setCou_end_time(String cou_end_time) {
                this.cou_end_time = cou_end_time;
            }

            public String getCou_type() {
                return cou_type;
            }

            public void setCou_type(String cou_type) {
                this.cou_type = cou_type;
            }

            public String getCou_get_man() {
                return cou_get_man;
            }

            public void setCou_get_man(String cou_get_man) {
                this.cou_get_man = cou_get_man;
            }

            public String getCou_ok_user() {
                return cou_ok_user;
            }

            public void setCou_ok_user(String cou_ok_user) {
                this.cou_ok_user = cou_ok_user;
            }

            public String getCou_ok_goods() {
                return cou_ok_goods;
            }

            public void setCou_ok_goods(String cou_ok_goods) {
                this.cou_ok_goods = cou_ok_goods;
            }

            public String getCou_ok_cat() {
                return cou_ok_cat;
            }

            public void setCou_ok_cat(String cou_ok_cat) {
                this.cou_ok_cat = cou_ok_cat;
            }

            public String getCou_intro() {
                return cou_intro;
            }

            public void setCou_intro(String cou_intro) {
                this.cou_intro = cou_intro;
            }

            public String getCou_add_time() {
                return cou_add_time;
            }

            public void setCou_add_time(String cou_add_time) {
                this.cou_add_time = cou_add_time;
            }

            public String getRu_id() {
                return ru_id;
            }

            public void setRu_id(String ru_id) {
                this.ru_id = ru_id;
            }

            public String getCou_order() {
                return cou_order;
            }

            public void setCou_order(String cou_order) {
                this.cou_order = cou_order;
            }

            public String getCou_title() {
                return cou_title;
            }

            public void setCou_title(String cou_title) {
                this.cou_title = cou_title;
            }

            public String getReview_status() {
                return review_status;
            }

            public void setReview_status(String review_status) {
                this.review_status = review_status;
            }

            public String getReview_content() {
                return review_content;
            }

            public void setReview_content(String review_content) {
                this.review_content = review_content;
            }

            public String getUc_id() {
                return uc_id;
            }

            public void setUc_id(String uc_id) {
                this.uc_id = uc_id;
            }

            public String getUser_id() {
                return user_id;
            }

            public void setUser_id(String user_id) {
                this.user_id = user_id;
            }

            public String getIs_use() {
                return is_use;
            }

            public void setIs_use(String is_use) {
                this.is_use = is_use;
            }

            public String getUc_sn() {
                return uc_sn;
            }

            public void setUc_sn(String uc_sn) {
                this.uc_sn = uc_sn;
            }

            public String getOrder_id() {
                return order_id;
            }

            public void setOrder_id(String order_id) {
                this.order_id = order_id;
            }

            public String getIs_use_time() {
                return is_use_time;
            }

            public void setIs_use_time(String is_use_time) {
                this.is_use_time = is_use_time;
            }

            public String getReceive_time() {
                return receive_time;
            }

            public void setReceive_time(String receive_time) {
                this.receive_time = receive_time;
            }

            public Object getOrder_sn() {
                return order_sn;
            }

            public void setOrder_sn(Object order_sn) {
                this.order_sn = order_sn;
            }

            public String getAdd_time() {
                return add_time;
            }

            public void setAdd_time(String add_time) {
                this.add_time = add_time;
            }

            public String getShop_name() {
                return shop_name;
            }

            public void setShop_name(String shop_name) {
                this.shop_name = shop_name;
            }

            public String getCou_start_time_date() {
                return cou_start_time_date;
            }

            public void setCou_start_time_date(String cou_start_time_date) {
                this.cou_start_time_date = cou_start_time_date;
            }

            public String getCou_end_time_date() {
                return cou_end_time_date;
            }

            public void setCou_end_time_date(String cou_end_time_date) {
                this.cou_end_time_date = cou_end_time_date;
            }

            public Object getCou_type_name() {
                return cou_type_name;
            }

            public void setCou_type_name(Object cou_type_name) {
                this.cou_type_name = cou_type_name;
            }
        }
    }
}
