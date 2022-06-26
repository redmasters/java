package io.red.ext05.adapter.input.controller;

import io.red.ext05.app.domain.usecases.CriarConta;
import io.red.ext05.app.domain.usecases.ExibirConta;
import io.red.ext05.core.entities.Conta;

public class ContaController {
    private final CriarConta criarConta;
    private final ExibirConta exibirConta;

    public ContaController(CriarConta criarConta, ExibirConta exibirConta) {
        this.criarConta = criarConta;
        this.exibirConta = exibirConta;
    }

    public Conta criarConta(String nomeTitular, Long numero){
        return criarConta.com(nomeTitular, numero);
    }

    public void exibir(Conta conta){
        exibirConta.por(conta);
    }
}
