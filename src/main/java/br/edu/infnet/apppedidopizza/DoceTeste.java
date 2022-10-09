package br.edu.infnet.apppedidopizza;

import br.edu.infnet.model.domain.Doce;
import br.edu.infnet.model.exceptions.ValorDaPizzaDoceInvalidoException;
import br.edu.infnet.model.service.DoceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
@Order(3)
public class DoceTeste implements ApplicationRunner {

    @Autowired
    private DoceService doceService;

    private Doce doce;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("##########doce");

        String dir ="C:/Users/crist/Documents/";
        String arq ="produtos.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();
                while (linha != null) {

                    String[] campos = linha.split(";");

                    if("doce".equalsIgnoreCase(campos[0])){
                        try {
                            doce = new Doce();
                            doce.setTipoPizzaDoce(campos[0]);
                            doce.setComBordaDoce(Boolean.valueOf(campos[1]));
                            doce.setNomeDaPizza(campos[2]);
                            doce.setTamanhoDaPizza(campos[3].charAt(0));
                            doce.setValorDaPizza(Double.valueOf(campos[4]));
                            doce.setIngrediente(campos[5]);
                            doce.setCodPizza(Integer.valueOf(campos[6]));
                            System.out.println("Cálculo de venda: " + doce.calcularVenda());
                            doceService.incluir(doce);

                        } catch (ValorDaPizzaDoceInvalidoException e) {
                            System.out.println("[ERROR - DOCE] " + e.getMessage());
                        }
                    }

                    linha = leitura.readLine();
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
