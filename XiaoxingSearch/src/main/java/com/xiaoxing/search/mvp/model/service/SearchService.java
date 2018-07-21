package com.xiaoxing.search.mvp.model.service;


import com.xiaoxing.search.mvp.model.entity.AuctionSearch;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author 小星 QQ:753940262
 * @class describe
 * @time 2018/7/9 0009 14:11
 */
public interface SearchService {


    @GET("/api/auction_search.php")
    Observable<AuctionSearch> getAuctionSearch(
            @Query("keywords") String keywords
    );

}
