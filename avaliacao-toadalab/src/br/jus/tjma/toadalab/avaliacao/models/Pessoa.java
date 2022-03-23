package br.jus.tjma.toadalab.avaliacao.models;

import java.time.LocalDate;

public abstract class Pessoa {
	
	private String nome;
	private LocalDate dataNascimento;
	private Integer cpf;
	private String endereco;
	
	public Pessoa(String nome, LocalDate dataNascimento, Integer cpf, String endereco) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public Pessoa() {
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getCPF() {
		return cpf;
	}

	public void setCPF(Integer cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
