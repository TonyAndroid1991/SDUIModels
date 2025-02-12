package com.kingmakers.createmodels.homemodels.sportsWithRegistered.sportsWithRegisteredDtos.optionsDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homemodels.sportsWithRegistered.domainSportsWithRegistered.options.TabOption

data class TabOptionDto(
    val id: String?,
    val icon: String?,
    val text: String?,
    val componentId: String?
) : MappableToDomain<TabOption> {

    override fun toDomain(): TabOption {
        return TabOption(
            id = id ?: "",
            icon = icon ?: "",
            text = text ?: "",
            componentId = componentId ?: ""
        )
    }
}
