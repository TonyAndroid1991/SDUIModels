package com.kingmakers.createmodels.homemodels.sportsWithRegistered.domainSportsWithRegistered.domainBetBuilder

import com.kingmakers.createmodels.homePageCommonModels.Action

data class BetBuilder(
    val actions: List<Action>,
    val buttonTitle: String?,
    val date: String,
    val betDetails: List<BetDetail>,
    val match: String,
    val odds: String,
    val url: String
)
