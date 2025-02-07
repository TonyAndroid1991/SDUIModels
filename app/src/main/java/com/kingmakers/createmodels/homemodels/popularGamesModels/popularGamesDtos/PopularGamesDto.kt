package com.kingmakers.createmodels.homemodels.popularGamesModels.popularGamesDtos

import com.kingmakers.createmodels.homePageCommonModels.ActionDto
import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.Header
import com.kingmakers.createmodels.homePageCommonModels.HeaderDto
import com.kingmakers.createmodels.homePageCommonModels.ImageDto
import com.kingmakers.createmodels.homemodels.popularGamesModels.domainPopularGames.PopularGames

data class PopularGamesDto(
    val actions: List<ActionDto>?,
    val carouselItems: List<CarouselItemDto>?,
    val header: HeaderDto?
) : MappableToDomain<PopularGames> {

    override fun toDomain(): PopularGames {
        return PopularGames(
            actions = actions?.map { it.toDomain() } ?: emptyList(),
            carouselItems = carouselItems?.map { it.toDomain() } ?: emptyList(),
            header = header?.toDomain() ?: HeaderDto.emptyHeader()
        )
    }
}