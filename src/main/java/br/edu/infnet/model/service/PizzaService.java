package br.edu.infnet.model.service;

import br.edu.infnet.model.domain.Pizza;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

   public List<Pizza> obterLista() {

        return (List<Pizza>) pizzaRepository.findAll();
    }

    public List<Pizza> obterLista(Usuario usuario) {

        return pizzaRepository.findAll(usuario.getId());
    }

    public  void excluir(Integer id) {
        pizzaRepository.deleteById(id);
    }
}
