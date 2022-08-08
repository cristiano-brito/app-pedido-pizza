package br.edu.infnet.model.tests;

import br.edu.infnet.model.domain.Pedido;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PedidoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        Pedido pedido1 = new Pedido();
        pedido1.setDescricao("Pedido Pizza1");
        pedido1.setData(LocalDateTime.now());
        pedido1.setWeb(true);
        System.out.println(pedido1);

        Pedido pedido2 = new Pedido();
        pedido2.setDescricao("Pedido Pizza2");
        pedido2.setData(LocalDateTime.now());
        pedido2.setWeb(true);
        System.out.println(pedido2);

        Pedido pedido3 = new Pedido();
        pedido3.setDescricao("Pedido Pizza3");
        pedido3.setData(LocalDateTime.now());
        pedido3.setWeb(true);
        System.out.println(pedido3);
    }
}
