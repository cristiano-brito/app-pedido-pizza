package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Doce;
import br.edu.infnet.model.tests.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DoceController {

    private static Map<Integer, Doce> mapaDoce = new HashMap<>();
    private static Integer id = 1;

    public static void incluir(Doce doce) {
        doce.setId(id++);
        mapaDoce.put(doce.getId(), doce);

        AppImpressao.relatorio("Inclusão da pizza de "
                + doce.getNomeDaPizza()
                + " realizada com sucesso!!!", doce);
    }

    public static Collection<Doce> obterLista() {
        return mapaDoce.values();
    }

    public static void excluir(Integer id) {
        mapaDoce.remove(id);
    }

    @GetMapping(value = "/doce/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", obterLista());

        return "doce/lista";
    }
@GetMapping(value = "/doce/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        excluir(id);
        return "redirect:/doce/lista";
    }
}
