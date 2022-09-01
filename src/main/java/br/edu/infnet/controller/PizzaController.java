package br.edu.infnet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PizzaController {

    @GetMapping(value = "/pizza/lista")
    public String telaLista() {
        return "pizza/lista";
    }
}
