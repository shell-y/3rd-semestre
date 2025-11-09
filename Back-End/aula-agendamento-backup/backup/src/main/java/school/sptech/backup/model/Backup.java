package school.sptech.backup.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

//Classe que representa os registros de Backup
@Data
@AllArgsConstructor
public class Backup {
    private String nomeArquivo;
    private LocalDateTime dataHora;
    private String status;



}//FIM CLASSE
