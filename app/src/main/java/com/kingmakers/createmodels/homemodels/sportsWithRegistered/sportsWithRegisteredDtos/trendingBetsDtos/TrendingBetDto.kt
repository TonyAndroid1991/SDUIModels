package com.kingmakers.createmodels.homemodels.sportsWithRegistered.sportsWithRegisteredDtos.trendingBetsDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ActionDto
import com.kingmakers.createmodels.homePageCommonModels.ImageDto
import com.kingmakers.createmodels.homemodels.sportsWithRegistered.domainSportsWithRegistered.trendingBets.TrendingBet

data class TrendingBetDto(
    val actions: List<ActionDto>?,
    val betDetails: BetDetailsDto?,
    val betId: String?,
    val bonus: String?,
    val buttonTitle: String?,
    val copyIcon: ImageDto?,
    val matchesList: List<MatchDto>?,
    val placedCount: String?,
    val placedCountIcon: ImageDto?,
    val potentialWinnings: String?
) : MappableToDomain<TrendingBet> {

    override fun toDomain(): TrendingBet {
        return TrendingBet(
            actions = actions?.map { it.toDomain() } ?: emptyList(),
            betDetails = betDetails?.toDomain() ?: BetDetailsDto.emptyBetDetails(),
            betId = betId ?: "",
            bonus = bonus ?: "",
            buttonTitle = buttonTitle ?: "",
            copyIcon = copyIcon?.toDomain() ?: ImageDto.emptyImage(),
            matchesList = matchesList?.map { it.toDomain() } ?: emptyList(),
            placedCount = placedCount ?: "",
            placedCountIcon = placedCountIcon?.toDomain() ?: ImageDto.emptyImage(),
            potentialWinnings = potentialWinnings ?: "",
        )
    }
}