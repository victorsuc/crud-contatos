package br.com.appvictor.crudcontatos.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.appvictor.crudcontatos.entities.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
