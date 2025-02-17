package com.kingmakers.createmodels.homemodels.component

interface ScreenInterface<T> {
    val id: String
    val analyticsId: String
    val component: Component<T>
}