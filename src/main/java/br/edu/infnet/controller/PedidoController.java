package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Pedido;
import br.edu.infnet.model.tests.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PedidoController {

    private static Map<Integer, Pedido> mapaPedido = new HashMap<>();
    private static Integer id = 1;

    public static void incluir(Pedido pedido) {
        pedido.setId(id++);
        mapaPedido.put(pedido.getId(), pedido);

        AppImpressao.relatorio("Inclusão de "
                + pedido.getDescricao()
                + " realizada com sucesso!!!", pedido);
    }

    public static Collection<Pedido> obterLista() {
        return mapaPedido.values();
    }

    public static void excluir(Integer id) {
        mapaPedido.remove(id);
    }

    @GetMapping(value = "/pedido/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", obterLista());
        return "pedido/lista";
    }

    @GetMapping(value = "/pedido/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        excluir(id);
        return "redirect:/pedido/lista";
    }
}
