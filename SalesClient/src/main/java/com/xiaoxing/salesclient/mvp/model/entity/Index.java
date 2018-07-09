package com.xiaoxing.salesclient.mvp.model.entity;

import java.util.List;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/7 0007 16:43
 */
public class Index {

    /**
     * result : success
     * error : 0
     * msg : 成功获取数据
     * info : {"list":[{"user_id":"81","aite_id":"","email":"","user_name":"fan","nick_name":"花瓣2","password":"3195e8f17d08374e57b5341d8a4d7022","question":"","answer":"","sex":"0","birthday":"0000-00-00","user_money":"1001.00","frozen_money":"8000.00","pay_points":"0","rank_points":"0","address_id":"0","reg_time":"1530557605","last_login":"1530855407","last_time":"0000-00-00 00:00:00","last_ip":"127.0.0.1","visit_count":"7","user_rank":"6","is_special":"0","ec_salt":"7946","salt":"0","parent_id":"0","flag":"0","alias":"","msn":"","qq":"","office_phone":"","home_phone":"","mobile_phone":"13276380514","is_validated":"1","credit_line":"0.00","passwd_question":null,"passwd_answer":null,"user_picture":"","old_user_picture":"","report_time":"0","drp_parent_id":"0","token":"48c63665cd830995212f84ff7cabf7ed","time_out":"1531527624"}],"filter":{"page":1,"page_size":15,"record_count":1,"page_count":1},"page_count":1,"record_count":1}
     */

