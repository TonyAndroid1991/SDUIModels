package com.kingmakers.createmodels.homemodels.recentWinWithRegistration.recentWinWithRegistration.domainRecentWinWithRegistration

import com.kingmakers.createmodels.ScreenModel
import com.kingmakers.createmodels.homePageCommonModels.Action
import com.kingmakers.createmodels.homePageCommonModels.Header

data class RecentWinWithRegistration(
    override val actions: List<Action>,
    val header: Header,
    val recentWinItems: List<RecentWinItem>
) : ScreenModel
