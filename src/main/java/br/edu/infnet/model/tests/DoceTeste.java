package br.edu.infnet.model.tests;

import br.edu.infnet.model.domain.Doce;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DoceTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        Doce doce1 = new Doce();
        doce1.setNomeDaPizza("Doce de leite");
        doce1.setTamanhoDaPizza('G');
        doce1.setValorDaPizza(50.00);
        doce1.setIngrediente("leite, açúcar, doce de leite");
        doce1.setCodPizza(4356363);
        System.out.println(doce1);

        Doce doce2 = new Doce();
        doce2.setNomeDaPizza("Brigadeiro");
        doce2.setTamanhoDaPizza('M');
        doce2.setValorDaPizza(30.00);
        doce2.setIngrediente("chocolate, leite condesado");
        doce2.setCodPizza(4356363);
        System.out.println(doce2);

        Doce doce3 = new Doce();
        doce3.setNomeDaPizza("Doce de caju");
        doce3.setTamanhoDaPizza('F');
        doce3.setValorDaPizza(50.00);
        doce3.setIngrediente("chocolate, leite, doce de caju");
        doce3.setCodPizza(4356363);
        System.out.println(doce3);
    }
}
