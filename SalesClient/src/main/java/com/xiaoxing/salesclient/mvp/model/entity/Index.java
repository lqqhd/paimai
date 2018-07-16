package com.xiaoxing.salesclient.mvp.model.entity;

import java.util.List;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/7 0007 16:43
 */
public class Index {


    /**
     * result : true
     * next : false
     * data : {"banner":[{"goods_id":"910","goods_name":"古书","goods_number":"6","shop_price":"3000.00","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530958971037.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530958971708.jpg","last_update":"1530958998"},{"goods_id":"909","goods_name":"字画1","goods_number":"5","shop_price":"0.00","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530958877665.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530958877783.jpg","last_update":"1530958996"},{"goods_id":"908","goods_name":"太师椅","goods_number":"4","shop_price":"3000.00","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530958811379.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530958811442.jpg","last_update":"1530959000"}],"article":[{"article_id":"66","title":"乐拍头条重要通知","add_time":"1531615549"},{"article_id":"65","title":"7月8日晚专场","add_time":"1531615549"},{"article_id":"64","title":"卖家入住流程","add_time":"1531615549"},{"article_id":"62","title":"玉器的鉴别方法","add_time":"1490724253"},{"article_id":"61","title":"古董鉴别方法","add_time":"1490724217"}],"weipai":[{"goods_id":"911","goods_name":"字画5","goods_number":"2","shop_price":"6000.00","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530959062805.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530959062471.jpg","last_update":"1530959084"},{"goods_id":"907","goods_name":"桌子","goods_number":"3","shop_price":"30000.00","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530958731867.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530958731596.jpg","last_update":"1530959014"},{"goods_id":"906","goods_name":"花瓶","goods_number":"3","shop_price":"2000.00","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530955495843.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530955495710.jpg","last_update":"1530957313"},{"goods_id":"905","goods_name":"椅子","goods_number":"994","shop_price":"0.01","goods_thumb":"http://47.100.103.123/data/gallery_album/2/thumb_img/1494985265759726303.jpg","goods_img":"http://47.100.103.123/data/gallery_album/2/images/1494985265262573638.jpg","last_update":"1530955689"},{"goods_id":"904","goods_name":"测试产品001","goods_number":"989","shop_price":"0.10","goods_thumb":"http://47.100.103.123/data/gallery_album/2/thumb_img/1494985268545005438.jpg","goods_img":"http://47.100.103.123/data/gallery_album/2/images/1494985268890006696.jpg","last_update":"1508738926"}],"zhuanchang":[{"goods_id":"913","goods_name":"玉器3","cat_id":"3","shop_price":"40000.00","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531016358458.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531016358426.jpg","last_update":"1531016363"},{"goods_id":"912","goods_name":"玉器1","cat_id":"3","shop_price":"1444.00","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531015034851.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531015034582.jpg","last_update":"1531015144"}],"store":[{"ru_id":"81","shop_logo":"","logo_thumb":"http://47.100.103.123/../seller_imgs/seller_logo/logo_thumb/1531031144777138297.jpg","street_thumb":"http://47.100.103.123/data/store_street/street_thumb/1531030573826726960.jpg","brand_thumb":"http://47.100.103.123/data/store_street/brand_thumb/1531031144663448469.jpg","sort_order":"3"}]}
     */

    private String result;
    private String next;
    private DataBean data;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<BannerBean> banner;
        private List<ArticleBean> article;
        private List<WeipaiBean> weipai;
        private List<ZhuanchangBean> zhuanchang;
        private List<StoreBean> store;

        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public List<ArticleBean> getArticle() {
            return article;
        }

        public void setArticle(List<ArticleBean> article) {
            this.article = article;
        }

        public List<WeipaiBean> getWeipai() {
            return weipai;
        }

        public void setWeipai(List<WeipaiBean> weipai) {
            this.weipai = weipai;
        }

        public List<ZhuanchangBean> getZhuanchang() {
            return zhuanchang;
        }

        public void setZhuanchang(List<ZhuanchangBean> zhuanchang) {
            this.zhuanchang = zhuanchang;
        }

        public List<StoreBean> getStore() {
            return store;
        }

        public void setStore(List<StoreBean> store) {
            this.store = store;
        }

        public static class BannerBean {
            /**
             * goods_id : 910
             * goods_name : 古书
             * goods_number : 6
             * shop_price : 3000.00
             * goods_thumb : http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530958971037.jpg
             * goods_img : http://47.100.103.123/images/201807/goods_img/0_G_1530958971708.jpg
             * last_update : 1530958998
             */

            private String goods_id;
            private String goods_name;
            private String goods_number;
            private String shop_price;
            private String goods_thumb;
            private String goods_img;
            private String last_update;

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
        }

        public static class ArticleBean {
            /**
             * article_id : 66
             * title : 乐拍头条重要通知
             * add_time : 1531615549
             * cat_name : 分类名称
             */

            private String article_id;
            private String title;
            private String add_time;
            private String cat_name;

            public String getCat_name() {
                return cat_name;
            }

            public void setCat_name(String cat_name) {
                this.cat_name = cat_name;
            }

            public String getArticle_id() {
                return article_id;
            }

            public void setArticle_id(String article_id) {
                this.article_id = article_id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getAdd_time() {
                return add_time;
            }

            public void setAdd_time(String add_time) {
                this.add_time = add_time;
            }
        }

        public static class WeipaiBean {
            /**
             * goods_id : 911
             * goods_name : 字画5
             * goods_number : 2
             * shop_price : 6000.00
             * goods_thumb : http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530959062805.jpg
             * goods_img : http://47.100.103.123/images/201807/goods_img/0_G_1530959062471.jpg
             * last_update : 1530959084
             */

            private String goods_id;
            private String goods_name;
            private String goods_number;
            private String shop_price;
            private String goods_thumb;
            private String goods_img;
            private String last_update;

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
        }

        public static class ZhuanchangBean {
            /**
             * goods_id : 913
             * goods_name : 玉器3
             * cat_id : 3
             * shop_price : 40000.00
             * goods_thumb : http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531016358458.jpg
             * goods_img : http://47.100.103.123/images/201807/goods_img/0_G_1531016358426.jpg
             * last_update : 1531016363
             */

            private String goods_id;
            private String goods_name;
            private String cat_id;
            private String shop_price;
            private String goods_thumb;
            private String goods_img;
            private String last_update;

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

            public String getCat_id() {
                return cat_id;
            }

            public void setCat_id(String cat_id) {
                this.cat_id = cat_id;
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
        }

        public static class StoreBean {
            /**
             * ru_id : 81
             * shop_logo :
             * logo_thumb : http://47.100.103.123/../seller_imgs/seller_logo/logo_thumb/1531031144777138297.jpg
             * street_thumb : http://47.100.103.123/data/store_street/street_thumb/1531030573826726960.jpg
             * brand_thumb : http://47.100.103.123/data/store_street/brand_thumb/1531031144663448469.jpg
             * sort_order : 3
             */

            private String ru_id;
            private String shop_logo;
            private String logo_thumb;
            private String street_thumb;
            private String brand_thumb;
            private String sort_order;

            public String getRu_id() {
                return ru_id;
            }

            public void setRu_id(String ru_id) {
                this.ru_id = ru_id;
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

            public String getSort_order() {
                return sort_order;
            }

            public void setSort_order(String sort_order) {
                this.sort_order = sort_order;
            }
        }
    }
}
