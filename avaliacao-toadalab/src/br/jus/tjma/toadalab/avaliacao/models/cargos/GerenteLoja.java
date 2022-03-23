package br.jus.tjma.toadalab.avaliacao.models.cargos;

import java.time.LocalDate;

import br.jus.tjma.toadalab.avaliacao.models.Colaborador;
import br.jus.tjma.toadalab.avaliacao.models.TipoVinculo;
import br.jus.tjma.toadalab.avaliacao.models.funcoes.Gerente;

/**
 * @author ToadaLab
 * 
 * Classe concreta que define um gerente da loja
 *
 */
public class GerenteLoja extends Colaborador implements Gerente {
	
	public GerenteLoja() {
		super();
	}

	public GerenteLoja(String nome, LocalDate dataNascimento, Integer cpf, String endereco, TipoVinculo tipoVinculo,
			String localLotacao, Float salario) {
		super(nome, dataNascimento, cpf, endereco, tipoVinculo, localLotacao, salario);
	}

	@Override
	public void autorizarVenda() {
		System.out.println("Gerente de loja " + this.getNome() + " autorizando venda...");
	}

}
