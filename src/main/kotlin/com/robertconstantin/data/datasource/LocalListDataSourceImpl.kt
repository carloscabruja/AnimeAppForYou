package com.robertconstantin.data.datasource

import com.robertconstantin.data.HeroList
import com.robertconstantin.data.datasource.dto.HeroDto
import com.robertconstantin.data.datasource.interfaces.ILocalListDatasource

class LocalListDataSourceImpl(
    private val localList: HeroList
) : ILocalListDatasource {
    override suspend fun getAllHeroes(): List<HeroDto> {
        return localList.listOfHeroes
    }

}