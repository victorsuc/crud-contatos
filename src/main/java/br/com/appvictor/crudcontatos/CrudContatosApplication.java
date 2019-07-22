package br.com.appvictor.crudcontatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.appvictor.crudcontatos.entities.Pessoa;
import br.com.appvictor.crudcontatos.repositories.PessoaRepository;

@SpringBootApplication
public class CrudContatosApplication implements CommandLineRunner{

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudContatosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		pessoaRepository.save(new Pessoa("victor", "1234", "qualquer"));
		pessoaRepository.save(new Pessoa("eric", "652", "qualquer"));
		pessoaRepository.save(new Pessoa("joao", "236", "qualquer"));
		
	}

}
