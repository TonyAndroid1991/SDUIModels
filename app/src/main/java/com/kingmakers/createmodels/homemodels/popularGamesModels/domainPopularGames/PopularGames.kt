package com.kingmakers.createmodels.homemodels.popularGamesModels.domainPopularGames

import com.kingmakers.createmodels.homePageCommonModels.Action
import com.kingmakers.createmodels.homePageCommonModels.Header

data class PopularGames(
    val actions: List<Action>,
    val carouselItems: List<CarouselItem>,
    val header: Header
)