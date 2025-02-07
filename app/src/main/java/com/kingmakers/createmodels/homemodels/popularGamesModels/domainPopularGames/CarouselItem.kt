package com.kingmakers.createmodels.homemodels.popularGamesModels.domainPopularGames

import com.kingmakers.createmodels.homePageCommonModels.Image

data class CarouselItem(
    val activeUsers: String,
    val icon: Image,
    val image: Image,
    val position: String
)