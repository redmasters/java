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
 * Classe concreta que define um gerente de vendas (pode vender e autorizar vendas)
 *
 */
public class GerenteVendas extends Colaborador implements Gerente, Vendedor {

	public GerenteVendas(){
		super();
	}
	
	public GerenteVendas(String nome, LocalDate dataNascimento, Integer cpf, String endereco, TipoVinculo tipoVinculo,
			String localLotacao, Float salario) {
		super(nome, dataNascimento, cpf, endereco, tipoVinculo, localLotacao, salario);
	}

	private ArrayList<Venda> vendas;
	
	@Override
	public void autorizarVenda() {
		System.out.println("Gerente de vendas " + this.getNome() + " autorizando venda...");
	}

	@Override
	public void efetuarVenda(Venda v) {
		vendas.add(v);
		System.out.println("Gerente de vendas " + this.getNome() + " realizando venda de valor " + v.getValorVenda() + "...");
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
