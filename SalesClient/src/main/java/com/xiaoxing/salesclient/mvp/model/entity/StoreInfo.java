package com.xiaoxing.salesclient.mvp.model.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/7 0007 16:43
 */
public class StoreInfo implements Serializable {


    /**
     * code : 200
     * msg : 获取数据成功
     * data : {"shop_id":"29","rz_shopName":"陶宇轩","street_thumb":"","shopNameSuffix":"行家","ru_id":"97","goods_count":"11","goods_list":[{"market_price":"¥<\/em>2100.00","shop_price":"¥<\/em>0.00","promote_price":"","goods_id":"981","goods_name":"清代高浮雕挂锡满工波斯人物镂空盘","goods_thumb":"images/201808/thumb_img/0_thumb_G_1533602424126.jpg","goods_url":"goods.php?id=981","sales_volume":"0","kf_type":"0","kf_qq":"","kf_ww":"","shop_name":"陶宇轩","shop_url":"merchants_store.php?merchant_id=97","cmt_count":"0"},{"market_price":"¥<\/em>1200.00","shop_price":"¥<\/em>0.00","promote_price":"","goods_id":"982","goods_name":"清末民国六边开光锡茶罐","goods_thumb":"images/201808/thumb_img/0_thumb_G_1533602801064.jpg","goods_url":"goods.php?id=982","sales_volume":"0","kf_type":"0","kf_qq":"","kf_ww":"","shop_name":"陶宇轩","shop_url":"merchants_store.php?merchant_id=97","cmt_count":"0"},{"market_price":"¥<\/em>3600.00","shop_price":"¥<\/em>0.00","promote_price":"","goods_id":"983","goods_name":"清代满工浅刻精致仙人麒麟锡器","goods_thumb":"images/201808/thumb_img/0_thumb_G_1533603012830.jpg","goods_url":"goods.php?id=983","sales_volume":"0","kf_type":"0","kf_qq":"","kf_ww":"","shop_name":"陶宇轩","shop_url":"merchants_store.php?merchant_id=97","cmt_count":"0"},{"market_price":"¥<\/em>3000.00","shop_price":"¥<\/em>0.00","promote_price":"","goods_id":"984","goods_name":"清代浅刻仙女倒流壶","goods_thumb":"images/201808/thumb_img/0_thumb_G_1533603469706.jpg","goods_url":"goods.php?id=984","sales_volume":"0","kf_type":"0","kf_qq":"","kf_ww":"","shop_name":"陶宇轩","shop_url":"merchants_store.php?merchant_id=97","cmt_count":"0"},{"market_price":"¥<\/em>9000.00","shop_price":"¥<\/em>0.00","promote_price":"","goods_id":"985","goods_name":"德占青岛时期龙纹锡制青岛啤酒杯","goods_thumb":"images/201808/thumb_img/0_thumb_G_1533603652204.jpg","goods_url":"goods.php?id=985","sales_volume":"0","kf_type":"0","kf_qq":"","kf_ww":"","shop_name":"陶宇轩","shop_url":"merchants_store.php?merchant_id=97","cmt_count":"0"}],"collect_store":"0","goodReview":100,"allReview":100}
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
         * shop_id : 29
         * rz_shopName : 陶宇轩
         * street_thumb :
         * shopNameSuffix : 行家
         * ru_id : 97
         * goods_count : 11
         * goods_list : [{"market_price":"¥<\/em>2100.00","shop_price":"¥<\/em>0.00","promote_price":"","goods_id":"981","goods_name":"清代高浮雕挂锡满工波斯人物镂空盘","goods_thumb":"images/201808/thumb_img/0_thumb_G_1533602424126.jpg","goods_url":"goods.php?id=981","sales_volume":"0","kf_type":"0","kf_qq":"","kf_ww":"","shop_name":"陶宇轩","shop_url":"merchants_store.php?merchant_id=97","cmt_count":"0"},{"market_price":"¥<\/em>1200.00","shop_price":"¥<\/em>0.00","promote_price":"","goods_id":"982","goods_name":"清末民国六边开光锡茶罐","goods_thumb":"images/201808/thumb_img/0_thumb_G_1533602801064.jpg","goods_url":"goods.php?id=982","sales_volume":"0","kf_type":"0","kf_qq":"","kf_ww":"","shop_name":"陶宇轩","shop_url":"merchants_store.php?merchant_id=97","cmt_count":"0"},{"market_price":"¥<\/em>3600.00","shop_price":"¥<\/em>0.00","promote_price":"","goods_id":"983","goods_name":"清代满工浅刻精致仙人麒麟锡器","goods_thumb":"images/201808/thumb_img/0_thumb_G_1533603012830.jpg","goods_url":"goods.php?id=983","sales_volume":"0","kf_type":"0","kf_qq":"","kf_ww":"","shop_name":"陶宇轩","shop_url":"merchants_store.php?merchant_id=97","cmt_count":"0"},{"market_price":"¥<\/em>3000.00","shop_price":"¥<\/em>0.00","promote_price":"","goods_id":"984","goods_name":"清代浅刻仙女倒流壶","goods_thumb":"images/201808/thumb_img/0_thumb_G_1533603469706.jpg","goods_url":"goods.php?id=984","sales_volume":"0","kf_type":"0","kf_qq":"","kf_ww":"","shop_name":"陶宇轩","shop_url":"merchants_store.php?merchant_id=97","cmt_count":"0"},{"market_price":"¥<\/em>9000.00","shop_price":"¥<\/em>0.00","promote_price":"","goods_id":"985","goods_name":"德占青岛时期龙纹锡制青岛啤酒杯","goods_thumb":"images/201808/thumb_img/0_thumb_G_1533603652204.jpg","goods_url":"goods.php?id=985","sales_volume":"0","kf_type":"0","kf_qq":"","kf_ww":"","shop_name":"陶宇轩","shop_url":"merchants_store.php?merchant_id=97","cmt_count":"0"}]
         * collect_store : 0
         * goodReview : 100
         * allReview : 100
         */

