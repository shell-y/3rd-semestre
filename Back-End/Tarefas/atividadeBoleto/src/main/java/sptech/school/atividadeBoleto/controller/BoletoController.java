package sptech.school.atividadeBoleto.controller;

import sptech.school.atividadeBoleto.model.BoletoBancario;
import sptech.school.atividadeBoleto.service.BoletoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/boletos")
@Validated
public class BoletoController {
    @Autowired
    private BoletoService boletoService;

    @GetMapping
    public List<BoletoBancario> listarTodos() {
        return boletoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BoletoBancario> buscarPorId(@PathVariable int id) {
        BoletoBancario boleto = boletoService.buscarPorId(id);
        if (boleto != null) return ResponseEntity.ok(boleto);
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<BoletoBancario> cadastrar(@Valid @RequestBody BoletoBancario boleto) {
        BoletoBancario salvo = boletoService.cadastrar(boleto);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable int id) {
        boolean removido = boletoService.deletar(id);
        if (removido) return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();
    }




}//FIM CLASSE CONTROLLER