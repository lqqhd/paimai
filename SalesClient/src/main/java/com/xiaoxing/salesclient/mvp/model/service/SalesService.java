package com.xiaoxing.salesclient.mvp.model.service;

import com.xiaoxing.salesclient.mvp.model.entity.Article;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionBid;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionList;
import com.xiaoxing.salesclient.mvp.model.entity.AuctionSearch;
import com.xiaoxing.salesclient.mvp.model.entity.Category;
import com.xiaoxing.salesclient.mvp.model.entity.Index;
import com.xiaoxing.salesclient.mvp.model.entity.Specialcat;
import com.xiaoxing.salesclient.mvp.model.entity.SpecialcatDetail;
import com.xiaoxing.salesclient.mvp.model.entity.StoreShop;
import com.xiaoxing.salesclient.mvp.model.entity.WoDeGuanZhu;

import me.jessyan.armscomponent.commonres.utils.AppUpdate;

import io.reactivex.Observable;
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
    Observable<SpecialcatDetail> getSpecialcatDetail(
            @Query("specialcat_id") String specialcat_id
    );

    @GET("/api/auction_search.php")
    Observable<AuctionSearch> getAuctionSearch(
            @Query("keywords") String keywords
    );

    @GET("/api/update.php")
    Observable<AppUpdate> checkAppUpdate(
    );

    @GET("/api/today_is_sign.php")
    Observable<TodayIsSign> todayIsSign(
            @Query("access_token") String access_token
    );

    @GET("/api/my_signin_coupons_list.php")
    Observable<MySgninCouponsList> mySgninCouponsList(
            @Query("access_token") String access_token,
            @Query("year_month") String year_month
    );


}
