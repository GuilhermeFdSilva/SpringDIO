package br.com.meuProjetoSpring.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String menssagem(){
        return "Primeiro Projeto Spring Boot Web";
    }
}
