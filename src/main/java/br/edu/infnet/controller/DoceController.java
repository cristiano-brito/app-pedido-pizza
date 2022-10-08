package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Doce;
import br.edu.infnet.model.service.DoceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DoceController {

    @Autowired
    private DoceService doceService;

    @GetMapping(value = "/doce/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", doceService.obterLista());

        return "doce/lista";
    }

    @GetMapping(value = "/doce")
    public String telaCadastro() {

        return "doce/cadastro";

    }

    @PostMapping(value = "/doce/incluir")
    public String incluir(Doce doce) {

        doceService.incluir(doce);

        return "redirect:/doce/lista";
    }

    @GetMapping(value = "/doce/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        doceService.excluir(id);

        return "redirect:/doce/lista";
    }
}
