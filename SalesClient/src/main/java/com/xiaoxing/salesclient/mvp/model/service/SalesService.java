package com.xiaoxing.salesclient.mvp.model.service;

import com.xiaoxing.salesclient.mvp.model.entity.Article;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionBid;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionBuy;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionDetailZhengChang;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionList;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionSearch;
import com.xiaoxing.salesclient.mvp.model.entity.Category;
import com.xiaoxing.salesclient.mvp.model.entity.GoodsReport;
import com.xiaoxing.salesclient.mvp.model.entity.GoodsReportSubmit;
import com.xiaoxing.salesclient.mvp.model.entity.Index;
import com.xiaoxing.salesclient.mvp.model.entity.Specialcat;
import com.xiaoxing.salesclient.mvp.model.entity.SpecialcatList;
import com.xiaoxing.salesclient.mvp.model.entity.StoreInfo;
import com.xiaoxing.salesclient.mvp.model.entity.StoreShop;
import com.xiaoxing.salesclient.mvp.model.entity.WoDeGuanZhu;

import me.jessyan.armscomponent.commonres.utils.AppUpdate;

import io.reactivex.Observable;

import com.xiaoxing.salesclient.mvp.model.entity.AuctionDetail;

import me.jessyan.armscomponent.commonres.utils.CouponsReceive;
import me.jessyan.armscomponent.commonres.utils.MyCouponsList;
import me.jessyan.armscomponent.commonres.utils.MySgninCouponsList;
import me.jessyan.armscomponent.commonres.utils.TodayIsSign;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/9 0009 14:11
 */
public interface SalesService {

    /**
     * 获取首页数据
     */
//    @GET("http://47.100.103.123/api.php?app_key=woaixuxiaoxing&method=dsc.user.login.get&user_name=fan&password=123456")
    @GET("/api/index.php")
    Observable<Index> getIndex();

    /**
     * 获取头条文章的数据
     *
     * @param article_id
     * @return
     */
    @GET("/api/article.php")
    Observable<Article> getArticle(@Query("article_id") String article_id);

    /**
     * 获得店铺列表-（展位推广更多）
     *
     * @param access_token
     * @param sort         排行：goods_number 最旺：sales_volume 最新：不传参数 传DESC
     * @param order        ASC升序 DESC降序
     * @param cat_left_id  二级分类
     * @return
     */
    @GET("/api/store_shop_list.php")
    Observable<StoreShop> getStoreShop(
            @Query("access_token") String access_token,
            @Query("sort") String sort,
            @Query("order") String order,
            @Query("cat_left_id") String cat_left_id
    );

    /**
     * 个人中心-我的关注列表
     *
     * @param access_token
     * @return
     */
    @GET("/api/auction_bid.php")
    Observable<AuctionBid> getAuctionBid(
            @Query("access_token") String access_token
    );

    /**
     * 拍品搜索
     *
     * @param keywords 商品名或者拍品名字
     * @return
     */
    @GET("/api/auction_list.php")
    Observable<AuctionList> getAuctionList(
            @Query("keywords") String keywords
    );

    /**
     * 拍品列表（微拍推广更多）
     *
     * @param access_token
     * @param sort         综合：end_time 价格：current_price 最新：act_id
     * @param order        ASC升序 DESC降序
     * @param cat_left_id  二级分类
     * @return
     */
    @GET("/api/auction_list.php")
    Observable<AuctionList> getAuctionList(
            @Query("access_token") String access_token,
            @Query("sort") String sort,
            @Query("order") String order,
            @Query("cat_left_id") String cat_left_id
    );

    /**
     * 个人中心-我的关注列表
     *
     * @param access_token
     * @return
     */
    @GET("/api/my_collection_store_list.php")
    Observable<WoDeGuanZhu> getMyCollectionStoreList(
            @Query("access_token") String access_token
    );

    /**
     * 分类接口
     *
     * @return
     */
    @GET("/api/category_index.php")
    Observable<Category> category(
    );

    /**
     * 专场列表
     *
     * @return
     */

