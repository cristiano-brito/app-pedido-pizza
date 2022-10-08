package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Solicitante;
import br.edu.infnet.model.service.SolicitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SolicitanteController {

    @Autowired
    private SolicitanteService solicitanteService;

    @GetMapping(value = "/solicitante/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", solicitanteService.obterLista());

        return "solicitante/lista";
    }

    @GetMapping(value = "/solicitante")
    public String telaCadastro() {
        return "solicitante/cadastro";
    }

    @PostMapping(value = "/solicitante/incluir")
    public String incluir(Solicitante solicitante) {

        solicitanteService.incluir(solicitante);

        return "redirect:/solicitante/lista";
    }

    @GetMapping(value = "/solicitante/{id}/excluir")
    public String excluir(@PathVariable Integer id) {

        solicitanteService.excluir(id);

        return "redirect:/solicitante/lista";
    }
}
