package br.edu.infnet.apppedidopizza;

import br.edu.infnet.model.domain.Mista;
import br.edu.infnet.model.exceptions.TamanhoDaPizzaMistaException;
import br.edu.infnet.model.service.MistaService;
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
@Order(4)
public class MistaTeste implements ApplicationRunner {

    @Autowired
    private MistaService mistaService;

    private Mista mista;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("##########mista");

        String dir ="C:/Users/crist/Documents/";
        String arq ="mistas.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();
                while (linha != null) {

                    String[] campos = linha.split(";");

                    mista = new Mista();
                    mista.setTipoPizzaMista(campos[0]);
                    mista.setComBordaMista(Boolean.valueOf(campos[1]));
                    mista.setNomeDaPizza(campos[2]);
                    mista.setTamanhoDaPizza(campos[3].charAt(0));
                    mista.setValorDaPizza(Double.valueOf(campos[4]));
                    mista.setIngrediente(campos[5]);
                    mista.setCodPizza(Integer.valueOf(campos[6]));
                    try {
                        System.out.println("Cálculo de venda: " + mista.calcularVenda());
                        mistaService.incluir(mista);

                        linha = leitura.readLine();
                    } catch (TamanhoDaPizzaMistaException e) {
                        System.out.println("[ERROR - MISTA] " + e.getMessage());
                    }
                }

                leitura.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("[ERRO] O arquivo não existe!!");

            } catch (IOException e) {
                System.out.println("[ERRO] Problema no fechamento do arquivo!!");

            }
        } finally {
            System.out.println("Terminou!!!");
        }
    }
}
