package br.com.luiznascimento.apirest.repository;

import br.com.luiznascimento.apirest.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    Curso findByNome(String nome);

}
