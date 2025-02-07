package com.kingmakers.createmodels.homemodels.topPromotions.domainTopPrompotions

import com.kingmakers.createmodels.homePageCommonModels.Action
import com.kingmakers.createmodels.homePageCommonModels.Header

data class TopPromotions(
    val actions: List<Action>,
    val header: Header,
    val topPromotionsItems: List<TopPromotionsItem>
)