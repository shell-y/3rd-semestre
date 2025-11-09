package com.example.api.RestAPI.Controller;

import com.example.api.RestAPI.Service.ContadorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/contador")
public class ContadorController {
    private final ContadorService contadorService;
    public ContadorController(ContadorService contadorService){
        this.contadorService = contadorService;
    }

    @GetMapping("/incrementar")
    public int incrementar(){
        return contadorService.incrementar();
    }

    @GetMapping("/valor")
    public int getValor(){
        return contadorService.getContador();
    }
}
