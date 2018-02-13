package com.example.usuario.databindingchuckexample.data.remote;

import android.content.Context;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by usuario on 13/02/2018.
 */

public class ChuckJokesService {
    private static final String BASE_URL = "https://api.chucknorris.io/";
    private static ChuckJokesService instance;
    private ChuckApi api;

    

    public static synchronized ChuckJokesService getInstance(Context context) {
        if (instance == null) {
            instance = new ChuckJokesService(context.getApplicationContext());
        }
        return instance;
    }

    private ChuckJokesService(Context applicationContext) {
        buildAPIService(applicationContext);
    }

    private void buildAPIService(Context applicationContext) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttpClient okHttpClient = builder.build();
        Retrofit retrofit = new Retrofit.Builder()

                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(ChuckApi.class);
    }

    public ChuckApi getApi() {
        return api;
    }
}
