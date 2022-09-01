package br.edu.infnet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MistaController {

    @GetMapping(value = "/mista/lista")
    public String telaLista() {
        return "mista/lista";
    }
}
