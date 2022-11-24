package com.robertconstantin.data.datasource.interfaces

import com.robertconstantin.data.datasource.dto.HeroDto

interface ILocalListDatasource {
    suspend fun getAllHeroes(): List<HeroDto>
}