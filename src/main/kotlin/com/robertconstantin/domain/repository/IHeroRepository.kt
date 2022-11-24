package com.robertconstantin.domain.repository

import com.robertconstantin.domain.model.HeroDM

interface IHeroRepository {
    suspend fun getAllHeroes(): List<HeroDM>
}