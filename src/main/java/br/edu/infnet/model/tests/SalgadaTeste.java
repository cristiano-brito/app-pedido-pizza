package br.edu.infnet.model.tests;

import br.edu.infnet.model.domain.Pizza;
import br.edu.infnet.model.domain.Salgada;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SalgadaTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {
        System.out.println("#salgada");

        Pizza salgada1 = new Salgada("salgada");
        salgada1.setNomeDaPizza("Calabressa");
        salgada1.setTamanhoDaPizza('G');
        salgada1.setValorDaPizza(50.00);
        salgada1.setIngrediente("Tomate, queijo, calabressa");
        salgada1.setCodPizza(4356363);
        System.out.println(salgada1);

        Pizza salgada2 = new Salgada("salgada");
        salgada2.setNomeDaPizza("4 Queijos");
        salgada2.setTamanhoDaPizza('M');
        salgada2.setValorDaPizza(30.00);
        salgada2.setIngrediente("Tomate, queijo, queijo");
        salgada2.setCodPizza(4356500);
        System.out.println(salgada2);

        Pizza salgada3 = new Salgada("salgada");
        salgada3.setNomeDaPizza("Toscana");
        salgada3.setTamanhoDaPizza('F');
        salgada3.setValorDaPizza(50.00);
        salgada3.setIngrediente("Tomate, queijo, toscana");
        salgada3.setCodPizza(4356899);
        System.out.println(salgada3);

    }
}
