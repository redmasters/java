package io.red.ext05.app.domain.usecases;

import io.red.ext05.app.domain.repositories.ContaRepository;
import io.red.ext05.core.entities.Conta;

public class CriarConta {
   private final ContaRepository conta;

    public CriarConta(ContaRepository conta) {
        this.conta = conta;
    }

    public Conta com(String nomeTitular, Long numero){
        return conta.com(nomeTitular, numero);
    }
    public static Conta comSaldo(String nomeTitular, Long numero, double saldo) {
        return new Conta(nomeTitular, numero, saldo);
    }
}
