package com.kingmakers.createmodels.homemodels.component

/**TODO this is the equivalent of Home-Page*/
data class Screen(
    override val id: String,
    override val analyticsId: String,
    override val component: Component
) : ScreenInterface
