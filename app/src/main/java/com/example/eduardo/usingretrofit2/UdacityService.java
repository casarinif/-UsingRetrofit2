package com.example.eduardo.usingretrofit2;

import com.example.eduardo.usingretrofit2.models.UdacityCatalog;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Eduardo on 27/02/2018.
 */

public interface UdacityService {
    // aqui vamos criar uma interface de comunicação
    public static final String BASE_URL = "https://www.udacity.com/public-api/v0/";

    //GET é para leitura e vai colocar courses no final do end acina
    @GET("courses")

    //vamos chamar o que tem na lista UdacityCatalog
    Call<UdacityCatalog> listCatalog();
}
