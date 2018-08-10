package com.xiaoxing.salesclient.mvp.model.entity;

import java.io.Serializable;
import java.util.List;

public class AuctionDetail implements Serializable{


    /**
     * code : 200
     * msg : 获取数据成功
     * data : {"goods_id":"915","user_id":"0","goods_name":"罗汉床","goods_number":"3","shop_price":"35600.00","goods_thumb":"http://47.100.103.123/images/201808/thumb_img/915_thumb_G_1533578010579.jpg","goods_img":"http://47.100.103.123/images/201808/goods_img/915_G_1533578010290.jpg","last_update":"1533578011","desc_mobile":" <\/div><\/div> 测试文字，123456<\/div><\/div>","onlookers_num":"58","act_promise":"","start_time":"1533576769","end_time":"1535650233","act_id":"56","pictures":[{"img_id":"1026","img_url":"http://47.100.103.123/images/201807/goods_img/0_P_1531041163989.jpg","thumb_url":"http://47.100.103.123/images/201807/thumb_img/0_thumb_P_1531041163749.jpg","img_desc":"9","external_url":""},{"img_id":"1093","img_url":"http://47.100.103.123/images/201808/goods_img/915_P_1533578010814.jpg","thumb_url":"http://47.100.103.123/images/201808/thumb_img/915_thumb_P_1533578010960.jpg","img_desc":"10","external_url":""}],"deposit":6000,"start_price":2000,"end_price":200000,"amplitude":1000,"no_top":0,"is_hot":1,"formated_start_price":"¥<\/em>2000.00","formated_end_price":"¥<\/em>200000.00","formated_deposit":"¥<\/em>6000.00","current_price":2000,"bid_user_count":"0","is_finished":"0","last_bid":null,"grade_name":"平台方","rz_shopName":"乐拍","shopinfo":{"shop_name":"乐拍","check_sellername":"0","shopname_audit":"1","shop_logo":"http://47.100.103.123/data/store_street/brand_thumb/0.jpg","brand_thumb":"http://47.100.103.123/data/store_street/brand_thumb/0.jpg","self_run":null},"other_goods":[{"goods_id":"923","goods_name":"首页祖传玉镯子","goods_number":"4","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/923_thumb_G_1532062567819.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/923_G_1532062567485.jpg","last_update":"1533608188","shop_price":"1.00"},{"goods_id":"922","goods_name":"书画购买测试","goods_number":"2","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/922_thumb_G_1532063003749.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/922_G_1532063003901.jpg","last_update":"1532063011","shop_price":"0.00"},{"goods_id":"921","goods_name":"铜器铜雕ceshi","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/921_thumb_G_1532062978516.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/921_G_1532062978855.jpg","last_update":"1532062982","shop_price":"0.00"},{"goods_id":"920","goods_name":"收藏杂项测试1","goods_number":"2","keywords":"","goods_brief":" 收藏杂项测试1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531383722150.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531383722754.jpg","last_update":"1531383754","shop_price":"0.00"},{"goods_id":"919","goods_name":"古钱币测试1","goods_number":"2","keywords":"","goods_brief":"古钱币测试1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531383528851.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531383528734.jpg","last_update":"1533577490","shop_price":"1999.00"},{"goods_id":"918","goods_name":"玉器玉雕测试商品1","goods_number":"1000","keywords":"","goods_brief":"玉器玉雕测试商品1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531382865134.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531382865153.jpg","last_update":"1531383147","shop_price":"0.00"},{"goods_id":"917","goods_name":"陶瓷陶器1测试商品1","goods_number":"1000","keywords":"","goods_brief":"陶瓷陶器1测试商品1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531382589160.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531382589563.jpg","last_update":"1531382686","shop_price":"0.00"},{"goods_id":"916","goods_name":"清朝铜钱","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531297383728.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531297383816.jpg","last_update":"1533577684","shop_price":"123444.00"},{"goods_id":"915","goods_name":"罗汉床","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201808/thumb_img/915_thumb_G_1533578010579.jpg","goods_img":"http://47.100.103.123/images/201808/goods_img/915_G_1533578010290.jpg","last_update":"1533578011","shop_price":"35600.00"},{"goods_id":"914","goods_name":"榆木床头柜","goods_number":"2","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531041001562.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531041001037.jpg","last_update":"1531041035","shop_price":"45000.00"},{"goods_id":"913","goods_name":"玉器3","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531016358458.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531016358426.jpg","last_update":"1531016363","shop_price":"40000.00"},{"goods_id":"912","goods_name":"玉器1","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531015034851.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531015034582.jpg","last_update":"1531015144","shop_price":"1444.00"},{"goods_id":"911","goods_name":"字画5","goods_number":"2","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530959062805.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530959062471.jpg","last_update":"1530959084","shop_price":"6000.00"},{"goods_id":"910","goods_name":"古书","goods_number":"6","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530958971037.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530958971708.jpg","last_update":"1532971159","shop_price":"3000.00"},{"goods_id":"909","goods_name":"字画1","goods_number":"5","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530958877665.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530958877783.jpg","last_update":"1530958996","shop_price":"0.00"},{"goods_id":"908","goods_name":"太师椅","goods_number":"4","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530958811379.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530958811442.jpg","last_update":"1530959000","shop_price":"3000.00"},{"goods_id":"907","goods_name":"桌子","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530958731867.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530958731596.jpg","last_update":"1530959014","shop_price":"30000.00"},{"goods_id":"906","goods_name":"花瓶-微拍推广","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530955495843.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530955495710.jpg","last_update":"1531383452","shop_price":"2000.00"},{"goods_id":"905","goods_name":"椅子","goods_number":"994","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/data/gallery_album/2/thumb_img/1494985265759726303.jpg","goods_img":"http://47.100.103.123/data/gallery_album/2/images/1494985265262573638.jpg","last_update":"1530955689","shop_price":"0.01"},{"goods_id":"904","goods_name":"测试产品001","goods_number":"989","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/data/gallery_album/2/thumb_img/1494985268545005438.jpg","goods_img":"http://47.100.103.123/data/gallery_album/2/images/1494985268890006696.jpg","last_update":"1508738926","shop_price":"0.10"}]}
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
         * goods_id : 915
         * user_id : 0
         * goods_name : 罗汉床
         * goods_number : 3
         * shop_price : 35600.00
         * goods_thumb : http://47.100.103.123/images/201808/thumb_img/915_thumb_G_1533578010579.jpg
         * goods_img : http://47.100.103.123/images/201808/goods_img/915_G_1533578010290.jpg
         * last_update : 1533578011
         * desc_mobile :  </div></div> 测试文字，123456</div></div>
         * onlookers_num : 58
         * act_promise :
         * start_time : 1533576769
         * end_time : 1535650233
         * act_id : 56
         * pictures : [{"img_id":"1026","img_url":"http://47.100.103.123/images/201807/goods_img/0_P_1531041163989.jpg","thumb_url":"http://47.100.103.123/images/201807/thumb_img/0_thumb_P_1531041163749.jpg","img_desc":"9","external_url":""},{"img_id":"1093","img_url":"http://47.100.103.123/images/201808/goods_img/915_P_1533578010814.jpg","thumb_url":"http://47.100.103.123/images/201808/thumb_img/915_thumb_P_1533578010960.jpg","img_desc":"10","external_url":""}]
         * deposit : 6000
         * start_price : 2000
         * end_price : 200000
         * amplitude : 1000
         * no_top : 0
         * is_hot : 1
         * formated_start_price : ¥</em>2000.00
         * formated_end_price : ¥</em>200000.00
         * formated_deposit : ¥</em>6000.00
         * current_price : 2000
         * bid_user_count : 0
         * is_finished : 0
         * last_bid : null
         * grade_name : 平台方
         * rz_shopName : 乐拍
         * shopinfo : {"shop_name":"乐拍","check_sellername":"0","shopname_audit":"1","shop_logo":"http://47.100.103.123/data/store_street/brand_thumb/0.jpg","brand_thumb":"http://47.100.103.123/data/store_street/brand_thumb/0.jpg","self_run":null}
         * other_goods : [{"goods_id":"923","goods_name":"首页祖传玉镯子","goods_number":"4","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/923_thumb_G_1532062567819.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/923_G_1532062567485.jpg","last_update":"1533608188","shop_price":"1.00"},{"goods_id":"922","goods_name":"书画购买测试","goods_number":"2","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/922_thumb_G_1532063003749.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/922_G_1532063003901.jpg","last_update":"1532063011","shop_price":"0.00"},{"goods_id":"921","goods_name":"铜器铜雕ceshi","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/921_thumb_G_1532062978516.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/921_G_1532062978855.jpg","last_update":"1532062982","shop_price":"0.00"},{"goods_id":"920","goods_name":"收藏杂项测试1","goods_number":"2","keywords":"","goods_brief":" 收藏杂项测试1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531383722150.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531383722754.jpg","last_update":"1531383754","shop_price":"0.00"},{"goods_id":"919","goods_name":"古钱币测试1","goods_number":"2","keywords":"","goods_brief":"古钱币测试1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531383528851.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531383528734.jpg","last_update":"1533577490","shop_price":"1999.00"},{"goods_id":"918","goods_name":"玉器玉雕测试商品1","goods_number":"1000","keywords":"","goods_brief":"玉器玉雕测试商品1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531382865134.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531382865153.jpg","last_update":"1531383147","shop_price":"0.00"},{"goods_id":"917","goods_name":"陶瓷陶器1测试商品1","goods_number":"1000","keywords":"","goods_brief":"陶瓷陶器1测试商品1","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531382589160.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531382589563.jpg","last_update":"1531382686","shop_price":"0.00"},{"goods_id":"916","goods_name":"清朝铜钱","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531297383728.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531297383816.jpg","last_update":"1533577684","shop_price":"123444.00"},{"goods_id":"915","goods_name":"罗汉床","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201808/thumb_img/915_thumb_G_1533578010579.jpg","goods_img":"http://47.100.103.123/images/201808/goods_img/915_G_1533578010290.jpg","last_update":"1533578011","shop_price":"35600.00"},{"goods_id":"914","goods_name":"榆木床头柜","goods_number":"2","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531041001562.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531041001037.jpg","last_update":"1531041035","shop_price":"45000.00"},{"goods_id":"913","goods_name":"玉器3","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531016358458.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531016358426.jpg","last_update":"1531016363","shop_price":"40000.00"},{"goods_id":"912","goods_name":"玉器1","goods_number":"1","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531015034851.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531015034582.jpg","last_update":"1531015144","shop_price":"1444.00"},{"goods_id":"911","goods_name":"字画5","goods_number":"2","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530959062805.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530959062471.jpg","last_update":"1530959084","shop_price":"6000.00"},{"goods_id":"910","goods_name":"古书","goods_number":"6","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530958971037.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530958971708.jpg","last_update":"1532971159","shop_price":"3000.00"},{"goods_id":"909","goods_name":"字画1","goods_number":"5","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530958877665.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530958877783.jpg","last_update":"1530958996","shop_price":"0.00"},{"goods_id":"908","goods_name":"太师椅","goods_number":"4","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530958811379.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530958811442.jpg","last_update":"1530959000","shop_price":"3000.00"},{"goods_id":"907","goods_name":"桌子","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530958731867.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530958731596.jpg","last_update":"1530959014","shop_price":"30000.00"},{"goods_id":"906","goods_name":"花瓶-微拍推广","goods_number":"3","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1530955495843.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1530955495710.jpg","last_update":"1531383452","shop_price":"2000.00"},{"goods_id":"905","goods_name":"椅子","goods_number":"994","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/data/gallery_album/2/thumb_img/1494985265759726303.jpg","goods_img":"http://47.100.103.123/data/gallery_album/2/images/1494985265262573638.jpg","last_update":"1530955689","shop_price":"0.01"},{"goods_id":"904","goods_name":"测试产品001","goods_number":"989","keywords":"","goods_brief":"","goods_thumb":"http://47.100.103.123/data/gallery_album/2/thumb_img/1494985268545005438.jpg","goods_img":"http://47.100.103.123/data/gallery_album/2/images/1494985268890006696.jpg","last_update":"1508738926","shop_price":"0.10"}]
         */

