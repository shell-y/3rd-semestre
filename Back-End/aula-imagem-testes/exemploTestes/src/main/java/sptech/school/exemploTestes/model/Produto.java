package sptech.school.exemploTestes.model;

public class Produto {
    private String nome;
    private double preco;
    private double desconto;

//    CONSTRUCTORS
    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

//    GETTERS
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public double getDesconto() {
        return desconto;
    }

}//FIM CLASSE
