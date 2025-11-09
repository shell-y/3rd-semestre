package school.sptech.backup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import school.sptech.backup.model.Backup;
import school.sptech.backup.service.BackupService;

import java.util.List;


@RestController
public class BackupController {
    private BackupService backupService;

    //CONSTRUCTOR
    public BackupController(BackupService backupService) {
        this.backupService = backupService;
    }

    //CRIAR ENDPOINT PARA ACESSAR OS BACKUPS
    @GetMapping("/backups")
    public List<Backup> listarBackups(){
        return backupService.getHistorico();
    }


}//FIM CLASSE
