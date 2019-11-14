package com.ansur.network;

import com.ansur.BuildConfig;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static OkHttpClient client = new OkHttpClient.Builder()
            .addInterceptor(new AuthInterceptor(BuildConfig.USERNAME, BuildConfig.PASSWORD))
            .build();

    public static Retrofit getRetrofitInstance() {
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();
        return retrofit;
    }
}
