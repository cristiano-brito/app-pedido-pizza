package br.edu.infnet.apppedidopizza;

import br.edu.infnet.controller.DoceController;
import br.edu.infnet.model.domain.Doce;
import br.edu.infnet.model.exceptions.ValorDaPizzaDoceInvalidoException;
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
        try {
            System.out.println("Cálculo de venda: " + doce1.calcularVenda());
            DoceController.incluir(doce1);
        } catch (ValorDaPizzaDoceInvalidoException e) {
            System.out.println("[ERROR - DOCE] " + e.getMessage());
        }

        Doce doce2 = new Doce("doce");
        doce2.setNomeDaPizza("Brigadeiro");
        doce2.setTamanhoDaPizza('M');
        doce2.setValorDaPizza(30.00);
        doce2.setIngrediente("chocolate, leite condensado");
        doce2.setCodPizza(53562793);
        try {
            System.out.println("Cálculo de venda: " + doce2.calcularVenda());
            DoceController.incluir(doce2);
        } catch (ValorDaPizzaDoceInvalidoException e) {
            System.out.println("[ERROR - DOCE] " + e.getMessage());
        }

        Doce doce3 = new Doce("doce");
        doce3.setNomeDaPizza("Doce de caju");
        doce3.setTamanhoDaPizza('F');
        doce3.setValorDaPizza(50.00);
        doce3.setIngrediente("chocolate, leite, doce de caju");
        doce3.setCodPizza(5356150);
        try {
            System.out.println("Cálculo de venda: " + doce3.calcularVenda());
            DoceController.incluir(doce3);
        } catch (ValorDaPizzaDoceInvalidoException e) {
            System.out.println("[ERROR - DOCE] " + e.getMessage());
        }

        Doce doce4 = new Doce("doce");
        doce4.setNomeDaPizza("Doce de caju");
        doce4.setTamanhoDaPizza('F');
        doce4.setValorDaPizza(-50.00);
        doce4.setIngrediente("chocolate, leite, doce de caju");
        doce4.setCodPizza(5356150);
        try {
            System.out.println("Cálculo de venda: " + doce4.calcularVenda());
            DoceController.incluir(doce4);
        } catch (ValorDaPizzaDoceInvalidoException e) {
            System.out.println("[ERROR - DOCE] " + e.getMessage());
        }
    }
}
