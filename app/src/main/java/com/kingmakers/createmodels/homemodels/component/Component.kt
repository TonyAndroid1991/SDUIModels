package com.kingmakers.createmodels.homemodels.component

import kotlinx.serialization.SerialName

data class Component<T>(
    val id: String?,
    val type: EnumType,
    val data: T
)

enum class EnumType {
    @SerialName("top_promotions")
    TOP_PROMOTIONS
}
