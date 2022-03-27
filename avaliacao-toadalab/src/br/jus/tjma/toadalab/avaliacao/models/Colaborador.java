package br.jus.tjma.toadalab.avaliacao.models;

import java.time.LocalDate;

public abstract class Colaborador extends Pessoa {
	
	private TipoVinculo tipoVinculo;
	private String localLotacao;
	private Float salario;
	
	public Colaborador() {
		super();
	}
	
	public Colaborador(String nome, LocalDate dataNascimento, Integer cpf, String endereco) {
		super(nome, dataNascimento, cpf, endereco);
	}

	public Colaborador(String nome, LocalDate dataNascimento, Integer cpf, String endereco, TipoVinculo tipoVinculo, String localLotacao, Float salario) {
		super(nome, dataNascimento, cpf, endereco);
		this.tipoVinculo = tipoVinculo;
		this.localLotacao = localLotacao;
		this.salario = salario;
	}
	
	public void setTipoVinculo(TipoVinculo tipoVinculo) {
		this.tipoVinculo = tipoVinculo;
	}

	public TipoVinculo getTipoVinculo() {
		return tipoVinculo;
	}

	public String getLocalLotacao() {
		return localLotacao;
	}

	public void setLocalLotacao(String localLotacao) {
		this.localLotacao = localLotacao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
}
