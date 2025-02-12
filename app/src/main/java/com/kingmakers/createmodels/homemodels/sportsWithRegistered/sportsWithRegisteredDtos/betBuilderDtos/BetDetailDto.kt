package com.kingmakers.createmodels.homemodels.sportsWithRegistered.sportsWithRegisteredDtos.betBuilderDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homemodels.sportsWithRegistered.domainSportsWithRegistered.domainBetBuilder.BetDetail

data class BetDetailDto(
    val firstCondition: String?,
    val secondConditions: String?,
    val thirdCondition: String?
) : MappableToDomain<BetDetail> {

    override fun toDomain(): BetDetail {
        return BetDetail(
            firstCondition = firstCondition ?: "",
            secondConditions = secondConditions ?: "",
            thirdCondition = thirdCondition ?: ""
        )
    }
}
