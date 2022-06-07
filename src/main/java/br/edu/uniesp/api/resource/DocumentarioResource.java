package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Documentario;
import br.edu.uniesp.api.service.DocumentarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/documentario")
public class DocumentarioResource {

    private DocumentarioService service;

    @PostMapping
    public Documentario salvar(@RequestBody Documentario documentario) throws Exception{
        documentario = service.salvar(documentario);
        return documentario;

    }

    @PutMapping
    public Documentario atualizar(@RequestBody Documentario documentario) throws Exception {
        return service.atualizar(documentario);

    }

    @GetMapping
    public List<Documentario> listar(){
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){
        service.deletar(id);

    }

}
