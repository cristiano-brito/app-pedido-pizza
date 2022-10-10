package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @GetMapping(value = "/pizza/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("listagem", pizzaService.obterLista(usuario));

        return "pizza/lista";
    }

    @GetMapping(value = "/pizza/{id}/excluir")
    public String excluir(@PathVariable Integer id) {

        pizzaService.excluir(id);

        return "redirect:/pizza/lista";
    }
}
