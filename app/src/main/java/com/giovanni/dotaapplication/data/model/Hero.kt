package com.giovanni.dotaapplication.data.model

import com.google.gson.annotations.SerializedName

data class Hero(
    @SerializedName("id")
    val id: Int,
    @SerializedName("localized_name")
    val localized_name: String,
    @SerializedName("primary_attr")
    val primary_attr: String,
    @SerializedName("attack_type")
    val attack_type: String,
    @SerializedName("roles")
    val roles: List<String>,
    @SerializedName("img")
    val img: String,
    @SerializedName("icon")
    val icon: String,
    @SerializedName("base_health")
    val base_health: Int,
    @SerializedName("base_health_regen")
    val base_health_regen: Int,
    @SerializedName("base_mana")
    val base_mana: Int
)
