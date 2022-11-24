package com.robertconstantin.feature_hereoes.data.datasource.mapper

import com.robertconstantin.feature_hereoes.data.datasource.dto.HeroDto
import com.robertconstantin.feature_hereoes.domain.model.HeroDM

fun HeroDto.toHeroDM() : HeroDM {
    return HeroDM(
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
}