package com.sptech.school.controller;

import com.sptech.school.dto.UsuarioDTO;
import com.sptech.school.entity.Usuario;
import com.sptech.school.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Usuario cadastrar(@RequestBody UsuarioDTO dto){
        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setAtivo(dto.getAtivo() != null ? dto.getAtivo() : true);
        return usuarioRepository.save(usuario);
    }

    @GetMapping
    public List<Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }

    @GetMapping("/email/{email}")
    public Usuario buscarPorEmail(@PathVariable String email){
        return usuarioRepository.findByEmail(email);
    }
    @GetMapping("/nome/{nome}")
    public List<Usuario> buscarPorNome(@PathVariable String nome){
        return usuarioRepository.findByNomeContainingIgnoreCase(nome);
    }
    @GetMapping("/ativos")
    public List<Usuario> buscarPorAtivo(){
        return usuarioRepository.findByAtivoTrueOrderByNomeAsc();
    }

}
