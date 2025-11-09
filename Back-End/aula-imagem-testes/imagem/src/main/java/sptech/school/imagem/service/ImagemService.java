package sptech.school.imagem.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import sptech.school.imagem.model.Imagem;

import java.io.IOException; //excecoes de entrada e saida
import java.nio.file.Files;
import java.nio.file.Paths; //para diretorios e subdiretorios
import java.nio.file.Path; //para diretorios raizes

@Service
public class ImagemService {
    @Value("${upload.dir}") //passando o caminho para salvar as imagens
    private String pastaUpload;

    public Imagem salvarImagem(MultipartFile arquivo) throws IOException{
//        Criar diretório se não existir:
        Path pasta = Paths.get(pastaUpload);
        if(!Files.exists(pasta)){
            Files.createDirectories(pasta);
        }

//        Montar o caminho completo das imagens
        Path caminho = pasta.resolve(arquivo.getOriginalFilename());

//        Faz uma cópia do arquivo
        Files.copy(arquivo.getInputStream(), caminho);

        return new Imagem(
                arquivo.getOriginalFilename(),
                arquivo.getContentType(),
                caminho.toString()
        );
    }

    public byte[] baixarImagem(String nomeArquivo) throws IOException{
        Path caminho = Paths.get(pastaUpload).resolve(nomeArquivo);
        if(!Files.exists(caminho)){
            throw new IOException("Imagem não encontrada");
        }
        return Files.readAllBytes(caminho);
    }



}//FIM CLASSE
