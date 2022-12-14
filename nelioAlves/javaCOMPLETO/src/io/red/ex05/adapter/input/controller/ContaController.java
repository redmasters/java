package io.red.ex05.adapter.input.controller;

import io.red.ex05.app.domain.usecases.CriarConta;
import io.red.ex05.app.domain.usecases.DepositarValor;
import io.red.ex05.app.domain.usecases.ExibirConta;
import io.red.ex05.core.entities.Conta;

public class ContaController {
    private final CriarConta criarConta;
    private final ExibirConta exibirConta;
    private final DepositarValor depositarValor;

    public ContaController(CriarConta criarConta, ExibirConta exibirConta, DepositarValor depositarValor) {
        this.criarConta = criarConta;
        this.exibirConta = exibirConta;
        this.depositarValor = depositarValor;
    }

    public Conta criarConta(String nomeTitular, Long numero){
        return criarConta.com(nomeTitular, numero);
    }

    public void exibir(Conta conta){
        exibirConta.por(conta);
    }

    public void semSaldo(Conta conta){
        exibirConta.semSaldo(conta);
    }

    public void depositar(double quantidade, Long numeroConta){
        depositarValor.valor(quantidade, numeroConta);
    }

}
