package com.giovanni.dotaapplication.domain.repository

import com.giovanni.dotaapplication.data.model.HeroesResponse
import javax.inject.Singleton

@Singleton
interface DotaRepository {
    suspend fun getHeroes() : HeroesResponse
}
