package com.kingmakers.createmodels.homemodels.virtualsPageWithAndWithoutRegistration.domainVirtualsPageWithoutRegistration

import com.kingmakers.createmodels.ScreenModel
import com.kingmakers.createmodels.homePageCommonModels.Action
import com.kingmakers.createmodels.homePageCommonModels.Header

data class VirtualsPage(
    override val actions: List<Action>,
    val cards: List<CardItem>,
    val header: Header,
    val jackpotInfoCard: JackpotInfoCard
) : ScreenModel
