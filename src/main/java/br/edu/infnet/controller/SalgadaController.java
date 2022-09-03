package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Salgada;
import br.edu.infnet.model.tests.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class SalgadaController {

    private static Map<Integer, Salgada> mapaSalgada = new HashMap<>();
    private static Integer id = 1;

    public static void incluir(Salgada salgada) {
        salgada.setId(id++);
        mapaSalgada.put(salgada.getId(), salgada);

        AppImpressao.relatorio("Inclusão da pizza de "
                + salgada.getNomeDaPizza()
                + " realizada com sucesso!!!", salgada);
    }

    public static Collection<Salgada> obterLista() {
        return mapaSalgada.values();
    }

    public static void excluir(Integer id) {
        mapaSalgada.remove(id);
    }

    @GetMapping(value = "/salgada/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", obterLista());
        return "salgada/lista";
    }

    @GetMapping(value = "/salgada/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        excluir(id);
        return "redirect:/salgada/lista";
    }
}
