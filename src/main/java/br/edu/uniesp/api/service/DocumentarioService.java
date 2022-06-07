package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.Documentario;
import br.edu.uniesp.api.repository.DocumentarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentarioService {

    private DocumentarioRepository repository;

    public Documentario salvar(Documentario documentario){
        return repository.save(documentario);
    }

    public Documentario atualizar(Documentario documentario) throws Exception {
        if(documentario.getId()==null){
            throw new Exception("ID não encontrado");
        }
        return repository.save(documentario);
    }

    public void deletar(int id){
        repository.deleteById(id);
    }

    public List<Documentario> listar(){
        return repository.findAll();
    }

}