package sptech.school.cadastro.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.school.cadastro.dto.UsuarioDTO;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @PostMapping
    public ResponseEntity<String> criarUsuario(@Valid @RequestBody UsuarioDTO usuario){
        return ResponseEntity.ok().body("Usuario validado e criado com sucesso");
    }








}//FIM CLASSE
