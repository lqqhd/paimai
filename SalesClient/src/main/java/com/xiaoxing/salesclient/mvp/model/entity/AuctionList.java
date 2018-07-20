package com.xiaoxing.salesclient.mvp.model.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/7 0007 16:43
 */
public class AuctionList implements Serializable {


    /**
     * result : true
     * msg : 获取数据成功
     * data : {"6":{"act_id":"53","act_name":"书画购买测试","current_price":3,"current_count":"1","end_time":"1533014129","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531545296023.jpg"},"0":{"act_id":"54","act_name":"首页祖传玉镯子","current_price":4000,"current_count":"0","end_time":"1533009893","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531627382532.jpg"},"5":{"act_id":"47","act_name":"罗汉床","current_price":3000,"current_count":"0","end_time":"1533009417","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531041163767.jpg"},"1":{"act_id":"51","act_name":"收藏杂项测试1","current_price":3000,"current_count":"0","end_time":"1532593359","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531383722150.jpg"},"2":{"act_id":"50","act_name":"古钱币测测试拍品1","current_price":200,"current_count":"0","end_time":"1532593161","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531383528851.jpg"},"3":{"act_id":"49","act_name":"玉器玉雕测试拍卖1","current_price":300,"current_count":"1","end_time":"1532506355","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531382865134.jpg"},"4":{"act_id":"48","act_name":"陶瓷拍卖1","current_price":200,"current_count":"0","end_time":"1532505909","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531382589160.jpg"},"7":{"act_id":"52","act_name":"立即购买测试","current_price":2,"current_count":"1","end_time":"1532336154","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531472081070.jpg"}}
     */

    private String result;
    private String msg;
    private DataBean data;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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
         * 6 : {"act_id":"53","act_name":"书画购买测试","current_price":3,"current_count":"1","end_time":"1533014129","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531545296023.jpg"}
         * 0 : {"act_id":"54","act_name":"首页祖传玉镯子","current_price":4000,"current_count":"0","end_time":"1533009893","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531627382532.jpg"}
         * 5 : {"act_id":"47","act_name":"罗汉床","current_price":3000,"current_count":"0","end_time":"1533009417","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531041163767.jpg"}
         * 1 : {"act_id":"51","act_name":"收藏杂项测试1","current_price":3000,"current_count":"0","end_time":"1532593359","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531383722150.jpg"}
         * 2 : {"act_id":"50","act_name":"古钱币测测试拍品1","current_price":200,"current_count":"0","end_time":"1532593161","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531383528851.jpg"}
         * 3 : {"act_id":"49","act_name":"玉器玉雕测试拍卖1","current_price":300,"current_count":"1","end_time":"1532506355","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531382865134.jpg"}
         * 4 : {"act_id":"48","act_name":"陶瓷拍卖1","current_price":200,"current_count":"0","end_time":"1532505909","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531382589160.jpg"}
         * 7 : {"act_id":"52","act_name":"立即购买测试","current_price":2,"current_count":"1","end_time":"1532336154","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531472081070.jpg"}
         */

        @SerializedName("6")
        private _$6Bean _$6;
        @SerializedName("0")
        private _$0Bean _$0;
        @SerializedName("5")
        private _$5Bean _$5;
        @SerializedName("1")
        private _$1Bean _$1;
        @SerializedName("2")
        private _$2Bean _$2;
        @SerializedName("3")
        private _$3Bean _$3;
        @SerializedName("4")
        private _$4Bean _$4;
        @SerializedName("7")
        private _$7Bean _$7;

        public _$6Bean get_$6() {
            return _$6;
        }

        public void set_$6(_$6Bean _$6) {
            this._$6 = _$6;
        }

        public _$0Bean get_$0() {
            return _$0;
        }

        public void set_$0(_$0Bean _$0) {
            this._$0 = _$0;
        }

        public _$5Bean get_$5() {
            return _$5;
        }

