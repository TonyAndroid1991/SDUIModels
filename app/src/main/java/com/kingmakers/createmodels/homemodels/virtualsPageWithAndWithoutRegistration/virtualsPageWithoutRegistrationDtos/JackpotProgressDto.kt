package com.kingmakers.createmodels.homemodels.virtualsPageWithAndWithoutRegistration.virtualsPageWithoutRegistrationDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homemodels.virtualsPageWithAndWithoutRegistration.domainVirtualsPageWithoutRegistration.JackpotProgress

data class JackpotProgressDto(
    val label: String?,
    val percentage: Int?
) : MappableToDomain<JackpotProgress> {

    override fun toDomain(): JackpotProgress {
       return JackpotProgress(
           label = label.orEmpty(),
           percentage = percentage ?: 0
       )
    }
}
