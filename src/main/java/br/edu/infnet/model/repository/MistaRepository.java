package br.edu.infnet.model.repository;

import br.edu.infnet.model.domain.Mista;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface MistaRepository extends CrudRepository<Mista, Integer> {

    @Query("from Mista m where m.usuario.id =:idUsuario")
    Collection<Mista> findAll(Integer idUsuario);
}
