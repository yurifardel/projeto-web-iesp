package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Filme;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filme")
public class FilmeResource {

    @GetMapping("/teste")
    public Filme teste(){
        Filme f = new Filme();
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
