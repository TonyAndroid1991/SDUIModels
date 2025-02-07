package com.kingmakers.createmodels.homemodels.recentWinWithRegistration.recentWinWithRegistration.recentWinWIthRegistrationDto

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ActionDto
import com.kingmakers.createmodels.homePageCommonModels.HeaderDto
import com.kingmakers.createmodels.homemodels.recentWinWithRegistration.recentWinWithRegistration.domainRecentWinWithRegistration.RecentWinWithRegistration

data class RecentWinWithRegistrationDto(
    val actions: List<ActionDto>?,
    val header: HeaderDto?,
    val recentWinItems: List<RecentWinItemDto>?
) : MappableToDomain<RecentWinWithRegistration> {

    override fun toDomain(): RecentWinWithRegistration {
        return RecentWinWithRegistration(
            actions = actions?.map { it.toDomain() } ?: emptyList(),
            header = header?.toDomain() ?: HeaderDto.emptyHeader(),
            recentWinItems = recentWinItems?.map { it.toDomain() } ?: emptyList()
        )
    }
}
