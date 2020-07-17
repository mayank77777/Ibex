package com.codeinger.ibex.utils;

import android.app.Application;
import com.fxn.stash.Stash;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ss.com.bannerslider.Slider;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Slider.init(new PicassoImageLoadingService(this));
        Stash.init(this);
    }



}
