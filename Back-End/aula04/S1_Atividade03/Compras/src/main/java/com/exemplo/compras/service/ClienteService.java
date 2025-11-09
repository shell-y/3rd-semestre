package com.exemplo.compras.service;

import com.exemplo.compras.model.Cliente;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();
    private Long proximoId = 1L;

    public Cliente criarCliente(Cliente cliente) {
        cliente.setId(proximoId++);
        clientes.add(cliente);
        return cliente;
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return clientes.stream().filter(c -> c.getId().equals(id)).findFirst();
    }
}
