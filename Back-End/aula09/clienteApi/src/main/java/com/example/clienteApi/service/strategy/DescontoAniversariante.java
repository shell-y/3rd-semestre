package com.example.clienteApi.service.strategy;

import com.example.clienteApi.model.Cliente;

public class DescontoAniversariante implements EstrategiaDesconto{
    @Override
    public double calcularDesconto(Cliente cliente,double valorCompra){
        return valorCompra * 0.20;
    }
}//FIM CLASSE
