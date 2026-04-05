package com.example.myapplication
import Api_interface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object `RetrofitInstance` {
    val adviceApi: Api_interface by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.adviceslip.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Api_interface::class.java)
    }

    val rickAndMortyApi: Api_interface by lazy {
        Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Api_interface::class.java)
    }
}