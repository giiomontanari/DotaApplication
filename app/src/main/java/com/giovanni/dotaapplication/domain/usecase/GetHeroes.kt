package com.giovanni.dotaapplication.domain.usecase

import com.giovanni.dotaapplication.data.model.Hero
import com.giovanni.dotaapplication.domain.repository.DotaRepository
import javax.inject.Inject

class GetHeroes @Inject constructor(
    private val repository: DotaRepository
) {
    suspend operator fun invoke(): List<Hero> = repository.getHeroes()
}
