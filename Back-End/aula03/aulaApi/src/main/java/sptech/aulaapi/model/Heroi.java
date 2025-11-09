package sptech.aulaapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Heroi {
    @Id //jakarta
    @GeneratedValue(strategy = GenerationType.IDENTITY) //expressão para criar um auto-incremento
    private Integer codigo;


    private String nome;
    private String poderes;
    //@JsonIgnore -> para impedir a inclusão do atributo abaixo (mesmo que ele tenha um getter)
    private Double forca;
    private boolean aposentado;


    /*
Aqui criamos um campo Virtual ou Calculado
(atributo virtual ou calculado)
     */
    public Double getSalario() {
        return aposentado ? 0.0 : 15_000 * forca;
    }

    public String getNome() {
        return nome;
    }

    public String getPoderes() {
        return poderes;
    }

    public Double getForca() {
        return forca;
    }

    public boolean isAposentado() {
        return aposentado;
    }
}
