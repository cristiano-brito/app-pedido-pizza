package br.edu.infnet.apppedidopizza;

import br.edu.infnet.controller.SalgadaController;
import br.edu.infnet.model.domain.Salgada;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class SalgadaTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {
        System.out.println("##########salgada");

        Salgada salgada1 = new Salgada("salgada");
        salgada1.setNomeDaPizza("Calabressa");
        salgada1.setTamanhoDaPizza('G');
        salgada1.setValorDaPizza(50.00);
        salgada1.setIngrediente("Tomate, queijo, calabressa");
        salgada1.setCodPizza(4356363);
        SalgadaController.incluir(salgada1);

        Salgada salgada2 = new Salgada("salgada");
        salgada2.setNomeDaPizza("4 Queijos");
        salgada2.setTamanhoDaPizza('M');
        salgada2.setValorDaPizza(30.00);
        salgada2.setIngrediente("Tomate, queijo, queijo");
        salgada2.setCodPizza(4356500);
        SalgadaController.incluir(salgada2);

        Salgada salgada3 = new Salgada("salgada");
        salgada3.setNomeDaPizza("Toscana");
        salgada3.setTamanhoDaPizza('F');
        salgada3.setValorDaPizza(50.00);
        salgada3.setIngrediente("Tomate, queijo, toscana");
        salgada3.setCodPizza(4356899);
        SalgadaController.incluir(salgada3);

    }
}
