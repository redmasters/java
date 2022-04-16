package io.red.bank;

public abstract class Conta {
    protected double saldo;
    private String nome;
    private int agencia;
    private int numero;

    public Conta() {
    }

    public Conta(String nome, int agencia, int numero) {
        this.nome = nome;
        this.agencia = agencia;
        this.numero = numero;
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saca(valor)) {
            System.out.println("Transferindo " + valor);
            destino.deposita(valor);
            System.out.println(valor + " transferido para " + destino.getNome());
            return true;
        } else {
            return false;
        }
    }


    public boolean saca(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo inferior ao saque");
            return false;
        } else {
            System.out.println("Sacando: " + valor);
            this.saldo = this.saldo - valor;
            return true;
        }

    }

    public abstract boolean deposita(double valor);

    public double getSaldo() {
        System.out.println("Saldo de: ");
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
