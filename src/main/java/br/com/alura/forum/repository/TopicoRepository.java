package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

//    O Spring gera a query automaticamente a partir do nome do método que contem os atributos que deseja buscar
    Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);

//    Criar a query manualmente e utilizar o nome que quiser no método
//    @Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
//    List<Topico> buscaPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);
}
