package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Salgada;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.service.SalgadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class SalgadaController {

    @Autowired
    private SalgadaService salgadaService;

    @GetMapping(value = "/salgada/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("listagem", salgadaService.obterLista(usuario));

        return "salgada/lista";
    }

    @GetMapping(value = "/salgada")
    public String telaCadastro() {

        return "salgada/cadastro";

    }

    @PostMapping(value = "/salgada/incluir")
    public String incluir(Salgada salgada, @SessionAttribute("user") Usuario usuario) {

        salgada.setUsuario(usuario);

        salgadaService.incluir(salgada);

        return "redirect:/salgada/lista";
    }

    @GetMapping(value = "/salgada/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        salgadaService.excluir(id);

        return "redirect:/salgada/lista";
    }
}
