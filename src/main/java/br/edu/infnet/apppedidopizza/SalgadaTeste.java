package br.edu.infnet.apppedidopizza;

import br.edu.infnet.controller.SalgadaController;
import br.edu.infnet.model.domain.Salgada;
import br.edu.infnet.model.exceptions.ValorDaPizzaSalgadaInvalidoException;
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
        try {
            System.out.println("Cálculo de venda: " + salgada1.calcularVenda());
            SalgadaController.incluir(salgada1);
        } catch (ValorDaPizzaSalgadaInvalidoException e) {
            System.out.println("[ERROR - SALGADA] " + e.getMessage());
        }


        Salgada salgada2 = new Salgada("salgada");
        salgada2.setNomeDaPizza("4 Queijos");
        salgada2.setTamanhoDaPizza('M');
        salgada2.setValorDaPizza(30.00);
        salgada2.setIngrediente("Tomate, queijo, queijo");
        salgada2.setCodPizza(4356500);
        try {
            System.out.println("Cálculo de venda: " + salgada2.calcularVenda());
            SalgadaController.incluir(salgada2);
        } catch (ValorDaPizzaSalgadaInvalidoException e) {
            System.out.println("[ERROR - SALGADA] " + e.getMessage());
        }


        Salgada salgada3 = new Salgada("salgada");
        salgada3.setNomeDaPizza("Toscana");
        salgada3.setTamanhoDaPizza('F');
        salgada3.setValorDaPizza(50.00);
        salgada3.setIngrediente("Tomate, queijo, toscana");
        salgada3.setCodPizza(4356899);
        try {
            System.out.println("Cálculo de venda: " + salgada3.calcularVenda());
            SalgadaController.incluir(salgada3);
        } catch (ValorDaPizzaSalgadaInvalidoException e) {
            System.out.println("[ERROR - SALGADA] " + e.getMessage());
        }

        Salgada salgada4 = new Salgada("salgada");
        salgada4.setNomeDaPizza("Toscana");
        salgada4.setTamanhoDaPizza('F');
        salgada4.setValorDaPizza(20.0);
        salgada4.setIngrediente("Tomate, queijo, toscana");
        salgada4.setCodPizza(4356899);
        try {
            System.out.println("Cálculo de venda: " + salgada4.calcularVenda());
            SalgadaController.incluir(salgada4);
        } catch (ValorDaPizzaSalgadaInvalidoException e) {
            System.out.println("[ERROR - SALGADA] " + e.getMessage());
        }


    }
}
