package com.example.clienteApi.repository;

import com.example.clienteApi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Dinamic Finders + JPQL
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    //Dinamic Finders ~> Clientes com um nome específico
    List<Cliente> findByNomeContaining(String nome);

    //JPQL ~> Clientes maiores que 18 anos
    @Query("SELECT c FROM Cliente c WHERE c.idade > :idadeMinima")
    List<Cliente> buscarClientesPorIdadeMinima(int idadeMinima);




}//FIM CLASSE
