package sptech.school.calcularDescontos;

public class CalcularDescontos {
    public double aplicarDesconto(double precoOriginal,double percentualDesconto){
        if(percentualDesconto < 0 || percentualDesconto > 100){
            throw new IllegalArgumentException("O desconto deve ser entre 0 e 100%");
        }
        return precoOriginal - (precoOriginal * percentualDesconto/100);
    }//FIM METODO

}//FIM CLASSE
