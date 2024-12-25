package com.shuvo6904.composepaging3cachingcleanarchitecture.data.mappers

import com.shuvo6904.composepaging3cachingcleanarchitecture.data.local.BeerEntity
import com.shuvo6904.composepaging3cachingcleanarchitecture.data.remote.BeerDto
import com.shuvo6904.composepaging3cachingcleanarchitecture.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}