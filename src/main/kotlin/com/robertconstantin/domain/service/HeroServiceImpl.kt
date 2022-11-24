package com.robertconstantin.domain.service

import com.robertconstantin.domain.repository.IHeroRepository

class HeroServiceImpl(
    private val repository: IHeroRepository
) : IHeroService {
    override suspend fun getAllHeroes() = repository.getAllHeroes()
}