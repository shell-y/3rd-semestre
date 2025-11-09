package com.exemplo.compras.service;

import com.exemplo.compras.model.Pedido;
import com.exemplo.compras.model.Cliente;
import com.exemplo.compras.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    private List<Pedido> pedidos = new ArrayList<>();
    private Long proximoId = 1L;

    public Pedido criarPedido(Cliente cliente, List<Produto> produtos) {
        Pedido pedido = new Pedido(proximoId++, cliente, produtos);
        pedidos.add(pedido);
        return pedido;
    }

    public List<Pedido> listarPedidos() {
        return pedidos;
    }

    public Optional<Pedido> buscarPorId(Long id) {
        return pedidos.stream().filter(p -> p.getId().equals(id)).findFirst();
    }
}
