package com.kingmakers.createmodels.homemodels.virtualsPageWithAndWithoutRegistration.domainVirtualsPageWithoutRegistration

import com.kingmakers.createmodels.homePageCommonModels.Action
import com.kingmakers.createmodels.homePageCommonModels.Header

data class VirtualsPage(
    val actions: List<Action>,
    val cards: List<CardItem>,
    val header: Header,
    val jackpotInfoCard: JackpotInfoCard
)
