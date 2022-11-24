package com.robertconstantin.feature_heroes.data.datasource.interfaces

import com.robertconstantin.feature_heroes.data.datasource.dto.HeroDto

interface ILocalListDatasource {
    suspend fun getAllHeroes(): List<HeroDto>
}