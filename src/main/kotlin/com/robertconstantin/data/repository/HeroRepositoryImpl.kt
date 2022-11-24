package com.robertconstantin.data.repository

import com.robertconstantin.data.datasource.interfaces.ILocalListDatasource
import com.robertconstantin.data.datasource.mapper.toHeroDM
import com.robertconstantin.domain.model.HeroDM
import com.robertconstantin.domain.repository.IHeroRepository

class HeroRepositoryImpl(
    private val localList: ILocalListDatasource
) : IHeroRepository {
    override suspend fun getAllHeroes(): List<HeroDM> {
        return localList.getAllHeroes().map { heroDto ->
            heroDto.toHeroDM()
        }
    }

}