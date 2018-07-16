package com.xiaoxing.salesclient.mvp.model.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/7 0007 16:43
 */
public class AuctionBid implements Serializable {


    /**
     * result : true
     * data : {"store_list":[{"shop_id":"23","store_name":"专门卖玉器的","shop_logo":"seller_imgs/seller_logo/seller_logo83.jpg","count_store":"1","add_time":"2018-07-15","kf_type":"0","is_IM":"1","is_dsc":false,"kf_qq":"","kf_ww":"","ru_id":"83","brand_thumb":"data/store_street/brand_thumb/1531635913595710558.jpg","url":"merchants_store.php?merchant_id=83","merch_cmt":{"0":{"shop_id":"23","user_id":"83","mc_all_Rank":"0","mc_one_Rank":"0","mc_two_Rank":"0","mc_three_Rank":"0","mc_four_Rank":"0","mc_five_Rank":"0","mc_all_Server":"0","mc_one_Server":"0","mc_two_Server":"0","mc_three_Server":"0","mc_four_Server":"0","mc_five_Server":"0","mc_all_Delivery":"0","mc_one_Delivery":"0","mc_two_Delivery":"0","mc_three_Delivery":"0","mc_four_Delivery":"0","mc_five_Delivery":"0"},"cmt":{"commentRank":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentServer":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentDelivery":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"all_zconments":{"score":"5.00","allReview":100,"position":-3}}},"hot_goods":[],"new_goods":[],"new_goods_count":0}],"record_count":"1","size":3}
     */

    private String result;
    private DataBean data;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * store_list : [{"shop_id":"23","store_name":"专门卖玉器的","shop_logo":"seller_imgs/seller_logo/seller_logo83.jpg","count_store":"1","add_time":"2018-07-15","kf_type":"0","is_IM":"1","is_dsc":false,"kf_qq":"","kf_ww":"","ru_id":"83","brand_thumb":"data/store_street/brand_thumb/1531635913595710558.jpg","url":"merchants_store.php?merchant_id=83","merch_cmt":{"0":{"shop_id":"23","user_id":"83","mc_all_Rank":"0","mc_one_Rank":"0","mc_two_Rank":"0","mc_three_Rank":"0","mc_four_Rank":"0","mc_five_Rank":"0","mc_all_Server":"0","mc_one_Server":"0","mc_two_Server":"0","mc_three_Server":"0","mc_four_Server":"0","mc_five_Server":"0","mc_all_Delivery":"0","mc_one_Delivery":"0","mc_two_Delivery":"0","mc_three_Delivery":"0","mc_four_Delivery":"0","mc_five_Delivery":"0"},"cmt":{"commentRank":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentServer":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentDelivery":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"all_zconments":{"score":"5.00","allReview":100,"position":-3}}},"hot_goods":[],"new_goods":[],"new_goods_count":0}]
         * record_count : 1
         * size : 3
         */

        private String record_count;
        private int size;
        private List<StoreListBean> store_list;

        public String getRecord_count() {
            return record_count;
        }

