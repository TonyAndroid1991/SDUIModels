package com.kingmakers.createmodels.homemodels.fastAndSecurePaymentsModels.domainFastAndSecurePayments

import com.kingmakers.createmodels.homePageCommonModels.Action
import com.kingmakers.createmodels.homePageCommonModels.Header
import com.kingmakers.createmodels.homePageCommonModels.Image

data class FastAndSecurePayments(
    val actions: List<Action>,
    val header: Header,
    val images: List<Image>,
)