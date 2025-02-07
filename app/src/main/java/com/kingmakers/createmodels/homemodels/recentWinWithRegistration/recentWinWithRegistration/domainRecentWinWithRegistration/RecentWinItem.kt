package com.kingmakers.createmodels.homemodels.recentWinWithRegistration.recentWinWithRegistration.domainRecentWinWithRegistration

import com.kingmakers.createmodels.homePageCommonModels.Image

data class RecentWinItem(
    val amount: String,
    val badge: Badge,
    val date: String,
    val gameImage: Image
)
