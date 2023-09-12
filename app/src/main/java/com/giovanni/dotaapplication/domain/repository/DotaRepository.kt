package com.giovanni.dotaapplication.domain.repository

import com.giovanni.dotaapplication.data.model.Hero
import javax.inject.Singleton

@Singleton
interface DotaRepository {
    suspend fun getHeroes() : List<Hero>
}
