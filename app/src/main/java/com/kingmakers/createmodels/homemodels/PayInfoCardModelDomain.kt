package com.kingmakers.createmodels.homemodels

/**TODO este objeto debe tener su dto y tenemos que tener una function que lo convierta a domain*/
data class PayInfoCardModelDomain(
    val header: Header,
    val items: List<Items>,/**TODO Items se pueden llamar Images, ver si nombrarlo distinto*/
    override val actionsList: List<Actions>,
) : ActionableEntity