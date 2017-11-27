package com.tarenwang.mvvmretrofitrxjavademo.net;

import com.tarenwang.mvvmretrofitrxjavademo.bean.BannerBean;
import com.tarenwang.mvvmretrofitrxjavademo.bean.PostInfo;
import com.tarenwang.mvvmretrofitrxjavademo.bean.PostInfoRequest;
import com.tarenwang.mvvmretrofitrxjavademo.bean.VideoBean;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2017/11/24.
 */

public interface RetrofitService {
    /**
     * 获取快递信息
     * http://www.kuaidi100.com/query?type=yuantong&postid=11111111111
     */
    @POST("query")
    Observable<PostInfo> getPostInfo(@Query("type") String type, @Query("postid") String postid);

    /**
     * 轮播图
     * http://news-at.zhihu.com/api/4/news/latest
     */
    @GET("/api/4/news/latest")
    Observable<BannerBean> getBanner();

    /**
     * 豆瓣影视
     * http://api.douban.com/v2/movie/top250?start=0&count=10
     */
    @POST("v2/movie/top250?start=0&count=10")
    Observable<VideoBean> getVideo(@Query("start") int start, @Query("count") int count);

}
