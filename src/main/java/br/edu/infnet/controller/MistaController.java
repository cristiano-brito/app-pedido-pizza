package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Mista;
import br.edu.infnet.model.service.MistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MistaController {

    @Autowired
    private MistaService mistaService;

    @GetMapping(value = "/mista/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", mistaService.obterLista());

        return "mista/lista";
    }

    @GetMapping(value = "/mista")
    public String telaCadastro() {

        return "mista/cadastro";

    }

    @PostMapping(value = "/mista/incluir")
    public String incluir(Mista mista) {

        mistaService.incluir(mista);

        return "redirect:/mista/lista";
    }

    @GetMapping(value = "/mista/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        mistaService.excluir(id);

        return "redirect:/mista/lista";
    }
}
