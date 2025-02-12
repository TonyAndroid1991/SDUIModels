package com.kingmakers.createmodels.homemodels.sportsWithRegistered.sportsWithRegisteredDtos.trendingBetsDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ActionDto
import com.kingmakers.createmodels.homemodels.sportsWithRegistered.domainSportsWithRegistered.trendingBets.TrendingBet
import com.kingmakers.createmodels.homemodels.sportsWithRegistered.sportsWithRegisteredDtos.betBuilderDtos.BetBuilderDto

data class TrendingBetDto(
    val actions: List<ActionDto>?,
    val betBuilder: BetBuilderDto?,
    val betDetails: BetDetailsDto?,
    val betId: String?,
    val bonus: String?,
    val buttonTitle: String?,
    val matchesList: List<MatchDto>?,
    val oddsBust: String?,
    val oddsSum: String?,
    val placedCount: String?,
    val potentialWinnings: String?,
    val selections: String?
) : MappableToDomain<TrendingBet> {

    override fun toDomain(): TrendingBet {
        return TrendingBet(
            actions = actions?.map { it.toDomain() } ?: emptyList(),
            betBuilder = betBuilder?.toDomain() ?: BetBuilderDto.emptyBetBuilder(),
            betDetails = betDetails?.toDomain() ?: BetDetailsDto.emptyBetDetails(),
            betId = betId ?: "",
            bonus = bonus ?: "",
            buttonTitle = buttonTitle ?: "",
            matchesList = matchesList?.map { it.toDomain() } ?: emptyList(),
            placedCount = placedCount ?: "",
            potentialWinnings = potentialWinnings ?: "",
            selections = selections ?: "",
            oddsBust = oddsBust ?: "",
            oddsSum = oddsSum ?: ""
        )
    }
}