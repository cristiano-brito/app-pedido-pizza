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
}
