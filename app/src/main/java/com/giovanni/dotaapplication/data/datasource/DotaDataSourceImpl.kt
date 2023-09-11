package com.giovanni.dotaapplication.data.datasource

import com.giovanni.dotaapplication.data.model.HeroesResponse
import com.giovanni.dotaapplication.domain.datasource.DotaDataSource
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import javax.inject.Inject

class DotaDataSourceImpl @Inject constructor() : DotaDataSource {
    @GET("/heroes?api_key={$queryKey}")
    override suspend fun getHeroes(): HeroesResponse {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(HeroesResponse::class.java)
    }

    companion object {
        private const val baseUrl: String = "https://api.opendota.com/api"
        private const val queryKey: String = "8456cf76-b747-4a93-bf46-0952e2d947a1"
    }
}