package sptech.school.gerenciamento.service;
import org.springframework.stereotype.Service;
import sptech.school.gerenciamento.model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Service //citar a anotação para que o SpringBoot gerencie esta classe
public class UsuarioServiceOld {
    private List<Usuario> usuarios = new ArrayList<>();
    private Long proximoId = 1L;

    //-------------------------------METODOS

    //Listar todos os usuários
    public List<Usuario> getUsuarios(){
        return usuarios;
    };

    //Adicionar usuário
    public Usuario adicionarUsuario(String nome,String email){
        Usuario novoUsuario = new Usuario(proximoId,nome,email);
        usuarios.add(novoUsuario);
        return novoUsuario;
    }

    //Buscar por ID
    public Usuario buscarPorId(Long id){
        return usuarios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null);
    }


}//FIM CLASSE
