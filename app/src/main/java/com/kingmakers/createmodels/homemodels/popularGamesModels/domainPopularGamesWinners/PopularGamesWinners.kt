package com.kingmakers.createmodels.homemodels.popularGamesModels.domainPopularGamesWinners


import com.kingmakers.createmodels.ScreenModel
import com.kingmakers.createmodels.homePageCommonModels.Action
import com.kingmakers.createmodels.homePageCommonModels.Header

data class PopularGamesWinners(
    override val actions: List<Action>,
    val header: Header,
    val winners: List<WinnersItem>
) : ScreenModel