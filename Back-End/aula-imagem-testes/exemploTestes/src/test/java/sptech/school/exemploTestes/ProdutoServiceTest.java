package sptech.school.exemploTestes;

import org.junit.jupiter.api.Test;
import sptech.school.exemploTestes.model.Produto;
import sptech.school.exemploTestes.service.ProdutoService;

import static org.junit.jupiter.api.Assertions.*;

// Criar testes que possam garantir que as regras de negócio funcionam
public class ProdutoServiceTest {
    private ProdutoService service = new ProdutoService();

    @Test
    void deveCalcularPrecoComDescontoInvalido(){
        Produto produto = new Produto("Celular",1000.0,1.5);
        assertThrows(IllegalArgumentException.class,
                ()-> service.calcularPrecoFinal(produto),
        "Deve lançar exceção quando for inválido");
    }

    @Test
    void deveCalcularPrecoComDescontoValido(){
        Produto produto = new Produto("Laptop",2000.0,0.1);
        double resultado = service.calcularPrecoFinal(produto);
        assertEquals(1800.0,resultado,0.001,
                "O preço final deve ser 1800 quando o desconto for de 10%");
    }

}//FIM CLASSE
