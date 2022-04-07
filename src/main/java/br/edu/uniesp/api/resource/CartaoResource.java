package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Cartao;
import br.edu.uniesp.api.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cartao")
public class CartaoResource {

    @Autowired
    private CartaoResource service;

    @PostMapping
    public Cartao salvar(@RequestBody Cartao cartao){
        cartao = service.salvar(cartao);
        return cartao;

    }

    @PutMapping
    public Cartao atualizar(@RequestBody Cartao cartao) throws Exception {
        return service.atualizar(cartao);

    }

    @GetMapping
    public List<Cartao> listar(){
        return service.listar();
    }

    @DeleteMapping("{idCartao}")
    public void remover(@PathVariable Integer idCartao){
        service.deletar(idCartao);

    }

}