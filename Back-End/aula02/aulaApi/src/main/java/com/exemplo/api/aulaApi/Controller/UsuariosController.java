package com.exemplo.api.aulaApi.Controller;

import com.exemplo.api.aulaApi.Model.Usuarios;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    //Lista de usuarios
    private final List<Usuarios> usuarios = Arrays.asList(
            new Usuarios(1L,"João Silva","joao@email.com"),
            new Usuarios(2L,"Maria Oliveira","maria@email.com"),
            new Usuarios(3L,"Carlos Souza","carlos@email.com")
    );

    @GetMapping
    public List<Usuarios> listarUsuarios(){
        return usuarios;
    }

}
