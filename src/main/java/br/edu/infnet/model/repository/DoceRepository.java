package br.edu.infnet.model.repository;

import br.edu.infnet.model.domain.Doce;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface DoceRepository extends CrudRepository<Doce, Integer> {

    @Query("from Doce d where d.usuario.id =:idUsuario")
    Collection<Doce> findAll(Integer idUsuario);
}
