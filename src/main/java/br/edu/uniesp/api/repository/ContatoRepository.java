package br.edu.uniesp.api.repository;

import br.edu.uniesp.api.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato,Integer> {

}