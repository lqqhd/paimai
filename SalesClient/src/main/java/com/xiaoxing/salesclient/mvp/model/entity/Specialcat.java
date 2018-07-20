package com.xiaoxing.salesclient.mvp.model.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/7 0007 16:43
 */
public class Specialcat implements Serializable {


    /**
     * result : true
     * msg : 获得所以专场
     * data : [{"cat_id":"1489","cat_name":"古钱币","cat_desc":"古钱币指古代货币。货币是商品交换的产物。中国是世界上最早使用铸币的国家。距今3000年前殷商晚期墓葬出土了不少\u201c无文铜贝\u201d，为最原始的金属货币。至西周晚期除贝币外还流通一些无一定形状的散铜块、铜锭等金属称量货币，这在考古发掘中...","touch_icon":"http://47.100.103.123/data/touch_icon/15313232766835.jpg","onlookers_num":"72"},{"cat_id":"1490","cat_name":"陶器","cat_desc":"关于本次陶器专场的描述","touch_icon":"http://47.100.103.123/data/touch_icon/15313234944920.jpg","onlookers_num":"2"},{"cat_id":"1491","cat_name":"玉镯","cat_desc":"很美的玉镯子","touch_icon":"http://47.100.103.123/data/touch_icon/15313235292709.jpg","onlookers_num":"0"},{"cat_id":"1492","cat_name":"古青铜器","cat_desc":"今晚七点开始本次专场","touch_icon":"http://47.100.103.123/data/touch_icon/15313235594957.jpg","onlookers_num":"0"}]
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
}
