package com.kingmakers.createmodels.homemodels

data class Actions(
    val type: String,
    val id: String,
    val label: String,
    val url: String?,
    val screenId: String?
)