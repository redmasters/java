package io.red.ex06Vetores.aulaExemplo;

public class Produto {
    public String nome;
    public double price;

    public Produto() {
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(String nome, double price) {
        this.nome = nome;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }
}
