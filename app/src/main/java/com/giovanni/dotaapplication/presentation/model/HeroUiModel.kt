package com.giovanni.dotaapplication.presentation.model

import com.google.gson.annotations.SerializedName

data class HeroUiModel(
    val id: Int,
    val name: String,
    val localizedName: String,
    val primaryAtrib: String,
    val attackType: String,
    val roles: List<String>,
    val img: String,
    val icon: String,
    val baseHealth: Int,
    val baseHealthGeren: Float,
    val baseMana: Int,
    val baseManaRegen: Float
)