        private String goods_id;
        private String user_id;
        private String goods_name;
        private String goods_number;
        private String shop_price;
        private String goods_thumb;
        private String goods_img;
        private String last_update;
        private String desc_mobile;
        private String onlookers_num;
        private String act_promise;
        private String start_time;
        private String end_time;
        private String act_id;
        private int deposit;
        private int start_price;
        private int end_price;
        private int amplitude;
        private int no_top;
        private int is_hot;
        private String formated_start_price;
        private String formated_end_price;
        private String formated_deposit;
        private int current_price;
        private String bid_user_count;
        private String is_finished;
        private Object last_bid;
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

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
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

        public String getAct_promise() {
            return act_promise;
        }

        public void setAct_promise(String act_promise) {
            this.act_promise = act_promise;
        }

        public String getStart_time() {
            return start_time;
        }

        public void setStart_time(String start_time) {
            this.start_time = start_time;
        }

        public String getEnd_time() {
            return end_time;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
        }

        public String getAct_id() {
            return act_id;
        }

        public void setAct_id(String act_id) {
            this.act_id = act_id;
        }

        public int getDeposit() {
            return deposit;
        }

        public void setDeposit(int deposit) {
            this.deposit = deposit;
        }

        public int getStart_price() {
            return start_price;
        }

