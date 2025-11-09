package com.example.clienteApi.service.strategy;

import com.example.clienteApi.model.Cliente;

public class EstrategiaPadrao implements EstrategiaDesconto{
    @Override
    public double calcularDesconto(Cliente cliente,double valorCompra){
        return valorCompra * 0.05;
    }
}//FIM CLASSE
