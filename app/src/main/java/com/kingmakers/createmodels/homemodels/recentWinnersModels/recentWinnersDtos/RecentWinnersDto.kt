package com.kingmakers.createmodels.homemodels.recentWinnersModels.recentWinnersDtos

import com.kingmakers.createmodels.homePageCommonModels.Action
import com.kingmakers.createmodels.homePageCommonModels.Image

data class RecentWinnersDto(
    val actions: List<Action>?,
    val recentWinnersItems: List<RecentWinnersItemsDto>?
)