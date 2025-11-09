package com.sptech.school.dto;
//DTO: aqui vamos indicar a forma que eu quero que o Lombok crie os meus getters e setters

import lombok.Data;

@Data //Indica que é uma classe de dados
public class UsuarioDTO {
    private String nome;
    private String email;
    private Boolean ativo;
}
