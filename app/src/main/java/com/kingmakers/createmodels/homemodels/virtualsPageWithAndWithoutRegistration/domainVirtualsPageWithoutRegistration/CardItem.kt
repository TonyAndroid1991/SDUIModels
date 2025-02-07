package com.kingmakers.createmodels.homemodels.virtualsPageWithAndWithoutRegistration.domainVirtualsPageWithoutRegistration

import com.kingmakers.createmodels.homePageCommonModels.Image

data class CardItem(
    val backgroundColor: KMColor,
    val buttonText: String,
    val description: String,
    val icon: Image,
    val title: String
)
