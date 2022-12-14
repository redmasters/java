package io.red.ex05.app.domain.exceptions;

import java.util.InputMismatchException;

public class NumeroInvalidoException extends InputMismatchException {
    public NumeroInvalidoException(String mensagem) {
        super(mensagem);
    }
}
