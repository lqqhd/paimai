package com.xiaoxing.salesclient.mvp.model.entity;

import java.util.List;

public class GoodsReportSubmit {


    /**
     * result : true
     * msg : 获取数据成功
     * data : [{"goods_id":"920","goods_name":"收藏杂项测试1","goods_number":"2","shop_price":"0.00","goods_thumb":"http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531383722150.jpg","goods_img":"http://47.100.103.123/images/201807/goods_img/0_G_1531383722754.jpg","last_update":"1531383754","desc_mobile":"PGRpdiBjbGFzcz0ic2VjdGlvbiBzLWltZyI+PGRpdiBjbGFzcz0iaW1nIj48aW1nIHNyYz0iaHR0cDovL3MuanVmZW5nc2MuY29tL2RhdGEvZ2FsbGVyeV9hbGJ1bS8yL29yaWdpbmFsX2ltZy8xNTMxMzgzNzQwMjg4MjI4MzU0LmpwZyI+PC9kaXY+PGRpdiBjbGFzcz0idG9vbHMiPjxhIGhyZWY9ImphdmFzY3JpcHQ6dm9pZCgwKTsiIGNsYXNzPSJtb3ZlLXVwIGljb24tYXJyb3ctdXAgZGlzYWJsZWQiPjwvYT48YSBocmVmPSJqYXZhc2NyaXB0OnZvaWQoMCk7IiBjbGFzcz0ibW92ZS1kb3duIGljb24tYXJyb3ctZG93biBkaXNhYmxlZCI+PC9hPjxhIGhyZWY9ImphdmFzY3JpcHQ6dm9pZCgwKTsiIGNsYXNzPSJtb3ZlLXJlbW92ZSI+PGkgY2xhc3M9Imljb24gaWNvbi1yZW1vdmUiPjwvaT7liKDpmaQ8L2E+PGRpdiBjbGFzcz0iY292ZXIiPjwvZGl2PjwvZGl2PjwvZGl2PjxkaXYgY2xhc3M9InNlY3Rpb24gcy10eHQiPjxkaXYgY2xhc3M9InR4dCI+IOaUtuiXj+adgumhuea1i+ivlTE8L2Rpdj48ZGl2IGNsYXNzPSJ0b29scyI+PGEgaHJlZj0iamF2YXNjcmlwdDp2b2lkKDApOyIgY2xhc3M9Im1vdmUtdXAgaWNvbi1hcnJvdy11cCI+PC9hPjxhIGhyZWY9ImphdmFzY3JpcHQ6dm9pZCgwKTsiIGNsYXNzPSJtb3ZlLWRvd24gaWNvbi1hcnJvdy1kb3duIGRpc2FibGVkIj48L2E+PGEgaHJlZj0iamF2YXNjcmlwdDp2b2lkKDApOyIgY2xhc3M9Im1vdmUtZWRpdCIgZWN0eXBlPSJtb3ZlX2VkaXRfdG91Y2giPjxpIGNsYXNzPSJpY29uIGljb24tZWRpdCI+PC9pPue8lui+kTwvYT48YSBocmVmPSJqYXZhc2NyaXB0OnZvaWQoMCk7IiBjbGFzcz0ibW92ZS1yZW1vdmUiPjxpIGNsYXNzPSJpY29uIGljb24tcmVtb3ZlIj48L2k+5Yig6ZmkPC9hPjxkaXYgY2xhc3M9ImNvdmVyIj48L2Rpdj48L2Rpdj48L2Rpdj4=","onlookers_num":"2","act_promise":"","start_time":"1531383774","end_time":"1532593359","act_id":"51","deposit":20000,"start_price":3000,"end_price":20000,"amplitude":3000,"no_top":0,"is_hot":0,"formated_start_price":"¥<\/em>3000.00","formated_end_price":"¥<\/em>20000.00","formated_deposit":"¥<\/em>20000.00","current_price":3000,"bid_user_count":"0","is_finished":"0","last_bid":null}]
     */

