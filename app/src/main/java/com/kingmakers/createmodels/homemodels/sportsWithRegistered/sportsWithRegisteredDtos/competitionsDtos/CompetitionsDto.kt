package com.kingmakers.createmodels.homemodels.sportsWithRegistered.sportsWithRegisteredDtos.competitionsDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ActionDto
import com.kingmakers.createmodels.homePageCommonModels.ImageDto
import com.kingmakers.createmodels.homemodels.sportsWithRegistered.domainSportsWithRegistered.domainCompetitions.Competitions

data class CompetitionsDto(
    val actions: List<ActionDto>?,
    val buttonTitle: String?,
    val icon: ImageDto?,
    val name: String?,
    val url: String?
) : MappableToDomain<Competitions> {

    override fun toDomain(): Competitions {
        return Competitions(
            actions = actions?.map { it.toDomain() } ?: emptyList(),
            buttonTitle = buttonTitle ?: "",
            icon = icon?.toDomain() ?: ImageDto.emptyImage(),
            name = name ?: "",
            url = url ?: ""
        )
    }
}
