package com.kingmakers.createmodels.homemodels.virtualsPageWithAndWithoutRegistration.virtualsPageWithoutRegistrationDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ImageDto
import com.kingmakers.createmodels.homemodels.virtualsPageWithAndWithoutRegistration.domainVirtualsPageWithoutRegistration.CardItem
import com.kingmakers.createmodels.homemodels.virtualsPageWithAndWithoutRegistration.domainVirtualsPageWithoutRegistration.KMColor

data class CardItemDto(
    val backgroundColor: KMColorDTo?,
    val buttonText: String?,
    val description: String?,
    val icon: ImageDto?,
    val title: String?
) : MappableToDomain<CardItem> {

    override fun toDomain(): CardItem {
        return CardItem(
            backgroundColor = backgroundColor?.toDomain() ?: KMColor("", ""),
            buttonText = buttonText.orEmpty(),
            description = description.orEmpty(),
            icon = icon?.toDomain() ?: ImageDto.emptyImage(),
            title = title.orEmpty()
        )
    }
}