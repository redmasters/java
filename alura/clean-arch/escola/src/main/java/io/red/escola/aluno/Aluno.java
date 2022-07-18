package io.red.escola.aluno;

import java.util.ArrayList;
import java.util.List;

// Classes que teem identificadores unicos sao chamadas de entidades
public class Aluno {
    private String nome;
    private CPF cpf;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(String nome, CPF cpf, Email email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero){
        this.telefones.add(new Telefone(ddd, numero));
    }

    public String getNome() {
        return nome;
    }

    public CPF getCpf() {
        return cpf;
    }

    public Email getEmail() {
        return email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}
