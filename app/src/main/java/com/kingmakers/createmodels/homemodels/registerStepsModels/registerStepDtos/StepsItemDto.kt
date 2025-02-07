package com.kingmakers.createmodels.homemodels.registerStepsModels.registerStepDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homemodels.registerStepsModels.domainRegisterSteps.StepsItem

data class StepsItemDto(
    val isCompleted: Boolean?,
    val title: String?
) : MappableToDomain<StepsItem> {

    override fun toDomain(): StepsItem {
        return StepsItem(
            isCompleted = isCompleted ?: false,
            title = title.orEmpty()
        )
    }
}