package com.kingmakers.createmodels.homemodels.sportsWithRegistered.domainSportsWithRegistered.domainSports

import com.kingmakers.createmodels.ScreenModel
import com.kingmakers.createmodels.homePageCommonModels.Action
import com.kingmakers.createmodels.homePageCommonModels.Image

data class Sports(
    override val actions: List<Action>,
    val buttonTitle: String,
    val icon: Image,
    val name: String,
    val url: String
) : ScreenModel
