package br.edu.infnet.model.repository;

import br.edu.infnet.model.domain.Solicitante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitanteRepository extends CrudRepository<Solicitante, Integer> {

}
