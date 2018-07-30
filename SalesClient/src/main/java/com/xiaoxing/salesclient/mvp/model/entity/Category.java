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
     * data : {"first_category":[{"cat_id":"5","cat_name":"古玩古董","parent_id":"0","second_category":[{"cat_id":"1477","cat_name":"陶瓷陶器","parent_id":"5","goods":[{"goods_id":"924","goods_name":"开店的人的商品","goods_number":"1000","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531635792269.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531635792822.jpg","last_update":"1532455502"},{"goods_id":"917","goods_name":"陶瓷陶器1测试商品1","goods_number":"1000","keywords":"","goods_brief":"陶瓷陶器1测试商品1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531382589160.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531382589563.jpg","last_update":"1531382686"}]},{"cat_id":"1478","cat_name":"玉器玉雕","parent_id":"5","goods":[{"goods_id":"923","goods_name":"首页祖传玉镯子","goods_number":"4","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/923_thumb_G_1532062567819.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/923_G_1532062567485.jpg","last_update":"1532062624"},{"goods_id":"918","goods_name":"玉器玉雕测试商品1","goods_number":"1000","keywords":"","goods_brief":"玉器玉雕测试商品1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531382865134.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531382865153.jpg","last_update":"1531383147"}]},{"cat_id":"1479","cat_name":"古币纸钱","parent_id":"5","goods":[{"goods_id":"919","goods_name":"古钱币测试1","goods_number":"2","keywords":"","goods_brief":"古钱币测试1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531383528851.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531383528734.jpg","last_update":"1531383550"}]},{"cat_id":"1480","cat_name":"收藏杂项","parent_id":"5","goods":[{"goods_id":"920","goods_name":"收藏杂项测试1","goods_number":"2","keywords":"","goods_brief":" 收藏杂项测试1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531383722150.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531383722754.jpg","last_update":"1531383754"}]},{"cat_id":"1481","cat_name":"铜器铜雕","parent_id":"5","goods":[{"goods_id":"921","goods_name":"铜器铜雕ceshi","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/921_thumb_G_1532062978516.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/921_G_1532062978855.jpg","last_update":"1532062982"}]},{"cat_id":"1482","cat_name":"中国书画","parent_id":"5","goods":[{"goods_id":"922","goods_name":"书画购买测试","goods_number":"2","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/922_thumb_G_1532063003749.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/922_G_1532063003901.jpg","last_update":"1532063011"}]},{"cat_id":"1483","cat_name":"古典家具","parent_id":"5","goods":[{"goods_id":"915","goods_name":"罗汉床","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531041163767.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531041163515.jpg","last_update":"1531197881"},{"goods_id":"914","goods_name":"榆木床头柜","goods_number":"2","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531041001562.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531041001037.jpg","last_update":"1531041035"}]}]},{"cat_id":"8","cat_name":"现代艺术","parent_id":"0"},{"cat_id":"1495","cat_name":"锁类","parent_id":"0"},{"cat_id":"1496","cat_name":"紫砂壶类","parent_id":"0"},{"cat_id":"1498","cat_name":"展馆","parent_id":"0","second_category":[{"cat_id":"1494","cat_name":"竹木牙雕类","parent_id":"1498","goods":[{"goods_id":"948","goods_name":"清末楠木苏工起线圆座","goods_number":"1000","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532480586002.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532480586132.jpg","last_update":"1532480621"},{"goods_id":"947","goods_name":"清代柏木钱纹满工暗八仙木雕","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532480456869.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532480456691.jpg","last_update":"1532480513"},{"goods_id":"946","goods_name":"建国后红木老料象骨镶牙母子象摆件","goods_number":"1000","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532480331275.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532480331316.jpg","last_update":"1532480383"},{"goods_id":"945","goods_name":"民国老料鸡翅木圆雕猛虎摆件","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532480259428.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532480259185.jpg","last_update":"1532480293"},{"goods_id":"944","goods_name":"清代起线紫檀木座","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532480164584.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532480164124.jpg","last_update":"1532480228"},{"goods_id":"943","goods_name":"清代黄花梨浅刻海棠形炉座","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532480022427.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532480022908.jpg","last_update":"1532480104"},{"goods_id":"942","goods_name":"小叶紫檀圆雕瑞兽摆件","goods_number":"1000","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532479789785.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532479789106.jpg","last_update":"1532479915"},{"goods_id":"941","goods_name":"清末民国黄杨木透雕圆雕荷叶莲蓬动子挂件","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532479604848.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532479604350.jpg","last_update":"1532479657"},{"goods_id":"940","goods_name":"清末民国红木八卦挂件","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532479479183.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532479479499.jpg","last_update":"1532479537"},{"goods_id":"939","goods_name":"清末民国多边中国结寿字纹浅刻满工影子木挂件","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532479336841.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532479336592.jpg","last_update":"1532479391"},{"goods_id":"938","goods_name":"清代如意纹步步高楠木挂件","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532479226921.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532479226377.jpg","last_update":"1532479303"},{"goods_id":"937","goods_name":"清代黄花梨双面浅刻满工蟹纹挂件","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532479020262.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532479020892.jpg","last_update":"1532479050"},{"goods_id":"936","goods_name":"清代满工浅刻鱼纹木鱼","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532478927155.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532478927664.jpg","last_update":"1532478977"},{"goods_id":"934","goods_name":"清代楠木圆雕卧牛摆件","goods_number":"1000","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532478656120.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532478656309.jpg","last_update":"1532478747"},{"goods_id":"932","goods_name":"清末民国小叶黄杨水盂座","goods_number":"1000","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532478429920.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532478429453.jpg","last_update":"1532478615"},{"goods_id":"931","goods_name":"清末民国犀角制水盂","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532478293310.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532478293314.jpg","last_update":"1532478385"},{"goods_id":"930","goods_name":"清代高浮雕挺拔送松干文房竹根笔洗","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532478086809.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532478086537.jpg","last_update":"1532478251"},{"goods_id":"929","goods_name":"建国后椰子罐","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532478085981.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532478085983.jpg","last_update":"1532478175"},{"goods_id":"928","goods_name":"清代竹制浅刻一路连升文房用具","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532477873810.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532477873585.jpg","last_update":"1532478020"},{"goods_id":"927","goods_name":"清末民国随形铁树种手球","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532477735047.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532477735146.jpg","last_update":"1532477804"},{"goods_id":"926","goods_name":"清代镂空透雕松枝水盂","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1532477088645.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1532477088987.jpg","last_update":"1532477525"}]}]},{"cat_id":"1500","cat_name":"葫芦折扇","parent_id":"0"}]}
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

        public List<FirstCategoryBean> getFirst_category() {
            return first_category;
        }

        public void setFirst_category(List<FirstCategoryBean> first_category) {
            this.first_category = first_category;
        }

        public static class FirstCategoryBean {
            /**
             * cat_id : 5
             * cat_name : 古玩古董
             * parent_id : 0
             * second_category : [{"cat_id":"1477","cat_name":"陶瓷陶器","parent_id":"5","goods":[{"goods_id":"924","goods_name":"开店的人的商品","goods_number":"1000","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531635792269.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531635792822.jpg","last_update":"1532455502"},{"goods_id":"917","goods_name":"陶瓷陶器1测试商品1","goods_number":"1000","keywords":"","goods_brief":"陶瓷陶器1测试商品1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531382589160.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531382589563.jpg","last_update":"1531382686"}]},{"cat_id":"1478","cat_name":"玉器玉雕","parent_id":"5","goods":[{"goods_id":"923","goods_name":"首页祖传玉镯子","goods_number":"4","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/923_thumb_G_1532062567819.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/923_G_1532062567485.jpg","last_update":"1532062624"},{"goods_id":"918","goods_name":"玉器玉雕测试商品1","goods_number":"1000","keywords":"","goods_brief":"玉器玉雕测试商品1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531382865134.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531382865153.jpg","last_update":"1531383147"}]},{"cat_id":"1479","cat_name":"古币纸钱","parent_id":"5","goods":[{"goods_id":"919","goods_name":"古钱币测试1","goods_number":"2","keywords":"","goods_brief":"古钱币测试1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531383528851.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531383528734.jpg","last_update":"1531383550"}]},{"cat_id":"1480","cat_name":"收藏杂项","parent_id":"5","goods":[{"goods_id":"920","goods_name":"收藏杂项测试1","goods_number":"2","keywords":"","goods_brief":" 收藏杂项测试1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531383722150.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531383722754.jpg","last_update":"1531383754"}]},{"cat_id":"1481","cat_name":"铜器铜雕","parent_id":"5","goods":[{"goods_id":"921","goods_name":"铜器铜雕ceshi","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/921_thumb_G_1532062978516.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/921_G_1532062978855.jpg","last_update":"1532062982"}]},{"cat_id":"1482","cat_name":"中国书画","parent_id":"5","goods":[{"goods_id":"922","goods_name":"书画购买测试","goods_number":"2","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/922_thumb_G_1532063003749.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/922_G_1532063003901.jpg","last_update":"1532063011"}]},{"cat_id":"1483","cat_name":"古典家具","parent_id":"5","goods":[{"goods_id":"915","goods_name":"罗汉床","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531041163767.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531041163515.jpg","last_update":"1531197881"},{"goods_id":"914","goods_name":"榆木床头柜","goods_number":"2","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531041001562.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531041001037.jpg","last_update":"1531041035"}]}]
             */

            private String cat_id;
            private String cat_name;
            private String parent_id;
            private List<SecondCategoryBean> second_category;

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

            public List<SecondCategoryBean> getSecond_category() {
                return second_category;
            }

            public void setSecond_category(List<SecondCategoryBean> second_category) {
                this.second_category = second_category;
            }

            public static class SecondCategoryBean {
                /**
                 * cat_id : 1477
                 * cat_name : 陶瓷陶器
                 * parent_id : 5
                 * goods : [{"goods_id":"924","goods_name":"开店的人的商品","goods_number":"1000","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531635792269.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531635792822.jpg","last_update":"1532455502"},{"goods_id":"917","goods_name":"陶瓷陶器1测试商品1","goods_number":"1000","keywords":"","goods_brief":"陶瓷陶器1测试商品1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531382589160.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531382589563.jpg","last_update":"1531382686"}]
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
                     * last_update : 1532455502
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
}