    private String result;
    private String msg;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * goods_id : 920
         * goods_name : 收藏杂项测试1
         * goods_number : 2
         * shop_price : 0.00
         * goods_thumb : http://47.100.103.123/images/201807/thumb_img/0_thumb_G_1531383722150.jpg
         * goods_img : http://47.100.103.123/images/201807/goods_img/0_G_1531383722754.jpg
         * last_update : 1531383754
         * desc_mobile : PGRpdiBjbGFzcz0ic2VjdGlvbiBzLWltZyI+PGRpdiBjbGFzcz0iaW1nIj48aW1nIHNyYz0iaHR0cDovL3MuanVmZW5nc2MuY29tL2RhdGEvZ2FsbGVyeV9hbGJ1bS8yL29yaWdpbmFsX2ltZy8xNTMxMzgzNzQwMjg4MjI4MzU0LmpwZyI+PC9kaXY+PGRpdiBjbGFzcz0idG9vbHMiPjxhIGhyZWY9ImphdmFzY3JpcHQ6dm9pZCgwKTsiIGNsYXNzPSJtb3ZlLXVwIGljb24tYXJyb3ctdXAgZGlzYWJsZWQiPjwvYT48YSBocmVmPSJqYXZhc2NyaXB0OnZvaWQoMCk7IiBjbGFzcz0ibW92ZS1kb3duIGljb24tYXJyb3ctZG93biBkaXNhYmxlZCI+PC9hPjxhIGhyZWY9ImphdmFzY3JpcHQ6dm9pZCgwKTsiIGNsYXNzPSJtb3ZlLXJlbW92ZSI+PGkgY2xhc3M9Imljb24gaWNvbi1yZW1vdmUiPjwvaT7liKDpmaQ8L2E+PGRpdiBjbGFzcz0iY292ZXIiPjwvZGl2PjwvZGl2PjwvZGl2PjxkaXYgY2xhc3M9InNlY3Rpb24gcy10eHQiPjxkaXYgY2xhc3M9InR4dCI+IOaUtuiXj+adgumhuea1i+ivlTE8L2Rpdj48ZGl2IGNsYXNzPSJ0b29scyI+PGEgaHJlZj0iamF2YXNjcmlwdDp2b2lkKDApOyIgY2xhc3M9Im1vdmUtdXAgaWNvbi1hcnJvdy11cCI+PC9hPjxhIGhyZWY9ImphdmFzY3JpcHQ6dm9pZCgwKTsiIGNsYXNzPSJtb3ZlLWRvd24gaWNvbi1hcnJvdy1kb3duIGRpc2FibGVkIj48L2E+PGEgaHJlZj0iamF2YXNjcmlwdDp2b2lkKDApOyIgY2xhc3M9Im1vdmUtZWRpdCIgZWN0eXBlPSJtb3ZlX2VkaXRfdG91Y2giPjxpIGNsYXNzPSJpY29uIGljb24tZWRpdCI+PC9pPue8lui+kTwvYT48YSBocmVmPSJqYXZhc2NyaXB0OnZvaWQoMCk7IiBjbGFzcz0ibW92ZS1yZW1vdmUiPjxpIGNsYXNzPSJpY29uIGljb24tcmVtb3ZlIj48L2k+5Yig6ZmkPC9hPjxkaXYgY2xhc3M9ImNvdmVyIj48L2Rpdj48L2Rpdj48L2Rpdj4=
         * onlookers_num : 2
         * act_promise :
         * start_time : 1531383774
         * end_time : 1532593359
         * act_id : 51
         * deposit : 20000
         * start_price : 3000
         * end_price : 20000
         * amplitude : 3000
         * no_top : 0
         * is_hot : 0
         * formated_start_price : ¥</em>3000.00
         * formated_end_price : ¥</em>20000.00
         * formated_deposit : ¥</em>20000.00
         * current_price : 3000
         * bid_user_count : 0
         * is_finished : 0
         * last_bid : null
         */

        private String goods_id;
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
    }
}
