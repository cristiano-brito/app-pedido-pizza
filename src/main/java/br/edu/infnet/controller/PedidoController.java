package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.service.PedidoService;
import br.edu.infnet.model.service.PizzaService;
import br.edu.infnet.model.service.SolicitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private SolicitanteService solicitanteService;
    @Autowired
    private PizzaService pizzaService;

    @GetMapping(value = "/pedido")
    public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("solicitantes", solicitanteService.obterLista(usuario));
        model.addAttribute("pizzas", pizzaService.obterLista(usuario));

        return "pedido/cadastro";
    }

    @GetMapping(value = "/pedido/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", pedidoService.obterLista());

        return "pedido/lista";
    }

    @PostMapping(value = "/pedido/incluir")
    public String Incluir() {

        /*pedidoService.incluir(pedido);*/

        return "redirect:/pedido/lista";
    }

    @GetMapping(value = "/pedido/{id}/excluir")
    public String excluir(@PathVariable Integer id) {

        pedidoService.excluir(id);

        return "redirect:/pedido/lista";
    }
}
