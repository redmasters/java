package io.red.empresa;

public interface Autenticavel {
    void setSenha(int senha);

    boolean autentica(int senha);
}