    private String result;
    private int error;
    private String msg;
    private InfoBean info;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public static class InfoBean {
        /**
         * list : [{"user_id":"81","aite_id":"","email":"","user_name":"fan","nick_name":"花瓣2","password":"3195e8f17d08374e57b5341d8a4d7022","question":"","answer":"","sex":"0","birthday":"0000-00-00","user_money":"1001.00","frozen_money":"8000.00","pay_points":"0","rank_points":"0","address_id":"0","reg_time":"1530557605","last_login":"1530855407","last_time":"0000-00-00 00:00:00","last_ip":"127.0.0.1","visit_count":"7","user_rank":"6","is_special":"0","ec_salt":"7946","salt":"0","parent_id":"0","flag":"0","alias":"","msn":"","qq":"","office_phone":"","home_phone":"","mobile_phone":"13276380514","is_validated":"1","credit_line":"0.00","passwd_question":null,"passwd_answer":null,"user_picture":"","old_user_picture":"","report_time":"0","drp_parent_id":"0","token":"48c63665cd830995212f84ff7cabf7ed","time_out":"1531527624"}]
         * filter : {"page":1,"page_size":15,"record_count":1,"page_count":1}
         * page_count : 1
         * record_count : 1
         */

        private FilterBean filter;
        private int page_count;
        private int record_count;
        private List<ListBean> list;

        public FilterBean getFilter() {
            return filter;
        }

        public void setFilter(FilterBean filter) {
            this.filter = filter;
        }

        public int getPage_count() {
            return page_count;
        }

        public void setPage_count(int page_count) {
            this.page_count = page_count;
        }

        public int getRecord_count() {
            return record_count;
        }

        public void setRecord_count(int record_count) {
            this.record_count = record_count;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class FilterBean {
            /**
             * page : 1
             * page_size : 15
             * record_count : 1
             * page_count : 1
             */

            private int page;
            private int page_size;
            private int record_count;
            private int page_count;

            public int getPage() {
                return page;
            }

            public void setPage(int page) {
                this.page = page;
            }

            public int getPage_size() {
                return page_size;
            }

            public void setPage_size(int page_size) {
                this.page_size = page_size;
            }

            public int getRecord_count() {
                return record_count;
            }

            public void setRecord_count(int record_count) {
                this.record_count = record_count;
            }

            public int getPage_count() {
                return page_count;
            }

            public void setPage_count(int page_count) {
                this.page_count = page_count;
            }
        }

        public static class ListBean {
            /**
             * user_id : 81
             * aite_id :
             * email :
             * user_name : fan
             * nick_name : 花瓣2
             * password : 3195e8f17d08374e57b5341d8a4d7022
             * question :
             * answer :
             * sex : 0
             * birthday : 0000-00-00
             * user_money : 1001.00
             * frozen_money : 8000.00
             * pay_points : 0
             * rank_points : 0
             * address_id : 0
             * reg_time : 1530557605
             * last_login : 1530855407
             * last_time : 0000-00-00 00:00:00
             * last_ip : 127.0.0.1
             * visit_count : 7
             * user_rank : 6
             * is_special : 0
             * ec_salt : 7946
             * salt : 0
             * parent_id : 0
             * flag : 0
             * alias :
             * msn :
             * qq :
             * office_phone :
             * home_phone :
             * mobile_phone : 13276380514
             * is_validated : 1
             * credit_line : 0.00
             * passwd_question : null
             * passwd_answer : null
             * user_picture :
             * old_user_picture :
             * report_time : 0
             * drp_parent_id : 0
             * token : 48c63665cd830995212f84ff7cabf7ed
             * time_out : 1531527624
             */

            private String user_id;
            private String aite_id;
            private String email;
            private String user_name;
            private String nick_name;
            private String password;
            private String question;
            private String answer;
            private String sex;
            private String birthday;
            private String user_money;
            private String frozen_money;
            private String pay_points;
            private String rank_points;
            private String address_id;
            private String reg_time;
            private String last_login;
            private String last_time;
            private String last_ip;
            private String visit_count;
            private String user_rank;
            private String is_special;
            private String ec_salt;
            private String salt;
            private String parent_id;
            private String flag;
            private String alias;
            private String msn;
            private String qq;
            private String office_phone;
            private String home_phone;
            private String mobile_phone;
            private String is_validated;
            private String credit_line;
            private Object passwd_question;
            private Object passwd_answer;
            private String user_picture;
            private String old_user_picture;
            private String report_time;
            private String drp_parent_id;
            private String token;
            private String time_out;

            public String getUser_id() {
                return user_id;
            }

            public void setUser_id(String user_id) {
                this.user_id = user_id;
            }

            public String getAite_id() {
                return aite_id;
            }

            public void setAite_id(String aite_id) {
                this.aite_id = aite_id;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getUser_name() {
                return user_name;
            }

            public void setUser_name(String user_name) {
                this.user_name = user_name;
            }

            public String getNick_name() {
                return nick_name;
            }

            public void setNick_name(String nick_name) {
                this.nick_name = nick_name;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getQuestion() {
                return question;
            }

            public void setQuestion(String question) {
                this.question = question;
            }

            public String getAnswer() {
                return answer;
            }

            public void setAnswer(String answer) {
                this.answer = answer;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }

            public String getUser_money() {
                return user_money;
            }

            public void setUser_money(String user_money) {
                this.user_money = user_money;
            }

            public String getFrozen_money() {
                return frozen_money;
            }

            public void setFrozen_money(String frozen_money) {
                this.frozen_money = frozen_money;
            }

            public String getPay_points() {
                return pay_points;
            }

            public void setPay_points(String pay_points) {
                this.pay_points = pay_points;
            }

            public String getRank_points() {
                return rank_points;
            }

            public void setRank_points(String rank_points) {
                this.rank_points = rank_points;
            }

            public String getAddress_id() {
                return address_id;
            }

            public void setAddress_id(String address_id) {
                this.address_id = address_id;
            }

            public String getReg_time() {
                return reg_time;
            }

            public void setReg_time(String reg_time) {
                this.reg_time = reg_time;
            }

            public String getLast_login() {
                return last_login;
            }

            public void setLast_login(String last_login) {
                this.last_login = last_login;
            }

            public String getLast_time() {
                return last_time;
            }

            public void setLast_time(String last_time) {
                this.last_time = last_time;
            }

            public String getLast_ip() {
                return last_ip;
            }

            public void setLast_ip(String last_ip) {
                this.last_ip = last_ip;
            }

            public String getVisit_count() {
                return visit_count;
            }

            public void setVisit_count(String visit_count) {
                this.visit_count = visit_count;
            }

            public String getUser_rank() {
                return user_rank;
            }

            public void setUser_rank(String user_rank) {
                this.user_rank = user_rank;
            }

            public String getIs_special() {
                return is_special;
            }

            public void setIs_special(String is_special) {
                this.is_special = is_special;
            }

            public String getEc_salt() {
                return ec_salt;
            }

            public void setEc_salt(String ec_salt) {
                this.ec_salt = ec_salt;
            }

            public String getSalt() {
                return salt;
            }

            public void setSalt(String salt) {
                this.salt = salt;
            }

            public String getParent_id() {
                return parent_id;
            }

            public void setParent_id(String parent_id) {
                this.parent_id = parent_id;
            }

            public String getFlag() {
                return flag;
            }

            public void setFlag(String flag) {
                this.flag = flag;
            }

            public String getAlias() {
                return alias;
            }

            public void setAlias(String alias) {
                this.alias = alias;
            }

            public String getMsn() {
                return msn;
            }

            public void setMsn(String msn) {
                this.msn = msn;
            }

            public String getQq() {
                return qq;
            }

            public void setQq(String qq) {
                this.qq = qq;
            }

            public String getOffice_phone() {
                return office_phone;
            }

            public void setOffice_phone(String office_phone) {
                this.office_phone = office_phone;
            }

            public String getHome_phone() {
                return home_phone;
            }

            public void setHome_phone(String home_phone) {
                this.home_phone = home_phone;
            }

            public String getMobile_phone() {
                return mobile_phone;
            }

            public void setMobile_phone(String mobile_phone) {
                this.mobile_phone = mobile_phone;
            }

            public String getIs_validated() {
                return is_validated;
            }

            public void setIs_validated(String is_validated) {
                this.is_validated = is_validated;
            }

            public String getCredit_line() {
                return credit_line;
            }

            public void setCredit_line(String credit_line) {
                this.credit_line = credit_line;
            }

            public Object getPasswd_question() {
                return passwd_question;
            }

            public void setPasswd_question(Object passwd_question) {
                this.passwd_question = passwd_question;
            }

            public Object getPasswd_answer() {
                return passwd_answer;
            }

            public void setPasswd_answer(Object passwd_answer) {
                this.passwd_answer = passwd_answer;
            }

            public String getUser_picture() {
                return user_picture;
            }

            public void setUser_picture(String user_picture) {
                this.user_picture = user_picture;
            }

            public String getOld_user_picture() {
                return old_user_picture;
            }

            public void setOld_user_picture(String old_user_picture) {
                this.old_user_picture = old_user_picture;
            }

            public String getReport_time() {
                return report_time;
            }

            public void setReport_time(String report_time) {
                this.report_time = report_time;
            }

            public String getDrp_parent_id() {
                return drp_parent_id;
            }

            public void setDrp_parent_id(String drp_parent_id) {
                this.drp_parent_id = drp_parent_id;
            }

            public String getToken() {
                return token;
            }

            public void setToken(String token) {
                this.token = token;
            }

            public String getTime_out() {
                return time_out;
            }

            public void setTime_out(String time_out) {
                this.time_out = time_out;
            }
        }
    }
}
