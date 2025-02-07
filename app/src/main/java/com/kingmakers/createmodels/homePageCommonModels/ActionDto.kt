package com.kingmakers.createmodels.homePageCommonModels

import com.kingmakers.createmodels.MappableToDomain

data class ActionDto(
    val id: String?,
    val label: String?,
    val screenId: String?,
    val type: String?
): MappableToDomain<Action> {

    override fun toDomain(): Action {
        return Action(
            id = id.orEmpty(),
            label = label.orEmpty(),
            screenId = screenId.orEmpty(),
            type = type.orEmpty()
        )
    }
}