package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Mista;
import br.edu.infnet.model.tests.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MistaController {

    private static Map<Integer, Mista> mapaMista = new HashMap<>();
    private static Integer id = 1;

    public static void incluir(Mista mista) {
        mista.setId(id++);
        mapaMista.put(mista.getId(), mista);

        AppImpressao.relatorio("Inclusão da pizza de "
                + mista.getNomeDaPizza()
                + " realizada com sucesso!!!", mista);
    }

    public static Collection<Mista> obterLista() {
        return mapaMista.values();
    }

    public static void excluir(Integer id) {
        mapaMista.remove(id);
    }

    @GetMapping(value = "/mista/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", obterLista());

        return "mista/lista";
    }

    @GetMapping(value = "/mista/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        excluir(id);
        return "redirect:/mista/lista";
    }
}
