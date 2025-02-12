package com.kingmakers.createmodels.homemodels.sportsWithRegistered.domainSportsWithRegistered.trendingBets

import com.kingmakers.createmodels.homePageCommonModels.Action
import com.kingmakers.createmodels.homePageCommonModels.Image

data class TrendingBet(
    val actions: List<Action>,
    val betDetails: BetDetails,
    val betId: String,
    val bonus: String,
    val buttonTitle: String,
    val copyIcon: Image,
    val matchesList: List<Match>,
    val placedCount: String,
    val placedCountIcon: Image,
    val potentialWinnings: String
)
