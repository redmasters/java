package io.red.ex05.app.domain.exceptions;

public class ContaInvalidaException extends RuntimeException{
    public ContaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
