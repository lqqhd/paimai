package com.xiaoxing.salesclient.mvp.model.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/7 0007 16:43
 */
public class StoreShop implements Serializable {


    /**
     * code : 200
     * msg : 获取数据成功
     * data : [{"shop_id":"23","grade_name":"行家","shop_name":{"shop_name":"专门卖玉器的","shopNameSuffix":"专卖店"},"goodReview":100,"allReview":100,"collect_store":0,"sales_volume":0,"goods_count":"1","shop_logo":"http://47.100.103.123/seller_imgs/seller_logo/seller_logo83.jpg","logo_thumb":"http://47.100.103.123/seller_imgs/seller_logo/logo_thumb/1531635913572779847.jpg","street_thumb":"http://47.100.103.123/data/store_street/street_thumb/1531635913164681547.jpg","brand_thumb":"http://47.100.103.123/data/store_street/brand_thumb/1531635913595710558.jpg","goods_list":[{"market_price":"¥<\/em>1.20","shop_price":"¥<\/em>0.00","promote_price":"","goods_id":"924","goods_name":"开店的人的商品","goods_thumb":"images/201807/thumb_img/0_thumb_G_1531635792269.jpg","goods_url":"goods.php?id=924","sales_volume":"0","kf_type":"0","kf_qq":"","kf_ww":"","shop_name":"专门卖玉器的","shop_url":"merchants_store.php?merchant_id=83","cmt_count":"0"}]},{"shop_id":"22","grade_name":"自由","shop_name":{"shop_name":"qwerw","shopNameSuffix":"专卖店"},"goodReview":100,"allReview":100,"collect_store":0,"sales_volume":0,"goods_count":"0","shop_logo":"http://47.100.103.123/seller_imgs/seller_logo/seller_logo81.jpg","logo_thumb":"http://47.100.103.123/seller_imgs/seller_logo/logo_thumb/1531031144777138297.jpg","street_thumb":"http://47.100.103.123/data/store_street/street_thumb/1531030573826726960.jpg","brand_thumb":"http://47.100.103.123/data/store_street/brand_thumb/1531031144663448469.jpg","goods_list":[]}]
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
         * shop_id : 23
         * grade_name : 行家
         * shop_name : {"shop_name":"专门卖玉器的","shopNameSuffix":"专卖店"}
         * goodReview : 100
         * allReview : 100
         * collect_store : 0
         * sales_volume : 0
         * goods_count : 1
         * shop_logo : http://47.100.103.123/seller_imgs/seller_logo/seller_logo83.jpg
         * logo_thumb : http://47.100.103.123/seller_imgs/seller_logo/logo_thumb/1531635913572779847.jpg
         * street_thumb : http://47.100.103.123/data/store_street/street_thumb/1531635913164681547.jpg
         * brand_thumb : http://47.100.103.123/data/store_street/brand_thumb/1531635913595710558.jpg
         * goods_list : [{"market_price":"¥<\/em>1.20","shop_price":"¥<\/em>0.00","promote_price":"","goods_id":"924","goods_name":"开店的人的商品","goods_thumb":"images/201807/thumb_img/0_thumb_G_1531635792269.jpg","goods_url":"goods.php?id=924","sales_volume":"0","kf_type":"0","kf_qq":"","kf_ww":"","shop_name":"专门卖玉器的","shop_url":"merchants_store.php?merchant_id=83","cmt_count":"0"}]
         */

        private String shop_id;
        private String grade_name;
        private ShopNameBean shop_name;
        private int goodReview;
        private int allReview;
        private int collect_store;
        private int sales_volume;
        private String goods_count;
        private String shop_logo;
        private String logo_thumb;
        private String street_thumb;
        private String brand_thumb;
        private List<GoodsListBean> goods_list;

        public String getShop_id() {
            return shop_id;
        }

        public void setShop_id(String shop_id) {
            this.shop_id = shop_id;
        }

        public String getGrade_name() {
            return grade_name;
        }

        public void setGrade_name(String grade_name) {
            this.grade_name = grade_name;
        }

        public ShopNameBean getShop_name() {
            return shop_name;
        }

        public void setShop_name(ShopNameBean shop_name) {
            this.shop_name = shop_name;
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

        public int getCollect_store() {
            return collect_store;
        }

        public void setCollect_store(int collect_store) {
            this.collect_store = collect_store;
        }

        public int getSales_volume() {
            return sales_volume;
        }

        public void setSales_volume(int sales_volume) {
            this.sales_volume = sales_volume;
        }

        public String getGoods_count() {
            return goods_count;
        }

        public void setGoods_count(String goods_count) {
            this.goods_count = goods_count;
        }

        public String getShop_logo() {
            return shop_logo;
        }

        public void setShop_logo(String shop_logo) {
            this.shop_logo = shop_logo;
        }

        public String getLogo_thumb() {
            return logo_thumb;
        }

        public void setLogo_thumb(String logo_thumb) {
            this.logo_thumb = logo_thumb;
        }

        public String getStreet_thumb() {
            return street_thumb;
        }

        public void setStreet_thumb(String street_thumb) {
            this.street_thumb = street_thumb;
        }

        public String getBrand_thumb() {
            return brand_thumb;
        }

        public void setBrand_thumb(String brand_thumb) {
            this.brand_thumb = brand_thumb;
        }

        public List<GoodsListBean> getGoods_list() {
            return goods_list;
        }

        public void setGoods_list(List<GoodsListBean> goods_list) {
            this.goods_list = goods_list;
        }

        public static class ShopNameBean {
            /**
             * shop_name : 专门卖玉器的
             * shopNameSuffix : 专卖店
             */

            private String shop_name;
            private String shopNameSuffix;

            public String getShop_name() {
                return shop_name;
            }

            public void setShop_name(String shop_name) {
                this.shop_name = shop_name;
            }

            public String getShopNameSuffix() {
                return shopNameSuffix;
            }

            public void setShopNameSuffix(String shopNameSuffix) {
                this.shopNameSuffix = shopNameSuffix;
            }
        }

        public static class GoodsListBean {
            /**
             * market_price : ¥</em>1.20
             * shop_price : ¥</em>0.00
             * promote_price :
             * goods_id : 924
             * goods_name : 开店的人的商品
             * goods_thumb : images/201807/thumb_img/0_thumb_G_1531635792269.jpg
             * goods_url : goods.php?id=924
             * sales_volume : 0
             * kf_type : 0
             * kf_qq :
             * kf_ww :
             * shop_name : 专门卖玉器的
             * shop_url : merchants_store.php?merchant_id=83
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
