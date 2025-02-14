package com.kingmakers.createmodels.homemodels.recentWinnersModels.recentWinnersDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ImageDto
import com.kingmakers.createmodels.homemodels.recentWinnersModels.domainRecentWinners.RecentWinnersItem

data class RecentWinnersItemDto(
    val attributedText: String?,
    val badgeImage: ImageDto?,
    val badgeText: String?,
    val gameImage: ImageDto?
) : MappableToDomain<RecentWinnersItem> {

    override fun toDomain(): RecentWinnersItem {
        return RecentWinnersItem(
            attributedText = attributedText.orEmpty(),
            badgeImage = badgeImage?.toDomain() ?: ImageDto.emptyImage(),
            badgeText = badgeText.orEmpty(),
            gameImage = gameImage?.toDomain() ?: ImageDto.emptyImage()
        )
    }
}