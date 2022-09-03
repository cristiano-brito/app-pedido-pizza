package br.edu.infnet.apppedidopizza;

import br.edu.infnet.controller.MistaController;
import br.edu.infnet.model.domain.Mista;
import br.edu.infnet.model.exceptions.TamanhoDaPizzaMistaException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class MistaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("##########mista");

        Mista mista1 = new Mista("mista");
        mista1.setNomeDaPizza("1/2 Calabressa, 1/2chocolate");
        mista1.setTamanhoDaPizza('G');
        mista1.setValorDaPizza(50.00);
        mista1.setIngrediente("Tomate, queijo, calabressa, chocolate, leite condensado");
        mista1.setCodPizza(7356547);
        try {
            System.out.println("Cálculo de venda: " + mista1.calcularVenda());
            MistaController.incluir(mista1);
        } catch (TamanhoDaPizzaMistaException e) {
            System.out.println("[ERROR - MISTA] " + e.getMessage());
        }

        Mista mista2 = new Mista("mista");
        mista2.setNomeDaPizza("1/2 4Queijos, 1/2 Brigadeiro");
        mista2.setTamanhoDaPizza('M');
        mista2.setValorDaPizza(30.00);
        mista2.setIngrediente("Tomate, queijo, queijo, chocolate");
        mista2.setCodPizza(7356163);
        try {
            System.out.println("Cálculo de venda: " + mista2.calcularVenda());
            MistaController.incluir(mista2);
        } catch (TamanhoDaPizzaMistaException e) {
            System.out.println("[ERROR - MISTA] " + e.getMessage());
        }

        Mista mista3 = new Mista("mista");
        mista3.setNomeDaPizza("1/2 Toscana, 1/2 Doce caju");
        mista3.setTamanhoDaPizza('P');
        mista3.setValorDaPizza(50.00);
        mista3.setIngrediente("Tomate, queijo, toscana, doce caju");
        mista3.setCodPizza(7356000);
        try {
            System.out.println("Cálculo de venda: " + mista3.calcularVenda());
            MistaController.incluir(mista3);
        } catch (TamanhoDaPizzaMistaException e) {
            System.out.println("[ERROR - MISTA] " + e.getMessage());
        }

        Mista mista4 = new Mista("mista");
        mista4.setNomeDaPizza("1/2 Toscana, 1/2 Doce caju");
        mista4.setTamanhoDaPizza('@');
        mista4.setValorDaPizza(40.00);
        mista4.setIngrediente("Tomate, queijo, toscana, doce caju");
        mista4.setCodPizza(7356000);
        try {
            System.out.println("Cálculo de venda: " + mista4.calcularVenda());
            MistaController.incluir(mista3);
        } catch (TamanhoDaPizzaMistaException e) {
            System.out.println("[ERROR - MISTA] " + e.getMessage());
        }
    }
}
