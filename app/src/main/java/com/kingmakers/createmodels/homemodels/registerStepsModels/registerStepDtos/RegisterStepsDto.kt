package com.kingmakers.createmodels.homemodels.registerStepsModels.registerStepDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ActionDto
import com.kingmakers.createmodels.homePageCommonModels.Header
import com.kingmakers.createmodels.homePageCommonModels.HeaderDto
import com.kingmakers.createmodels.homePageCommonModels.ImageDto
import com.kingmakers.createmodels.homemodels.registerStepsModels.domainRegisterSteps.RegisterSteps

data class RegisterStepsDto(
    val actions: List<ActionDto>?,
    val header: HeaderDto?,
    val informationMessage: String?,
    val stepsItems: List<StepsItemDto>?
) : MappableToDomain<RegisterSteps> {

    override fun toDomain(): RegisterSteps {
        return RegisterSteps(
            actions = actions?.map { it.toDomain() } ?: emptyList(),
            header = header?.toDomain() ?: Header(
                "", "",
                ImageDto.EMPTY
            ),
            informationMessage = informationMessage.orEmpty(),
            stepsItems = stepsItems?.map { it.toDomain() } ?: emptyList()
        )
    }
}