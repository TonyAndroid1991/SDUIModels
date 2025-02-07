package com.kingmakers.createmodels.homePageCommonModels

import com.kingmakers.createmodels.MappableToDomain


data class HeaderDto(
    val description: String?,
    val title: String?,
    val image: ImageDto?
): MappableToDomain<Header> {

    override fun toDomain(): Header {
        return Header(
            description = description.orEmpty(),
            title = title.orEmpty(),
            image = image?.toDomain() ?: ImageDto.EMPTY
        )
    }
}