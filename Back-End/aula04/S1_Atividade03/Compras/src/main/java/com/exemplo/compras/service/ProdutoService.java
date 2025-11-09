package com.exemplo.compras.service;

import com.exemplo.compras.model.Produto;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();
    private Long proximoId = 1L;

    public Produto criarProduto(Produto produto) {
        produto.setId(proximoId++);
        produtos.add(produto);
        return produto;
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }

    public Optional<Produto> buscarPorId(Long id) {
        return produtos.stream().filter(p -> p.getId().equals(id)).findFirst();
    }
}
