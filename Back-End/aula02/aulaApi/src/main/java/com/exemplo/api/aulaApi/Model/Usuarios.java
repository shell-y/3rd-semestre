package com.exemplo.api.aulaApi.Model;

public class Usuarios {

    private Long id;
    private String nome;
    private String email;

    //CONSTRUCTOR
    public Usuarios(Long id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    //GETS
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
}
