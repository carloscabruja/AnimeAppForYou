package com.robertconstantin.domain.service

import com.robertconstantin.domain.model.HeroDM

interface IHeroService {
    suspend fun getAllHeroes(): List<HeroDM>
}