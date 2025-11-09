package com.exemplo.compras.controller;

import com.exemplo.compras.model.Pedido;
import com.exemplo.compras.model.Cliente;
import com.exemplo.compras.model.Produto;
import com.exemplo.compras.service.ClienteService;
import com.exemplo.compras.service.PedidoService;
import com.exemplo.compras.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<?> criarPedido(@RequestParam Long clienteId, @RequestParam List<Long> produtoIds) {
        Optional<Cliente> cliente = clienteService.buscarPorId(clienteId);
        if (cliente.isEmpty()) {
            return ResponseEntity.badRequest().body("Cliente não encontrado");
        }

        List<Produto> produtos = produtoIds.stream()
                .map(produtoService::buscarPorId)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();

        Pedido pedido = pedidoService.criarPedido(cliente.get(), produtos);
        return ResponseEntity.ok(pedido);
    }

    @GetMapping
    public List<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPedido(@PathVariable Long id) {
        return pedidoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
