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
     * data : {"banner":[{"goods_id":"923","goods_name":"首页祖传玉镯子","goods_number":"4","shop_price":"1.00","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531627382532.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531627382990.jpg","last_update":"1531629547"},{"goods_id":"910","goods_name":"古书","goods_number":"6","shop_price":"3000.00","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530958971037.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530958971708.jpg","last_update":"1530958998"},{"goods_id":"909","goods_name":"字画1","goods_number":"5","shop_price":"0.00","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530958877665.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530958877783.jpg","last_update":"1530958996"}],"article":[{"article_id":"66","title":"乐拍头条重要通知","add_time":"1531615549","cat_name":"公告"},{"article_id":"65","title":"7月8日晚专场","add_time":"1531615549","cat_name":"促销"},{"article_id":"64","title":"卖家入住流程","add_time":"1531615549","cat_name":"商家入驻流程说明"},{"article_id":"62","title":"玉器的鉴别方法","add_time":"1490724253","cat_name":"站内快讯"},{"article_id":"61","title":"古董鉴别方法","add_time":"1490724217","cat_name":"站内快讯"}],"weipai":[{"act_id":"54","act_name":"首页祖传玉镯子","current_price":4000,"current_count":"0","end_time":"1533009893","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531627382532.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531627382990.jpg"},{"act_id":"52","act_name":"立即购买测试","current_price":2,"current_count":"1","end_time":"1532336154","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531472081070.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531472081978.jpg"},{"act_id":"53","act_name":"书画购买测试","current_price":3,"current_count":"1","end_time":"1533014129","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531545296023.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531545296656.jpg"}],"zhuanchang":[{"cat_id":"1489","cat_name":"古钱币","cat_desc":"古钱币指古代货币。货币是商品交换的产物。中国是世界上最早使用铸币的国家。距今3000年前殷商晚期墓葬出土了不少\u201c无文铜贝\u201d，为最原始的金属货币。至西周晚期除贝币外还流通一些无一定形状的散铜块、铜锭等金属称量货币，这在考古发掘中...","touch_icon":"http://47.100.103.123/data/touch_icon/15313232766835.jpg","onlookers_num":"72"},{"cat_id":"1490","cat_name":"陶器","cat_desc":"关于本次陶器专场的描述","touch_icon":"http://47.100.103.123/data/touch_icon/15313234944920.jpg","onlookers_num":"2"},{"cat_id":"1491","cat_name":"玉镯","cat_desc":"很美的玉镯子","touch_icon":"http://47.100.103.123/data/touch_icon/15313235292709.jpg","onlookers_num":"0"},{"cat_id":"1492","cat_name":"古青铜器","cat_desc":"今晚七点开始本次专场","touch_icon":"http://47.100.103.123/data/touch_icon/15313235594957.jpg","onlookers_num":"0"}],"store":[{"ru_id":"83","shop_logo":"http://47.100.103.123/../seller_imgs/seller_logo/seller_logo83.jpg","logo_thumb":"http://47.100.103.123/../seller_imgs/seller_logo/logo_thumb/1531635913572779847.jpg","street_thumb":"http://47.100.103.123/data/store_street/street_thumb/1531635913164681547.jpg","brand_thumb":"http://47.100.103.123/data/store_street/brand_thumb/1531635913595710558.jpg","sort_order":"100"},{"ru_id":"81","shop_logo":"","logo_thumb":"http://47.100.103.123/../seller_imgs/seller_logo/logo_thumb/1531031144777138297.jpg","street_thumb":"http://47.100.103.123/data/store_street/street_thumb/1531030573826726960.jpg","brand_thumb":"http://47.100.103.123/data/store_street/brand_thumb/1531031144663448469.jpg","sort_order":"3"}]}
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
             * goods_id : 923
             * goods_name : 首页祖传玉镯子
             * goods_number : 4
             * shop_price : 1.00
             * goods_thumb : http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531627382532.jpg
             * goods_img : http://47.100.103.123/images/201807/goods_img/0_G_1531627382990.jpg
             * last_update : 1531629547
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
             * cat_name : 公告
             */

            private String article_id;
            private String title;
            private String add_time;
            private String cat_name;

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

            public String getCat_name() {
                return cat_name;
            }

            public void setCat_name(String cat_name) {
                this.cat_name = cat_name;
            }
        }

        public static class WeipaiBean {
            /**
             * act_id : 54
             * act_name : 首页祖传玉镯子
             * current_price : 4000
             * current_count : 0
             * end_time : 1533009893
             * goods_thumb : http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531627382532.jpg
             * goods_img : http://47.100.103.123/images/201807/goods_img/0_G_1531627382990.jpg
             */

            private String act_id;
            private String act_name;
            private int current_price;
            private String current_count;
            private String end_time;
            private String goods_thumb;
            private String goods_img;

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

            public String getGoods_img() {
                return goods_img;
            }

            public void setGoods_img(String goods_img) {
                this.goods_img = goods_img;
            }
        }

        public static class ZhuanchangBean {
            /**
             * cat_id : 1489
             * cat_name : 古钱币
             * cat_desc : 古钱币指古代货币。货币是商品交换的产物。中国是世界上最早使用铸币的国家。距今3000年前殷商晚期墓葬出土了不少“无文铜贝”，为最原始的金属货币。至西周晚期除贝币外还流通一些无一定形状的散铜块、铜锭等金属称量货币，这在考古发掘中...
             * touch_icon : http://47.100.103.123/data/touch_icon/15313232766835.jpg
             * onlookers_num : 72
             */

            private String cat_id;
            private String cat_name;
            private String cat_desc;
            private String touch_icon;
            private String onlookers_num;
            private String goods_img;
            private String end_time;

            public String getGoods_img() {
                return goods_img;
            }

            public void setGoods_img(String goods_img) {
                this.goods_img = goods_img;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getCat_id() {
                return cat_id;
            }

            public void setCat_id(String cat_id) {
                this.cat_id = cat_id;
            }

            public String getCat_name() {
                return cat_name;
            }

            public void setCat_name(String cat_name) {
                this.cat_name = cat_name;
            }

            public String getCat_desc() {
                return cat_desc;
            }

            public void setCat_desc(String cat_desc) {
                this.cat_desc = cat_desc;
            }

            public String getTouch_icon() {
                return touch_icon;
            }

            public void setTouch_icon(String touch_icon) {
                this.touch_icon = touch_icon;
            }

            public String getOnlookers_num() {
                return onlookers_num;
            }

            public void setOnlookers_num(String onlookers_num) {
                this.onlookers_num = onlookers_num;
            }
        }

        public static class StoreBean {
            /**
             * ru_id : 83
             * shop_logo : http://47.100.103.123/../seller_imgs/seller_logo/seller_logo83.jpg
             * logo_thumb : http://47.100.103.123/../seller_imgs/seller_logo/logo_thumb/1531635913572779847.jpg
             * street_thumb : http://47.100.103.123/data/store_street/street_thumb/1531635913164681547.jpg
             * brand_thumb : http://47.100.103.123/data/store_street/brand_thumb/1531635913595710558.jpg
             * sort_order : 100
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
