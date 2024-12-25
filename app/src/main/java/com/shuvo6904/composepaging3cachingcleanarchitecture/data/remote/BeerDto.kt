package com.shuvo6904.composepaging3cachingcleanarchitecture.data.remote

data class BeerDto(
    val id: Int,
    val name: String,
    val tagline: String,
    val description: String,
    val first_brewed: String,
    val image_url: String?
)