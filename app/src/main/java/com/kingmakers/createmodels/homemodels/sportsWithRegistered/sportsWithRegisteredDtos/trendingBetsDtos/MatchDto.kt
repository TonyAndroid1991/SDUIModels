package com.kingmakers.createmodels.homemodels.sportsWithRegistered.sportsWithRegisteredDtos.trendingBetsDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ImageDto
import com.kingmakers.createmodels.homemodels.sportsWithRegistered.domainSportsWithRegistered.trendingBets.Match

data class MatchDto(
    val odds: String?,
    val teamLogo: ImageDto?,
    val trendingTeamName: String?,
    val vsTeam: String?,
) : MappableToDomain<Match> {

    override fun toDomain(): Match {
        return Match(
            odds = odds ?: "",
            teamLogo = teamLogo?.toDomain() ?: ImageDto.emptyImage(),
            trendingTeamName = trendingTeamName ?: "",
            vsTeam = vsTeam ?: ""
        )
    }
}
