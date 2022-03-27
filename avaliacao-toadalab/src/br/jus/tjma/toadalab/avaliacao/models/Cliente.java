package br.jus.tjma.toadalab.avaliacao.models;

import java.time.LocalDate;

public class Cliente extends Pessoa {

	public Cliente() {
		 
	}
	
	public Cliente(String nome, LocalDate dataNascimento, Integer cpf, String endereco) {
		super(nome, dataNascimento, cpf, endereco);
	}

}
