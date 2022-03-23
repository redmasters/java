package br.jus.tjma.toadalab.avaliacao.models.funcoes;

import br.jus.tjma.toadalab.avaliacao.models.Venda;

public interface Vendedor {

	public abstract void efetuarVenda(Venda v);
	public abstract float somarVendas();

}
