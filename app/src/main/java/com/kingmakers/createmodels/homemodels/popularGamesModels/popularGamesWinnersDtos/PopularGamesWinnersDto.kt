package com.kingmakers.createmodels.homemodels.popularGamesModels.popularGamesWinnersDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ActionDto
import com.kingmakers.createmodels.homePageCommonModels.HeaderDto
import com.kingmakers.createmodels.homemodels.popularGamesModels.domainPopularGamesWinners.PopularGamesWinners

data class PopularGamesWinnersDto(
    val actions: List<ActionDto>?,
    val header: HeaderDto?,
    val items: List<WinnersItemDto>?
): MappableToDomain<PopularGamesWinners> {

    override fun toDomain(): PopularGamesWinners {
       return PopularGamesWinners(
            actions = actions?.map { it.toDomain() } ?: emptyList(),
            header = header?.toDomain() ?: HeaderDto.emptyHeader(),
            winners = items?.map { it.toDomain() } ?: emptyList()
        )
    }
}