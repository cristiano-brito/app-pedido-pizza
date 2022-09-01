package br.edu.infnet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SalgadaController {

    @GetMapping(value = "/salgada/lista")
    public String telaLista() {
        return "salgada/lista";
    }
}
