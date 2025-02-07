package com.kingmakers.createmodels.homemodels.recentWinnersModels.domainRecentWinners

import com.kingmakers.createmodels.homePageCommonModels.Action

data class RecentWinners(
    val actions: List<Action>,
    val recentWinnersItems: List<RecentWinnersItem>
)