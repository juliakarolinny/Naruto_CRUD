package juliakarol.naruto.services;

import jakarta.transaction.Transactional;
import juliakarol.naruto.entityes.Personagem;
import juliakarol.naruto.repositoryes.PersonagemRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class PersonagemService {

    public final PersonagemRepository repository;

    public PersonagemService(PersonagemRepository repository) {
        this.repository = repository;
    }


    public void criar(Personagem personagem){
        repository.save(personagem);
    }

    public List<Personagem> mostrar(){
        return repository.findAll();
    }

    public void excluir(int id){
        repository.deleteById(id);
    }

    @Transactional
    public void atualizar (int id, Personagem personagem){
        Personagem p = repository.getReferenceById(id);
        p.setNome(personagem.getNome());
        p.setElemento(personagem.getElemento());
        p.setJinchuriki(personagem.getJinchuriki());
        p.setNukenin(personagem.getNukenin());
        p.setKage(personagem.getKage());
        p.setSexo(personagem.getSexo());
        p.setVila(personagem.getVila());
    }
}

