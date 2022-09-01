package br.edu.infnet.model.tests;

import br.edu.infnet.model.domain.Solicitante;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SolicitanteTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {
        System.out.println("#solicitante");

        Solicitante solicitante1 = new Solicitante("Raul", "71796363600", "Jardim cruzeiro");
        System.out.println(solicitante1);

        Solicitante solicitante2 = new Solicitante("Marcela", "99999999999", "Itaigara");
        System.out.println(solicitante2);

        Solicitante solicitante3 = new Solicitante("Bianca", "11111111111", "Pituba");
        System.out.println(solicitante3);
    }
}
