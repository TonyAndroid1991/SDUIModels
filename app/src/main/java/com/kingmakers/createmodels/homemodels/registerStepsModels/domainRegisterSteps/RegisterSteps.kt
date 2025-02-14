package com.kingmakers.createmodels.homemodels.registerStepsModels.domainRegisterSteps

import com.kingmakers.createmodels.ScreenModel
import com.kingmakers.createmodels.homePageCommonModels.Action
import com.kingmakers.createmodels.homePageCommonModels.Header

data class RegisterSteps(
    override val actions: List<Action>,
    val header: Header,
    val informationMessage: String,
    val stepsItems: List<StepsItem>
) : ScreenModel