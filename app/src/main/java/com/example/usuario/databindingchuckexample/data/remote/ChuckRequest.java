package com.example.usuario.databindingchuckexample.data.remote;

import com.example.usuario.databindingchuckexample.data.model.Response;

import java.util.List;

/**
 * Created by usuario on 13/02/2018.
 */

public class ChuckRequest {
    private final List<Response> jokes;

    public ChuckRequest(List<Response> jokes) {
        this.jokes = jokes;
    }

    public static ChuckRequest newJokesInstance(List<Response> jokes){
        return new ChuckRequest(jokes);
    }

    public List<Response> getJokes() {
        return jokes;
    }
}