        public void setRecord_count(String record_count) {
            this.record_count = record_count;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public List<StoreListBean> getStore_list() {
            return store_list;
        }

        public void setStore_list(List<StoreListBean> store_list) {
            this.store_list = store_list;
        }

        public static class StoreListBean {
            /**
             * shop_id : 23
             * store_name : 专门卖玉器的
             * shop_logo : seller_imgs/seller_logo/seller_logo83.jpg
             * count_store : 1
             * add_time : 2018-07-15
             * kf_type : 0
             * is_IM : 1
             * is_dsc : false
             * kf_qq :
             * kf_ww :
             * ru_id : 83
             * brand_thumb : data/store_street/brand_thumb/1531635913595710558.jpg
             * url : merchants_store.php?merchant_id=83
             * merch_cmt : {"0":{"shop_id":"23","user_id":"83","mc_all_Rank":"0","mc_one_Rank":"0","mc_two_Rank":"0","mc_three_Rank":"0","mc_four_Rank":"0","mc_five_Rank":"0","mc_all_Server":"0","mc_one_Server":"0","mc_two_Server":"0","mc_three_Server":"0","mc_four_Server":"0","mc_five_Server":"0","mc_all_Delivery":"0","mc_one_Delivery":"0","mc_two_Delivery":"0","mc_three_Delivery":"0","mc_four_Delivery":"0","mc_five_Delivery":"0"},"cmt":{"commentRank":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentServer":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"commentDelivery":{"zconments":{"score":5,"stars":5,"badReview":0,"middlReview":0,"goodReview":100,"allReview":100,"allmen":0,"badmen":0,"middlemen":0,"goodmen":0,"left":90,"up_down":100,"is_status":1}},"all_zconments":{"score":"5.00","allReview":100,"position":-3}}}
             * hot_goods : []
             * new_goods : []
             * new_goods_count : 0
             */

            private String shop_id;
            private String store_name;
            private String shop_logo;
            private String count_store;
            private String add_time;
            private String kf_type;
            private String is_IM;
            private boolean is_dsc;
            private String kf_qq;
            private String kf_ww;
            private String ru_id;
            private String brand_thumb;
            private String url;
            private MerchCmtBean merch_cmt;
            private int new_goods_count;
            private List<?> hot_goods;
            private List<?> new_goods;

            public String getShop_id() {
                return shop_id;
            }

            public void setShop_id(String shop_id) {
                this.shop_id = shop_id;
            }

            public String getStore_name() {
                return store_name;
            }

            public void setStore_name(String store_name) {
                this.store_name = store_name;
            }

            public String getShop_logo() {
                return shop_logo;
            }

            public void setShop_logo(String shop_logo) {
                this.shop_logo = shop_logo;
            }

            public String getCount_store() {
                return count_store;
            }

            public void setCount_store(String count_store) {
                this.count_store = count_store;
            }

            public String getAdd_time() {
                return add_time;
            }

            public void setAdd_time(String add_time) {
                this.add_time = add_time;
            }

            public String getKf_type() {
                return kf_type;
            }

            public void setKf_type(String kf_type) {
                this.kf_type = kf_type;
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

            public String getRu_id() {
                return ru_id;
            }

            public void setRu_id(String ru_id) {
                this.ru_id = ru_id;
            }

            public String getBrand_thumb() {
                return brand_thumb;
            }

            public void setBrand_thumb(String brand_thumb) {
                this.brand_thumb = brand_thumb;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public MerchCmtBean getMerch_cmt() {
                return merch_cmt;
            }

            public void setMerch_cmt(MerchCmtBean merch_cmt) {
                this.merch_cmt = merch_cmt;
            }

            public int getNew_goods_count() {
                return new_goods_count;
            }

            public void setNew_goods_count(int new_goods_count) {
                this.new_goods_count = new_goods_count;
            }

            public List<?> getHot_goods() {
                return hot_goods;
            }

            public void setHot_goods(List<?> hot_goods) {
                this.hot_goods = hot_goods;
            }

            public List<?> getNew_goods() {
                return new_goods;
            }

            public void setNew_goods(List<?> new_goods) {
                this.new_goods = new_goods;
            }

            public static class MerchCmtBean {
                /**
                 * 0 : {"shop_id":"23","user_id":"83","mc_all_Rank":"0","mc_one_Rank":"0","mc_two_Rank":"0","mc_three_Rank":"0","mc_four_Rank":"0","mc_five_Rank":"0","mc_all_Server":"0","mc_one_Server":"0","mc_two_Server":"0","mc_three_Server":"0","mc_four_Server":"0","mc_five_Server":"0","mc_all_Delivery":"0","mc_one_Delivery":"0","mc_two_Delivery":"0","mc_three_Delivery":"0","mc_four_Delivery":"0","mc_five_Delivery":"0"}
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
    }
}
