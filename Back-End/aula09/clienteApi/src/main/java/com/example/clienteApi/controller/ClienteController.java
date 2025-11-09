package com.example.clienteApi.controller;

import com.example.clienteApi.model.Cliente;
import com.example.clienteApi.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    //CONSTRUCTOR
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    //METHODS
    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente){
        Cliente novoCliente = clienteService.salvar(cliente);
        return ResponseEntity.status(201).body(novoCliente); //Status 201 = created
    }
    @GetMapping
    public ResponseEntity<List<Cliente>> listar(){
        return ResponseEntity.status(200).body(clienteService.listar());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscar(@PathVariable Long Id){
        Cliente cliente = clienteService.buscarPorId(Id);
        if(cliente == null){
            return ResponseEntity.notFound().build();//Not found (404)
        }
        return ResponseEntity.status(200).body(cliente);
    }
    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<Cliente>> buscarPorNome(@PathVariable String nome){
        return ResponseEntity.ok(clienteService.buscarPorNome(nome));
    }
    @GetMapping("/maiores/{idade}")
    public ResponseEntity<List<Cliente>> buscarMaiores(@PathVariable int idade){
        return ResponseEntity.ok(clienteService.buscarMaioresDeIdade(idade));
    }
    @GetMapping("/{id}/desconto/{valor}")
    public ResponseEntity<Double> calcularDesconto(@PathVariable Long id, @PathVariable Double valor){
        Cliente cliente = clienteService.buscarPorId(id);
        if(cliente==null){
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.ok(clienteService.calcularDesconto(cliente,valor));
    }






}//FIM CLASSE
