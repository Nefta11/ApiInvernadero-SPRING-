package com.example.invernadero.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/control/v1")
public class BienvenideController {
//Endpoint para el mensaje de bienvenida siuu
    @GetMapping
    public String bienvenido() {
        return "¡Bienvenido al Invernadero Siuuuuu!";
    }
}
