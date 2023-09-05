package com.giovanni.dotaapplication.domain.repository

import com.giovanni.dotaapplication.data.model.HeroesResponse

interface DotaRepository {
    suspend fun getHeroes() : HeroesResponse
}
