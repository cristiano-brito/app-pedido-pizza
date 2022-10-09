package br.edu.infnet.model.repository;

import br.edu.infnet.model.domain.Mista;
import br.edu.infnet.model.domain.Solicitante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MistaRepository extends CrudRepository<Mista, Integer> {

}
