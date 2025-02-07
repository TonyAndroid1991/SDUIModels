package com.kingmakers.createmodels.homemodels.recentWinWithRegistration.recentWinWithRegistration.recentWinWIthRegistrationDto

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ImageDto
import com.kingmakers.createmodels.homemodels.recentWinWithRegistration.recentWinWithRegistration.domainRecentWinWithRegistration.Badge
import com.kingmakers.createmodels.homemodels.recentWinWithRegistration.recentWinWithRegistration.domainRecentWinWithRegistration.RecentWinItem

data class RecentWinItemDto(
    val amount: String?,
    val badge: BadgeDto?,
    val date: String?,
    val gameImage: ImageDto?
) : MappableToDomain<RecentWinItem> {

    override fun toDomain(): RecentWinItem {
        return RecentWinItem(
            amount = amount.orEmpty(),
            badge = badge?.toDomain() ?: Badge(ImageDto.emptyImage(), ""),
            date = date.orEmpty(),
            gameImage = gameImage?.toDomain() ?: ImageDto.emptyImage()
        )
    }
}