package com.kingmakers.createmodels.homemodels.quickActionsModels.domainQuickActions

import com.kingmakers.createmodels.homePageCommonModels.Action
import com.kingmakers.createmodels.homemodels.quickActionsModels.quickActionsDtos.QuickActionItemDto

data class QuickActions(
    val actions: List<Action>,
    val quickActionItems: List<QuickActionItem>
)