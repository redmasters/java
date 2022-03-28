package io.red.bank;

public class ContaCorrente extends Conta{

    public ContaCorrente (String nome, int agencia, int numero){
        super(nome, agencia, numero);
    }

    @Override
    public boolean saca(double valor){
        double novoValor = valor + 0.2;
        super.saca(novoValor);
        return true;
    }

}
