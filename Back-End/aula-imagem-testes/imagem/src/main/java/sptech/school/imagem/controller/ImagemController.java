package sptech.school.imagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sptech.school.imagem.model.Imagem;
import sptech.school.imagem.service.ImagemService;

import java.io.IOException;

@RestController
@RequestMapping("/imagens")
public class ImagemController {
    @Autowired
    private ImagemService imagemService;
//    Endpoint para upload
    @PostMapping("/upload")
    public ResponseEntity<Imagem> uploadImagem(@RequestParam("arquivo") MultipartFile arquivo){
        try{
            Imagem img = imagemService.salvarImagem(arquivo);
            return ResponseEntity.ok(img);
        } catch (IOException e) {
            return ResponseEntity.internalServerError().build();
        }
    }
//    Endpoint para download
    @GetMapping("/download/{nomeArquivo}")
    public ResponseEntity<byte[]> downloadImagem(@PathVariable String nomeArquivo){
        try{
            byte[] dados = imagemService.baixarImagem(nomeArquivo);
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION,
                            "attachment; filename=\"" + nomeArquivo + "\"")
                    .contentType(MediaType.IMAGE_JPEG)
                    .body(dados);
        }catch(IOException e){
            return ResponseEntity.notFound().build();
        }
    }

}//FIM CLASSE
