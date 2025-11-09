package sptech.school.atividadeBoleto.service;

import sptech.school.atividadeBoleto.model.BoletoBancario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoletoService {

    private final List<BoletoBancario> boletos = new ArrayList<>();
    private int proximoId = 1;

    public List<BoletoBancario> listarTodos() {
        return boletos;
    }

    public BoletoBancario buscarPorId(int id) {
        return boletos.stream()
                .filter(boleto -> boleto.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public BoletoBancario cadastrar(BoletoBancario boleto) {
        boleto.setId(proximoId++);
        boletos.add(boleto);
        return boleto;
    }

    public boolean deletar(int id) {
        return boletos.removeIf(boleto -> boleto.getId() == id);
    }




}//FIM CLASSE SERVICE
