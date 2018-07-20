package com.xiaoxing.salesclient.mvp.model.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/7 0007 16:43
 */
public class SpecialcatDetail implements Serializable {


    /**
     * result : true
     * msg : 获取到产品
     * data : {"goods":[{"goods_id":"916","goods_name":"清朝铜钱","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531297383728.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531297383816.jpg","last_update":"1531297392"}],"good_number":1,"onlookers_num":"72"}
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
         * goods : [{"goods_id":"916","goods_name":"清朝铜钱","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531297383728.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531297383816.jpg","last_update":"1531297392"}]
         * good_number : 1
         * onlookers_num : 72
         */

        private int good_number;
        private String onlookers_num;
        private List<GoodsBean> goods;

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

        public List<GoodsBean> getGoods() {
            return goods;
        }

        public void setGoods(List<GoodsBean> goods) {
            this.goods = goods;
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
             * last_update : 1531297392
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
