package br.edu.infnet.model.tests;

import br.edu.infnet.interfaces.IPrinter;

public class AppImpressao {

    public static void relatorio(String mensagem, IPrinter pizza) {
        System.out.println(mensagem);

        pizza.impressao();
    }
}
