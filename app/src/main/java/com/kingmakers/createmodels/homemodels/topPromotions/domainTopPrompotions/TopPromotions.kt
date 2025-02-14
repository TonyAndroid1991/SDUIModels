package com.kingmakers.createmodels.homemodels.topPromotions.domainTopPrompotions

import com.kingmakers.createmodels.ScreenModel
import com.kingmakers.createmodels.homePageCommonModels.Action
import com.kingmakers.createmodels.homePageCommonModels.Header

data class TopPromotions(
    override val actions: List<Action>,
    val header: Header,
    val topPromotionsItems: List<TopPromotionsItem>
) : ScreenModel