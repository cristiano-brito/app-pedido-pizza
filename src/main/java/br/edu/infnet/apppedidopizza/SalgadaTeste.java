package br.edu.infnet.apppedidopizza;

import br.edu.infnet.model.domain.Salgada;
import br.edu.infnet.model.exceptions.ValorDaPizzaSalgadaInvalidoException;
import br.edu.infnet.model.service.SalgadaService;
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
@Order(5)
public class SalgadaTeste implements ApplicationRunner {

    @Autowired
    private SalgadaService salgadaService;

    private Salgada salgada;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("##########salgada");

        String dir ="C:/Users/crist/Documents/";
        String arq ="produtos.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();
                while (linha != null) {

                    String[] campos = linha.split(";");

                    if("salgada".equalsIgnoreCase(campos[0])) {
                        try {
                            salgada = new Salgada();
                            salgada.setTipoPizzaSalgada(campos[0]);
                            salgada.setComBordaSalgada(Boolean.valueOf(campos[1]));
                            salgada.setNomeDaPizza(campos[2]);
                            salgada.setTamanhoDaPizza(campos[3].charAt(0));
                            salgada.setValorDaPizza(Double.valueOf(campos[4]));
                            salgada.setIngrediente(campos[5]);
                            salgada.setCodPizza(Integer.valueOf(campos[6]));
                            System.out.println("Cálculo de venda: " + salgada.calcularVenda());
                            salgadaService.incluir(salgada);

                        } catch (ValorDaPizzaSalgadaInvalidoException e) {
                            System.out.println("[ERROR - SALGADA] " + e.getMessage());
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
