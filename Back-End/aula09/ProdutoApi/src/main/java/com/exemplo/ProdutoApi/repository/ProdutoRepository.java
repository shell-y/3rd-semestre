package com.exemplo.ProdutoApi.repository;

import com.exemplo.ProdutoApi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Aqui usaremos consultas com JPQL (@Query)
//@Query("Isso é uma String")
public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    //Usando JPQL ~> buscar produtos com um preço maior que o informado
    @Query("SELECT p FROM Produto p WHERE p.preco > :precoMinimo") // Usa-se : para mostrar que vai ser uma variável
    List<Produto> buscarProdutosCaros(Double precoMinimo);

    //Usando JPQL ~> busca produtos por categoria
    @Query("SELECT p         FROM Produto p WHERE p.categoria = :categoria")
    List<Produto> buscarProdutosPorCategoria(String categoria);


}//FIM CLASSE
