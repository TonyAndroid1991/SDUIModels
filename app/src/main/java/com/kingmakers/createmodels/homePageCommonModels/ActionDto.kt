package com.kingmakers.createmodels.homePageCommonModels

import com.kingmakers.createmodels.MappableToDomain

data class ActionDto(
    val id: String?,
    val label: String?,
    val path: String?,
    val type: String?
): MappableToDomain<Action> {

    override fun toDomain(): Action {
        return Action(
            id = id.orEmpty(),
            label = label.orEmpty(),
            path = path.orEmpty(),
            type = type.orEmpty()
        )
    }

    companion object {
        fun emptyAction() = Action(
            id = "",
            label = "",
            path = "",
            type = ""
        )
    }
}