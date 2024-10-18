package com.danelli.forum.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull

data class NovoTopicoForm (
    @field:NotEmpty(message = "Título não pode ser em branco") val titulo: String,
    @field:NotEmpty(message = "Mensagem não pode ser em branco") val mensagem: String,
    @field:NotNull val idCurso: Long,
    @field:NotNull val idAutor: Long
)
