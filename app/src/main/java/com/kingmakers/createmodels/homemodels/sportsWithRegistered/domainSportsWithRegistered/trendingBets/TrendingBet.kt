package com.kingmakers.createmodels.homemodels.sportsWithRegistered.domainSportsWithRegistered.trendingBets

import com.kingmakers.createmodels.homePageCommonModels.Action
import com.kingmakers.createmodels.homemodels.sportsWithRegistered.domainSportsWithRegistered.domainBetBuilder.BetBuilder

data class TrendingBet(
    val actions: List<Action>,
    val betBuilder: BetBuilder,
    val betDetails: BetDetails,
    val betId: String,
    val bonus: String,
    val buttonTitle: String,
    val matchesList: List<Match>,
    val oddsBust: String,
    val oddsSum: String,
    val placedCount: String,
    val potentialWinnings: String,
    val selections: String
)
