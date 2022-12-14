package io.red.ex05.app.domain.usecases;

import io.red.ex05.app.domain.repositories.ContaRepository;

public class DepositarValor {
    private final ContaRepository contaRepository;

    public DepositarValor(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }
    public void valor(Double quantidade, Long numeroDaConta) {
        contaRepository.depositar(quantidade, numeroDaConta);
    }
}
