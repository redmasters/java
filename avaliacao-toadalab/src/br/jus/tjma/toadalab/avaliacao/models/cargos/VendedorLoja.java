/**
 * 
 */
package br.jus.tjma.toadalab.avaliacao.models.cargos;

import java.time.LocalDate;
import java.util.ArrayList;

import br.jus.tjma.toadalab.avaliacao.models.Colaborador;
import br.jus.tjma.toadalab.avaliacao.models.TipoVinculo;
import br.jus.tjma.toadalab.avaliacao.models.Venda;
import br.jus.tjma.toadalab.avaliacao.models.funcoes.Gerente;
import br.jus.tjma.toadalab.avaliacao.models.funcoes.Vendedor;

/**
 * @author ToadaLab
 * 
 * Classe concreta que define um vendedor padrão
 *
 */
public class VendedorLoja extends Colaborador implements Vendedor {
	
	public VendedorLoja() {
		super();
	}
	
	public VendedorLoja(String nome, LocalDate dataNascimento, Integer cpf, String endereco, TipoVinculo tipoVinculo,
			String localLotacao, Float salario) {
		super(nome, dataNascimento, cpf, endereco, tipoVinculo, localLotacao, salario);
	}

	private Gerente gerenteResponsavel;
	private ArrayList<Venda> vendas;

	@Override
	public void efetuarVenda(Venda v) {
		vendas.add(v);
		System.out.println("Vendedor " + this.getNome() + " registrando venda de valor " + v.getValorVenda());
	}

	public Gerente getGerenteResponsavel() {
		return gerenteResponsavel;
	}

	public void setGerenteResponsavel(Gerente gerenteResponsavel) {
		this.gerenteResponsavel = gerenteResponsavel;
	}

	@Override
	public float somarVendas() {
		float total = 0;
		for(Venda v : vendas) {
			total += v.getValorVenda();
		}
		return total;
	}
	
	

}
