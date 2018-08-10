package com.xiaoxing.salesclient.mvp.model.entity;

import java.io.Serializable;
import java.util.List;

public class AuctionDetailZhengChang implements Serializable{


    /**
     * code : 300
     * msg : 拍卖活动未开始
     * data : {"goods_id":"924","goods_name":"开店的人的商品","user_id":"83","goods_number":"1000","shop_price":"1.00","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531635792269.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531635792822.jpg","last_update":"1532455502","desc_mobile":"","onlookers_num":"46","pictures":[{"img_id":"1035","img_url":"http://47.100.103.123/images/201807/goods_img/0_P_1531635792875.jpg","thumb_url":"http://47.100.103.123/images/201807/thumb_img/0_thumb_P_1531635792067.jpg","img_desc":"9","external_url":""}],"formated_start_price":"","formated_end_price":"","formated_deposit":"","act_promise":"","current_price":"","bid_user_count":"","is_finished":"","last_bid":"","grade_name":"行家","rz_shopName":"专门卖玉器的","shopinfo":{"shop_name":"开店的人","check_sellername":"0","shopname_audit":"0","shop_logo":"http://47.100.103.123/../seller_imgs/seller_logo/seller_logo83.jpg","brand_thumb":"http://47.100.103.123/data/store_street/brand_thumb/1531635913595710558.jpg","self_run":"0"},"other_goods":[{"goods_id":"924","goods_name":"开店的人的商品","goods_number":"1000","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531635792269.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531635792822.jpg","last_update":"1532455502","shop_price":"1.00"}]}
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

    public static class DataBean implements Serializable{
        /**
         * goods_id : 924
         * goods_name : 开店的人的商品
         * user_id : 83
         * goods_number : 1000
         * shop_price : 1.00
         * goods_thumb : http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531635792269.jpg
         * goods_img : http://47.100.103.123/images/201807/goods_img/0_G_1531635792822.jpg
         * last_update : 1532455502
         * desc_mobile :
         * onlookers_num : 46
         * pictures : [{"img_id":"1035","img_url":"http://47.100.103.123/images/201807/goods_img/0_P_1531635792875.jpg","thumb_url":"http://47.100.103.123/images/201807/thumb_img/0_thumb_P_1531635792067.jpg","img_desc":"9","external_url":""}]
         * formated_start_price :
         * formated_end_price :
         * formated_deposit :
         * act_promise :
         * current_price :
         * bid_user_count :
         * is_finished :
         * last_bid :
         * grade_name : 行家
         * rz_shopName : 专门卖玉器的
         * shopinfo : {"shop_name":"开店的人","check_sellername":"0","shopname_audit":"0","shop_logo":"http://47.100.103.123/../seller_imgs/seller_logo/seller_logo83.jpg","brand_thumb":"http://47.100.103.123/data/store_street/brand_thumb/1531635913595710558.jpg","self_run":"0"}
         * other_goods : [{"goods_id":"924","goods_name":"开店的人的商品","goods_number":"1000","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531635792269.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531635792822.jpg","last_update":"1532455502","shop_price":"1.00"}]
         */

        private String goods_id;
        private String goods_name;
        private String user_id;
        private String goods_number;
        private String shop_price;
        private String goods_thumb;
        private String goods_img;
        private String last_update;
        private String desc_mobile;
        private String onlookers_num;
        private String formated_start_price;
        private String formated_end_price;
        private String formated_deposit;
        private String act_promise;
        private String current_price;
        private String bid_user_count;
        private String is_finished;
        private String last_bid;
        private String grade_name;
        private String rz_shopName;
        private ShopinfoBean shopinfo;
        private List<PicturesBean> pictures;
        private List<OtherGoodsBean> other_goods;

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

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getGoods_number() {
            return goods_number;
        }

        public void setGoods_number(String goods_number) {
            this.goods_number = goods_number;
        }

        public String getShop_price() {
            return shop_price;
        }

        public void setShop_price(String shop_price) {
            this.shop_price = shop_price;
        }

        public String getGoods_thumb() {
            return goods_thumb;
        }

        public void setGoods_thumb(String goods_thumb) {
            this.goods_thumb = goods_thumb;
        }

        public String getGoods_img() {
            return goods_img;
        }

        public void setGoods_img(String goods_img) {
            this.goods_img = goods_img;
        }

        public String getLast_update() {
            return last_update;
        }

        public void setLast_update(String last_update) {
            this.last_update = last_update;
        }

        public String getDesc_mobile() {
            return desc_mobile;
        }

        public void setDesc_mobile(String desc_mobile) {
            this.desc_mobile = desc_mobile;
        }

        public String getOnlookers_num() {
            return onlookers_num;
        }

        public void setOnlookers_num(String onlookers_num) {
            this.onlookers_num = onlookers_num;
        }

        public String getFormated_start_price() {
            return formated_start_price;
        }

        public void setFormated_start_price(String formated_start_price) {
            this.formated_start_price = formated_start_price;
        }

        public String getFormated_end_price() {
            return formated_end_price;
        }

        public void setFormated_end_price(String formated_end_price) {
            this.formated_end_price = formated_end_price;
        }

        public String getFormated_deposit() {
            return formated_deposit;
        }

        public void setFormated_deposit(String formated_deposit) {
            this.formated_deposit = formated_deposit;
        }

        public String getAct_promise() {
            return act_promise;
        }

        public void setAct_promise(String act_promise) {
            this.act_promise = act_promise;
        }

        public String getCurrent_price() {
            return current_price;
        }

        public void setCurrent_price(String current_price) {
            this.current_price = current_price;
        }

        public String getBid_user_count() {
            return bid_user_count;
        }

