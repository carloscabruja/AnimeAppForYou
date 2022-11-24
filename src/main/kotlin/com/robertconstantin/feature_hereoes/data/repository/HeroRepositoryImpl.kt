package com.robertconstantin.feature_hereoes.data.repository

import com.robertconstantin.feature_hereoes.data.datasource.interfaces.ILocalListDatasource
import com.robertconstantin.feature_hereoes.data.datasource.mapper.toHeroDM
import com.robertconstantin.feature_hereoes.domain.model.HeroDM
import com.robertconstantin.feature_hereoes.domain.repository.IHeroRepository

class HeroRepositoryImpl(
    private val localList: ILocalListDatasource
): IHeroRepository {
    override suspend fun getAllHeroes(): List<HeroDM> {
        return localList.getAllHeroes().map { heroDto ->
            heroDto.toHeroDM()
        }
    }
}