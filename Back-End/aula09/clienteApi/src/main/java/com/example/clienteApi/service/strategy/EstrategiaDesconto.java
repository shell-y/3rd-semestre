package com.example.clienteApi.service.strategy;

import com.example.clienteApi.model.Cliente;

public interface EstrategiaDesconto {

    double calcularDesconto(Cliente cliente,double valorCompra);

}//FIM CLASSE
