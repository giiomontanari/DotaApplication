package com.giovanni.dotaapplication.domain.usecase

import com.giovanni.dotaapplication.data.model.HeroesResponse
import com.giovanni.dotaapplication.domain.repository.DotaRepository

class GetHeroes(
    private val repository: DotaRepository
) {
    suspend operator fun invoke() : HeroesResponse {
        return repository.getHeroes()
    }
}