package com.kingmakers.createmodels.homemodels.sportsWithRegistered.sportsWithRegisteredDtos.trendingBetsDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homemodels.sportsWithRegistered.domainSportsWithRegistered.trendingBets.BetDetails

data class BetDetailsDto(
    val stake: String?,
    val win: String?
) : MappableToDomain<BetDetails> {

    override fun toDomain(): BetDetails {
        return BetDetails(
            stake = stake ?: "",
            win = win ?: ""
        )
    }

    companion object {
        fun emptyBetDetails() = BetDetails(
            stake = "",
            win = ""
        )
    }
}
