package sptech.school.exemploTestes.service;

import org.springframework.stereotype.Service;
import sptech.school.exemploTestes.model.Produto;

@Service
public class ProdutoService {
//    Calcular o preço final do produto após aplicar um determinado desconto
    public double calcularPrecoFinal(Produto produto){
        if(produto.getDesconto() < 0 || produto.getDesconto() > 1){
            throw new IllegalArgumentException("O desconto deve ser entre 0 e 1.");
        }
        return produto.getPreco() * (1 - produto.getDesconto());
    }
}//FIM CLASSE