        public void set_$5(_$5Bean _$5) {
            this._$5 = _$5;
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

        public _$7Bean get_$7() {
            return _$7;
        }

        public void set_$7(_$7Bean _$7) {
            this._$7 = _$7;
        }

        public static class _$6Bean {
            /**
             * act_id : 53
             * act_name : 书画购买测试
             * current_price : 3
             * current_count : 1
             * end_time : 1533014129
             * goods_thumb : http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531545296023.jpg
             */

            private String act_id;
            private String act_name;
            private int current_price;
            private String current_count;
            private String end_time;
            private String goods_thumb;

            public String getAct_id() {
                return act_id;
            }

            public void setAct_id(String act_id) {
                this.act_id = act_id;
            }

            public String getAct_name() {
                return act_name;
            }

            public void setAct_name(String act_name) {
                this.act_name = act_name;
            }

            public int getCurrent_price() {
                return current_price;
            }

            public void setCurrent_price(int current_price) {
                this.current_price = current_price;
            }

            public String getCurrent_count() {
                return current_count;
            }

            public void setCurrent_count(String current_count) {
                this.current_count = current_count;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getGoods_thumb() {
                return goods_thumb;
            }

            public void setGoods_thumb(String goods_thumb) {
                this.goods_thumb = goods_thumb;
            }
        }

        public static class _$0Bean {
            /**
             * act_id : 54
             * act_name : 首页祖传玉镯子
             * current_price : 4000
             * current_count : 0
             * end_time : 1533009893
             * goods_thumb : http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531627382532.jpg
             */

            private String act_id;
            private String act_name;
            private int current_price;
            private String current_count;
            private String end_time;
            private String goods_thumb;

            public String getAct_id() {
                return act_id;
            }

            public void setAct_id(String act_id) {
                this.act_id = act_id;
            }

            public String getAct_name() {
                return act_name;
            }

            public void setAct_name(String act_name) {
                this.act_name = act_name;
            }

            public int getCurrent_price() {
                return current_price;
            }

            public void setCurrent_price(int current_price) {
                this.current_price = current_price;
            }

            public String getCurrent_count() {
                return current_count;
            }

            public void setCurrent_count(String current_count) {
                this.current_count = current_count;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getGoods_thumb() {
                return goods_thumb;
            }

            public void setGoods_thumb(String goods_thumb) {
                this.goods_thumb = goods_thumb;
            }
        }

        public static class _$5Bean {
            /**
             * act_id : 47
             * act_name : 罗汉床
             * current_price : 3000
             * current_count : 0
             * end_time : 1533009417
             * goods_thumb : http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531041163767.jpg
             */

            private String act_id;
            private String act_name;
            private int current_price;
            private String current_count;
            private String end_time;
            private String goods_thumb;

            public String getAct_id() {
                return act_id;
            }

            public void setAct_id(String act_id) {
                this.act_id = act_id;
            }

            public String getAct_name() {
                return act_name;
            }

            public void setAct_name(String act_name) {
                this.act_name = act_name;
            }

            public int getCurrent_price() {
                return current_price;
            }

            public void setCurrent_price(int current_price) {
                this.current_price = current_price;
            }

            public String getCurrent_count() {
                return current_count;
            }

            public void setCurrent_count(String current_count) {
                this.current_count = current_count;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getGoods_thumb() {
                return goods_thumb;
            }

            public void setGoods_thumb(String goods_thumb) {
                this.goods_thumb = goods_thumb;
            }
        }

        public static class _$1Bean {
            /**
             * act_id : 51
             * act_name : 收藏杂项测试1
             * current_price : 3000
             * current_count : 0
             * end_time : 1532593359
             * goods_thumb : http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531383722150.jpg
             */

            private String act_id;
            private String act_name;
            private int current_price;
            private String current_count;
            private String end_time;
            private String goods_thumb;

            public String getAct_id() {
                return act_id;
            }

            public void setAct_id(String act_id) {
                this.act_id = act_id;
            }

            public String getAct_name() {
                return act_name;
            }

            public void setAct_name(String act_name) {
                this.act_name = act_name;
            }

            public int getCurrent_price() {
                return current_price;
            }

            public void setCurrent_price(int current_price) {
                this.current_price = current_price;
            }

            public String getCurrent_count() {
                return current_count;
            }

            public void setCurrent_count(String current_count) {
                this.current_count = current_count;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getGoods_thumb() {
                return goods_thumb;
            }

            public void setGoods_thumb(String goods_thumb) {
                this.goods_thumb = goods_thumb;
            }
        }

        public static class _$2Bean {
            /**
             * act_id : 50
             * act_name : 古钱币测测试拍品1
             * current_price : 200
             * current_count : 0
             * end_time : 1532593161
             * goods_thumb : http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531383528851.jpg
             */

            private String act_id;
            private String act_name;
            private int current_price;
            private String current_count;
            private String end_time;
            private String goods_thumb;

            public String getAct_id() {
                return act_id;
            }

            public void setAct_id(String act_id) {
                this.act_id = act_id;
            }

            public String getAct_name() {
                return act_name;
            }

            public void setAct_name(String act_name) {
                this.act_name = act_name;
            }

            public int getCurrent_price() {
                return current_price;
            }

            public void setCurrent_price(int current_price) {
                this.current_price = current_price;
            }

            public String getCurrent_count() {
                return current_count;
            }

            public void setCurrent_count(String current_count) {
                this.current_count = current_count;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getGoods_thumb() {
                return goods_thumb;
            }

            public void setGoods_thumb(String goods_thumb) {
                this.goods_thumb = goods_thumb;
            }
        }

        public static class _$3Bean {
            /**
             * act_id : 49
             * act_name : 玉器玉雕测试拍卖1
             * current_price : 300
             * current_count : 1
             * end_time : 1532506355
             * goods_thumb : http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531382865134.jpg
             */

            private String act_id;
            private String act_name;
            private int current_price;
            private String current_count;
            private String end_time;
            private String goods_thumb;

            public String getAct_id() {
                return act_id;
            }

            public void setAct_id(String act_id) {
                this.act_id = act_id;
            }

            public String getAct_name() {
                return act_name;
            }

            public void setAct_name(String act_name) {
                this.act_name = act_name;
            }

            public int getCurrent_price() {
                return current_price;
            }

            public void setCurrent_price(int current_price) {
                this.current_price = current_price;
            }

            public String getCurrent_count() {
                return current_count;
            }

            public void setCurrent_count(String current_count) {
                this.current_count = current_count;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getGoods_thumb() {
                return goods_thumb;
            }

            public void setGoods_thumb(String goods_thumb) {
                this.goods_thumb = goods_thumb;
            }
        }

        public static class _$4Bean {
            /**
             * act_id : 48
             * act_name : 陶瓷拍卖1
             * current_price : 200
             * current_count : 0
             * end_time : 1532505909
             * goods_thumb : http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531382589160.jpg
             */

            private String act_id;
            private String act_name;
            private int current_price;
            private String current_count;
            private String end_time;
            private String goods_thumb;

            public String getAct_id() {
                return act_id;
            }

            public void setAct_id(String act_id) {
                this.act_id = act_id;
            }

            public String getAct_name() {
                return act_name;
            }

            public void setAct_name(String act_name) {
                this.act_name = act_name;
            }

            public int getCurrent_price() {
                return current_price;
            }

            public void setCurrent_price(int current_price) {
                this.current_price = current_price;
            }

            public String getCurrent_count() {
                return current_count;
            }

            public void setCurrent_count(String current_count) {
                this.current_count = current_count;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getGoods_thumb() {
                return goods_thumb;
            }

            public void setGoods_thumb(String goods_thumb) {
                this.goods_thumb = goods_thumb;
            }
        }

        public static class _$7Bean {
            /**
             * act_id : 52
             * act_name : 立即购买测试
             * current_price : 2
             * current_count : 1
             * end_time : 1532336154
             * goods_thumb : http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531472081070.jpg
             */

            private String act_id;
            private String act_name;
            private int current_price;
            private String current_count;
            private String end_time;
            private String goods_thumb;

            public String getAct_id() {
                return act_id;
            }

            public void setAct_id(String act_id) {
                this.act_id = act_id;
            }

            public String getAct_name() {
                return act_name;
            }

            public void setAct_name(String act_name) {
                this.act_name = act_name;
            }

            public int getCurrent_price() {
                return current_price;
            }

            public void setCurrent_price(int current_price) {
                this.current_price = current_price;
            }

            public String getCurrent_count() {
                return current_count;
            }

            public void setCurrent_count(String current_count) {
                this.current_count = current_count;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getGoods_thumb() {
                return goods_thumb;
            }

            public void setGoods_thumb(String goods_thumb) {
                this.goods_thumb = goods_thumb;
            }
        }
    }
}
