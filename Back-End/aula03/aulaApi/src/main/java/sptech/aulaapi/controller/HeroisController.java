package sptech.aulaapi.controller;

import org.springframework.web.bind.annotation.*;
import sptech.aulaapi.model.Heroi;
import sptech.aulaapi.repository.HeroiRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/herois")
public class HeroisController {

    private final HeroiRepository repository;

    public HeroisController(HeroiRepository repository) {
        this.repository = repository;
    }

    //@GetMapping("/listar")
    @GetMapping
    public List<Heroi> getHerois() {
        return repository.findAll();
    }

    /*
/herois/cadastrar/{nome}/{poderes}/{forca}/{aposentado}
Ele cadastra um herio na API e retorna o JSON do heroi recem cadastrado */
    @PostMapping
    public Heroi cadastrar(@RequestBody Heroi novoHeroi) // criar novo corpo de requisição
    {
        //herois.add(novoHeroi);
        return repository.save(novoHeroi);
    }

    /*
    @GetMapping("/{indice}") // como se fosse "herois/nº" com o nº do indice do herói
    public Heroi recuperar(@PathVariable int indice) {
        // ainda não vamos verificar se o indice é válido
        return herois.get(indice);
    }

    @DeleteMapping("/{indice}")
    public Heroi excluir(@PathVariable int indice) {
        // ainda não vamos verificar se o indice é válido
        return herois.remove(indice);
    }

    @PutMapping("/{indice}")
    public Heroi atualizar(
            @PathVariable int indice,
            @RequestBody Heroi heroiAtualizado
    ) {
        herois.set(indice, heroiAtualizado);
        return heroiAtualizado;
    }
    */

}