        private String shop_id;
        private String rz_shopName;
        private String street_thumb;
        private String shopNameSuffix;
        private String ru_id;
        private String goods_count;
        private String collect_store;
        private int goodReview;
        private int allReview;
        private List<GoodsListBean> goods_list;

        public String getShop_id() {
            return shop_id;
        }

        public void setShop_id(String shop_id) {
            this.shop_id = shop_id;
        }

        public String getRz_shopName() {
            return rz_shopName;
        }

        public void setRz_shopName(String rz_shopName) {
            this.rz_shopName = rz_shopName;
        }

        public String getStreet_thumb() {
            return street_thumb;
        }

        public void setStreet_thumb(String street_thumb) {
            this.street_thumb = street_thumb;
        }

        public String getShopNameSuffix() {
            return shopNameSuffix;
        }

        public void setShopNameSuffix(String shopNameSuffix) {
            this.shopNameSuffix = shopNameSuffix;
        }

        public String getRu_id() {
            return ru_id;
        }

        public void setRu_id(String ru_id) {
            this.ru_id = ru_id;
        }

        public String getGoods_count() {
            return goods_count;
        }

        public void setGoods_count(String goods_count) {
            this.goods_count = goods_count;
        }

        public String getCollect_store() {
            return collect_store;
        }

        public void setCollect_store(String collect_store) {
            this.collect_store = collect_store;
        }

        public int getGoodReview() {
            return goodReview;
        }

        public void setGoodReview(int goodReview) {
            this.goodReview = goodReview;
        }

        public int getAllReview() {
            return allReview;
        }

        public void setAllReview(int allReview) {
            this.allReview = allReview;
        }

        public List<GoodsListBean> getGoods_list() {
            return goods_list;
        }

        public void setGoods_list(List<GoodsListBean> goods_list) {
            this.goods_list = goods_list;
        }

        public static class GoodsListBean {
            /**
             * market_price : ¥</em>2100.00
             * shop_price : ¥</em>0.00
             * promote_price :
             * goods_id : 981
             * goods_name : 清代高浮雕挂锡满工波斯人物镂空盘
             * goods_thumb : images/201808/thumb_img/0_thumb_G_1533602424126.jpg
             * goods_url : goods.php?id=981
             * sales_volume : 0
             * kf_type : 0
             * kf_qq :
             * kf_ww :
             * shop_name : 陶宇轩
             * shop_url : merchants_store.php?merchant_id=97
             * cmt_count : 0
             */

            private String market_price;
            private String shop_price;
            private String promote_price;
            private String goods_id;
            private String goods_name;
            private String goods_thumb;
            private String goods_url;
            private String sales_volume;
            private String kf_type;
            private String kf_qq;
            private String kf_ww;
            private String shop_name;
            private String shop_url;
            private String cmt_count;

            public String getMarket_price() {
                return market_price;
            }

            public void setMarket_price(String market_price) {
                this.market_price = market_price;
            }

            public String getShop_price() {
                return shop_price;
            }

            public void setShop_price(String shop_price) {
                this.shop_price = shop_price;
            }

            public String getPromote_price() {
                return promote_price;
            }

            public void setPromote_price(String promote_price) {
                this.promote_price = promote_price;
            }

            public String getGoods_id() {
                return goods_id;
            }

            public void setGoods_id(String goods_id) {
                this.goods_id = goods_id;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public String getGoods_thumb() {
                return goods_thumb;
            }

            public void setGoods_thumb(String goods_thumb) {
                this.goods_thumb = goods_thumb;
            }

            public String getGoods_url() {
                return goods_url;
            }

            public void setGoods_url(String goods_url) {
                this.goods_url = goods_url;
            }

            public String getSales_volume() {
                return sales_volume;
            }

            public void setSales_volume(String sales_volume) {
                this.sales_volume = sales_volume;
            }

            public String getKf_type() {
                return kf_type;
            }

            public void setKf_type(String kf_type) {
                this.kf_type = kf_type;
            }

            public String getKf_qq() {
                return kf_qq;
            }

            public void setKf_qq(String kf_qq) {
                this.kf_qq = kf_qq;
            }

            public String getKf_ww() {
                return kf_ww;
            }

            public void setKf_ww(String kf_ww) {
                this.kf_ww = kf_ww;
            }

            public String getShop_name() {
                return shop_name;
            }

            public void setShop_name(String shop_name) {
                this.shop_name = shop_name;
            }

            public String getShop_url() {
                return shop_url;
            }

            public void setShop_url(String shop_url) {
                this.shop_url = shop_url;
            }

            public String getCmt_count() {
                return cmt_count;
            }

            public void setCmt_count(String cmt_count) {
                this.cmt_count = cmt_count;
            }
        }
    }
}
