package com.kingmakers.createmodels.homemodels.quickActionsModels.quickActionsDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.Image
import com.kingmakers.createmodels.homePageCommonModels.ImageDto
import com.kingmakers.createmodels.homemodels.quickActionsModels.domainQuickActions.QuickActionItem

data class QuickActionItemDto(
    val title: String?,
    val image: ImageDto?
) : MappableToDomain<QuickActionItem> {

    override fun toDomain(): QuickActionItem {
        return QuickActionItem(
            title = title.orEmpty(),
            image = image?.toDomain() ?: ImageDto.emptyImage()
        )
    }
}