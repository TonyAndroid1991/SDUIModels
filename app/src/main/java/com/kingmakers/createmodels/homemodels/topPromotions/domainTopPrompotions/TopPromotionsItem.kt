package com.kingmakers.createmodels.homemodels.topPromotions.domainTopPrompotions

import com.kingmakers.createmodels.homePageCommonModels.Image

data class TopPromotionsItem(
    val description: String,
    val id: String,
    val image: Image,
    val title: String
)