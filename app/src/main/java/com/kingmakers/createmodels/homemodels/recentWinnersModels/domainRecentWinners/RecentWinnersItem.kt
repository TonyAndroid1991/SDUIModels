package com.kingmakers.createmodels.homemodels.recentWinnersModels.domainRecentWinners

import com.kingmakers.createmodels.homePageCommonModels.Image

data class RecentWinnersItem(
    val attributedText: String,
    val badgeImage: Image,
    val badgeText: String,
    val gameImage: Image
)