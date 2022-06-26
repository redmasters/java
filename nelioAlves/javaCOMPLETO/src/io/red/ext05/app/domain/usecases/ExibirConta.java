package io.red.ext05.app.domain.usecases;

import io.red.ext05.app.domain.repositories.ContaRepository;
import io.red.ext05.core.entities.Conta;

public class ExibirConta {
    private final ContaRepository repository;

    public ExibirConta(ContaRepository repository) {
        this.repository = repository;
    }


//    public static void por(Conta conta){
//        System.out.println(conta.toString());
//    }

    public static void semSaldo(Conta conta){
        System.out.println(conta.semSaldo());
    }

    public void por(Conta conta){
        repository.exibir(conta.toString());
    }
}
