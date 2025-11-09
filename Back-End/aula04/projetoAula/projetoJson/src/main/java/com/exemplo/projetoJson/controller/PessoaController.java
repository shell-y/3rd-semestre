package com.exemplo.projetoJson.controller;

import com.exemplo.projetoJson.model.Pessoa;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {
    @GetMapping("/pessoa")
    public Pessoa getPessoa(){
        return new Pessoa("João",30);
    }

    @PostMapping("/pessoa")
    public String criarPessoa(@RequestBody Pessoa pessoa){
        return "Pessoa recebida: " + pessoa.getNome() + " Idade: " + pessoa.getIdade();
    }

    @GetMapping("/pessoa-detalhe")
    public ResponseEntity<String> getPessoaDetalhe(){
        Pessoa pessoa = new Pessoa("Carlos",40);
        String mensagem = "Nome: " + pessoa.getNome() + " Idade: " + pessoa.getIdade();
        return ResponseEntity.ok(mensagem); //status 200 OK com body personalizado
    }
    //Status 400 ou 201
    @PostMapping("/pessoa-validada")
    public ResponseEntity<String> criarPessoaValidada(@RequestBody Pessoa pessoa){
        if(pessoa.getIdade() < 0){
            return ResponseEntity
                    .badRequest()
                    .body("Erro: idade não pode ser negativa");
        }
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Pessoa criada com sucesso: " + pessoa.getNome());
    }


} //FIM PUBLIC CLASS
