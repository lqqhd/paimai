/*
 * Copyright 2018 JessYan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.jessyan.armscomponent.commonsdk.core;

/**
 * ================================================
 * RouterHub 用来定义路由器的路由地址, 以组件名作为前缀, 对每个组件的路由地址进行分组, 可以统一查看和管理所有分组的路由地址
 * 路由地址的命名规则为 组件名 + 页面名, 如订单组件的订单详情页的路由地址可以命名为 "/order/OrderDetailActivity"
 * <p>
 * ARouter 将路由地址中第一个 '/' 后面的字符称为 Group, 比如上面的示例路由地址中 order 就是 Group, 以 order 开头的地址都被分配该 Group 下
 * 切记不同的组件中不能出现名称一样的 Group, 否则会发生该 Group 下的部分路由地址找不到的情况!!!
 * 所以每个组件使用自己的组件名作为 Group 是比较好的选择, 毕竟组件不会重名
 *
 * @see <a href="https://github.com/JessYanCoding/ArmsComponent/wiki#3.4">RouterHub wiki 官方文档</a>
 * Created by JessYan on 30/03/2018 18:07
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * ================================================
 */
public interface RouterHub {
    /**
     * 组名
     */
    String APP = "/app";//宿主 App 组件
    String ZHIHU = "/zhihu";//知乎组件
    String GANK = "/gank";//干货集中营组件
    String GOLD = "/gold";//稀土掘金组件
    String WELCOME = "/welcome";//欢迎组件
    String SALES_CLIENT = "/sales_client";//买家
    String SELLER_CLIENT = "/seller_client";//卖家
    String XIAO_XING_SETTING = "/xiao_xing_setting";//设置
    String XIAO_XING_LOGIN = "/xiao_xing_login";//登录
    String XIAO_XING_ADDRESS = "/xiao_xing_address";//地址
    String XIAO_XING_ORDER = "/xiao_xing_order";//订单
    String XIAO_XING_SEARCH = "/xiao_xing_search";//搜索

    /**
     * 服务组件, 用于给每个组件暴露特有的服务
     */
    String SERVICE = "/service";

    /**
     * 欢迎分组
     */
    String WELCOME_SPLASHACTIVITY = WELCOME + "/SplashActivity";
    String WELCOME_WELCOMEACTIVITY = WELCOME + "/WelcomeActivity";
    String WELCOME_WELCOMEGUIDEACTIVITY = WELCOME + "/WelcomeGuideActivity";

    String XIAO_XING_SEARCH_SearchActivity = XIAO_XING_SEARCH + "/SearchActivity";

    /**
     * 宿主 App 分组
     */
    //String APP_SPLASHACTIVITY = APP + "/SplashActivity";
    String APP_MAINACTIVITY = APP + "/MainActivity";
    String SALES_CLIENT_PAIMAIMAINACTIVITY = SALES_CLIENT + "/PaiMaiMainActivity";
    String SALES_CLIENT_ZHUANCHANGACTIVITY = SALES_CLIENT + "/ZhuanChangActivity";
    String SALES_CLIENT_HEADLINESACTIVITY = SALES_CLIENT + "/HeadlinesActivity";
    String SALES_CLIENT_WEIPAIACTIVITY = SALES_CLIENT + "/WeiPaiActivity";
    String SALES_CLIENT_CANGPINACTIVITY = SALES_CLIENT + "/CangPinActivity";
    String SALES_CLIENT_ZHANTINGACTIVITY = SALES_CLIENT + "/ZhanTingActivity";
    String SALES_CLIENT_WEIPAIDETAILACTIVITY = SALES_CLIENT + "/WeiPaiDetailActivity";
    String SALES_CLIENT_ZHANTINGDETAILACTIVITY = SALES_CLIENT + "/ZhanTingDetailActivity";
    String SALES_CLIENT_MINEQUOTATIONACTIVITY = SALES_CLIENT + "/MineQuotationActivity";
    String SALES_CLIENT_WODEJINGPAIACTIVITY = SALES_CLIENT + "/WoDeJingPaiActivity";
    String SALES_CLIENT_SHOUCANGACTIVITY = SALES_CLIENT + "/ShouCangActivity";
    String SALES_CLIENT_TIANJIANGHONGBAOACTIVITY = SALES_CLIENT + "/TianJiangHongBaoActivity";
    String SALES_CLIENT_CHUANGJIANZHUANCHANGACTIVITY = SALES_CLIENT + "/ChuangJianZhuanChangActivity";
    String SALES_CLIENT_CHUANGJIANZHANPINACTIVITY = SALES_CLIENT + "/ChuangJianZhanPinActivity";
    String SALES_CLIENT_CHUANGJIANWEIPAIACTIVITY = SALES_CLIENT + "/ChuangJianWeiPaiActivity";
    String SALES_CLIENT_ZHANTINGGOODSLISTACTIVITY = SALES_CLIENT + "/ZhanTingGoodsListActivity";

