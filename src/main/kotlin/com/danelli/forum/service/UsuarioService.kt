package com.danelli.forum.service

import com.danelli.forum.model.Curso
import com.danelli.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService(private var usuarios: List<Usuario>) {

    init {
        val usuario = Usuario(
            id = 1,
            nome = "Ana da Silva",
            email = "ana@email.com.br"
        )
        usuarios = Arrays.asList(usuario)
    }

    fun buscarPorId(id: Long): Usuario {
        return usuarios.stream().filter { u ->
            u.id == id
        }.findFirst().get()
    }
}
