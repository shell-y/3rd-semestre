package sptech.school.calcularDescontos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcularDescontosTest {
    CalcularDescontos novoDesconto = new CalcularDescontos();

    @Test
    void deveAplicarDescontoCorretamente() {
        CalcularDescontos resultado = new CalcularDescontos();
        double precoFinal = resultado.aplicarDesconto(200.0, 20.0);
        assertEquals(160.0, precoFinal, 1e-9, "20% de 200 deve dar 160");
    }

    @Test
    void comZeroPorCentoDeveRetornarMesmoPreco() {
        CalcularDescontos resultado = new CalcularDescontos();
        double precoOriginal = 199.99;
        double precoFinal = resultado.aplicarDesconto(precoOriginal, 0.0);
        assertEquals(precoOriginal, precoFinal, 1e-9, "0% deve manter o preço original");
    }

    @Test
    void descontoForaDoIntervaloDeveLancarExcecao() {
        CalcularDescontos resultado = new CalcularDescontos();
        assertThrows(IllegalArgumentException.class,
                () -> resultado.aplicarDesconto(100.0, -5.0),
                "Desconto negativo deve lançar exceção");

        assertThrows(IllegalArgumentException.class,
                () -> resultado.aplicarDesconto(100.0, 150.0),
                "Desconto acima de 100% deve lançar exceção");
    }

}//FIM CLASSE
