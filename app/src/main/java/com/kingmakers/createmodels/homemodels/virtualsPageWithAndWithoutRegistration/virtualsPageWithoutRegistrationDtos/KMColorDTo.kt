package com.kingmakers.createmodels.homemodels.virtualsPageWithAndWithoutRegistration.virtualsPageWithoutRegistrationDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homemodels.virtualsPageWithAndWithoutRegistration.domainVirtualsPageWithoutRegistration.KMColor

data class KMColorDTo(
    val name: String?,
    val value: String?
) : MappableToDomain<KMColor> {

    override fun toDomain(): KMColor {
        return KMColor(
            name = name.orEmpty(),
            value = value.orEmpty()
        )
    }
}