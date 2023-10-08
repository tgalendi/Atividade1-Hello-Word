package unip.alpoo.atividade01.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import java.util.Scanner;


@RestController
public class Hello{

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "nome") String nome){
        return "Olá, " + nome + "! Seja bem-vindo(a).";
    }
}
