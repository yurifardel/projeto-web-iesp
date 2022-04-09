package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.Series;
import br.edu.uniesp.api.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesService {

    @Autowired
    private SeriesRepository repository;

    public Series salvar(Series series){
        return repository.save(series);
    }

    public Series atualizar(Series series) throws Exception {
        if(series.getId()==null){
            throw new Exception("ID não encontrado");
        }
        return repository.save(series);
    }

    public void deletar(int id){
        repository.deleteById(id);
    }

    public List<Series> listar(){
        return repository.findAll();
    }

}
