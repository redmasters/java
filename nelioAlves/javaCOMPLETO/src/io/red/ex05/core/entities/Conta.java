package io.red.ex05.core.entities;

public class Conta {
    private Long numero;
    private String titular;
    private double saldo;
    private double taxaSaque;

    public Conta() {
    }

    public Conta(String nomeTitular, Long numero) {
        this.titular = nomeTitular;
        this.numero = numero;
    }

    public Conta(String titular, Long numero, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void alteraTaxa(double taxa) {
        this.taxaSaque = taxa;
    }
    public void deposita(Double quantidade){
        this.saldo += quantidade;
    }

    public void saca(double quantidade) {
        this.saldo -= quantidade + taxaSaque;
    }


    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public String semSaldo() {
        return "Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                '}';
    }


    public String getTitular() {
        return titular;
    }

    public Long getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


}
