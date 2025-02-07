package com.kingmakers.createmodels.homemodels.sportsWithoutRegistered.sportsWithoutRegisteredDto

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ImageDto
import com.kingmakers.createmodels.homemodels.sportsWithoutRegistered.domainSportsWithoutRegistered.SportItem

data class SportItemDto(
    val attributedText: String?,
    val icon: ImageDto?
) : MappableToDomain<SportItem> {

    override fun toDomain(): SportItem {
        return SportItem(
            attributedText = attributedText.orEmpty(),
            icon = icon?.toDomain() ?: ImageDto.emptyImage()
        )
    }
}
