package com.example.clienteApi.service;

import com.example.clienteApi.model.Cliente;
import com.example.clienteApi.repository.ClienteRepository;
import com.example.clienteApi.service.strategy.DescontoAniversariante;
import com.example.clienteApi.service.strategy.EstrategiaDesconto;
import com.example.clienteApi.service.strategy.EstrategiaPadrao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    //CONSTRUCTOR
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    //METHODS
    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }
    public Cliente buscarPorId(Long id){
        return clienteRepository.findById(id).orElse(null);
    }
    public List<Cliente> buscarPorNome(String nome){
        return clienteRepository.findByNomeContaining(nome);
    }
    public List<Cliente> buscarMaioresDeIdade(int idade){
        return clienteRepository.buscarClientesPorIdadeMinima(idade);
    }

    //STRATEGY para calcular o desconto
    public double calcularDesconto(Cliente cliente,double valorCompra){
        EstrategiaDesconto estrategia = cliente.isAniversariante() ?
                new DescontoAniversariante() : new EstrategiaPadrao();
        return estrategia.calcularDesconto(cliente,valorCompra);
    }





}//FIM CLASSE
