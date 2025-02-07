package com.kingmakers.createmodels.homemodels.sportsWithoutRegistered.domainSportsWithoutRegistered

import com.kingmakers.createmodels.homePageCommonModels.Action
import com.kingmakers.createmodels.homePageCommonModels.Header

data class SportsWithoutRegistered(
    val actions: List<Action>,
    val header: Header,
    val sportsItems: List<SportItem>
)
