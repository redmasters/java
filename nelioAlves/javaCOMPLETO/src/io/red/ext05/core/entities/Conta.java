package io.red.ext05.core.entities;

public class Conta {
    private Long numero;
    private String titular;
    private double saldo;

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

    public void deposita(Double quantidade){
        this.saldo += quantidade;
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
