package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.Usuario;
import br.edu.uniesp.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario salvar(Usuario usuario) throws Exception{
      
        return repository.save(usuario);

    }

    public Usuario atualizar(Usuario usuario ) throws Exception {
        if(usuario.getId()==null){
            throw new Exception("id não cadastrado");
        }
        return repository.save(usuario);
    }

        public void deletar(int id){
            repository.deleteById(id);
        }

    public List<Usuario> listar(){
        return repository.findAll();
    }

}