package br.edu.infnet.model.tests;

import br.edu.infnet.model.domain.Mista;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MistaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        Mista mista1 = new Mista();
        mista1.setNomeDaPizza("1/2 Calabressa, 1/2chocolate");
        mista1.setTamanhoDaPizza('G');
        mista1.setValorDaPizza(50.00);
        mista1.setIngrediente("Tomate, queijo, calabressa, chocolate, leite condensado");
        mista1.setCodPizza(4356363);
        System.out.println(mista1);

        Mista mista2 = new Mista();
        mista2.setNomeDaPizza("1/2 4Queijos, 1/2 Brigadeiro");
        mista2.setTamanhoDaPizza('M');
        mista2.setValorDaPizza(30.00);
        mista2.setIngrediente("Tomate, queijo, queijo, chocolate");
        mista2.setCodPizza(4356363);
        System.out.println(mista2);

        Mista mista3 = new Mista();
        mista3.setNomeDaPizza("1/2 Toscana, 1/2 Doce caju");
        mista3.setTamanhoDaPizza('F');
        mista3.setValorDaPizza(50.00);
        mista3.setIngrediente("Tomate, queijo, toscana, doce caju");
        mista3.setCodPizza(4356363);
        System.out.println(mista3);

    }
}
