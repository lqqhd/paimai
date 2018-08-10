package com.xiaoxing.salesclient.mvp.model.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/7 0007 16:43
 */
public class SpecialcatList implements Serializable {


    /**
     * code : 200
     * msg : 获取到产品
     * data : {"goods":[{"goods_id":"916","goods_name":"清朝铜钱","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531297383728.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531297383816.jpg","last_update":"1533577684"}],"cat_name":"古钱币","cat_desc":"古钱币指古代货币。货币是商品交换的产物。中国是世界上最早使用铸币的国家。距今3000年前殷商晚期墓葬出土了不少\u201c无文铜贝\u201d，为最原始的金属货币。至西周晚期除贝币外还流通一些无一定形状的散铜块、铜锭等金属称量货币，这在考古发掘中...","good_number":1,"onlookers_num":"135","shop_info":{"grade_name":"平台方","rz_shopName":"乐拍","baozhengjin":"平台方","shopinfo":{"shop_logo":"http://47.100.103.123/data/store_street/brand_thumb/0.jpg","street_thumb":"http://47.100.103.123/data/store_street/brand_thumb/0.jpg"}}}
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
         * goods : [{"goods_id":"916","goods_name":"清朝铜钱","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531297383728.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531297383816.jpg","last_update":"1533577684"}]
         * cat_name : 古钱币
         * cat_desc : 古钱币指古代货币。货币是商品交换的产物。中国是世界上最早使用铸币的国家。距今3000年前殷商晚期墓葬出土了不少“无文铜贝”，为最原始的金属货币。至西周晚期除贝币外还流通一些无一定形状的散铜块、铜锭等金属称量货币，这在考古发掘中...
         * good_number : 1
         * onlookers_num : 135
         * shop_info : {"grade_name":"平台方","rz_shopName":"乐拍","baozhengjin":"平台方","shopinfo":{"shop_logo":"http://47.100.103.123/data/store_street/brand_thumb/0.jpg","street_thumb":"http://47.100.103.123/data/store_street/brand_thumb/0.jpg"}}
         */

        private String cat_name;
        private String cat_desc;
        private int good_number;
        private String onlookers_num;
        private ShopInfoBean shop_info;
        private List<GoodsBean> goods;

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

        public int getGood_number() {
            return good_number;
        }

        public void setGood_number(int good_number) {
            this.good_number = good_number;
        }

        public String getOnlookers_num() {
            return onlookers_num;
        }

        public void setOnlookers_num(String onlookers_num) {
            this.onlookers_num = onlookers_num;
        }

        public ShopInfoBean getShop_info() {
            return shop_info;
        }

        public void setShop_info(ShopInfoBean shop_info) {
            this.shop_info = shop_info;
        }

        public List<GoodsBean> getGoods() {
            return goods;
        }

        public void setGoods(List<GoodsBean> goods) {
            this.goods = goods;
        }

        public static class ShopInfoBean {
            /**
             * grade_name : 平台方
             * rz_shopName : 乐拍
             * baozhengjin : 平台方
             * shopinfo : {"shop_logo":"http://47.100.103.123/data/store_street/brand_thumb/0.jpg","street_thumb":"http://47.100.103.123/data/store_street/brand_thumb/0.jpg"}
             */

            private String grade_name;
            private String rz_shopName;
            private String baozhengjin;
            private ShopinfoBean shopinfo;

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

            public String getBaozhengjin() {
                return baozhengjin;
            }

            public void setBaozhengjin(String baozhengjin) {
                this.baozhengjin = baozhengjin;
            }

            public ShopinfoBean getShopinfo() {
                return shopinfo;
            }

            public void setShopinfo(ShopinfoBean shopinfo) {
                this.shopinfo = shopinfo;
            }

            public static class ShopinfoBean {
                /**
                 * shop_logo : http://47.100.103.123/data/store_street/brand_thumb/0.jpg
                 * street_thumb : http://47.100.103.123/data/store_street/brand_thumb/0.jpg
                 */

                private String shop_logo;
                private String street_thumb;

                public String getShop_logo() {
                    return shop_logo;
                }

                public void setShop_logo(String shop_logo) {
                    this.shop_logo = shop_logo;
                }

                public String getStreet_thumb() {
                    return street_thumb;
                }

                public void setStreet_thumb(String street_thumb) {
                    this.street_thumb = street_thumb;
                }
            }
        }

        public static class GoodsBean {
            /**
             * goods_id : 916
             * goods_name : 清朝铜钱
             * goods_number : 3
             * keywords :
             * goods_brief :
             * goods_thumb : http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531297383728.jpg
             * goods_img : http://47.100.103.123/images/201807/goods_img/0_G_1531297383816.jpg
             * last_update : 1533577684
             */

            private String goods_id;
            private String goods_name;
            private String goods_number;
            private String keywords;
            private String goods_brief;
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
        }
    }
}
