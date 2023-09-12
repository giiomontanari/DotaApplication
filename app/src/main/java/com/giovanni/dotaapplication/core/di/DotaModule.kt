package com.giovanni.dotaapplication.core.di

import com.giovanni.dotaapplication.data.api.DotaService
import com.giovanni.dotaapplication.data.datasource.DotaDataSourceImpl
import com.giovanni.dotaapplication.data.repository.DotaRepositoryImpl
import com.giovanni.dotaapplication.domain.datasource.DotaDataSource
import com.giovanni.dotaapplication.domain.repository.DotaRepository
import com.giovanni.dotaapplication.domain.usecase.GetHeroes
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DotaModule {
    @Binds
    abstract fun bindingDotaDataSource(bind: DotaDataSourceImpl): DotaDataSource

    @Binds
    abstract fun bindingDotaRepository(bind: DotaRepositoryImpl): DotaRepository
    companion object {
        private const val baseUrl: String = "https://api.opendota.com/api/"

        @Singleton
        @Provides
        fun provideRetrofit(): Retrofit {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .build()
        }

        @Singleton
        @Provides
        fun provideDotaService(retrofit: Retrofit): DotaService {
            return retrofit.create(DotaService::class.java)
        }
    }

}