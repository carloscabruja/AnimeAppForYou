package com.robertconstantin.feature_heroes.data.repository

import com.robertconstantin.feature_heroes.data.datasource.interfaces.ILocalListDatasource
import com.robertconstantin.feature_heroes.data.datasource.mapper.toHeroDM
import com.robertconstantin.feature_heroes.domain.model.HeroDM
import com.robertconstantin.feature_heroes.domain.repository.IHeroRepository

class HeroRepositoryImpl(
    private val localList: ILocalListDatasource
): IHeroRepository {
    override suspend fun getAllHeroes(): List<HeroDM> {
        return localList.getAllHeroes().map { heroDto ->
            heroDto.toHeroDM()
        }
    }
}