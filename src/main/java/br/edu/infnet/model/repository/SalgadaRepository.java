package br.edu.infnet.model.repository;

import br.edu.infnet.model.domain.Salgada;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface SalgadaRepository extends CrudRepository<Salgada, Integer> {

    @Query("from Salgada s where s.usuario.id=:idUsuario")
    Collection<Salgada> findAll(Integer idUsuario);
}
