package com.giovanni.dotaapplication.data.repository

import android.util.Log
import com.giovanni.dotaapplication.data.model.Hero
import com.giovanni.dotaapplication.domain.datasource.DotaDataSource
import com.giovanni.dotaapplication.domain.repository.DotaRepository
import java.lang.Exception
import javax.inject.Inject

class DotaRepositoryImpl @Inject constructor(
    private val dataSource: DotaDataSource
) : DotaRepository {
    override suspend fun getHeroes(): List<Hero> = getHeroesFromApi()

    suspend fun getHeroesFromApi() : List<Hero> {
        lateinit var heroesList: List<Hero>
        try {
            val response = dataSource.getHeroes()
            val body = response.body()
            if (body != null) {
                heroesList = body
            }
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return heroesList
    }
}
