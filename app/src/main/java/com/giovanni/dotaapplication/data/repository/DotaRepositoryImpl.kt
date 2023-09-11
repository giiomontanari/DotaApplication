package com.giovanni.dotaapplication.data.repository

import com.giovanni.dotaapplication.data.model.HeroesResponse
import com.giovanni.dotaapplication.domain.datasource.DotaDataSource
import com.giovanni.dotaapplication.domain.repository.DotaRepository
import javax.inject.Inject

class DotaRepositoryImpl @Inject constructor(
    private val dataSource: DotaDataSource
) : DotaRepository {
    override suspend fun getHeroes(): HeroesResponse = dataSource.getHeroes()
}