        public void setStart_price(int start_price) {
            this.start_price = start_price;
        }

        public int getEnd_price() {
            return end_price;
        }

        public void setEnd_price(int end_price) {
            this.end_price = end_price;
        }

        public int getAmplitude() {
            return amplitude;
        }

        public void setAmplitude(int amplitude) {
            this.amplitude = amplitude;
        }

        public int getNo_top() {
            return no_top;
        }

        public void setNo_top(int no_top) {
            this.no_top = no_top;
        }

        public int getIs_hot() {
            return is_hot;
        }

        public void setIs_hot(int is_hot) {
            this.is_hot = is_hot;
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

        public int getCurrent_price() {
            return current_price;
        }

        public void setCurrent_price(int current_price) {
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

        public Object getLast_bid() {
            return last_bid;
        }

        public void setLast_bid(Object last_bid) {
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

        public static class ShopinfoBean {
            /**
             * shop_name : 乐拍
             * check_sellername : 0
             * shopname_audit : 1
             * shop_logo : http://47.100.103.123/data/store_street/brand_thumb/0.jpg
             * brand_thumb : http://47.100.103.123/data/store_street/brand_thumb/0.jpg
             * self_run : null
             */

            private String shop_name;
            private String check_sellername;
            private String shopname_audit;
            private String shop_logo;
            private String brand_thumb;
            private Object self_run;

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

            public Object getSelf_run() {
                return self_run;
            }

            public void setSelf_run(Object self_run) {
                this.self_run = self_run;
            }
        }

        public static class PicturesBean {
            /**
             * img_id : 1026
             * img_url : http://47.100.103.123/images/201807/goods_img/0_P_1531041163989.jpg
             * thumb_url : http://47.100.103.123/images/201807/thumb_img/0_thumb_P_1531041163749.jpg
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

        public static class OtherGoodsBean {
            /**
             * goods_id : 923
             * goods_name : 首页祖传玉镯子
             * goods_number : 4
             * keywords :
             * goods_brief :
             * goods_thumb : http://47.100.103.123/images/201807/thumb_img/923_thumb_G_1532062567819.jpg
             * goods_img : http://47.100.103.123/images/201807/goods_img/923_G_1532062567485.jpg
             * last_update : 1533608188
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
