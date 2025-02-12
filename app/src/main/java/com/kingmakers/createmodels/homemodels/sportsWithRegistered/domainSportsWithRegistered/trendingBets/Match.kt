package com.kingmakers.createmodels.homemodels.sportsWithRegistered.domainSportsWithRegistered.trendingBets

import com.kingmakers.createmodels.homePageCommonModels.Image

data class Match(
    val odds: String,
    val teamLogo: Image,
    val trendingTeamName: String,
    val matchDescription: String,
)
