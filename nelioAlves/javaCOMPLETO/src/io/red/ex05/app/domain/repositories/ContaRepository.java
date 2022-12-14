package io.red.ex05.app.domain.repositories;

import io.red.ex05.core.entities.Conta;

public interface ContaRepository {
    Conta com(String nomeTitular, Long numero);
    void exibir(String conta);
    void semSaldo(Conta conta);
    void depositar(double quantidade, Long numeroConta);
    void sacar(double quantidade, Long numeroConta);
    void alterarTaxa(double taxa, Long numeroConta);
}
