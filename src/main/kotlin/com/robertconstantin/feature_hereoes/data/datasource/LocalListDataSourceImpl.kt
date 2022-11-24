package com.robertconstantin.feature_hereoes.data.datasource

import com.robertconstantin.feature_hereoes.data.HeroList
import com.robertconstantin.feature_hereoes.data.datasource.dto.HeroDto
import com.robertconstantin.feature_hereoes.data.datasource.interfaces.ILocalListDatasource

class LocalListDataSourceImpl(
    private val localList: HeroList
): ILocalListDatasource {
    override suspend fun getAllHeroes(): List<HeroDto> {
        return localList.listOfHeroes
    }
}