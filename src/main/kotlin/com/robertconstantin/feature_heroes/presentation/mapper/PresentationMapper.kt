package com.robertconstantin.feature_heroes.presentation.mapper

import com.robertconstantin.feature_heroes.domain.model.HeroDM

fun HeroDM.toHero() = HeroDM(
    id= this.id,
    name,
    image,
    about,
    rating,
    power,
    month,
    day,
    family,
    abilities,
    natureTypes
)