    @GET("/api/specialcat.php")
    Observable<Specialcat> specialcat(
    );

    @GET("/api/specialcat.php")
    Observable<SpecialcatList> getSpecialcatDetail(
            @Query("specialcat_id") String specialcat_id
    );

    @GET("/api/auction_search.php")
    Observable<AuctionSearch> getAuctionSearch(
            @Query("keywords") String keywords
    );

    @GET("/api/update.php")
    Observable<AppUpdate> checkAppUpdate(
    );

    /**
     * 今天是否签到
     *
     * @param access_token
     * @return
     */
    @GET("/api/today_is_sign.php")
    Observable<TodayIsSign> todayIsSign(
            @Query("access_token") String access_token
    );

    /**
     * 获取签到历史信息
     *
     * @param access_token
     * @param year_month
     * @return
     */
    @GET("/api/my_signin_coupons_list.php")
    Observable<MySgninCouponsList> mySgninCouponsList(
            @Query("access_token") String access_token,
            @Query("year_month") String year_month
    );

    /**
     * 签到
     *
     * @param access_token
     * @param cou_id
     * @return
     */
    @GET("/api/coupons_receive.php")
    Observable<CouponsReceive> couponsReceive(
            @Query("access_token") String access_token,
            @Query("cou_id") String cou_id
    );

    @GET("/api/my_coupons_list.php")
    Observable<MyCouponsList> myCouponsList(
            @Query("access_token") String access_token
    );

    /**
     * 获得拍品详细信息
     *
     * @param goods_id
     * @return
     */
    @GET("/api/auction.php")
    Observable<AuctionDetail> auctionDetail(
            @Query("act_id") String act_id,
            @Query("goods_id") String goods_id
    );
    @GET("/api/auction.php")
    Observable<AuctionDetailZhengChang> auctionDetailZhengChang(
            @Query("act_id") String act_id,
            @Query("goods_id") String goods_id
    );

    /**
     * 举报
     *
     * @param access_token
     * @param goods_id
     * @return
     */
    @GET("/api/goods_report.php")
    Observable<GoodsReport> goodsReport(
            @Query("access_token") String access_token,
            @Query("goods_id") String goods_id
    );

    /**
     * 提交举报
     *
     * @param access_token
     * @param goods_id
     * @param goods_name
     * @param goods_image
     * @param title_id
     * @param type_id
     * @param inform_content
     * @return
     */
    @GET("/api/goods_report_submit.php")
    Observable<GoodsReportSubmit> goodsReportSubmit(
            @Query("access_token") String access_token,
            @Query("goods_id") String goods_id,
            @Query("goods_name") String goods_name,
            @Query("goods_image") String goods_image,
            @Query("title_id") String title_id,
            @Query("type_id") String type_id,
            @Query("inform_content") String inform_content
    );

    /**
     * 出价
     *
     * @param access_token
     * @param auction_id
     * @param bid_price
     * @return
     */
    @GET("/api/auction_bid.php")
    Observable<AuctionBid> auctionBid(
            @Query("access_token") String access_token,
            @Query("auction_id") String auction_id,
            @Query("bid_price") String bid_price
    );

    /**
     * 立即购买接口
     *
     * @param access_token
     * @param auction_id
     * @return
     */
    @GET("/api/auction_buy.php")
    Observable<AuctionBuy> auctionBuy(
            @Query("access_token") String access_token,
            @Query("auction_id") String auction_id
    );

    /**
     * 店铺-获得店铺详情
     *
     * @param store_id 店铺id
     * @param ru_id    店铺拥有者id
     * @return
     */
    @GET("/api/store_info.php")
    Observable<StoreInfo> storeInfo(
            @Query("store_id") String store_id,
            @Query("ru_id") String ru_id
    );

    /**
     * 专场-获得专场详情-含店铺专场
     *
     * @param specialcat_id
     * @param user_id
     * @return
     */
    @GET("/api/specialcat_list.php")
    Observable<SpecialcatList> getSpecialcatList(
            @Query("specialcat_id") String specialcat_id,
            @Query("user_id") String user_id
    );


}