        public void setBid_user_count(String bid_user_count) {
            this.bid_user_count = bid_user_count;
        }

        public String getIs_finished() {
            return is_finished;
        }

        public void setIs_finished(String is_finished) {
            this.is_finished = is_finished;
        }

        public String getLast_bid() {
            return last_bid;
        }

        public void setLast_bid(String last_bid) {
            this.last_bid = last_bid;
        }

        public String getGrade_name() {
            return grade_name;
        }

        public void setGrade_name(String grade_name) {
            this.grade_name = grade_name;
        }

        public String getRz_shopName() {
            return rz_shopName;
        }

        public void setRz_shopName(String rz_shopName) {
            this.rz_shopName = rz_shopName;
        }

        public ShopinfoBean getShopinfo() {
            return shopinfo;
        }

        public void setShopinfo(ShopinfoBean shopinfo) {
            this.shopinfo = shopinfo;
        }

        public List<PicturesBean> getPictures() {
            return pictures;
        }

        public void setPictures(List<PicturesBean> pictures) {
            this.pictures = pictures;
        }

        public List<OtherGoodsBean> getOther_goods() {
            return other_goods;
        }

        public void setOther_goods(List<OtherGoodsBean> other_goods) {
            this.other_goods = other_goods;
        }

        public static class ShopinfoBean implements Serializable{
            /**
             * shop_name : 开店的人
             * check_sellername : 0
             * shopname_audit : 0
             * shop_logo : http://47.100.103.123/../seller_imgs/seller_logo/seller_logo83.jpg
             * brand_thumb : http://47.100.103.123/data/store_street/brand_thumb/1531635913595710558.jpg
             * self_run : 0
             */

            private String shop_name;
            private String check_sellername;
            private String shopname_audit;
            private String shop_logo;
            private String brand_thumb;
            private String self_run;

            public String getShop_name() {
                return shop_name;
            }

            public void setShop_name(String shop_name) {
                this.shop_name = shop_name;
            }

            public String getCheck_sellername() {
                return check_sellername;
            }

            public void setCheck_sellername(String check_sellername) {
                this.check_sellername = check_sellername;
            }

            public String getShopname_audit() {
                return shopname_audit;
            }

            public void setShopname_audit(String shopname_audit) {
                this.shopname_audit = shopname_audit;
            }

            public String getShop_logo() {
                return shop_logo;
            }

            public void setShop_logo(String shop_logo) {
                this.shop_logo = shop_logo;
            }

            public String getBrand_thumb() {
                return brand_thumb;
            }

            public void setBrand_thumb(String brand_thumb) {
                this.brand_thumb = brand_thumb;
            }

            public String getSelf_run() {
                return self_run;
            }

            public void setSelf_run(String self_run) {
                this.self_run = self_run;
            }
        }

        public static class PicturesBean implements Serializable{
            /**
             * img_id : 1035
             * img_url : http://47.100.103.123/images/201807/goods_img/0_P_1531635792875.jpg
             * thumb_url : http://47.100.103.123/images/201807/thumb_img/0_thumb_P_1531635792067.jpg
             * img_desc : 9
             * external_url :
             */

            private String img_id;
            private String img_url;
            private String thumb_url;
            private String img_desc;
            private String external_url;

            public String getImg_id() {
                return img_id;
            }

            public void setImg_id(String img_id) {
                this.img_id = img_id;
            }

            public String getImg_url() {
                return img_url;
            }

            public void setImg_url(String img_url) {
                this.img_url = img_url;
            }

            public String getThumb_url() {
                return thumb_url;
            }

            public void setThumb_url(String thumb_url) {
                this.thumb_url = thumb_url;
            }

            public String getImg_desc() {
                return img_desc;
            }

            public void setImg_desc(String img_desc) {
                this.img_desc = img_desc;
            }

            public String getExternal_url() {
                return external_url;
            }

            public void setExternal_url(String external_url) {
                this.external_url = external_url;
            }
        }

        public static class OtherGoodsBean implements Serializable{
            /**
             * goods_id : 924
             * goods_name : 开店的人的商品
             * goods_number : 1000
             * keywords :
             * goods_brief :
             * goods_thumb : http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531635792269.jpg
             * goods_img : http://47.100.103.123/images/201807/goods_img/0_G_1531635792822.jpg
             * last_update : 1532455502
             * shop_price : 1.00
             */

            private String goods_id;
            private String goods_name;
            private String goods_number;
            private String keywords;
            private String goods_brief;
            private String goods_thumb;
            private String goods_img;
            private String last_update;
            private String shop_price;

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

            public String getGoods_number() {
                return goods_number;
            }

            public void setGoods_number(String goods_number) {
                this.goods_number = goods_number;
            }

            public String getKeywords() {
                return keywords;
            }

            public void setKeywords(String keywords) {
                this.keywords = keywords;
            }

            public String getGoods_brief() {
                return goods_brief;
            }

            public void setGoods_brief(String goods_brief) {
                this.goods_brief = goods_brief;
            }

            public String getGoods_thumb() {
                return goods_thumb;
            }

            public void setGoods_thumb(String goods_thumb) {
                this.goods_thumb = goods_thumb;
            }

            public String getGoods_img() {
                return goods_img;
            }

            public void setGoods_img(String goods_img) {
                this.goods_img = goods_img;
            }

            public String getLast_update() {
                return last_update;
            }

            public void setLast_update(String last_update) {
                this.last_update = last_update;
            }

            public String getShop_price() {
                return shop_price;
            }

            public void setShop_price(String shop_price) {
                this.shop_price = shop_price;
            }
        }
    }
}
