package io.red.bank;

public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente (String nome, int agencia, int numero){
        super(nome, agencia, numero);
    }

    @Override
    public boolean saca(double valor){
        double novoValor = valor + 0.2;
        super.saca(novoValor);
        return true;
    }

    @Override
    public boolean deposita(double valor) {
        if (valor == 0) {
            System.out.println("Insira um valor maior que zero");
            return false;
        } else {
            System.out.println("Depositado: " + valor);
            super.saldo += valor;
            return true;
        }
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
