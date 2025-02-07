package com.kingmakers.createmodels.homemodels.popularGamesModels.popularGamesWinnersDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.Image
import com.kingmakers.createmodels.homemodels.popularGamesModels.domainPopularGamesWinners.WinnersItem
import com.kingmakers.createmodels.homePageCommonModels.ImageDto

data class WinnersItemDto(
    val amount: String?,
    val date: String?,
    val gameImage: ImageDto?,
    val userName: String?
): MappableToDomain<WinnersItem> {

    override fun toDomain(): WinnersItem {
        return WinnersItem(
            amount = amount.orEmpty(),
            date = date.orEmpty(),
            gameImage = gameImage?.toDomain() ?: ImageDto.EMPTY,
            userName = userName.orEmpty()
        )
    }
}