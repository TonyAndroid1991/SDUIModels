package com.kingmakers.createmodels.homemodels.recentWinnersModels.recentWinnersDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.Image
import com.kingmakers.createmodels.homemodels.recentWinnersModels.domainRecentWinners.RecentWinnersItem

data class RecentWinnersItemsDto(
    val attributedText: String?,
    val badgeImage: Image?,
    val badgeText: String?,
    val gameImage: Image?
) : MappableToDomain<RecentWinnersItem> {

    override fun toDomain(): RecentWinnersItem {
        return RecentWinnersItem(
            attributedText = attributedText.orEmpty(),
            badgeImage = badgeImage ?: Image.EMPTY,
            badgeText = badgeText.orEmpty(),
            gameImage = gameImage ?: Image.EMPTY
        )
    }
}