package br.com.appvictor.crudcontatos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.appvictor.crudcontatos.entities.Pessoa;
import br.com.appvictor.crudcontatos.repositories.PessoaRepository;

@RestController
@RequestMapping("/crud")
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping("/pessoas")
	public List<Pessoa> getPessoas(){
		return pessoaRepository.findAll();
	}
	
	@GetMapping("/pessoa/{id}")
	public Optional<Pessoa> getPessoa(@PathVariable Long id) {
		return pessoaRepository.findById(id);
	}
	
	@DeleteMapping("/pessoa/{id}")
	public void deletePessoa(@PathVariable Long id) {
		pessoaRepository.deleteById(id);
	}
	
	@PostMapping("/pessoa")
	public Pessoa createPessoa(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	@PutMapping("/pessoa")
	public Pessoa updatePessoa(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
}
