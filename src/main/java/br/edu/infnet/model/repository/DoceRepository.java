package br.edu.infnet.model.repository;

import br.edu.infnet.model.domain.Doce;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoceRepository extends CrudRepository<Doce, Integer> {

}
