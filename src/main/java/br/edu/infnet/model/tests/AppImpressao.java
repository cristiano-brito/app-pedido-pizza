package br.edu.infnet.model.tests;

import br.edu.infnet.interfaces.IPrinter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppImpressao {

    public static void relatorio(String mensagem, IPrinter pizza) {
        System.out.println(mensagem);

        pizza.impressao();
    }

    public static void main(String[] args) {

        String dir ="C:/Users/crist/Documents/";
        String arq ="pizzas.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();
                while (linha != null) {
                    System.out.println(linha);

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
