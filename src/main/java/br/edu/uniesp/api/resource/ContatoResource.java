package br.edu.uniesp.api.resource;


import br.edu.uniesp.api.model.Contato;
import br.edu.uniesp.api.service.ContatoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contato")
public class ContatoResource {

    private ContatoService service;


    @PostMapping
    public Contato salvar(@RequestBody Contato contato){
        contato = service.salvar(contato);
        return contato;
    }

    @PutMapping
    public Contato atualizar(@RequestBody Contato contato) throws Exception {
        return service.atualizar(contato);
    }

    @GetMapping
    public List<Contato> listar(){
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){
        service.deletar(id);
    }


}