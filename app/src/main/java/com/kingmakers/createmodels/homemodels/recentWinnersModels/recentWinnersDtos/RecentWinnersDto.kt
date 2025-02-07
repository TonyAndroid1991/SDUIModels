package com.kingmakers.createmodels.homemodels.recentWinnersModels.recentWinnersDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ActionDto
import com.kingmakers.createmodels.homemodels.recentWinnersModels.domainRecentWinners.RecentWinners

data class RecentWinnersDto(
    val actions: List<ActionDto>?,
    val recentWinnersItems: List<RecentWinnersItemDto>?
) : MappableToDomain<RecentWinners> {
    override fun toDomain(): RecentWinners {
        return  RecentWinners(
            actions = actions?.map { it.toDomain() } ?: emptyList(),
            recentWinnersItems = recentWinnersItems?.map { it.toDomain() } ?: emptyList()
        )
    }

}