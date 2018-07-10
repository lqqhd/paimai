package com.xiaoxing.salesclient.mvp.model.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/7 0007 16:43
 */
public class Article implements Serializable {


    /**
     * result : true
     * next : false
     * data : [{"article_id":"66","title":"乐拍头条重要通知","content":"6L+Z5piv5pyA5paw55qE6YCa55+l","author":"小樊","add_time":"1531615549"}]
     */

    private String result;
    private String next;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * article_id : 66
         * title : 乐拍头条重要通知
         * content : 6L+Z5piv5pyA5paw55qE6YCa55+l
         * author : 小樊
         * add_time : 1531615549
         */

        private String article_id;
        private String title;
        private String content;
        private String author;
        private String add_time;

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

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAdd_time() {
            return add_time;
        }

        public void setAdd_time(String add_time) {
            this.add_time = add_time;
        }
    }
}
