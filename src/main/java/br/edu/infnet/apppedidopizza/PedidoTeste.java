package br.edu.infnet.apppedidopizza;

import br.edu.infnet.model.domain.*;
import br.edu.infnet.model.exceptions.PedidoSemProdutosException;
import br.edu.infnet.model.exceptions.SolicitanteNuloException;
import br.edu.infnet.model.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@Order(6)
public class PedidoTeste implements ApplicationRunner {

    @Autowired
    private PedidoService pedidoService;

    @Override
    public void run(ApplicationArguments args) {

        System.out.println("##########pedido");

        try {
            Usuario usuario = new Usuario();
            usuario.setId(1);

            Solicitante solicitante = new Solicitante();
            solicitante.setId(1);

            Set<Pizza> listaPizzas = new HashSet<Pizza>();

            Doce doce1 = new Doce();
            doce1.setId(1);
            doce1.setCodPizza(123);
            Doce doce2 = new Doce();
            doce2.setId(2);
            doce2.setCodPizza(234);
            Doce doce3 = new Doce();
            doce3.setId(3);
            doce3.setCodPizza(345);
            listaPizzas.add(doce1);
            listaPizzas.add(doce2);
            listaPizzas.add(doce3);

            Pedido pedido = new Pedido(solicitante, listaPizzas);
            pedido.setDescricao("Primeiro pedido");
            pedido.setWeb(true);
            pedido.setUsuario(usuario);

            pedidoService.incluir(pedido);
        } catch (SolicitanteNuloException | PedidoSemProdutosException e) {
            e.printStackTrace();
        }
    }
}
