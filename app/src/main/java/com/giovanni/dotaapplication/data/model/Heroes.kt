package com.giovanni.dotaapplication.data.model

import com.google.gson.annotations.SerializedName

data class Heroes(
    @SerializedName("id")
    val id: Int,
    @SerializedName("localized_name")
    val localized_name: String,
    @SerializedName("primary_attr")
    val primary_attr: String,
    @SerializedName("attack_type")
    val attack_type: String,
    @SerializedName("roles")
    val roles: List<String>
)
