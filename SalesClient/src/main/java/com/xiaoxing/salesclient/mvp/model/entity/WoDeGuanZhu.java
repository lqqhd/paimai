package com.xiaoxing.salesclient.mvp.model.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/7 0007 16:43
 */
public class WoDeGuanZhu implements Serializable {


    /**
     * result : true
     * msg : 获取数据成功
     * data : [{"act_id":"49","act_name":"玉器玉雕测试拍卖1","current_price":300,"current_count":"1","end_time":"1532506355","goods_thumb":"http://s.jufengsc.com/images/201807/thumb_img/0_thumb_G_1531382865134.jpg"}]
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
         * act_id : 49
         * act_name : 玉器玉雕测试拍卖1
         * current_price : 300
         * current_count : 1
         * end_time : 1532506355
         * goods_thumb : http://s.jufengsc.com/images/201807/thumb_img/0_thumb_G_1531382865134.jpg
         */

        private String act_id;
        private String act_name;
        private int current_price;
        private String current_count;
        private String end_time;
        private String goods_thumb;

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
    }
}
