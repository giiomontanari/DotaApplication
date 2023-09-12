package com.giovanni.dotaapplication.domain.datasource

import com.giovanni.dotaapplication.data.model.Hero
import retrofit2.Response

interface DotaDataSource {
    suspend fun getHeroes(): Response<List<Hero>>
}