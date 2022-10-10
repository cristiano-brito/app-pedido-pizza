package br.edu.infnet.model.repository;

import br.edu.infnet.model.domain.Doce;
import br.edu.infnet.model.domain.Pizza;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface PizzaRepository extends CrudRepository<Pizza, Integer> {

    @Query("from Pizza p where p.usuario.id =:idUsuario")
    List<Pizza> findAll(Integer idUsuario);
}
