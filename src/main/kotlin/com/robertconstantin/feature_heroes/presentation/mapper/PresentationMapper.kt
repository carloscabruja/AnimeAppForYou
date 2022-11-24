package com.robertconstantin.feature_heroes.presentation.mapper

import com.robertconstantin.feature_heroes.domain.model.HeroDM
import com.robertconstantin.feature_heroes.presentation.model.Hero

fun HeroDM.toHero() = Hero(
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