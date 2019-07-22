package br.com.appvictor.crudcontatos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.appvictor.crudcontatos.entities.Telefone;

@RepositoryRestResource
public interface TelefoneRepository extends JpaRepository<Telefone, Long>{

}
