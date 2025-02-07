package com.kingmakers.createmodels.homemodels.virtualsPageWithAndWithoutRegistration.virtualsPageWithoutRegistrationDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ImageDto
import com.kingmakers.createmodels.homemodels.virtualsPageWithAndWithoutRegistration.domainVirtualsPageWithoutRegistration.JackpotInfoCard
import com.kingmakers.createmodels.homemodels.virtualsPageWithAndWithoutRegistration.domainVirtualsPageWithoutRegistration.JackpotProgress

data class JackpotInfoCardDto(
    val amount: String?,
    val description: String?,
    val icon: ImageDto?,
    val jackpotProgressDto: JackpotProgressDto?,
    val title: String?
) : MappableToDomain<JackpotInfoCard> {

    override fun toDomain(): JackpotInfoCard {
        return JackpotInfoCard(
            amount = amount.orEmpty(),
            description = description.orEmpty(),
            icon = icon?.toDomain() ?: ImageDto.emptyImage(),
            jackpotProgressDto = jackpotProgressDto?.toDomain() ?: JackpotProgress("", 0),
            title = title.orEmpty()
        )
    }
}
