package com.xiaoxing.salesclient.mvp.model.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/7 0007 16:43
 */
public class StoreShop implements Serializable {


    /**
     * result : true
     * msg : 获取数据成功
     * data : {"22":{"shop_id":"22","shoprz_brandName":"qwerw","shopNameSuffix":"专卖店","self_run":"0","shop_name":{"shop_name":"qwerw","shopNameSuffix":"专卖店"},"shopName":"qwerw专卖店","brand_list":[],"address":"  ","sales_volume":0,"grade_img":"data/seller_grade/1490317342721835143.png","grade_name":"自由","shop_logo":"","logo_thumb":"seller_imgs/seller_logo/logo_thumb/1531031144777138297.jpg","street_thumb":"data/store_street/street_thumb/1531030573826726960.jpg","brand_thumb":"data/store_street/brand_thumb/1531031144663448469.jpg","street_desc":"","merch_cmt":{"0":{"shop_id":"22","user_id":"81","mc_all_Rank":"0","mc_one_Rank":"0","mc_two_Rank":"0","mc_three_Rank":"0","mc_four_Rank":"0","mc_five_Rank":"0","mc_all_Server":"0","mc_one_Server":"0","mc_two_Server":"0","mc_three_Server":"0","mc_four_Server":"0","mc_five_Server":"0","mc_all_Delivery":"0","mc_one_Delivery":"0","mc_two_Delivery":"0","mc_three_Delivery":"0","mc_four_Delivery":"0","mc_five_Delivery":"0"},"cmt":{"commentRank":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentServer":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentDelivery":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"all_zconments":{"score":"5.00","allReview":100,"position":-3}}},"ru_id":"81","shop_url":"merchants_store.php?merchant_id=81","store_shop_url":"merchants_store_shop.php?id=81","goods_count":"0","goods_list":[],"collect_store":"","kf_type":"0","kf_ww":"","kf_qq":"","is_IM":"1","is_dsc":false},"23":{"shop_id":"23","shoprz_brandName":"","shopNameSuffix":"专卖店","self_run":"0","shop_name":{"shop_name":"专门卖玉器的","shopNameSuffix":"专卖店"},"shopName":"专门卖玉器的","brand_list":[],"address":"  ","sales_volume":0,"grade_img":"data/seller_grade/1490317350248705761.png","grade_name":"行家","shop_logo":"seller_imgs/seller_logo/seller_logo83.jpg","logo_thumb":"seller_imgs/seller_logo/logo_thumb/1531635913572779847.jpg","street_thumb":"data/store_street/street_thumb/1531635913164681547.jpg","brand_thumb":"data/store_street/brand_thumb/1531635913595710558.jpg","street_desc":"","merch_cmt":{"0":{"shop_id":"23","user_id":"83","mc_all_Rank":"0","mc_one_Rank":"0","mc_two_Rank":"0","mc_three_Rank":"0","mc_four_Rank":"0","mc_five_Rank":"0","mc_all_Server":"0","mc_one_Server":"0","mc_two_Server":"0","mc_three_Server":"0","mc_four_Server":"0","mc_five_Server":"0","mc_all_Delivery":"0","mc_one_Delivery":"0","mc_two_Delivery":"0","mc_three_Delivery":"0","mc_four_Delivery":"0","mc_five_Delivery":"0"},"cmt":{"commentRank":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentServer":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentDelivery":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"all_zconments":{"score":"5.00","allReview":100,"position":-3}}},"ru_id":"83","shop_url":"merchants_store.php?merchant_id=83","store_shop_url":"merchants_store_shop.php?id=83","goods_count":"1","goods_list":[{"market_price":"¥<\/em>1.20","shop_price":"¥<\/em>1.00","promote_price":"","goods_id":"924","goods_name":"开店的人的商品","goods_thumb":"images/201807/thumb_img/0_thumb_G_1531635792269.jpg","goods_url":"goods.php?id=924","sales_volume":"0","kf_type":"0","kf_qq":"","kf_ww":"","shop_name":"专门卖玉器的","shop_url":"merchants_store.php?merchant_id=83","cmt_count":"0"}],"collect_store":"1","kf_type":"0","kf_ww":"","kf_qq":"","is_IM":"1","is_dsc":false}}
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
         * 22 : {"shop_id":"22","shoprz_brandName":"qwerw","shopNameSuffix":"专卖店","self_run":"0","shop_name":{"shop_name":"qwerw","shopNameSuffix":"专卖店"},"shopName":"qwerw专卖店","brand_list":[],"address":"  ","sales_volume":0,"grade_img":"data/seller_grade/1490317342721835143.png","grade_name":"自由","shop_logo":"","logo_thumb":"seller_imgs/seller_logo/logo_thumb/1531031144777138297.jpg","street_thumb":"data/store_street/street_thumb/1531030573826726960.jpg","brand_thumb":"data/store_street/brand_thumb/1531031144663448469.jpg","street_desc":"","merch_cmt":{"0":{"shop_id":"22","user_id":"81","mc_all_Rank":"0","mc_one_Rank":"0","mc_two_Rank":"0","mc_three_Rank":"0","mc_four_Rank":"0","mc_five_Rank":"0","mc_all_Server":"0","mc_one_Server":"0","mc_two_Server":"0","mc_three_Server":"0","mc_four_Server":"0","mc_five_Server":"0","mc_all_Delivery":"0","mc_one_Delivery":"0","mc_two_Delivery":"0","mc_three_Delivery":"0","mc_four_Delivery":"0","mc_five_Delivery":"0"},"cmt":{"commentRank":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentServer":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentDelivery":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"all_zconments":{"score":"5.00","allReview":100,"position":-3}}},"ru_id":"81","shop_url":"merchants_store.php?merchant_id=81","store_shop_url":"merchants_store_shop.php?id=81","goods_count":"0","goods_list":[],"collect_store":"","kf_type":"0","kf_ww":"","kf_qq":"","is_IM":"1","is_dsc":false}
         * 23 : {"shop_id":"23","shoprz_brandName":"","shopNameSuffix":"专卖店","self_run":"0","shop_name":{"shop_name":"专门卖玉器的","shopNameSuffix":"专卖店"},"shopName":"专门卖玉器的","brand_list":[],"address":"  ","sales_volume":0,"grade_img":"data/seller_grade/1490317350248705761.png","grade_name":"行家","shop_logo":"seller_imgs/seller_logo/seller_logo83.jpg","logo_thumb":"seller_imgs/seller_logo/logo_thumb/1531635913572779847.jpg","street_thumb":"data/store_street/street_thumb/1531635913164681547.jpg","brand_thumb":"data/store_street/brand_thumb/1531635913595710558.jpg","street_desc":"","merch_cmt":{"0":{"shop_id":"23","user_id":"83","mc_all_Rank":"0","mc_one_Rank":"0","mc_two_Rank":"0","mc_three_Rank":"0","mc_four_Rank":"0","mc_five_Rank":"0","mc_all_Server":"0","mc_one_Server":"0","mc_two_Server":"0","mc_three_Server":"0","mc_four_Server":"0","mc_five_Server":"0","mc_all_Delivery":"0","mc_one_Delivery":"0","mc_two_Delivery":"0","mc_three_Delivery":"0","mc_four_Delivery":"0","mc_five_Delivery":"0"},"cmt":{"commentRank":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentServer":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentDelivery":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"all_zconments":{"score":"5.00","allReview":100,"position":-3}}},"ru_id":"83","shop_url":"merchants_store.php?merchant_id=83","store_shop_url":"merchants_store_shop.php?id=83","goods_count":"1","goods_list":[{"market_price":"¥<\/em>1.20","shop_price":"¥<\/em>1.00","promote_price":"","goods_id":"924","goods_name":"开店的人的商品","goods_thumb":"images/201807/thumb_img/0_thumb_G_1531635792269.jpg","goods_url":"goods.php?id=924","sales_volume":"0","kf_type":"0","kf_qq":"","kf_ww":"","shop_name":"专门卖玉器的","shop_url":"merchants_store.php?merchant_id=83","cmt_count":"0"}],"collect_store":"1","kf_type":"0","kf_ww":"","kf_qq":"","is_IM":"1","is_dsc":false}
         */

