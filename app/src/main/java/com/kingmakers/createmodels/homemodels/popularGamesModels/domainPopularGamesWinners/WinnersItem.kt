package com.kingmakers.createmodels.homemodels.popularGamesModels.domainPopularGamesWinners

import com.kingmakers.createmodels.homePageCommonModels.Image

data class WinnersItem(
    val amount: String,
    val date: String,
    val gameImage: Image,
    val userName: String
)