package com.tarenwang.mvvmretrofitrxjavademo.ui;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.bumptech.glide.Glide;
import com.tarenwang.mvvmretrofitrxjavademo.bean.BannerBean;
import com.tarenwang.mvvmretrofitrxjavademo.bean.PostInfo;
import com.tarenwang.mvvmretrofitrxjavademo.R;
import com.tarenwang.mvvmretrofitrxjavademo.bean.PostInfoRequest;
import com.tarenwang.mvvmretrofitrxjavademo.databinding.ActivityMainBinding;
import com.tarenwang.mvvmretrofitrxjavademo.net.RetrofitService;
import com.tarenwang.mvvmretrofitrxjavademo.net.RetrofitUtils;

import java.util.ArrayList;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 先创建被观察者
 */

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ArrayList<BannerBean.TopStoriesBean> mBannerList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //getPost();
        getBanner();
    }

    private void getPost() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.kuaidi100.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(RetrofitUtils.getOkHttpClient())
                .build();
        RetrofitService service = retrofit.create(RetrofitService.class);

//        PostInfoRequest request = new PostInfoRequest(    );
//        request.setType("yuantong");
//        request.setPostid("11111111111");
        Observable<PostInfo> observable = service.getPostInfo("yuantong", "11111111111");
        observable.subscribeOn(Schedulers.io())//在子线程中进行Http访问
                .observeOn(AndroidSchedulers.mainThread())// UI线程处理返回接口
                .subscribe(new Observer<PostInfo>() {//订阅
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println("错误");

                    }

                    @Override
                    public void onNext(PostInfo postInfo) {
                        Log.i("asd：", "返回Json" + postInfo.toString() + "");
                    }
                });
    }

    private void getBanner() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://news-at.zhihu.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(RetrofitUtils.getOkHttpClient())
                .build();
        RetrofitService retrofitService = retrofit.create(RetrofitService.class);
        Observable<BannerBean> observable = retrofitService.getBanner();
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BannerBean>() {
                    @Override
                    public void onCompleted() {
                        binding.bannerBg.setPages(new CBViewHolderCreator<MyViewHolder>() {
                            @Override
                            public MyViewHolder createHolder() {
                                return new MyViewHolder();
                            }
                        }, mBannerList)
//                                .setPageIndicator(new int[]{R.mipmap.b, R.mipmap.bb, R.mipmap.bbb})
                        ;
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(BannerBean bannerBean) {
                        mBannerList.addAll(bannerBean.getTop_stories());
                        Log.i("asd：", "返回Json" + bannerBean.toString() + "");

                    }
                });

    }

    public class MyViewHolder implements Holder<BannerBean.TopStoriesBean> {
        private ImageView image;


        @Override
        public View createView(Context context) {
            image = new ImageView(context);
            image.setScaleType(ImageView.ScaleType.FIT_XY);
            return image;
        }

        @Override
        public void UpdateUI(Context context, int position, BannerBean.TopStoriesBean data) {
            Glide.with(context)
                    .load(data.getImage())
                    .into(image);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        binding.bannerBg.startTurning(3000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        binding.bannerBg.stopTurning();
    }
}
