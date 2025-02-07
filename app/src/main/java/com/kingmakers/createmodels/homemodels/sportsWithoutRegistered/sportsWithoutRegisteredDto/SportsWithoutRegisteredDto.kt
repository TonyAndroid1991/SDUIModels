package com.kingmakers.createmodels.homemodels.sportsWithoutRegistered.sportsWithoutRegisteredDto

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ActionDto
import com.kingmakers.createmodels.homePageCommonModels.Header
import com.kingmakers.createmodels.homePageCommonModels.HeaderDto
import com.kingmakers.createmodels.homePageCommonModels.ImageDto
import com.kingmakers.createmodels.homemodels.sportsWithoutRegistered.domainSportsWithoutRegistered.SportsWithoutRegistered

data class SportsWithoutRegisteredDto(
    val actions: List<ActionDto>?,
    val header: HeaderDto?,
    val sportsItems: List<SportItemDto>?
) : MappableToDomain<SportsWithoutRegistered> {

    override fun toDomain(): SportsWithoutRegistered {
        return SportsWithoutRegistered(
            actions = actions?.map { it.toDomain() } ?: emptyList(),
            header = header?.toDomain() ?: HeaderDto.emptyHeader(),
            sportsItems = sportsItems?.map { it.toDomain() } ?: emptyList()
        )
    }
}