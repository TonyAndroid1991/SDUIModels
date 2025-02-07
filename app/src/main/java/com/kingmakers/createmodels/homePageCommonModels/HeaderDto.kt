package com.kingmakers.createmodels.homePageCommonModels

import com.kingmakers.createmodels.MappableToDomain

data class HeaderDto(
    val description: String?,
    val title: String?,
    val image: ImageDto?,
    val subtitle: String?
): MappableToDomain<Header> {

    override fun toDomain(): Header {
        return Header(
            description = description.orEmpty(),
            title = title.orEmpty(),
            image = image?.toDomain() ?: ImageDto.emptyImage(),
            subtitle = subtitle.orEmpty()
        )
    }

    companion object {
        fun emptyHeader() = Header(
            description = "",
            title = "",
            image = ImageDto.emptyImage(),
            subtitle = ""
        )
    }
}