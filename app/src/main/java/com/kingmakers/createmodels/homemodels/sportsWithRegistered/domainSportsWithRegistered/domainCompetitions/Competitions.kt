package com.kingmakers.createmodels.homemodels.sportsWithRegistered.domainSportsWithRegistered.domainCompetitions

import com.kingmakers.createmodels.homePageCommonModels.Action
import com.kingmakers.createmodels.homePageCommonModels.Image

data class Competitions(
    val actions: List<Action>,
    val buttonTitle: String,
    val icon: Image,
    val name: String,
    val url: String
)