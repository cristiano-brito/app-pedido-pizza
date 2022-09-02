package br.edu.infnet.apppedidopizza;

import br.edu.infnet.model.domain.Mista;
import br.edu.infnet.model.domain.Pizza;
import br.edu.infnet.model.tests.AppImpressao;
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

        Pizza mista1 = new Mista("mista");
        mista1.setNomeDaPizza("1/2 Calabressa, 1/2chocolate");
        mista1.setTamanhoDaPizza('G');
        mista1.setValorDaPizza(50.00);
        mista1.setIngrediente("Tomate, queijo, calabressa, chocolate, leite condensado");
        mista1.setCodPizza(7356547);

        AppImpressao.relatorio("Inclusão de pizza mista 1/2 Calabressa, 1/2chocolate", mista1);

        Pizza mista2 = new Mista("mista");
        mista2.setNomeDaPizza("1/2 4Queijos, 1/2 Brigadeiro");
        mista2.setTamanhoDaPizza('M');
        mista2.setValorDaPizza(30.00);
        mista2.setIngrediente("Tomate, queijo, queijo, chocolate");
        mista2.setCodPizza(7356163);

        AppImpressao.relatorio("Inclusão de pizza mista 1/2 4Queijos, 1/2 Brigadeiro", mista2);

        Pizza mista3 = new Mista("mista");
        mista3.setNomeDaPizza("1/2 Toscana, 1/2 Doce caju");
        mista3.setTamanhoDaPizza('F');
        mista3.setValorDaPizza(50.00);
        mista3.setIngrediente("Tomate, queijo, toscana, doce caju");
        mista3.setCodPizza(7356000);

        AppImpressao.relatorio("Inclusão de pizza mista 1/2 Toscana, 1/2 Doce caju", mista3);

    }
}