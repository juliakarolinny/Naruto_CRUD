package juliakarol.naruto.controllers;


import juliakarol.naruto.entityes.Personagem;
import juliakarol.naruto.services.PersonagemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/personagem")
public class PersonagemController {

    private final PersonagemService service;

    public PersonagemController(PersonagemService service) {
        this.service = service;
    }

    @PostMapping
    public void criar (@RequestBody Personagem p) {
        service.criar(p);
    }

    @GetMapping
    public List<Personagem> mostrar() {
        return service.mostrar();
    }

    @DeleteMapping ("{id}")
    public void deletar (@PathVariable int id) {
        service.excluir(id);
    }

    @PutMapping("{id}")
    public void atualizar (@PathVariable int id, @RequestBody Personagem p) {
        service.atualizar(id, p);
    }
}
