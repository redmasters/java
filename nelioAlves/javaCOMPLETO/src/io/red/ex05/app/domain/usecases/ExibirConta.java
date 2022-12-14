package io.red.ex05.app.domain.usecases;

import io.red.ex05.app.domain.repositories.ContaRepository;
import io.red.ex05.core.entities.Conta;

public class ExibirConta {
    private final ContaRepository repository;

    public ExibirConta(ContaRepository repository) {
        this.repository = repository;
    }

    public void por(Conta conta){
        repository.exibir(conta.toString());
    }

    public void semSaldo(Conta conta){
        repository.semSaldo(conta);
    }
}
