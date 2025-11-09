package sptech.school.gerenciamento.service;

import org.springframework.stereotype.Service;
import sptech.school.gerenciamento.exception.UsuarioNaoEncontradoException;
import sptech.school.gerenciamento.model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();
    private Long proximoId = 1L;

    //Adicionar o primeiro usuario
    public UsuarioService(){
        usuarios.add(
                new Usuario(proximoId++,"Maria","maria@email")
        );
    }
    //Listar todos os usuários
    public List<Usuario> Listar(){
        return usuarios;
    }
    //Buscar usando o ID
    public Usuario buscarPorId(Long id){
        return usuarios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElseThrow(
                        ()-> new UsuarioNaoEncontradoException(id)
                );
    }



}//FIM CLASSE
