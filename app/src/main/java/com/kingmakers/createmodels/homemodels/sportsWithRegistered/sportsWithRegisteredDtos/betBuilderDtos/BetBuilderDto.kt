package com.kingmakers.createmodels.homemodels.sportsWithRegistered.sportsWithRegisteredDtos.betBuilderDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ActionDto
import com.kingmakers.createmodels.homemodels.sportsWithRegistered.domainSportsWithRegistered.domainBetBuilder.BetBuilder

data class BetBuilderDto(
    val actions: List<ActionDto>?,
    val buttonTitle: String?,
    val date: String?,
    val betDetails: List<BetDetailDto>?,
    val match: String?,
    val odds: String?,
    val url: String?
) : MappableToDomain<BetBuilder> {

    override fun toDomain(): BetBuilder {
        return BetBuilder(
            actions = actions?.map { it.toDomain() } ?: emptyList(),
            buttonTitle = buttonTitle ?: "",
            date = date ?: "",
            betDetails = betDetails?.map { it.toDomain() } ?: emptyList(),
            match = match ?: "",
            odds = odds ?: "",
            url = url ?: ""
        )
    }
}
