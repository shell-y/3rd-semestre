package sptech.school.gerenciamento.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import sptech.school.gerenciamento.exception.UsuarioNaoEncontradoException;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    //Captura a exception personalizada
    @ExceptionHandler(UsuarioNaoEncontradoException.class)
    public ResponseEntity<Object> handleUsuarioNaoEncontradoException(UsuarioNaoEncontradoException excp){
        Map<String,Object> corpo = new HashMap<>();
        corpo.put("timestamp", LocalDateTime.now());
        corpo.put("mensagem", excp.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(corpo);
    }





}//FIM CLASSE
