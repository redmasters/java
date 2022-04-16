package io.red.bank;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String nome, int agencia, int numero){
        super(nome, agencia, numero);
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

}
