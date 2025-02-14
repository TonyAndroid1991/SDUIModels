package com.kingmakers.createmodels.homemodels.quickActionsModels.domainQuickActions

import com.kingmakers.createmodels.ScreenModel
import com.kingmakers.createmodels.homePageCommonModels.Action

data class QuickActions(
    override val actions: List<Action>,
    val quickActionItems: List<QuickActionItem>
) : ScreenModel