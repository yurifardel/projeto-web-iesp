package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Filme;
import br.edu.uniesp.api.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filme")
public class FilmeResource {

    @Autowired
    private FilmeService service;

    @GetMapping("/teste")
    public Filme teste(){
        Filme f = service.getFilme();
        f.setTitulo("Jurassic Park");
        return f;
    }

    @PostMapping
    public String salvar(){
        return "Salvou";
    }

    @GetMapping
    public String listar(){
        return "Deveria Retornar Lista";
    }

    @DeleteMapping
    public String remover(){
        return "Removendo";
    }

    @PutMapping
    public String atualizar(){
        return "Atualizando";
    }

}
