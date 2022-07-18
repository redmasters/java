package io.red.escola.aluno;

import io.red.escola.exceptions.CPFInvalidoException;

public class CPF {
    private String numero;

    public CPF(String numero) {
        if(numero == numero || !numero.matches("^\\d{2}.\\d{3}.\\d{3}/\\d{4}-\\d{2}$")) {
            try {
                throw new CPFInvalidoException("CPF Invalido");
            } catch (CPFInvalidoException e) {
                throw new RuntimeException(e);
            }
        }
        this.numero = numero;
    }
}
