package edu.unisabana.graphql.controller

import edu.unisabana.graphql.model.NotasDTO
import edu.unisabana.graphql.service.NotasService
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class NotasController(
    private val notasService: NotasService
) {

    @QueryMapping
    fun getAllNotas(): List<NotasDTO> = notasService.findAll()

    @QueryMapping
    fun nota(@Argument id: Long): NotasDTO = notasService.get(id)

    @QueryMapping
    fun notasByMateria(@Argument materiaId: Long): List<NotasDTO> = notasService.notasByMateria(materiaId)

    @QueryMapping
    fun notasByHobby(@Argument hobbyId: Int): List<NotasDTO> = notasService.notasByHobby(hobbyId)
}