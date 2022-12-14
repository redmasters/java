package io.red.ex05.app.domain.usecases;

import io.red.ex05.app.domain.repositories.ContaRepository;

public class SacarValor {
    private final ContaRepository contaRepository;

    public SacarValor(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public void valor(Double quantidade, Long numeroDaConta) {
        contaRepository.sacar(quantidade, numeroDaConta);
    }
}
