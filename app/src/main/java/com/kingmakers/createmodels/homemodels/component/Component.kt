package com.kingmakers.createmodels.homemodels.component

import com.kingmakers.createmodels.homemodels.topPromotions.topPromotionsDtos.TopPromotionsDto

data class Component(
    val id: String?,
    val type: EnumType,
    val data: ComponentType
)

enum class EnumType {
    /**TODO add the @Serialname here*/
    top_promotions
}

sealed class ComponentType {
    data class TopPromotions(val topPromotions: TopPromotionsDto) : ComponentType()
}