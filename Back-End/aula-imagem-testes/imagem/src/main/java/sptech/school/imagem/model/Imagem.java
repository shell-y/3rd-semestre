package sptech.school.imagem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Imagem {
    private String nomeArquivo;
    private String tipo;
    private String caminho;
}
