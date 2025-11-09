package com.example.api.RestAPI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @GetMapping("/{id}")
    public String buscarUsuario(@PathVariable int id) {//mesmo nome colocado no parãmetro
        return "Usuário com ID: " + id;
    }
}
