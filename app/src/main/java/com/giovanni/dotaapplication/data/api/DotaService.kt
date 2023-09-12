package com.giovanni.dotaapplication.data.api

import com.giovanni.dotaapplication.data.model.Hero
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface DotaService {
    @GET("heroes")
    suspend fun getHeroes(
        @Query(
            "api_key"
        ) apiKey: String
    ): Response<List<Hero>>
}