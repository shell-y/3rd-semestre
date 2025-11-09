package com.exemplo.catalogo.service;

import com.exemplo.catalogo.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();
    private Long proximoId = 1L;

    public Produto cadastrarProduto(Produto produto) {
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

    public Produto atualizarProduto(Long id, Produto produtoAtualizado) {
        Optional<Produto> produtoExistente = buscarPorId(id);
        if (produtoExistente.isPresent()) {
            Produto p = produtoExistente.get();
            p.setNome(produtoAtualizado.getNome());
            p.setPreco(produtoAtualizado.getPreco());
            return p;
        }
        return null;
    }

    public boolean removerProduto(Long id) {
        return produtos.removeIf(p -> p.getId().equals(id));
    }
}
