package com.kingmakers.createmodels.homemodels.topPromotions.topPromotionsDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ImageDto
import com.kingmakers.createmodels.homemodels.topPromotions.domainTopPrompotions.TopPromotionsItem

data class TopPromotionsItemDto(
    val description: String?,
    val id: String?,
    val image: ImageDto?,
    val title: String?
) : MappableToDomain<TopPromotionsItem> {

    override fun toDomain(): TopPromotionsItem {
       return TopPromotionsItem(
           description = description.orEmpty(),
           id = id.orEmpty(),
           image = image?.toDomain() ?: ImageDto.emptyImage(),
           title = title.orEmpty()
       )
    }
}
