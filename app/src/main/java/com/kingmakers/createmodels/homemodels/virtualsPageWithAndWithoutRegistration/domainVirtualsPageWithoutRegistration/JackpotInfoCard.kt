package com.kingmakers.createmodels.homemodels.virtualsPageWithAndWithoutRegistration.domainVirtualsPageWithoutRegistration

import com.kingmakers.createmodels.homePageCommonModels.Image

data class JackpotInfoCard(
    val amount: String,
    val description: String,
    val icon: Image,
    val jackpotProgressDto: JackpotProgress,
    val title: String
)