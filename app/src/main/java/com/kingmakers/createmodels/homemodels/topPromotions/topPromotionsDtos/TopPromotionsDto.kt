package com.kingmakers.createmodels.homemodels.topPromotions.topPromotionsDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ActionDto
import com.kingmakers.createmodels.homePageCommonModels.Header
import com.kingmakers.createmodels.homePageCommonModels.HeaderDto
import com.kingmakers.createmodels.homePageCommonModels.ImageDto
import com.kingmakers.createmodels.homemodels.topPromotions.domainTopPrompotions.TopPromotions

data class TopPromotionsDto(
    val actions: List<ActionDto>?,
    val header: HeaderDto?,
    val topPromotionsItems: List<TopPromotionsItemDto>?
) : MappableToDomain<TopPromotions> {

    override fun toDomain(): TopPromotions {
       return TopPromotions(
           actions = actions?.map { it.toDomain() } ?: emptyList(),
           header = header?.toDomain() ?: HeaderDto.emptyHeader(),
           topPromotionsItems = topPromotionsItems?.map { it.toDomain() } ?: emptyList()
       )
    }
}