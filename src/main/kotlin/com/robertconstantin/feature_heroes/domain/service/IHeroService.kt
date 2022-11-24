package com.robertconstantin.features.heroes.domain.service

import com.robertconstantin.feature_heroes.domain.model.HeroDM

interface IHeroService {
    suspend fun getAllHeroes(): List<HeroDM>
}