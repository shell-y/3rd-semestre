package com.sptech.school.repository;

import com.sptech.school.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    Usuario findByEmail(String email);
    List<Usuario> findByNomeContainingIgnoreCase(String nome);
    List<Usuario> findByAtivoTrueOrderByNomeAsc();
}
