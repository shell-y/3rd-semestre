package sptech.school.exemploTestes.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.school.exemploTestes.model.Produto;
import sptech.school.exemploTestes.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private ProdutoService service;
    //CONSTRUCTOR
    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping("/calcular")
    public double calcular(@RequestBody Produto produto){
        return service.calcularPrecoFinal(produto);
    }



}//FIM CLASSE
