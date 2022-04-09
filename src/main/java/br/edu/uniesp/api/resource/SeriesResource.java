package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Series;
import br.edu.uniesp.api.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/series")
public class SeriesResource {

    @Autowired
    private SeriesService service;

    @PostMapping
    public Series salvar(@RequestBody Series series) throws Exception{
        series = service.salvar(series);
        return series;

    }

    @PutMapping
    public Series atualizar(@RequestBody Series series) throws Exception {
        return service.atualizar(series);

    }

    @GetMapping
    public List<Series> listar(){
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){
        service.deletar(id);

    }

}
