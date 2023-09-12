package com.giovanni.dotaapplication.data.datasource

import com.giovanni.dotaapplication.data.api.DotaService
import com.giovanni.dotaapplication.data.model.Hero
import com.giovanni.dotaapplication.domain.datasource.DotaDataSource
import retrofit2.Response
import javax.inject.Inject

class DotaDataSourceImpl @Inject constructor(
    private val api: DotaService
) : DotaDataSource {

    override suspend fun getHeroes(): Response<List<Hero>> {
        return api.getHeroes(queryKey)
    }

    companion object {

        private const val queryKey: String = "8456cf76-b747-4a93-bf46-0952e2d947a1"
    }
}