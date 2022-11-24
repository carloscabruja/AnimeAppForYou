package com.robertconstantin.feature_hereoes.data.datasource.interfaces

import com.robertconstantin.feature_hereoes.data.datasource.dto.HeroDto

interface ILocalListDatasource {
    suspend fun getAllHeroes(): List<HeroDto>
}