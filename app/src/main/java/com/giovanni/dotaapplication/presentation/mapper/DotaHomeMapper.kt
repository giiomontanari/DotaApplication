package com.giovanni.dotaapplication.presentation.mapper

import com.giovanni.dotaapplication.data.model.Hero
import com.giovanni.dotaapplication.presentation.model.HeroUiModel
import javax.inject.Inject

class DotaHomeMapper @Inject constructor() {

    fun mapFrom(from: List<Hero>) = from.let {
        it.map { hero ->
            HeroUiModel(
                id = hero.id,
                name = setupName(hero.name),
                localizedName = hero.localized_name,
                primaryAtrib = hero.primary_attr,
                attackType = hero.attack_type,
                roles = hero.roles,
                img = hero.img,
                icon = hero.icon,
                baseHealth = hero.base_health,
                baseHealthGeren = hero.base_health_regen,
                baseMana = hero.base_mana,
                baseManaRegen = hero.base_mana_regen
            )
        }
    }

    private fun setupName(localizedName: String) : String {
        return localizedName.replace("npc_dota_hero_", "")
    }
}