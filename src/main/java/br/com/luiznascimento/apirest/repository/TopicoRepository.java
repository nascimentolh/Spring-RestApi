package br.com.luiznascimento.apirest.repository;

import br.com.luiznascimento.apirest.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    List<Topico> findByCursoNome(String nomeCurso);
}
