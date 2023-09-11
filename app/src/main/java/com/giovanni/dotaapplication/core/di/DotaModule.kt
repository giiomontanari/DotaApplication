package com.giovanni.dotaapplication.core.di

import com.giovanni.dotaapplication.data.datasource.DotaDataSourceImpl
import com.giovanni.dotaapplication.data.repository.DotaRepositoryImpl
import com.giovanni.dotaapplication.domain.datasource.DotaDataSource
import com.giovanni.dotaapplication.domain.repository.DotaRepository
import com.giovanni.dotaapplication.domain.usecase.GetHeroes
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DotaModule {
    @Binds
    fun bindingDotaDataSource(bind: DotaDataSourceImpl) : DotaDataSource
    @Binds
    fun bindingDotaRepository(bind: DotaRepositoryImpl) : DotaRepository
}