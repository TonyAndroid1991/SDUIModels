package com.kingmakers.createmodels.homemodels.quickActionsModels.quickActionsDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.Action
import com.kingmakers.createmodels.homemodels.quickActionsModels.domainQuickActions.QuickActions

data class QuickActionsDto(
    val actions: List<Action>?,
    val quickActionItems: List<QuickActionItemDto>?
) : MappableToDomain<QuickActions> {

    override fun toDomain(): QuickActions {
        return QuickActions(
            actions = actions ?: emptyList(),
            quickActionItems = quickActionItems?.map { it.toDomain() } ?: emptyList(),
        )
    }
}