package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Solicitante;
import br.edu.infnet.model.tests.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class SolicitanteController {

    private static Map<Integer, Solicitante> mapaSolicitante = new HashMap<>();
    private static Integer id = 1;

    public static void incluir(Solicitante solicitante) {
        solicitante.setId(id++);
        mapaSolicitante.put(solicitante.getId(), solicitante);

        AppImpressao.relatorio("Inclusão de solicitante "
                + solicitante.getNome()
                + " realizada com sucesso!!!", solicitante);
    }

    public static Collection<Solicitante> obterLista() {
        return mapaSolicitante.values();
    }

    public static void excluir(Integer id) {
        mapaSolicitante.remove(id);
    }

    @GetMapping(value = "/solicitante/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", obterLista());
        return "solicitante/lista";
    }

    @GetMapping(value = "/solicitante/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        excluir(id);
        return "redirect:/solicitante/lista";
    }
}
