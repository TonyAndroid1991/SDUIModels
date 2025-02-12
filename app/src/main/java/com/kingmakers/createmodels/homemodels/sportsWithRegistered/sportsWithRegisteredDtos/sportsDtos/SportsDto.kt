package com.kingmakers.createmodels.homemodels.sportsWithRegistered.sportsWithRegisteredDtos.sportsDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ActionDto
import com.kingmakers.createmodels.homePageCommonModels.ImageDto
import com.kingmakers.createmodels.homemodels.sportsWithRegistered.domainSportsWithRegistered.domainSports.Sports

data class SportsDto(
    val actions: List<ActionDto>?,
    val buttonTitle: String?,
    val icon: ImageDto?,
    val name: String?,
    val url: String?,
) : MappableToDomain<Sports> {

    override fun toDomain(): Sports {
        return Sports(
            actions = actions?.map { it.toDomain() } ?: emptyList(),
            buttonTitle = buttonTitle ?: "",
            icon = icon?.toDomain() ?: ImageDto.emptyImage(),
            name = name ?: "",
            url = url ?: ""
        )
    }
}