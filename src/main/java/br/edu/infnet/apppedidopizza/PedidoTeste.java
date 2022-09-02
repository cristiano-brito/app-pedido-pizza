package br.edu.infnet.apppedidopizza;

import br.edu.infnet.model.domain.Pedido;
import br.edu.infnet.model.tests.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Order(1)
public class PedidoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("##########pedido");

        Pedido pedido1 = new Pedido();
        pedido1.setDescricao("Pedido Pizza1");
        pedido1.setData(LocalDateTime.now());
        pedido1.setWeb(true);

        AppImpressao.relatorio("Inclusão do Pedido 1!!!", pedido1);

        Pedido pedido2 = new Pedido();
        pedido2.setDescricao("Pedido Pizza2");
        pedido2.setData(LocalDateTime.now());
        pedido2.setWeb(true);

        AppImpressao.relatorio("Inclusão do Pedido 2!!!", pedido2);

        Pedido pedido3 = new Pedido();
        pedido3.setDescricao("Pedido Pizza3");
        pedido3.setData(LocalDateTime.now());
        pedido3.setWeb(true);

        AppImpressao.relatorio("Inclusão do Pedido 3!!!", pedido3);
    }
}
