package com.robertconstantin.data.datasource.mapper

import com.robertconstantin.data.datasource.dto.HeroDto
import com.robertconstantin.domain.model.HeroDM

fun HeroDto.toHeroDM() : HeroDM {
    return HeroDM(
        id = this.id,
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