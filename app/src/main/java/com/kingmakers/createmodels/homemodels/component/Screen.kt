package com.kingmakers.createmodels.homemodels.component

data class Screen<T>(
    override val id: String,
    override val analyticsId: String,
    override val component: Component<T>
) : ScreenInterface<T>
