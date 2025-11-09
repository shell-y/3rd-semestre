package com.exemplo.projetoBanco.controller;

import com.exemplo.projetoBanco.model.Pessoa;
import com.exemplo.projetoBanco.repository.PessoaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    private final PessoaRepository repository;

    //CONSTRUCTOR
    public PessoaController(PessoaRepository repository){
        this.repository = repository;
    }

    //VAI PASSAR OS DADOS A SEREM CADASTRADOS
    @PostMapping
    public ResponseEntity<Pessoa> criar(@RequestBody Pessoa pessoa){
        Pessoa salva = repository.save(pessoa);
        return ResponseEntity.ok(salva);
    }

    //VAI FAZER UM 'SELECT'
    @GetMapping
    public List<Pessoa> listarTodos(){
        return repository.findAll();
    }

}//FIM CLASS
