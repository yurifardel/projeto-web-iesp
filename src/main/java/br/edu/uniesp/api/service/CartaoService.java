package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.Cartao;
import br.edu.uniesp.api.repository.CartaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartaoService {

    private CartaoRepository repository;

    public Cartao salvar(Cartao cartao){return repository.save(cartao);
    }

    public Cartao atualizar(Cartao cartao ) throws Exception {
        if(cartao.getIdCartao()==null){
            throw new Exception("Cartão não cadastrado");
        }
        return repository.save(cartao);
    }

    

    public List<Cartao> listar(){
        return repository.findAll();
    }

    public void deletar(int id){
        repository.deleteById(id);
    }

}