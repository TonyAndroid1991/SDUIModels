package com.kingmakers.createmodels.homemodels.fastAndSecurePaymentsModels.fastAndSecurePaymentsDtos

import com.kingmakers.createmodels.MappableToDomain
import com.kingmakers.createmodels.homePageCommonModels.Action
import com.kingmakers.createmodels.homePageCommonModels.Header
import com.kingmakers.createmodels.homePageCommonModels.HeaderDto
import com.kingmakers.createmodels.homePageCommonModels.Image
import com.kingmakers.createmodels.homemodels.fastAndSecurePaymentsModels.domainFastAndSecurePayments.FastAndSecurePayments

data class FastAndSecurePaymentsDto(
    val actions: List<Action>?,
    val header: Header?,
    val images: List<Image>?,
): MappableToDomain<FastAndSecurePayments> {
    override fun toDomain(): FastAndSecurePayments {
        return FastAndSecurePayments(
            actions = actions ?: emptyList(),
            header = header ?: HeaderDto.emptyHeader(),
            images = images ?: emptyList(),
        )
    }
}