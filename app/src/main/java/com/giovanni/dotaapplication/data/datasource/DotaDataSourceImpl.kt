package com.giovanni.dotaapplication.data.datasource

import com.giovanni.dotaapplication.BuildConfig
import com.giovanni.dotaapplication.data.api.DotaService
import com.giovanni.dotaapplication.data.model.Hero
import com.giovanni.dotaapplication.domain.datasource.DotaDataSource
import retrofit2.Response
import javax.inject.Inject

class DotaDataSourceImpl @Inject constructor(
    private val api: DotaService
) : DotaDataSource {

    override suspend fun getHeroes(): Response<List<Hero>> {
        return api.getHeroes(BuildConfig.API_KEY)
    }
}
