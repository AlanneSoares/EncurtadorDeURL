package br.com.fattoriaweb.repository;


import br.com.fattoriaweb.model.CadastroURL;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CadastroRepository extends CrudRepository<CadastroURL, Long> {
    List<CadastroURL> findAll();
}