package com.kingmakers.createmodels.homePageCommonModels

import com.kingmakers.createmodels.MappableToDomain

data class ImageDto(
    val alt: String?,
    val imageColor: String?,
    val imageName: String?,
    val imageUrl: String?,
    val type: String?
): MappableToDomain<Image> {

    override fun toDomain(): Image {
        return Image(
            alt = alt.orEmpty(),
            imageColor = imageColor.orEmpty(),
            imageName = imageName.orEmpty(),
            imageUrl = imageUrl.orEmpty(),
            type = type.orEmpty()
        )
    }

    companion object {
        val EMPTY = Image(
            alt = "",
            imageColor = "",
            imageName = "",
            imageUrl = "",
            type = ""
        )
    }
}