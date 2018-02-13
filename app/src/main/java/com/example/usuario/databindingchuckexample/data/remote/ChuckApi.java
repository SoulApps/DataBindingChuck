package com.example.usuario.databindingchuckexample.data.remote;

import com.example.usuario.databindingchuckexample.data.model.Response;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by usuario on 13/02/2018.
 */

public interface ChuckApi {

    // Petición GET a dicho path, que incluye el chiste
    // Retorna una lista con el chiste
    @GET("jokes/random")
    Call<List<Response>> getJoke();
}
