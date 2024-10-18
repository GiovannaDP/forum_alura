package com.danelli.forum.mapper

import com.danelli.forum.dto.NovoTopicoForm
import com.danelli.forum.model.Topico
import com.danelli.forum.service.CursoService
import com.danelli.forum.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper(
                        private var cursoService: CursoService,
                        private var usuarioService: UsuarioService,
): Mapper<NovoTopicoForm, Topico> {

    override fun map(t: NovoTopicoForm): Topico {
        return Topico(
            titulo = t.titulo,
            mensagem = t.mensagem,
            curso = cursoService.buscarPorId(t.idCurso),
            autor = usuarioService.buscarPorId(t.idAutor)
        )
    }

}