        @SerializedName("22")
        private _$22Bean _$22;
        @SerializedName("23")
        private _$23Bean _$23;

        public _$22Bean get_$22() {
            return _$22;
        }

        public void set_$22(_$22Bean _$22) {
            this._$22 = _$22;
        }

        public _$23Bean get_$23() {
            return _$23;
        }

        public void set_$23(_$23Bean _$23) {
            this._$23 = _$23;
        }

        public static class _$22Bean {
            /**
             * shop_id : 22
             * shoprz_brandName : qwerw
             * shopNameSuffix : 专卖店
             * self_run : 0
             * shop_name : {"shop_name":"qwerw","shopNameSuffix":"专卖店"}
             * shopName : qwerw专卖店
             * brand_list : []
             * address :
             * sales_volume : 0
             * grade_img : data/seller_grade/1490317342721835143.png
             * grade_name : 自由
             * shop_logo :
             * logo_thumb : seller_imgs/seller_logo/logo_thumb/1531031144777138297.jpg
             * street_thumb : data/store_street/street_thumb/1531030573826726960.jpg
             * brand_thumb : data/store_street/brand_thumb/1531031144663448469.jpg
             * street_desc :
             * merch_cmt : {"0":{"shop_id":"22","user_id":"81","mc_all_Rank":"0","mc_one_Rank":"0","mc_two_Rank":"0","mc_three_Rank":"0","mc_four_Rank":"0","mc_five_Rank":"0","mc_all_Server":"0","mc_one_Server":"0","mc_two_Server":"0","mc_three_Server":"0","mc_four_Server":"0","mc_five_Server":"0","mc_all_Delivery":"0","mc_one_Delivery":"0","mc_two_Delivery":"0","mc_three_Delivery":"0","mc_four_Delivery":"0","mc_five_Delivery":"0"},"cmt":{"commentRank":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentServer":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentDelivery":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"all_zconments":{"score":"5.00","allReview":100,"position":-3}}}
             * ru_id : 81
             * shop_url : merchants_store.php?merchant_id=81
             * store_shop_url : merchants_store_shop.php?id=81
             * goods_count : 0
             * goods_list : []
             * collect_store :
             * kf_type : 0
             * kf_ww :
             * kf_qq :
             * is_IM : 1
             * is_dsc : false
             */

            private String shop_id;
            private String shoprz_brandName;
            private String shopNameSuffix;
            private String self_run;
            private ShopNameBean shop_name;
            private String shopName;
            private String address;
            private int sales_volume;
            private String grade_img;
            private String grade_name;
            private String shop_logo;
            private String logo_thumb;
            private String street_thumb;
            private String brand_thumb;
            private String street_desc;
            private MerchCmtBean merch_cmt;
            private String ru_id;
            private String shop_url;
            private String store_shop_url;
            private String goods_count;
            private String collect_store;
            private String kf_type;
            private String kf_ww;
            private String kf_qq;
            private String is_IM;
            private boolean is_dsc;
            private List<?> brand_list;
            private List<?> goods_list;

            public String getShop_id() {
                return shop_id;
            }

            public void setShop_id(String shop_id) {
                this.shop_id = shop_id;
            }

            public String getShoprz_brandName() {
                return shoprz_brandName;
            }

            public void setShoprz_brandName(String shoprz_brandName) {
                this.shoprz_brandName = shoprz_brandName;
            }

            public String getShopNameSuffix() {
                return shopNameSuffix;
            }

            public void setShopNameSuffix(String shopNameSuffix) {
                this.shopNameSuffix = shopNameSuffix;
            }

            public String getSelf_run() {
                return self_run;
            }

            public void setSelf_run(String self_run) {
                this.self_run = self_run;
            }

            public ShopNameBean getShop_name() {
                return shop_name;
            }

            public void setShop_name(ShopNameBean shop_name) {
                this.shop_name = shop_name;
            }

            public String getShopName() {
                return shopName;
            }

