package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MeuAppSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeuAppSpringBootApplication.class, args);
    }

    @GetMapping("/pedido")
    public String getPedido() {
        return "Informações do Pedido: [ID: 123, Cliente: João, Produto: Notebook, Quantidade: 1]";
    }
}
