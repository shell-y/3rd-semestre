package school.sptech.agendamento.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import school.sptech.agendamento.model.Conta;
import school.sptech.agendamento.service.AgendamentoService;

import java.util.List;

@RestController
public class ContaController {
    private final AgendamentoService agendamentoService;

    //CONSTRUCTOR
    public ContaController(AgendamentoService agendamentoService){
        this.agendamentoService = agendamentoService;
    }

    //Endpoint para listar as contas
    @GetMapping("/contas")
    public List<Conta> listarContas(){
        return agendamentoService.getContas();
    }


}//FIM CLASSE
