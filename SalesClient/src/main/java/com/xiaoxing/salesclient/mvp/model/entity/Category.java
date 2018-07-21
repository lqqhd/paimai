package com.xiaoxing.salesclient.mvp.model.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/7 0007 16:43
 */
public class Category implements Serializable {


    /**
     * code : 200
     * msg : 获取成功
     * data : {"first_category":[{"cat_id":"5","cat_name":"古玩古董","parent_id":"0"},{"cat_id":"8","cat_name":"现代艺术","parent_id":"0"}],"second_category":[{"cat_id":"1477","cat_name":"陶瓷陶器","parent_id":"5","goods":[{"goods_id":"924","goods_name":"开店的人的商品","goods_number":"1000","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531635792269.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531635792822.jpg","last_update":"1531636161"}]},{"cat_id":"1477","cat_name":"陶瓷陶器","parent_id":"5","goods":[{"goods_id":"924","goods_name":"开店的人的商品","goods_number":"1000","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531635792269.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531635792822.jpg","last_update":"1531636161"},{"goods_id":"917","goods_name":"陶瓷陶器1测试商品1","goods_number":"1000","keywords":"","goods_brief":"陶瓷陶器1测试商品1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531382589160.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531382589563.jpg","last_update":"1531382686"}]},{"cat_id":"1478","cat_name":"玉器玉雕","parent_id":"5","goods":[{"goods_id":"923","goods_name":"首页祖传玉镯子","goods_number":"4","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/923_thumb_G_1532062567819.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/923_G_1532062567485.jpg","last_update":"1532062624"}]},{"cat_id":"1478","cat_name":"玉器玉雕","parent_id":"5","goods":[{"goods_id":"923","goods_name":"首页祖传玉镯子","goods_number":"4","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/923_thumb_G_1532062567819.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/923_G_1532062567485.jpg","last_update":"1532062624"},{"goods_id":"918","goods_name":"玉器玉雕测试商品1","goods_number":"1000","keywords":"","goods_brief":"玉器玉雕测试商品1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531382865134.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531382865153.jpg","last_update":"1531383147"}]},{"cat_id":"1479","cat_name":"古币纸钱","parent_id":"5","goods":[{"goods_id":"919","goods_name":"古钱币测试1","goods_number":"2","keywords":"","goods_brief":"古钱币测试1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531383528851.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531383528734.jpg","last_update":"1531383550"}]},{"cat_id":"1480","cat_name":"收藏杂项","parent_id":"5","goods":[{"goods_id":"920","goods_name":"收藏杂项测试1","goods_number":"2","keywords":"","goods_brief":" 收藏杂项测试1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531383722150.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531383722754.jpg","last_update":"1531383754"}]},{"cat_id":"1481","cat_name":"铜器铜雕","parent_id":"5","goods":[{"goods_id":"921","goods_name":"铜器铜雕ceshi","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/921_thumb_G_1532062978516.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/921_G_1532062978855.jpg","last_update":"1532062982"}]},{"cat_id":"1482","cat_name":"中国书画","parent_id":"5","goods":[{"goods_id":"922","goods_name":"书画购买测试","goods_number":"2","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/922_thumb_G_1532063003749.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/922_G_1532063003901.jpg","last_update":"1532063011"}]},{"cat_id":"1483","cat_name":"古典家具","parent_id":"5","goods":[{"goods_id":"915","goods_name":"罗汉床","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531041163767.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531041163515.jpg","last_update":"1531197881"}]},{"cat_id":"1483","cat_name":"古典家具","parent_id":"5","goods":[{"goods_id":"915","goods_name":"罗汉床","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531041163767.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531041163515.jpg","last_update":"1531197881"},{"goods_id":"914","goods_name":"榆木床头柜","goods_number":"2","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531041001562.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531041001037.jpg","last_update":"1531041035"}]}]}
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
        private List<FirstCategoryBean> first_category;
        private List<SecondCategoryBean> second_category;

        public List<FirstCategoryBean> getFirst_category() {
            return first_category;
        }

        public void setFirst_category(List<FirstCategoryBean> first_category) {
            this.first_category = first_category;
        }

        public List<SecondCategoryBean> getSecond_category() {
            return second_category;
        }

        public void setSecond_category(List<SecondCategoryBean> second_category) {
            this.second_category = second_category;
        }

        public static class FirstCategoryBean {
            /**
             * cat_id : 5
             * cat_name : 古玩古董
             * parent_id : 0
             */

            private String cat_id;
            private String cat_name;
            private String parent_id;

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

            public String getParent_id() {
                return parent_id;
            }

            public void setParent_id(String parent_id) {
                this.parent_id = parent_id;
            }
        }

        public static class SecondCategoryBean {
            /**
             * cat_id : 1477
             * cat_name : 陶瓷陶器
             * parent_id : 5
             * goods : [{"goods_id":"924","goods_name":"开店的人的商品","goods_number":"1000","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531635792269.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531635792822.jpg","last_update":"1531636161"}]
             */

            private String cat_id;
            private String cat_name;
            private String parent_id;
            private List<GoodsBean> goods;

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

            public String getParent_id() {
                return parent_id;
            }

            public void setParent_id(String parent_id) {
                this.parent_id = parent_id;
            }

            public List<GoodsBean> getGoods() {
                return goods;
            }

            public void setGoods(List<GoodsBean> goods) {
                this.goods = goods;
            }

            public static class GoodsBean {
                /**
                 * goods_id : 924
                 * goods_name : 开店的人的商品
                 * goods_number : 1000
                 * keywords :
                 * goods_brief :
                 * goods_thumb : http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531635792269.jpg
                 * goods_img : http://47.100.103.123/images/201807/goods_img/0_G_1531635792822.jpg
                 * last_update : 1531636161
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
}
