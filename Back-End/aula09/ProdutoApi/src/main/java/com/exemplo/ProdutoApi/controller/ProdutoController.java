package com.exemplo.ProdutoApi.controller;

import com.exemplo.ProdutoApi.model.Produto;
import com.exemplo.ProdutoApi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    //CONSTRUCTOR
    public ProdutoController(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    //Listar todos os produtos
    @GetMapping
    public List<Produto> listarTodos(){
        return produtoRepository.findAll();
    }

    //Buscar produtos mais caros
    @GetMapping("/maisCaros/{preco}")
    public List<Produto> buscarMaisCaros(@PathVariable Double preco){
        return  produtoRepository.buscarProdutosCaros(preco);
    }

    //Buscar por categoria
    @GetMapping("/categoria/{categoria}")
    public List<Produto> buscarProdutosCategoria(@PathVariable String categoria){
        return produtoRepository.buscarProdutosPorCategoria(categoria);
    }

}//FIM CLASSE
