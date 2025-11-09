package com.exemplo.projetoBanco.model;

import jakarta.persistence.*;
@Entity //esta classe vai ser uma Entidade no nosso banco de dados
public class Pessoa {
    //O que eu quero que tenha na minha tabela Pessoa:
    @Id //indica que é um id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
    private Long id; //Long ao invés de int pois não sabemos o tamanho do número que vai ser gerado
    private String nome;
    private int idade;

    //CONSTRUTORES
    public Pessoa() {
    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //GETTERS & SETTERS
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}//FIM CLASS
