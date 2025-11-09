package com.sptech.school.entity;

import jakarta.persistence.*;
//LOMBOK ~> Cria getters e setters automaticamente EM TEMPO DE EXECUÇÃO (ou seja, NÃO APARECE no código)
//Não é recomendado usar em projetos grandes
import lombok.Data;

@Entity //Indica que é uma classe de entidade
@Data //Indica que é uma classe de dados
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Column(unique = true)//Indica que é uma coluna de chave única
    private String email;

    private Boolean ativo;
}
