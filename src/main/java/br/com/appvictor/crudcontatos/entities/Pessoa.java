package br.com.appvictor.crudcontatos.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Pessoa {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private String cpf;
	
	private Date dataNascimento;
	
	private String email;
}
