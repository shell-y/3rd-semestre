package school.sptech.agendamento.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data //lombok
@AllArgsConstructor //lombok
public class Conta {
    private String descricao;
    private Double valor;
    private LocalDate vencimento;

    //Lombok já cria os Getters & Setters


}//FIM CLASSE
