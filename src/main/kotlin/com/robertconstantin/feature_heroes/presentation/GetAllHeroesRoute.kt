package com.robertconstantin.feature_heroes.presentation

import com.robertconstantin.feature_heroes.presentation.mapper.toHero
import com.robertconstantin.feature_heroes.presentation.util.PresentationConsts.GET_ALL_HEROES
import com.robertconstantin.features.heroes.domain.service.IHeroService
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getAllHeroes(
    heroService: IHeroService,
) {
    get(GET_ALL_HEROES) {
        heroService.getAllHeroes().map{
            it.toHero()
        } .also { heroList ->
            if (heroList.isEmpty()){
                call.respond(
                    status = HttpStatusCode.OK,
                    message = emptyList<Unit>()
                )

                return@get
            }

            call.respond(
                status = HttpStatusCode.OK,
                message = heroList
            )
        }
    }
}