package br.edu.infnet.apppedidopizza;

import br.edu.infnet.controller.PedidoController;
import br.edu.infnet.model.domain.*;
import br.edu.infnet.model.exceptions.PedidoSemProdutosException;
import br.edu.infnet.model.exceptions.SolicitanteNuloException;
import br.edu.infnet.model.exceptions.TelefoneInvalidoException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@Order(1)
public class PedidoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("##########pedido");

        Doce doce1 = new Doce("doce");
        doce1.setNomeDaPizza("Doce de leite");
        doce1.setTamanhoDaPizza('G');
        doce1.setValorDaPizza(50.00);
        doce1.setIngrediente("leite, açúcar, doce de leite");
        doce1.setCodPizza(5356363);

        Doce doce2 = new Doce("doce");
        doce2.setNomeDaPizza("Doce de leite");
        doce2.setTamanhoDaPizza('G');
        doce2.setValorDaPizza(50.00);
        doce2.setIngrediente("leite, açúcar, doce de leite");
        doce2.setCodPizza(5356363);

        Mista mista1 = new Mista("mista");
        mista1.setNomeDaPizza("1/2 Calabressa, 1/2chocolate");
        mista1.setTamanhoDaPizza('G');
        mista1.setValorDaPizza(50.00);
        mista1.setIngrediente("Tomate, queijo, calabressa, chocolate, leite condensado");
        mista1.setCodPizza(5356363);

        Salgada salgada1 = new Salgada("salgada");
        salgada1.setNomeDaPizza("Calabressa");
        salgada1.setTamanhoDaPizza('G');
        salgada1.setValorDaPizza(50.00);
        salgada1.setIngrediente("Tomate, queijo, calabressa");
        salgada1.setCodPizza(5356363);

        try {
            Set<Pizza> listaPizzaPedido1 = new HashSet<>();
            listaPizzaPedido1.add(doce1);
            listaPizzaPedido1.add(doce2);
            listaPizzaPedido1.add(salgada1);

            Solicitante solicitante1 = new Solicitante("Raul", "71796363600", "Jardim cruzeiro");

            Pedido pedido1 = new Pedido(solicitante1, listaPizzaPedido1);
            pedido1.setDescricao("Pedido Pizza 1");
            pedido1.setWeb(true);
            PedidoController.incluir(pedido1);
        } catch (TelefoneInvalidoException | SolicitanteNuloException | PedidoSemProdutosException e) {
            System.out.println("[ERROR] - PEDIDO " + e.getMessage());
        }

        try {
            Set<Pizza> listaPizzaPedido2 = new HashSet<>();
            listaPizzaPedido2.add(doce1);

            Solicitante solicitante2 = new Solicitante("Marcela", "99999999999", "Itaigara");

            Pedido pedido2 = new Pedido(solicitante2, listaPizzaPedido2);
            pedido2.setDescricao("Pedido Pizza 2");
            pedido2.setWeb(true);
            PedidoController.incluir(pedido2);
        } catch (TelefoneInvalidoException | SolicitanteNuloException | PedidoSemProdutosException e) {
            System.out.println("[ERROR] - PEDIDO " + e.getMessage());
        }

        try {
            Set<Pizza> listaPizzaPedido3 = new HashSet<>();
            listaPizzaPedido3.add(salgada1);
            listaPizzaPedido3.add(doce1);
            listaPizzaPedido3.add(mista1);

            Solicitante solicitante3 = new Solicitante("Bianca", "11111111111", "Pituba");

            Pedido pedido3 = new Pedido(solicitante3, listaPizzaPedido3);
            pedido3.setDescricao("Pedido Pizza 3");
            pedido3.setWeb(true);
            PedidoController.incluir(pedido3);
        } catch (TelefoneInvalidoException | SolicitanteNuloException | PedidoSemProdutosException e) {
            System.out.println("[ERROR] - PEDIDO " + e.getMessage());
        }

        try {
            Set<Pizza> listaPizzaPedido4 = new HashSet<>();
            listaPizzaPedido4.add(salgada1);
            listaPizzaPedido4.add(doce1);
            listaPizzaPedido4.add(mista1);

            Solicitante solicitante4 = new Solicitante("Bianca", "11111111111", "Pituba");

            Pedido pedido4 = new Pedido(null, listaPizzaPedido4);
            pedido4.setDescricao("Pedido Pizza 4");
            pedido4.setWeb(true);
            PedidoController.incluir(pedido4);
        } catch (TelefoneInvalidoException | SolicitanteNuloException | PedidoSemProdutosException e) {
            System.out.println("[ERROR] - PEDIDO " + e.getMessage());
        }

        try {
            Set<Pizza> listaPizzaPedido5 = new HashSet<>();

            Solicitante solicitante5 = new Solicitante("Bianca", "11111111111", "Pituba");

            Pedido pedido5 = new Pedido(solicitante5, listaPizzaPedido5);
            pedido5.setDescricao("Pedido Pizza 5");
            pedido5.setWeb(true);
            PedidoController.incluir(pedido5);
        } catch (TelefoneInvalidoException | SolicitanteNuloException | PedidoSemProdutosException e) {
            System.out.println("[ERROR] - PEDIDO " + e.getMessage());
        }

        try {
            Set<Pizza> listaPizzaPedido6 = null;

            Solicitante solicitante6 = new Solicitante("Bianca", "11111111111", "Pituba");

            Pedido pedido6 = new Pedido(solicitante6, listaPizzaPedido6);
            pedido6.setDescricao("Pedido Pizza 6");
            pedido6.setWeb(true);
            PedidoController.incluir(pedido6);
        } catch (TelefoneInvalidoException | SolicitanteNuloException | PedidoSemProdutosException e) {
            System.out.println("[ERROR] - PEDIDO " + e.getMessage());
        }
    }
}
