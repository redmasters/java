package io.red.escola.aluno;

import io.red.escola.exceptions.TelefoneInvalidoException;

public class Telefone {
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if(ddd == null || numero == null){
            throw new TelefoneInvalidoException("Insira DDD e Numero");
        }

        if(!ddd.matches("\\d{2}")) {
            throw new TelefoneInvalidoException("DDD Invalido");
        }

        if (!numero.matches("\\d{8}|\\d{9}")){
            throw new TelefoneInvalidoException("Numero Invalido");
        }

        this.ddd = ddd;
        this.numero = numero;
    }
}