    /**
     * 卖家
     */
    String SELLER_CLIENT_MINEACTIVITY = SELLER_CLIENT + "/MineActivity";
    String SELLER_CLIENT_HEADLINESACTIVITY = SELLER_CLIENT + "/HeadlinesActivity";
    String SELLER_CLIENT_BALANCEACTIVITY = SELLER_CLIENT + "/BalanceActivity";
    String SELLER_CLIENT_APPLICATIONHALLACTIVITY = SELLER_CLIENT + "/ApplicationHallActivity";
    String SELLER_CLIENT_COMMODITYMANAGEMENTACTIVITY = SELLER_CLIENT + "/CommodityManagementActivity";
    String SELLER_CLIENT_EXHIBITIONMANAGEMENTACTIVITY = SELLER_CLIENT + "/ExhibitionManagementActivity";
    String SELLER_CLIENT_NOVICEMUSTLEARNACTIVITY = SELLER_CLIENT + "/NoviceMustLearnActivity";
    String SELLER_CLIENT_QUOTATIONACTIVITY = SELLER_CLIENT + "/QuotationActivity";
    String SELLER_CLIENT_REDENVELOPESACTIVITY = SELLER_CLIENT + "/RedEnvelopesActivity";
    String SELLER_CLIENT_SPECIALMANAGEMENTACTIVITY = SELLER_CLIENT + "/SpecialManagementActivity";
    String SELLER_CLIENT_REDENVELOPESADDACTIVITY = SELLER_CLIENT + "/RedEnvelopesAddActivity";
    String SELLER_CLIENT_SPECIALMANAGEMENTADDACTIVITY = SELLER_CLIENT + "/SpecialManagementAddActivity";
    String SELLER_CLIENT_BALANCEDETAILSACTIVITY = SELLER_CLIENT + "/BalanceDetailsActivity";
    String SELLER_CLIENT_BALANCERECHARGEACTIVITY = SELLER_CLIENT + "/BalanceRechargeActivity";
    String SELLER_CLIENT_BALANCERECHARGEPAYMENTACTIVITY = SELLER_CLIENT + "/BalanceRechargePaymentActivity";
    String SELLER_CLIENT_BALANCEWITHDRAWLOGINACTIVITY = SELLER_CLIENT + "/BalanceWithDrawLoginActivity";
    String SELLER_CLIENT_BALANCEWITHDRAWACTIVITY = SELLER_CLIENT + "/BalanceWithDrawActivity";
    String SELLER_CLIENT_BALANCEXIAOBAOJINACTIVITY = SELLER_CLIENT + "/BalanceXiaoBaoJinActivity";
    String SELLER_CLIENT_BALANCEXIAOBAOJINJIAONAACTIVITY = SELLER_CLIENT + "/BalanceXiaoBaoJinJiaoNaActivity";
    String SELLER_CLIENT_BALANCEVERIFIEDACTIVITY = SELLER_CLIENT + "/BalanceVerifiedActivity";
    String SELLER_CLIENT_BALANCEPAYMENTSECURITYACTIVITY = SELLER_CLIENT + "/BalancePaymentSecurityActivity";
    String SELLER_CLIENT_BALANCEADDBANKCARDACTIVITY = SELLER_CLIENT + "/BalanceAddBankCardActivity";
    String SELLER_CLIENT_BALANCEADDBANKCARDLISTACTIVITY = SELLER_CLIENT + "/BalanceAddBankCardListActivity";
    /**
     * 设置
     */
    String XIAO_XING_SETTING_SETTING = XIAO_XING_SETTING + "/SettingActivity";
    /**
     * 登录
     */
    String XIAO_XING_LOGIN_LOGINACTIVITY = XIAO_XING_LOGIN + "/LoginActivity";
    String XIAO_XING_LOGIN_SETNEWPASSWORDACTIVITY = XIAO_XING_LOGIN + "/SetNewPasswordActivity";
    String XIAO_XING_LOGIN_FORGOTPWDSENDPHONEACTIVITY = XIAO_XING_LOGIN + "/ForgotPwdSendPhoneActivity";
    String XIAO_XING_LOGIN_FORGOTPWDVERIFICATIONCODEACTIVITY = XIAO_XING_LOGIN + "/ForgotPwdVerificationCodeActivity";
    String XIAO_XING_LOGIN_PROTOCOLACTIVITY = XIAO_XING_LOGIN + "/ProtocolActivity";
    String XIAO_XING_LOGIN_REGISTERSENDPHONEACTIVITY = XIAO_XING_LOGIN + "/RegisterSendPhoneActivity";
    String XIAO_XING_LOGIN_REGISTERSETPWDACTIVITY = XIAO_XING_LOGIN + "/RegisterSetPwdActivity";
    String XIAO_XING_LOGIN_REGISTERVERIFICATIONCODEACTIVITY = XIAO_XING_LOGIN + "/RegisterVerificationCodeActivity";

    /**
     * 地址
     */
    String XIAO_XING_ADDRESS_ADDRESSADDACTIVITY = XIAO_XING_ADDRESS + "/AddressAddActivity";
    String XIAO_XING_ADDRESS_ADDRESSLISTACTIVITY = XIAO_XING_ADDRESS + "/AddressListActivity";

    /**
     * 订单
     */
    String XIAO_XING_ORDER_ORDERACTIVITY = XIAO_XING_ORDER + "/OrderActivity";

    /**
     * 知乎分组
     */
    String ZHIHU_SERVICE_ZHIHUINFOSERVICE = ZHIHU + SERVICE + "/ZhihuInfoService";

    String ZHIHU_HOMEACTIVITY = ZHIHU + "/HomeActivity";
    String ZHIHU_DETAILACTIVITY = ZHIHU + "/DetailActivity";

    /**
     * 干货集中营分组
     */
    String GANK_SERVICE_GANKINFOSERVICE = GANK + SERVICE + "/GankInfoService";

    String GANK_HOMEACTIVITY = GANK + "/HomeActivity";

    /**
     * 稀土掘金分组
     */
    String GOLD_SERVICE_GOLDINFOSERVICE = GOLD + SERVICE + "/GoldInfoService";

    String GOLD_HOMEACTIVITY = GOLD + "/HomeActivity";
    String GOLD_DETAILACTIVITY = GOLD + "/DetailActivity";
}
