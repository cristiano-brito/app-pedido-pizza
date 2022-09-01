package br.edu.infnet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoceController {

    @GetMapping(value = "/doce/lista")
    public String telaLista() {
        return "doce/lista";
    }
}
