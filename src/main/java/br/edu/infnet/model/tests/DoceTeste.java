package br.edu.infnet.model.tests;

import br.edu.infnet.model.domain.Doce;
import br.edu.infnet.model.domain.Pizza;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DoceTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("#doce");

        Pizza doce1 = new Doce("doce");
        doce1.setNomeDaPizza("Doce de leite");
        doce1.setTamanhoDaPizza('G');
        doce1.setValorDaPizza(50.00);
        doce1.setIngrediente("leite, açúcar, doce de leite");
        doce1.setCodPizza(5356363);

        new AppPizza("Inclusão da pizza de doce de leite!!!").relatorio(doce1);

        Pizza doce2 = new Doce("doce");
        doce2.setNomeDaPizza("Brigadeiro");
        doce2.setTamanhoDaPizza('M');
        doce2.setValorDaPizza(30.00);
        doce2.setIngrediente("chocolate, leite condensado");
        doce2.setCodPizza(53562793);

        new AppPizza("Inclusão da pizza de brigadeiro!!!").relatorio(doce2);

        Pizza doce3 = new Doce("doce");
        doce3.setNomeDaPizza("Doce de caju");
        doce3.setTamanhoDaPizza('F');
        doce3.setValorDaPizza(50.00);
        doce3.setIngrediente("chocolate, leite, doce de caju");
        doce3.setCodPizza(5356150);

        new AppPizza("Inclusão da pizza de doce de caju!!!").relatorio(doce3);
    }
}
