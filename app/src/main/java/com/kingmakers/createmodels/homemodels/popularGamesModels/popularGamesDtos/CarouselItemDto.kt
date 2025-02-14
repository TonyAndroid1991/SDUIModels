package com.kingmakers.createmodels.homemodels.popularGamesModels.popularGamesDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ImageDto
import com.kingmakers.createmodels.homemodels.popularGamesModels.domainPopularGames.CarouselItem

data class CarouselItemDto(
    val activeUsers: String?,
    val icon: ImageDto?,
    val carouselImage: ImageDto?,
    val position: String?
): MappableToDomain<CarouselItem> {

    override fun toDomain(): CarouselItem {
        return CarouselItem(
            activeUsers = activeUsers.orEmpty(),
            icon = icon?.toDomain() ?: ImageDto.emptyImage(),
            image = carouselImage?.toDomain() ?: ImageDto.emptyImage(),
            position = position.orEmpty()
        )
    }
}