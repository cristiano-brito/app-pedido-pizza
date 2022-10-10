package br.edu.infnet.model.repository;

import br.edu.infnet.model.domain.Doce;
import br.edu.infnet.model.domain.Pedido;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Integer> {

    @Query("from Pedido p where p.usuario.id =:idUsuario")
    Collection<Pedido> findAll(Integer idUsuario);
}
