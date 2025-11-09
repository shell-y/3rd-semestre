package school.sptech.backup.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import school.sptech.backup.model.Backup;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@Service
public class BackupService {
    private List<Backup> historico = new ArrayList<>();

//    Caminhos de entrada/saída dos arquivos
    private static final String ARQUIVO_ORIGEM = "src/main/resources/entrada/dados.txt";
    private static final String PASTA_BACKUP = "src/main/resources/backup/";

//    Metodo de compactar
    private String compactarArquivo(String nomeZip){
        String destino = PASTA_BACKUP + nomeZip;
        try(
                FileOutputStream fos = new FileOutputStream(destino);
                ZipOutputStream zipOut = new ZipOutputStream(fos);
                FileInputStream fis = new FileInputStream(ARQUIVO_ORIGEM)
        ){
            //Entrada do arquivo Zip
            ZipEntry zipEntry = new ZipEntry("dados.txt");
            zipOut.putNextEntry(zipEntry);

            //informar metodo de compactação
            byte[] buffer = new byte[1024]; //pegar o menor valor possível 1024bytes
            int length;
            while((length = fis.read(buffer)) >= 0){
                zipOut.write(buffer,0,length);
            }
            return "Backup realizado em: " + destino;
        }catch (IOException e){
            return "Erro ao criar backup " + e.getMessage();
        }
    }

//    Metodo para agendar o Backup (rodar a cada 10s)
    @Scheduled(fixedRate = 10000)
    public void executarBackup(){
        String nomeArquivo = "backup"+System.currentTimeMillis()+".zip";
        String resultado = compactarArquivo(nomeArquivo);
        Backup backup = new Backup(nomeArquivo,LocalDateTime.now(),resultado);
        historico.add(backup);
        System.out.println("Backup realizado em: " + resultado);
    }

//    Historico dos backups
    public List<Backup> getHistorico(){
        return historico;
    }





}//FIM CLASSE