package com.example.clienteApi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NotBlank(message = "Nome obrigatório")
    private String nome;
    @Email(message = "Deve ser um e-mail válido")
    private String email;
    @Min(value = 18, message = "Idade mínima 18 anos")
    private int idade;
    private boolean aniversariante;

    //GETTERS & SETTERS
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public boolean isAniversariante() {
        return aniversariante;
    }
    public void setAniversariante(boolean aniversariante) {
        this.aniversariante = aniversariante;
    }


}//FIM CLASSE
