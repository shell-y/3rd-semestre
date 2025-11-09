package com.exemplo.projetoBanco.repository;

import com.exemplo.projetoBanco.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
}
