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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

        String dir ="C:/Users/crist/Documents/";
        String arq ="pedidos.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();
                while (linha != null) {
                    try {
                        String[] campos = linha.split(";");

                        Set<Pizza> listaPizzaPedido1 = new HashSet<>();
                        listaPizzaPedido1.add(doce1);
                        listaPizzaPedido1.add(doce2);
                        listaPizzaPedido1.add(salgada1);

                        Solicitante solicitante1 = new Solicitante(campos[2], campos[3], campos[4]);

                        Pedido pedido1 = new Pedido(solicitante1, listaPizzaPedido1);
                        pedido1.setDescricao(campos[0]);
                        pedido1.setWeb(Boolean.valueOf(campos[1]));
                        PedidoController.incluir(pedido1);
                    } catch (TelefoneInvalidoException | SolicitanteNuloException | PedidoSemProdutosException e) {
                        System.out.println("[ERROR] - PEDIDO " + e.getMessage());
                    }

                    linha = leitura.readLine();
                }

                leitura.close();
                fileReader.close();

            } catch (IOException e) {
                System.out.println("[ERRO] Problema no fechamento do arquivo!!");;
            }
        } finally {
            System.out.println("Terminou!!!");
        }

    }
}
