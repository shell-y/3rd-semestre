package school.sptech.agendamento.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import school.sptech.agendamento.model.Conta;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

@Service
public class AgendamentoService {
    //Lista que simula um banco de dados:
    private List<Conta> contas = new ArrayList<>();
    public AgendamentoService(){
        //LocalDate.now().plusDays(x) ~> Adiciona X dias a partir de agora
        contas.add(new Conta("Conta de Luz",120.00,LocalDate.now().plusDays(1)));
        contas.add(new Conta("Internet",90.00,LocalDate.now().plusDays(3)));
        contas.add(new Conta("Cartão de Crédito",1500.00,LocalDate.now().plusDays(5)));
    }

    /**************** METODO AGENDADO PARA RODAR A CADA 10seg ****************/
    //fixedRate é medido em milissegundos (10000ms = 10s)
    @Scheduled(fixedRate = 10000)
    public void verificarContas(){
        System.out.println("Verificando contas [" + LocalDate.now() + "]");
        contas.stream()
                .filter(conta -> conta.getVencimento()
                        .isEqual(LocalDate.now().plusDays(1))
                ).forEach(conta -> System.out.println("Lembrete: "+ conta.getDescricao()+
                        " vence amanhã. Valor R$ " + conta.getValor())
                );
    }//FIM VERIFICAR CONTAS

    /**************** METODO AGENDADO PARA RODAR TODOS OS DIAS ÀS 18:00 ****************/
    @Scheduled(cron = "0 0 18 * * *")
    public void lembreteDiario(){
        System.out.println("Bom dia!\nNão se esqueça de verificar suas contas hoje!");
    }

    public List<Conta> getContas(){
        return contas;
    }



}//FIM CLASSE
