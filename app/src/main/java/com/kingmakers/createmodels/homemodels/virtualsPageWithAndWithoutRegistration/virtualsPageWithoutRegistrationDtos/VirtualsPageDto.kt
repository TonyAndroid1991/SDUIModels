package com.kingmakers.createmodels.homemodels.virtualsPageWithAndWithoutRegistration.virtualsPageWithoutRegistrationDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.ActionDto
import com.kingmakers.createmodels.homePageCommonModels.Header
import com.kingmakers.createmodels.homePageCommonModels.HeaderDto
import com.kingmakers.createmodels.homePageCommonModels.ImageDto
import com.kingmakers.createmodels.homemodels.virtualsPageWithAndWithoutRegistration.domainVirtualsPageWithoutRegistration.JackpotInfoCard
import com.kingmakers.createmodels.homemodels.virtualsPageWithAndWithoutRegistration.domainVirtualsPageWithoutRegistration.JackpotProgress
import com.kingmakers.createmodels.homemodels.virtualsPageWithAndWithoutRegistration.domainVirtualsPageWithoutRegistration.VirtualsPage

data class VirtualsPageDto(
    val actions: List<ActionDto>?,
    val cards: List<CardItemDto>?,
    val header: HeaderDto?,
    val jackpotInfoCard: JackpotInfoCardDto?
) : MappableToDomain<VirtualsPage> {

    override fun toDomain(): VirtualsPage {
        return VirtualsPage(
            actions = actions?.map { it.toDomain() } ?: emptyList(),
            cards = cards?.map { it.toDomain() } ?: emptyList(),
            header = header?.toDomain() ?: HeaderDto.emptyHeader(),
            jackpotInfoCard = jackpotInfoCard?.toDomain() ?: JackpotInfoCard(
                "",
                "",
                ImageDto.emptyImage(),
                JackpotProgress("", 0),
                ""
            )
        )
    }
}