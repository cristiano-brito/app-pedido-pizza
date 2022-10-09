package br.edu.infnet.apppedidopizza;

import br.edu.infnet.model.domain.*;
import br.edu.infnet.model.exceptions.PedidoSemProdutosException;
import br.edu.infnet.model.exceptions.SolicitanteNuloException;
import br.edu.infnet.model.exceptions.TelefoneInvalidoException;
import br.edu.infnet.model.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class PedidoTeste implements ApplicationRunner {

    @Autowired
    private PedidoService pedidoService;

    @Override
    public void run(ApplicationArguments args) {

        System.out.println("##########pedido");

        String dir ="C:/Users/crist/Documents/";
        String arq ="pedidos.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                Set<Pizza> listaPizzas = null;
                List<Pedido> pedidos = new ArrayList<Pedido>();

                String linha = leitura.readLine();
                while (linha != null) {

                    String[] campos = linha.split(";");

                    switch (campos[0].toUpperCase()) {
                        case "P":
                            try {
                                listaPizzas = new HashSet<Pizza>();

                                Solicitante solicitante1 = new Solicitante(campos[3], campos[4], campos[5]);

                                Pedido pedido = new Pedido(solicitante1, listaPizzas);
                                pedido.setDescricao(campos[1]);
                                pedido.setWeb(Boolean.valueOf(campos[2]));

                                pedidos.add(pedido);

                            } catch (TelefoneInvalidoException | SolicitanteNuloException | PedidoSemProdutosException e) {
                                System.out.println("[ERROR] - PEDIDO " + e.getMessage());
                            }
                            break;
                        case "D":
                            Doce doce = new Doce();
                            doce.setTipoPizzaDoce(campos[1]);
                            doce.setComBordaDoce(Boolean.valueOf(campos[2]));
                            doce.setNomeDaPizza(campos[3]);
                            doce.setTamanhoDaPizza(campos[4].charAt(0));
                            doce.setValorDaPizza(Double.valueOf(campos[5]));
                            doce.setIngrediente(campos[6]);
                            doce.setCodPizza(Integer.valueOf(campos[7]));

                            listaPizzas.add(doce);

                            break;
                        case "M":
                            Mista mista = new Mista();
                            mista.setTipoPizzaMista(campos[1]);
                            mista.setComBordaMista(Boolean.valueOf(campos[2]));
                            mista.setNomeDaPizza(campos[3]);
                            mista.setTamanhoDaPizza(campos[4].charAt(0));
                            mista.setValorDaPizza(Double.valueOf(campos[5]));
                            mista.setIngrediente(campos[6]);
                            mista.setCodPizza(Integer.valueOf(campos[7]));

                            listaPizzas.add(mista);

                            break;
                        case "S":
                            Salgada salgada = new Salgada();
                            salgada.setTipoPizzaSalgada(campos[1]);
                            salgada.setComBordaSalgada(Boolean.valueOf(campos[2]));
                            salgada.setNomeDaPizza(campos[3]);
                            salgada.setTamanhoDaPizza(campos[4].charAt(0));
                            salgada.setValorDaPizza(Double.valueOf(campos[5]));
                            salgada.setIngrediente(campos[6]);
                            salgada.setCodPizza(Integer.valueOf(campos[7]));

                            listaPizzas.add(salgada);

                            break;

                        default:
                            break;
                    }

                    linha = leitura.readLine();
                }

                for (Pedido p : pedidos) {
                    pedidoService.incluir(p);
                    System.out.println(">>>>>>>>>>>> " + p.getId());
                    System.out.println(">>>>>>>> " + p.getSolicitante().getNome());
                    System.out.println(">>>>> " + p.getPizzas().size());
                }

                leitura.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("[ERRO] O arquivo não existe!!");;

            } catch (IOException e) {
                System.out.println("[ERRO] Problema no fechamento do arquivo!!");;
            }
        } finally {
            System.out.println("Terminou!!!");
        }

    }
}
