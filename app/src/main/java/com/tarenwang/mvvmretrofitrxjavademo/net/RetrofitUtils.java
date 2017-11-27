package com.tarenwang.mvvmretrofitrxjavademo.net;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by Administrator on 2017/11/24.
 */

public class RetrofitUtils {
    /**
     * 获取OKHttpClient
     * 请求打印请求参数
     *
     * @return OKHttpClient
     */
    public static OkHttpClient getOkHttpClient() {
        //日志显示级别
        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.BODY;
        //新建log拦截器
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.i("asd", message);
            }
        });
        loggingInterceptor.setLevel(level);
        //定制OKHttp
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        //OkHttp添加拦截器loggingInterceptor
        httpClientBuilder.addInterceptor(loggingInterceptor);
        return httpClientBuilder.build();

    }
}
