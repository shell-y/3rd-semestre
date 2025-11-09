package sptech.school.gerenciamento.controller;
import org.springframework.web.bind.annotation.*;
import sptech.school.gerenciamento.model.Usuario;
import sptech.school.gerenciamento.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    //Listar todos
    @GetMapping
    public List<Usuario> listar(){
        return usuarioService.Listar();
    }

    //Buscar por id
    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable Long id){
        return usuarioService.buscarPorId(id);
    }


}//FIM CLASSE
