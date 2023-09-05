package com.giovanni.dotaapplication.domain.datasource

import com.giovanni.dotaapplication.data.model.HeroesResponse

interface DotaDataSource {
    suspend fun getHeroes(): HeroesResponse
}