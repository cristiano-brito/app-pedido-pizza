package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Doce;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.service.DoceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class DoceController {

    @Autowired
    private DoceService doceService;

    @GetMapping(value = "/doce/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("listagem", doceService.obterLista(usuario));

        return "doce/lista";
    }

    @GetMapping(value = "/doce")
    public String telaCadastro() {

        return "doce/cadastro";

    }

    @PostMapping(value = "/doce/incluir")
    public String incluir(Doce doce, @SessionAttribute("user") Usuario usuario) {

        doce.setUsuario(usuario);

        doceService.incluir(doce);

        return "redirect:/doce/lista";
    }

    @GetMapping(value = "/doce/{id}/excluir")
    public String excluir(@PathVariable Integer id) {

        doceService.excluir(id);

        return "redirect:/doce/lista";
    }
}
