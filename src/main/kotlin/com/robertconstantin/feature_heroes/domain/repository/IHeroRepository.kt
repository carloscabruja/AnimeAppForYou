package com.robertconstantin.feature_heroes.domain.repository

import com.robertconstantin.feature_heroes.domain.model.HeroDM

interface IHeroRepository {
    suspend fun getAllHeroes(): List<HeroDM>
}