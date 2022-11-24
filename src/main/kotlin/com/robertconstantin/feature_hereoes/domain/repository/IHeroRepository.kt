package com.robertconstantin.feature_hereoes.domain.repository

import com.robertconstantin.feature_hereoes.domain.model.HeroDM

interface IHeroRepository {
    suspend fun getAllHeroes(): List<HeroDM>
}