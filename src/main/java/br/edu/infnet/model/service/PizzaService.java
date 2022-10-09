package br.edu.infnet.model.service;

import br.edu.infnet.model.domain.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PizzaService {

    @Autowired
    private DoceService doceService;
    @Autowired
    private MistaService mistaService;
    @Autowired
    private SalgadaService salgadaService;

    public List<Pizza> obterLista() {

        List<Pizza> pizzas = new ArrayList<>();

        pizzas.addAll(doceService.obterLista());

        pizzas.addAll(mistaService.obterLista());

        pizzas.addAll(salgadaService.obterLista());

        return pizzas;
    }
}
