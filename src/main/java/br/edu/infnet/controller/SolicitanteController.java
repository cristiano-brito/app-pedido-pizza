package br.edu.infnet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SolicitanteController {

    @GetMapping(value = "/solicitante/lista")
    public String telaLista() {
        return "solicitante/lista";
    }
}
