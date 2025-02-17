package com.kingmakers.createmodels.homemodels.HomeScreenJsonBased

import com.kingmakers.createmodels.homemodels.component.Component

data class HomeScreenJsonBased(
    val id: String,
    val analyticsId: String,
    val components: List<Component<*>>
)
