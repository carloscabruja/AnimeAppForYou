package com.robertconstantin.features.heroes.domain.service

import com.robertconstantin.feature_heroes.domain.model.HeroDM
import com.robertconstantin.feature_heroes.domain.repository.IHeroRepository

class HeroServiceImpl(private val repository: IHeroRepository): IHeroService {
    override suspend fun getAllHeroes(): List<HeroDM> {
        return repository.getAllHeroes()
    }
}