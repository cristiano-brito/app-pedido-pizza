package br.edu.infnet.apppedidopizza;

import br.edu.infnet.controller.DoceController;
import br.edu.infnet.model.domain.Doce;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class DoceTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("##########doce");

        Doce doce1 = new Doce("doce");
        doce1.setNomeDaPizza("Doce de leite");
        doce1.setTamanhoDaPizza('G');
        doce1.setValorDaPizza(50.00);
        doce1.setIngrediente("leite, açúcar, doce de leite");
        doce1.setCodPizza(5356363);
        DoceController.incluir(doce1);

        Doce doce2 = new Doce("doce");
        doce2.setNomeDaPizza("Brigadeiro");
        doce2.setTamanhoDaPizza('M');
        doce2.setValorDaPizza(30.00);
        doce2.setIngrediente("chocolate, leite condensado");
        doce2.setCodPizza(53562793);
        DoceController.incluir(doce2);

        Doce doce3 = new Doce("doce");
        doce3.setNomeDaPizza("Doce de caju");
        doce3.setTamanhoDaPizza('F');
        doce3.setValorDaPizza(50.00);
        doce3.setIngrediente("chocolate, leite, doce de caju");
        doce3.setCodPizza(5356150);
        DoceController.incluir(doce3);
    }
}
