package com.kingmakers.createmodels.homemodels.recentWinWithRegistration.recentWinWithRegistration.recentWinWIthRegistrationDto

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ImageDto
import com.kingmakers.createmodels.homemodels.recentWinWithRegistration.recentWinWithRegistration.domainRecentWinWithRegistration.Badge

data class BadgeDto(
    val image: ImageDto?,
    val text: String?
) : MappableToDomain<Badge> {

    override fun toDomain(): Badge {
        return Badge(
            image = image?.toDomain() ?: ImageDto.emptyImage(),
            text = text.orEmpty()
        )
    }
}