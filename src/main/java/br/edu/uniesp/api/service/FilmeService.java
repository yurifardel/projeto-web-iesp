package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.Filme;
import br.edu.uniesp.api.repository.FilmeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    private FilmeRepository repository;

     public Filme salvar(Filme filme){
         return repository.save(filme);
     }

     public Filme atualizar(Filme filme) throws Exception {
         if(filme.getId()==null){
             throw new Exception("ID não encontrado");
         }
        return repository.save(filme);
     }

     public void deletar(int id){
        repository.deleteById(id);
     }

     public List<Filme> listar(){
         return repository.findAll();
     }

}