            public void setShopName(String shopName) {
                this.shopName = shopName;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public int getSales_volume() {
                return sales_volume;
            }

            public void setSales_volume(int sales_volume) {
                this.sales_volume = sales_volume;
            }

            public String getGrade_img() {
                return grade_img;
            }

            public void setGrade_img(String grade_img) {
                this.grade_img = grade_img;
            }

            public String getGrade_name() {
                return grade_name;
            }

            public void setGrade_name(String grade_name) {
                this.grade_name = grade_name;
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

            public String getStreet_desc() {
                return street_desc;
            }

            public void setStreet_desc(String street_desc) {
                this.street_desc = street_desc;
            }

            public MerchCmtBean getMerch_cmt() {
                return merch_cmt;
            }

            public void setMerch_cmt(MerchCmtBean merch_cmt) {
                this.merch_cmt = merch_cmt;
            }

            public String getRu_id() {
                return ru_id;
            }

            public void setRu_id(String ru_id) {
                this.ru_id = ru_id;
            }

            public String getShop_url() {
                return shop_url;
            }

            public void setShop_url(String shop_url) {
                this.shop_url = shop_url;
            }

            public String getStore_shop_url() {
                return store_shop_url;
            }

            public void setStore_shop_url(String store_shop_url) {
                this.store_shop_url = store_shop_url;
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

            public String getKf_type() {
                return kf_type;
            }

            public void setKf_type(String kf_type) {
                this.kf_type = kf_type;
            }

            public String getKf_ww() {
                return kf_ww;
            }

            public void setKf_ww(String kf_ww) {
                this.kf_ww = kf_ww;
            }

            public String getKf_qq() {
                return kf_qq;
            }

            public void setKf_qq(String kf_qq) {
                this.kf_qq = kf_qq;
            }

            public String getIs_IM() {
                return is_IM;
            }

            public void setIs_IM(String is_IM) {
                this.is_IM = is_IM;
            }

            public boolean isIs_dsc() {
                return is_dsc;
            }

            public void setIs_dsc(boolean is_dsc) {
                this.is_dsc = is_dsc;
            }

            public List<?> getBrand_list() {
                return brand_list;
            }

            public void setBrand_list(List<?> brand_list) {
                this.brand_list = brand_list;
            }

            public List<?> getGoods_list() {
                return goods_list;
            }

            public void setGoods_list(List<?> goods_list) {
                this.goods_list = goods_list;
            }

            public static class ShopNameBean {
                /**
                 * shop_name : qwerw
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

            public static class MerchCmtBean {
                /**
                 * 0 : {"shop_id":"22","user_id":"81","mc_all_Rank":"0","mc_one_Rank":"0","mc_two_Rank":"0","mc_three_Rank":"0","mc_four_Rank":"0","mc_five_Rank":"0","mc_all_Server":"0","mc_one_Server":"0","mc_two_Server":"0","mc_three_Server":"0","mc_four_Server":"0","mc_five_Server":"0","mc_all_Delivery":"0","mc_one_Delivery":"0","mc_two_Delivery":"0","mc_three_Delivery":"0","mc_four_Delivery":"0","mc_five_Delivery":"0"}
                 * cmt : {"commentRank":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentServer":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentDelivery":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"all_zconments":{"score":"5.00","allReview":100,"position":-3}}
                 */

                @SerializedName("0")
                private _$0Bean _$0;
                private CmtBean cmt;

                public _$0Bean get_$0() {
                    return _$0;
                }

                public void set_$0(_$0Bean _$0) {
                    this._$0 = _$0;
                }

                public CmtBean getCmt() {
                    return cmt;
                }

                public void setCmt(CmtBean cmt) {
                    this.cmt = cmt;
                }

                public static class _$0Bean {
                    /**
                     * shop_id : 22
                     * user_id : 81
                     * mc_all_Rank : 0
                     * mc_one_Rank : 0
                     * mc_two_Rank : 0
                     * mc_three_Rank : 0
                     * mc_four_Rank : 0
                     * mc_five_Rank : 0
                     * mc_all_Server : 0
                     * mc_one_Server : 0
                     * mc_two_Server : 0
                     * mc_three_Server : 0
                     * mc_four_Server : 0
                     * mc_five_Server : 0
                     * mc_all_Delivery : 0
                     * mc_one_Delivery : 0
                     * mc_two_Delivery : 0
                     * mc_three_Delivery : 0
                     * mc_four_Delivery : 0
                     * mc_five_Delivery : 0
                     */

                    private String shop_id;
                    private String user_id;
                    private String mc_all_Rank;
                    private String mc_one_Rank;
                    private String mc_two_Rank;
                    private String mc_three_Rank;
                    private String mc_four_Rank;
                    private String mc_five_Rank;
                    private String mc_all_Server;
                    private String mc_one_Server;
                    private String mc_two_Server;
                    private String mc_three_Server;
                    private String mc_four_Server;
                    private String mc_five_Server;
                    private String mc_all_Delivery;
                    private String mc_one_Delivery;
                    private String mc_two_Delivery;
                    private String mc_three_Delivery;
                    private String mc_four_Delivery;
                    private String mc_five_Delivery;

                    public String getShop_id() {
                        return shop_id;
                    }

                    public void setShop_id(String shop_id) {
                        this.shop_id = shop_id;
                    }

                    public String getUser_id() {
                        return user_id;
                    }

                    public void setUser_id(String user_id) {
                        this.user_id = user_id;
                    }

                    public String getMc_all_Rank() {
                        return mc_all_Rank;
                    }

                    public void setMc_all_Rank(String mc_all_Rank) {
                        this.mc_all_Rank = mc_all_Rank;
                    }

                    public String getMc_one_Rank() {
                        return mc_one_Rank;
                    }

                    public void setMc_one_Rank(String mc_one_Rank) {
                        this.mc_one_Rank = mc_one_Rank;
                    }

                    public String getMc_two_Rank() {
                        return mc_two_Rank;
                    }

                    public void setMc_two_Rank(String mc_two_Rank) {
                        this.mc_two_Rank = mc_two_Rank;
                    }

                    public String getMc_three_Rank() {
                        return mc_three_Rank;
                    }

                    public void setMc_three_Rank(String mc_three_Rank) {
                        this.mc_three_Rank = mc_three_Rank;
                    }

                    public String getMc_four_Rank() {
                        return mc_four_Rank;
                    }

                    public void setMc_four_Rank(String mc_four_Rank) {
                        this.mc_four_Rank = mc_four_Rank;
                    }

                    public String getMc_five_Rank() {
                        return mc_five_Rank;
                    }

                    public void setMc_five_Rank(String mc_five_Rank) {
                        this.mc_five_Rank = mc_five_Rank;
                    }

                    public String getMc_all_Server() {
                        return mc_all_Server;
                    }

                    public void setMc_all_Server(String mc_all_Server) {
                        this.mc_all_Server = mc_all_Server;
                    }

                    public String getMc_one_Server() {
                        return mc_one_Server;
                    }

                    public void setMc_one_Server(String mc_one_Server) {
                        this.mc_one_Server = mc_one_Server;
                    }

                    public String getMc_two_Server() {
                        return mc_two_Server;
                    }

                    public void setMc_two_Server(String mc_two_Server) {
                        this.mc_two_Server = mc_two_Server;
                    }

                    public String getMc_three_Server() {
                        return mc_three_Server;
                    }

                    public void setMc_three_Server(String mc_three_Server) {
                        this.mc_three_Server = mc_three_Server;
                    }

                    public String getMc_four_Server() {
                        return mc_four_Server;
                    }

                    public void setMc_four_Server(String mc_four_Server) {
                        this.mc_four_Server = mc_four_Server;
                    }

                    public String getMc_five_Server() {
                        return mc_five_Server;
                    }

                    public void setMc_five_Server(String mc_five_Server) {
                        this.mc_five_Server = mc_five_Server;
                    }

                    public String getMc_all_Delivery() {
                        return mc_all_Delivery;
                    }

                    public void setMc_all_Delivery(String mc_all_Delivery) {
                        this.mc_all_Delivery = mc_all_Delivery;
                    }

                    public String getMc_one_Delivery() {
                        return mc_one_Delivery;
                    }

                    public void setMc_one_Delivery(String mc_one_Delivery) {
                        this.mc_one_Delivery = mc_one_Delivery;
                    }

                    public String getMc_two_Delivery() {
                        return mc_two_Delivery;
                    }

                    public void setMc_two_Delivery(String mc_two_Delivery) {
                        this.mc_two_Delivery = mc_two_Delivery;
                    }

                    public String getMc_three_Delivery() {
                        return mc_three_Delivery;
                    }

                    public void setMc_three_Delivery(String mc_three_Delivery) {
                        this.mc_three_Delivery = mc_three_Delivery;
                    }

                    public String getMc_four_Delivery() {
                        return mc_four_Delivery;
                    }

                    public void setMc_four_Delivery(String mc_four_Delivery) {
                        this.mc_four_Delivery = mc_four_Delivery;
                    }

                    public String getMc_five_Delivery() {
                        return mc_five_Delivery;
                    }

                    public void setMc_five_Delivery(String mc_five_Delivery) {
                        this.mc_five_Delivery = mc_five_Delivery;
                    }
                }

                public static class CmtBean {
                    /**
                     * commentRank : {"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}}
                     * commentServer : {"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}}
                     * commentDelivery : {"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}}
                     * all_zconments : {"score":"5.00","allReview":100,"position":-3}
                     */

                    private CommentRankBean commentRank;
                    private CommentServerBean commentServer;
                    private CommentDeliveryBean commentDelivery;
                    private AllZconmentsBean all_zconments;

                    public CommentRankBean getCommentRank() {
                        return commentRank;
                    }

                    public void setCommentRank(CommentRankBean commentRank) {
                        this.commentRank = commentRank;
                    }

                    public CommentServerBean getCommentServer() {
                        return commentServer;
                    }

                    public void setCommentServer(CommentServerBean commentServer) {
                        this.commentServer = commentServer;
                    }

                    public CommentDeliveryBean getCommentDelivery() {
                        return commentDelivery;
                    }

                    public void setCommentDelivery(CommentDeliveryBean commentDelivery) {
                        this.commentDelivery = commentDelivery;
                    }

                    public AllZconmentsBean getAll_zconments() {
                        return all_zconments;
                    }

                    public void setAll_zconments(AllZconmentsBean all_zconments) {
                        this.all_zconments = all_zconments;
                    }

                    public static class CommentRankBean {
                        /**
                         * zconments : {"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}
                         */

                        private ZconmentsBean zconments;

                        public ZconmentsBean getZconments() {
                            return zconments;
                        }

                        public void setZconments(ZconmentsBean zconments) {
                            this.zconments = zconments;
                        }

                        public static class ZconmentsBean {
                            /**
                             * score : 5
                             * stars : 5
                             * badReview : 0
                             * middlReview : 0
                             * goodReview : 100
                             * allReview : 100
                             * allmen : 0
                             * badmen : 0
                             * middlemen : 0
                             * goodmen : 0
                             * left : 90
                             * up_down : 100
                             * is_status : 1
                             */

                            private int score;
                            private int stars;
                            private int badReview;
                            private int middlReview;
                            private int goodReview;
                            private int allReview;
                            private int allmen;
                            private int badmen;
                            private int middlemen;
                            private int goodmen;
                            private int left;
                            private int up_down;
                            private int is_status;

                            public int getScore() {
                                return score;
                            }

                            public void setScore(int score) {
                                this.score = score;
                            }

                            public int getStars() {
                                return stars;
                            }

                            public void setStars(int stars) {
                                this.stars = stars;
                            }

                            public int getBadReview() {
                                return badReview;
                            }

                            public void setBadReview(int badReview) {
                                this.badReview = badReview;
                            }

                            public int getMiddlReview() {
                                return middlReview;
                            }

                            public void setMiddlReview(int middlReview) {
                                this.middlReview = middlReview;
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

                            public int getAllmen() {
                                return allmen;
                            }

                            public void setAllmen(int allmen) {
                                this.allmen = allmen;
                            }

                            public int getBadmen() {
                                return badmen;
                            }

                            public void setBadmen(int badmen) {
                                this.badmen = badmen;
                            }

                            public int getMiddlemen() {
                                return middlemen;
                            }

                            public void setMiddlemen(int middlemen) {
                                this.middlemen = middlemen;
                            }

                            public int getGoodmen() {
                                return goodmen;
                            }

                            public void setGoodmen(int goodmen) {
                                this.goodmen = goodmen;
                            }

                            public int getLeft() {
                                return left;
                            }

                            public void setLeft(int left) {
                                this.left = left;
                            }

                            public int getUp_down() {
                                return up_down;
                            }

                            public void setUp_down(int up_down) {
                                this.up_down = up_down;
                            }

                            public int getIs_status() {
                                return is_status;
                            }

                            public void setIs_status(int is_status) {
                                this.is_status = is_status;
                            }
                        }
                    }

                    public static class CommentServerBean {
                        /**
                         * zconments : {"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}
                         */

                        private ZconmentsBeanX zconments;

                        public ZconmentsBeanX getZconments() {
                            return zconments;
                        }

                        public void setZconments(ZconmentsBeanX zconments) {
                            this.zconments = zconments;
                        }

                        public static class ZconmentsBeanX {
                            /**
                             * score : 5
                             * stars : 5
                             * badReview : 0
                             * middlReview : 0
                             * goodReview : 100
                             * allReview : 100
                             * allmen : 0
                             * badmen : 0
                             * middlemen : 0
                             * goodmen : 0
                             * left : 90
                             * up_down : 100
                             * is_status : 1
                             */

                            private int score;
                            private int stars;
                            private int badReview;
                            private int middlReview;
                            private int goodReview;
                            private int allReview;
                            private int allmen;
                            private int badmen;
                            private int middlemen;
                            private int goodmen;
                            private int left;
                            private int up_down;
                            private int is_status;

                            public int getScore() {
                                return score;
                            }

                            public void setScore(int score) {
                                this.score = score;
                            }

                            public int getStars() {
                                return stars;
                            }

                            public void setStars(int stars) {
                                this.stars = stars;
                            }

                            public int getBadReview() {
                                return badReview;
                            }

                            public void setBadReview(int badReview) {
                                this.badReview = badReview;
                            }

                            public int getMiddlReview() {
                                return middlReview;
                            }

                            public void setMiddlReview(int middlReview) {
                                this.middlReview = middlReview;
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

                            public int getAllmen() {
                                return allmen;
                            }

                            public void setAllmen(int allmen) {
                                this.allmen = allmen;
                            }

                            public int getBadmen() {
                                return badmen;
                            }

                            public void setBadmen(int badmen) {
                                this.badmen = badmen;
                            }

                            public int getMiddlemen() {
                                return middlemen;
                            }

                            public void setMiddlemen(int middlemen) {
                                this.middlemen = middlemen;
                            }

                            public int getGoodmen() {
                                return goodmen;
                            }

                            public void setGoodmen(int goodmen) {
                                this.goodmen = goodmen;
                            }

                            public int getLeft() {
                                return left;
                            }

                            public void setLeft(int left) {
                                this.left = left;
                            }

                            public int getUp_down() {
                                return up_down;
                            }

                            public void setUp_down(int up_down) {
                                this.up_down = up_down;
                            }

                            public int getIs_status() {
                                return is_status;
                            }

                            public void setIs_status(int is_status) {
                                this.is_status = is_status;
                            }
                        }
                    }

                    public static class CommentDeliveryBean {
                        /**
                         * zconments : {"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}
                         */

                        private ZconmentsBeanXX zconments;

                        public ZconmentsBeanXX getZconments() {
                            return zconments;
                        }

                        public void setZconments(ZconmentsBeanXX zconments) {
                            this.zconments = zconments;
                        }

                        public static class ZconmentsBeanXX {
                            /**
                             * score : 5
                             * stars : 5
                             * badReview : 0
                             * middlReview : 0
                             * goodReview : 100
                             * allReview : 100
                             * allmen : 0
                             * badmen : 0
                             * middlemen : 0
                             * goodmen : 0
                             * left : 90
                             * up_down : 100
                             * is_status : 1
                             */

                            private int score;
                            private int stars;
                            private int badReview;
                            private int middlReview;
                            private int goodReview;
                            private int allReview;
                            private int allmen;
                            private int badmen;
                            private int middlemen;
                            private int goodmen;
                            private int left;
                            private int up_down;
                            private int is_status;

                            public int getScore() {
                                return score;
                            }

                            public void setScore(int score) {
                                this.score = score;
                            }

                            public int getStars() {
                                return stars;
                            }

                            public void setStars(int stars) {
                                this.stars = stars;
                            }

                            public int getBadReview() {
                                return badReview;
                            }

                            public void setBadReview(int badReview) {
                                this.badReview = badReview;
                            }

                            public int getMiddlReview() {
                                return middlReview;
                            }

                            public void setMiddlReview(int middlReview) {
                                this.middlReview = middlReview;
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

                            public int getAllmen() {
                                return allmen;
                            }

                            public void setAllmen(int allmen) {
                                this.allmen = allmen;
                            }

                            public int getBadmen() {
                                return badmen;
                            }

                            public void setBadmen(int badmen) {
                                this.badmen = badmen;
                            }

                            public int getMiddlemen() {
                                return middlemen;
                            }

                            public void setMiddlemen(int middlemen) {
                                this.middlemen = middlemen;
                            }

                            public int getGoodmen() {
                                return goodmen;
                            }

                            public void setGoodmen(int goodmen) {
                                this.goodmen = goodmen;
                            }

                            public int getLeft() {
                                return left;
                            }

                            public void setLeft(int left) {
                                this.left = left;
                            }

                            public int getUp_down() {
                                return up_down;
                            }

                            public void setUp_down(int up_down) {
                                this.up_down = up_down;
                            }

                            public int getIs_status() {
                                return is_status;
                            }

                            public void setIs_status(int is_status) {
                                this.is_status = is_status;
                            }
                        }
                    }

                    public static class AllZconmentsBean {
                        /**
                         * score : 5.00
                         * allReview : 100
                         * position : -3
                         */

                        private String score;
                        private int allReview;
                        private int position;

                        public String getScore() {
                            return score;
                        }

                        public void setScore(String score) {
                            this.score = score;
                        }

                        public int getAllReview() {
                            return allReview;
                        }

                        public void setAllReview(int allReview) {
                            this.allReview = allReview;
                        }

                        public int getPosition() {
                            return position;
                        }

                        public void setPosition(int position) {
                            this.position = position;
                        }
                    }
                }
            }
        }

        public static class _$23Bean {
            /**
             * shop_id : 23
             * shoprz_brandName :
             * shopNameSuffix : 专卖店
             * self_run : 0
             * shop_name : {"shop_name":"专门卖玉器的","shopNameSuffix":"专卖店"}
             * shopName : 专门卖玉器的
             * brand_list : []
             * address :
             * sales_volume : 0
             * grade_img : data/seller_grade/1490317350248705761.png
             * grade_name : 行家
             * shop_logo : seller_imgs/seller_logo/seller_logo83.jpg
             * logo_thumb : seller_imgs/seller_logo/logo_thumb/1531635913572779847.jpg
             * street_thumb : data/store_street/street_thumb/1531635913164681547.jpg
             * brand_thumb : data/store_street/brand_thumb/1531635913595710558.jpg
             * street_desc :
             * merch_cmt : {"0":{"shop_id":"23","user_id":"83","mc_all_Rank":"0","mc_one_Rank":"0","mc_two_Rank":"0","mc_three_Rank":"0","mc_four_Rank":"0","mc_five_Rank":"0","mc_all_Server":"0","mc_one_Server":"0","mc_two_Server":"0","mc_three_Server":"0","mc_four_Server":"0","mc_five_Server":"0","mc_all_Delivery":"0","mc_one_Delivery":"0","mc_two_Delivery":"0","mc_three_Delivery":"0","mc_four_Delivery":"0","mc_five_Delivery":"0"},"cmt":{"commentRank":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentServer":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentDelivery":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"all_zconments":{"score":"5.00","allReview":100,"position":-3}}}
             * ru_id : 83
             * shop_url : merchants_store.php?merchant_id=83
             * store_shop_url : merchants_store_shop.php?id=83
             * goods_count : 1
             * goods_list : [{"market_price":"¥<\/em>1.20","shop_price":"¥<\/em>1.00","promote_price":"","goods_id":"924","goods_name":"开店的人的商品","goods_thumb":"images/201807/thumb_img/0_thumb_G_1531635792269.jpg","goods_url":"goods.php?id=924","sales_volume":"0","kf_type":"0","kf_qq":"","kf_ww":"","shop_name":"专门卖玉器的","shop_url":"merchants_store.php?merchant_id=83","cmt_count":"0"}]
             * collect_store : 1
             * kf_type : 0
             * kf_ww :
             * kf_qq :
             * is_IM : 1
             * is_dsc : false
             */

            private String shop_id;
            private String shoprz_brandName;
            private String shopNameSuffix;
            private String self_run;
            private ShopNameBeanX shop_name;
            private String shopName;
            private String address;
            private int sales_volume;
            private String grade_img;
            private String grade_name;
            private String shop_logo;
            private String logo_thumb;
            private String street_thumb;
            private String brand_thumb;
            private String street_desc;
            private MerchCmtBeanX merch_cmt;
            private String ru_id;
            private String shop_url;
            private String store_shop_url;
            private String goods_count;
            private String collect_store;
            private String kf_type;
            private String kf_ww;
            private String kf_qq;
            private String is_IM;
            private boolean is_dsc;
            private List<?> brand_list;
            private List<GoodsListBean> goods_list;

            public String getShop_id() {
                return shop_id;
            }

            public void setShop_id(String shop_id) {
                this.shop_id = shop_id;
            }

            public String getShoprz_brandName() {
                return shoprz_brandName;
            }

            public void setShoprz_brandName(String shoprz_brandName) {
                this.shoprz_brandName = shoprz_brandName;
            }

            public String getShopNameSuffix() {
                return shopNameSuffix;
            }

            public void setShopNameSuffix(String shopNameSuffix) {
                this.shopNameSuffix = shopNameSuffix;
            }

            public String getSelf_run() {
                return self_run;
            }

            public void setSelf_run(String self_run) {
                this.self_run = self_run;
            }

            public ShopNameBeanX getShop_name() {
                return shop_name;
            }

            public void setShop_name(ShopNameBeanX shop_name) {
                this.shop_name = shop_name;
            }

            public String getShopName() {
                return shopName;
            }

            public void setShopName(String shopName) {
                this.shopName = shopName;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public int getSales_volume() {
                return sales_volume;
            }

            public void setSales_volume(int sales_volume) {
                this.sales_volume = sales_volume;
            }

            public String getGrade_img() {
                return grade_img;
            }

            public void setGrade_img(String grade_img) {
                this.grade_img = grade_img;
            }

            public String getGrade_name() {
                return grade_name;
            }

            public void setGrade_name(String grade_name) {
                this.grade_name = grade_name;
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

            public String getStreet_desc() {
                return street_desc;
            }

            public void setStreet_desc(String street_desc) {
                this.street_desc = street_desc;
            }

            public MerchCmtBeanX getMerch_cmt() {
                return merch_cmt;
            }

            public void setMerch_cmt(MerchCmtBeanX merch_cmt) {
                this.merch_cmt = merch_cmt;
            }

            public String getRu_id() {
                return ru_id;
            }

            public void setRu_id(String ru_id) {
                this.ru_id = ru_id;
            }

            public String getShop_url() {
                return shop_url;
            }

            public void setShop_url(String shop_url) {
                this.shop_url = shop_url;
            }

            public String getStore_shop_url() {
                return store_shop_url;
            }

            public void setStore_shop_url(String store_shop_url) {
                this.store_shop_url = store_shop_url;
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

            public String getKf_type() {
                return kf_type;
            }

            public void setKf_type(String kf_type) {
                this.kf_type = kf_type;
            }

            public String getKf_ww() {
                return kf_ww;
            }

            public void setKf_ww(String kf_ww) {
                this.kf_ww = kf_ww;
            }

            public String getKf_qq() {
                return kf_qq;
            }

            public void setKf_qq(String kf_qq) {
                this.kf_qq = kf_qq;
            }

            public String getIs_IM() {
                return is_IM;
            }

            public void setIs_IM(String is_IM) {
                this.is_IM = is_IM;
            }

            public boolean isIs_dsc() {
                return is_dsc;
            }

            public void setIs_dsc(boolean is_dsc) {
                this.is_dsc = is_dsc;
            }

            public List<?> getBrand_list() {
                return brand_list;
            }

            public void setBrand_list(List<?> brand_list) {
                this.brand_list = brand_list;
            }

            public List<GoodsListBean> getGoods_list() {
                return goods_list;
            }

            public void setGoods_list(List<GoodsListBean> goods_list) {
                this.goods_list = goods_list;
            }

            public static class ShopNameBeanX {
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

            public static class MerchCmtBeanX {
                /**
                 * 0 : {"shop_id":"23","user_id":"83","mc_all_Rank":"0","mc_one_Rank":"0","mc_two_Rank":"0","mc_three_Rank":"0","mc_four_Rank":"0","mc_five_Rank":"0","mc_all_Server":"0","mc_one_Server":"0","mc_two_Server":"0","mc_three_Server":"0","mc_four_Server":"0","mc_five_Server":"0","mc_all_Delivery":"0","mc_one_Delivery":"0","mc_two_Delivery":"0","mc_three_Delivery":"0","mc_four_Delivery":"0","mc_five_Delivery":"0"}
                 * cmt : {"commentRank":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentServer":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentDelivery":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"all_zconments":{"score":"5.00","allReview":100,"position":-3}}
                 */

                @SerializedName("0")
                private _$0BeanX _$0;
                private CmtBeanX cmt;

                public _$0BeanX get_$0() {
                    return _$0;
                }

                public void set_$0(_$0BeanX _$0) {
                    this._$0 = _$0;
                }

                public CmtBeanX getCmt() {
                    return cmt;
                }

                public void setCmt(CmtBeanX cmt) {
                    this.cmt = cmt;
                }

                public static class _$0BeanX {
                    /**
                     * shop_id : 23
                     * user_id : 83
                     * mc_all_Rank : 0
                     * mc_one_Rank : 0
                     * mc_two_Rank : 0
                     * mc_three_Rank : 0
                     * mc_four_Rank : 0
                     * mc_five_Rank : 0
                     * mc_all_Server : 0
                     * mc_one_Server : 0
                     * mc_two_Server : 0
                     * mc_three_Server : 0
                     * mc_four_Server : 0
                     * mc_five_Server : 0
                     * mc_all_Delivery : 0
                     * mc_one_Delivery : 0
                     * mc_two_Delivery : 0
                     * mc_three_Delivery : 0
                     * mc_four_Delivery : 0
                     * mc_five_Delivery : 0
                     */

                    private String shop_id;
                    private String user_id;
                    private String mc_all_Rank;
                    private String mc_one_Rank;
                    private String mc_two_Rank;
                    private String mc_three_Rank;
                    private String mc_four_Rank;
                    private String mc_five_Rank;
                    private String mc_all_Server;
                    private String mc_one_Server;
                    private String mc_two_Server;
                    private String mc_three_Server;
                    private String mc_four_Server;
                    private String mc_five_Server;
                    private String mc_all_Delivery;
                    private String mc_one_Delivery;
                    private String mc_two_Delivery;
                    private String mc_three_Delivery;
                    private String mc_four_Delivery;
                    private String mc_five_Delivery;

                    public String getShop_id() {
                        return shop_id;
                    }

                    public void setShop_id(String shop_id) {
                        this.shop_id = shop_id;
                    }

                    public String getUser_id() {
                        return user_id;
                    }

                    public void setUser_id(String user_id) {
                        this.user_id = user_id;
                    }

                    public String getMc_all_Rank() {
                        return mc_all_Rank;
                    }

                    public void setMc_all_Rank(String mc_all_Rank) {
                        this.mc_all_Rank = mc_all_Rank;
                    }

                    public String getMc_one_Rank() {
                        return mc_one_Rank;
                    }

                    public void setMc_one_Rank(String mc_one_Rank) {
                        this.mc_one_Rank = mc_one_Rank;
                    }

                    public String getMc_two_Rank() {
                        return mc_two_Rank;
                    }

                    public void setMc_two_Rank(String mc_two_Rank) {
                        this.mc_two_Rank = mc_two_Rank;
                    }

                    public String getMc_three_Rank() {
                        return mc_three_Rank;
                    }

                    public void setMc_three_Rank(String mc_three_Rank) {
                        this.mc_three_Rank = mc_three_Rank;
                    }

                    public String getMc_four_Rank() {
                        return mc_four_Rank;
                    }

                    public void setMc_four_Rank(String mc_four_Rank) {
                        this.mc_four_Rank = mc_four_Rank;
                    }

                    public String getMc_five_Rank() {
                        return mc_five_Rank;
                    }

                    public void setMc_five_Rank(String mc_five_Rank) {
                        this.mc_five_Rank = mc_five_Rank;
                    }

                    public String getMc_all_Server() {
                        return mc_all_Server;
                    }

                    public void setMc_all_Server(String mc_all_Server) {
                        this.mc_all_Server = mc_all_Server;
                    }

                    public String getMc_one_Server() {
                        return mc_one_Server;
                    }

                    public void setMc_one_Server(String mc_one_Server) {
                        this.mc_one_Server = mc_one_Server;
                    }

                    public String getMc_two_Server() {
                        return mc_two_Server;
                    }

                    public void setMc_two_Server(String mc_two_Server) {
                        this.mc_two_Server = mc_two_Server;
                    }

                    public String getMc_three_Server() {
                        return mc_three_Server;
                    }

                    public void setMc_three_Server(String mc_three_Server) {
                        this.mc_three_Server = mc_three_Server;
                    }

                    public String getMc_four_Server() {
                        return mc_four_Server;
                    }

                    public void setMc_four_Server(String mc_four_Server) {
                        this.mc_four_Server = mc_four_Server;
                    }

                    public String getMc_five_Server() {
                        return mc_five_Server;
                    }

                    public void setMc_five_Server(String mc_five_Server) {
                        this.mc_five_Server = mc_five_Server;
                    }

                    public String getMc_all_Delivery() {
                        return mc_all_Delivery;
                    }

                    public void setMc_all_Delivery(String mc_all_Delivery) {
                        this.mc_all_Delivery = mc_all_Delivery;
                    }

                    public String getMc_one_Delivery() {
                        return mc_one_Delivery;
                    }

                    public void setMc_one_Delivery(String mc_one_Delivery) {
                        this.mc_one_Delivery = mc_one_Delivery;
                    }

                    public String getMc_two_Delivery() {
                        return mc_two_Delivery;
                    }

                    public void setMc_two_Delivery(String mc_two_Delivery) {
                        this.mc_two_Delivery = mc_two_Delivery;
                    }

                    public String getMc_three_Delivery() {
                        return mc_three_Delivery;
                    }

                    public void setMc_three_Delivery(String mc_three_Delivery) {
                        this.mc_three_Delivery = mc_three_Delivery;
                    }

                    public String getMc_four_Delivery() {
                        return mc_four_Delivery;
                    }

                    public void setMc_four_Delivery(String mc_four_Delivery) {
                        this.mc_four_Delivery = mc_four_Delivery;
                    }

                    public String getMc_five_Delivery() {
                        return mc_five_Delivery;
                    }

                    public void setMc_five_Delivery(String mc_five_Delivery) {
                        this.mc_five_Delivery = mc_five_Delivery;
                    }
                }

                public static class CmtBeanX {
                    /**
                     * commentRank : {"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}}
                     * commentServer : {"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}}
                     * commentDelivery : {"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}}
                     * all_zconments : {"score":"5.00","allReview":100,"position":-3}
                     */

                    private CommentRankBeanX commentRank;
                    private CommentServerBeanX commentServer;
                    private CommentDeliveryBeanX commentDelivery;
                    private AllZconmentsBeanX all_zconments;

                    public CommentRankBeanX getCommentRank() {
                        return commentRank;
                    }

                    public void setCommentRank(CommentRankBeanX commentRank) {
                        this.commentRank = commentRank;
                    }

                    public CommentServerBeanX getCommentServer() {
                        return commentServer;
                    }

                    public void setCommentServer(CommentServerBeanX commentServer) {
                        this.commentServer = commentServer;
                    }

                    public CommentDeliveryBeanX getCommentDelivery() {
                        return commentDelivery;
                    }

                    public void setCommentDelivery(CommentDeliveryBeanX commentDelivery) {
                        this.commentDelivery = commentDelivery;
                    }

                    public AllZconmentsBeanX getAll_zconments() {
                        return all_zconments;
                    }

                    public void setAll_zconments(AllZconmentsBeanX all_zconments) {
                        this.all_zconments = all_zconments;
                    }

                    public static class CommentRankBeanX {
                        /**
                         * zconments : {"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}
                         */

                        private ZconmentsBeanXXX zconments;

                        public ZconmentsBeanXXX getZconments() {
                            return zconments;
                        }

                        public void setZconments(ZconmentsBeanXXX zconments) {
                            this.zconments = zconments;
                        }

                        public static class ZconmentsBeanXXX {
                            /**
                             * score : 5
                             * stars : 5
                             * badReview : 0
                             * middlReview : 0
                             * goodReview : 100
                             * allReview : 100
                             * allmen : 0
                             * badmen : 0
                             * middlemen : 0
                             * goodmen : 0
                             * left : 90
                             * up_down : 100
                             * is_status : 1
                             */

                            private int score;
                            private int stars;
                            private int badReview;
                            private int middlReview;
                            private int goodReview;
                            private int allReview;
                            private int allmen;
                            private int badmen;
                            private int middlemen;
                            private int goodmen;
                            private int left;
                            private int up_down;
                            private int is_status;

                            public int getScore() {
                                return score;
                            }

                            public void setScore(int score) {
                                this.score = score;
                            }

                            public int getStars() {
                                return stars;
                            }

                            public void setStars(int stars) {
                                this.stars = stars;
                            }

                            public int getBadReview() {
                                return badReview;
                            }

                            public void setBadReview(int badReview) {
                                this.badReview = badReview;
                            }

                            public int getMiddlReview() {
                                return middlReview;
                            }

                            public void setMiddlReview(int middlReview) {
                                this.middlReview = middlReview;
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

                            public int getAllmen() {
                                return allmen;
                            }

                            public void setAllmen(int allmen) {
                                this.allmen = allmen;
                            }

                            public int getBadmen() {
                                return badmen;
                            }

                            public void setBadmen(int badmen) {
                                this.badmen = badmen;
                            }

                            public int getMiddlemen() {
                                return middlemen;
                            }

                            public void setMiddlemen(int middlemen) {
                                this.middlemen = middlemen;
                            }

                            public int getGoodmen() {
                                return goodmen;
                            }

                            public void setGoodmen(int goodmen) {
                                this.goodmen = goodmen;
                            }

                            public int getLeft() {
                                return left;
                            }

                            public void setLeft(int left) {
                                this.left = left;
                            }

                            public int getUp_down() {
                                return up_down;
                            }

                            public void setUp_down(int up_down) {
                                this.up_down = up_down;
                            }

                            public int getIs_status() {
                                return is_status;
                            }

                            public void setIs_status(int is_status) {
                                this.is_status = is_status;
                            }
                        }
                    }

                    public static class CommentServerBeanX {
                        /**
                         * zconments : {"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}
                         */

                        private ZconmentsBeanXXXX zconments;

                        public ZconmentsBeanXXXX getZconments() {
                            return zconments;
                        }

                        public void setZconments(ZconmentsBeanXXXX zconments) {
                            this.zconments = zconments;
                        }

                        public static class ZconmentsBeanXXXX {
                            /**
                             * score : 5
                             * stars : 5
                             * badReview : 0
                             * middlReview : 0
                             * goodReview : 100
                             * allReview : 100
                             * allmen : 0
                             * badmen : 0
                             * middlemen : 0
                             * goodmen : 0
                             * left : 90
                             * up_down : 100
                             * is_status : 1
                             */

                            private int score;
                            private int stars;
                            private int badReview;
                            private int middlReview;
                            private int goodReview;
                            private int allReview;
                            private int allmen;
                            private int badmen;
                            private int middlemen;
                            private int goodmen;
                            private int left;
                            private int up_down;
                            private int is_status;

                            public int getScore() {
                                return score;
                            }

                            public void setScore(int score) {
                                this.score = score;
                            }

                            public int getStars() {
                                return stars;
                            }

                            public void setStars(int stars) {
                                this.stars = stars;
                            }

                            public int getBadReview() {
                                return badReview;
                            }

                            public void setBadReview(int badReview) {
                                this.badReview = badReview;
                            }

                            public int getMiddlReview() {
                                return middlReview;
                            }

                            public void setMiddlReview(int middlReview) {
                                this.middlReview = middlReview;
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

                            public int getAllmen() {
                                return allmen;
                            }

                            public void setAllmen(int allmen) {
                                this.allmen = allmen;
                            }

                            public int getBadmen() {
                                return badmen;
                            }

                            public void setBadmen(int badmen) {
                                this.badmen = badmen;
                            }

                            public int getMiddlemen() {
                                return middlemen;
                            }

                            public void setMiddlemen(int middlemen) {
                                this.middlemen = middlemen;
                            }

                            public int getGoodmen() {
                                return goodmen;
                            }

                            public void setGoodmen(int goodmen) {
                                this.goodmen = goodmen;
                            }

                            public int getLeft() {
                                return left;
                            }

                            public void setLeft(int left) {
                                this.left = left;
                            }

                            public int getUp_down() {
                                return up_down;
                            }

                            public void setUp_down(int up_down) {
                                this.up_down = up_down;
                            }

                            public int getIs_status() {
                                return is_status;
                            }

                            public void setIs_status(int is_status) {
                                this.is_status = is_status;
                            }
                        }
                    }

                    public static class CommentDeliveryBeanX {
                        /**
                         * zconments : {"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}
                         */

                        private ZconmentsBeanXXXXX zconments;

                        public ZconmentsBeanXXXXX getZconments() {
                            return zconments;
                        }

                        public void setZconments(ZconmentsBeanXXXXX zconments) {
                            this.zconments = zconments;
                        }

                        public static class ZconmentsBeanXXXXX {
                            /**
                             * score : 5
                             * stars : 5
                             * badReview : 0
                             * middlReview : 0
                             * goodReview : 100
                             * allReview : 100
                             * allmen : 0
                             * badmen : 0
                             * middlemen : 0
                             * goodmen : 0
                             * left : 90
                             * up_down : 100
                             * is_status : 1
                             */

                            private int score;
                            private int stars;
                            private int badReview;
                            private int middlReview;
                            private int goodReview;
                            private int allReview;
                            private int allmen;
                            private int badmen;
                            private int middlemen;
                            private int goodmen;
                            private int left;
                            private int up_down;
                            private int is_status;

                            public int getScore() {
                                return score;
                            }

                            public void setScore(int score) {
                                this.score = score;
                            }

                            public int getStars() {
                                return stars;
                            }

                            public void setStars(int stars) {
                                this.stars = stars;
                            }

                            public int getBadReview() {
                                return badReview;
                            }

                            public void setBadReview(int badReview) {
                                this.badReview = badReview;
                            }

                            public int getMiddlReview() {
                                return middlReview;
                            }

                            public void setMiddlReview(int middlReview) {
                                this.middlReview = middlReview;
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

                            public int getAllmen() {
                                return allmen;
                            }

                            public void setAllmen(int allmen) {
                                this.allmen = allmen;
                            }

                            public int getBadmen() {
                                return badmen;
                            }

                            public void setBadmen(int badmen) {
                                this.badmen = badmen;
                            }

                            public int getMiddlemen() {
                                return middlemen;
                            }

                            public void setMiddlemen(int middlemen) {
                                this.middlemen = middlemen;
                            }

                            public int getGoodmen() {
                                return goodmen;
                            }

                            public void setGoodmen(int goodmen) {
                                this.goodmen = goodmen;
                            }

                            public int getLeft() {
                                return left;
                            }

                            public void setLeft(int left) {
                                this.left = left;
                            }

                            public int getUp_down() {
                                return up_down;
                            }

                            public void setUp_down(int up_down) {
                                this.up_down = up_down;
                            }

                            public int getIs_status() {
                                return is_status;
                            }

                            public void setIs_status(int is_status) {
                                this.is_status = is_status;
                            }
                        }
                    }

                    public static class AllZconmentsBeanX {
                        /**
                         * score : 5.00
                         * allReview : 100
                         * position : -3
                         */

                        private String score;
                        private int allReview;
                        private int position;

                        public String getScore() {
                            return score;
                        }

                        public void setScore(String score) {
                            this.score = score;
                        }

                        public int getAllReview() {
                            return allReview;
                        }

                        public void setAllReview(int allReview) {
                            this.allReview = allReview;
                        }

                        public int getPosition() {
                            return position;
                        }

                        public void setPosition(int position) {
                            this.position = position;
                        }
                    }
                }
            }

            public static class GoodsListBean {
                /**
                 * market_price : ¥</em>1.20
                 * shop_price : ¥</em>1.00
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
}
