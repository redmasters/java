package br.jus.tjma.toadalab.avaliacao.models;

import java.time.LocalDate;

import br.jus.tjma.toadalab.avaliacao.models.funcoes.Gerente;
import br.jus.tjma.toadalab.avaliacao.models.funcoes.Vendedor;

public class Venda {

	private Vendedor vendedor;
	private Gerente autorizador;
	private Cliente comprador;
	private float valorVenda;
	private LocalDate dataVenda;

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Gerente getAutorizador() {
		return autorizador;
	}

	public void setAutorizador(Gerente autorizador) {
		this.autorizador = autorizador;
	}

	public Cliente getComprador() {
		return comprador;
	}

	public void setComprador(Cliente comprador) {
		this.comprador = comprador;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}

}
