package io.red.ex05.app.domain.usecases;

import io.red.ex05.app.domain.repositories.ContaRepository;

public class TaxaSaque {
    private final ContaRepository contaRepository;

    public TaxaSaque(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public void fixar(Double taxa, Long numeroDaConta) {
        contaRepository.alterarTaxa(taxa, numeroDaConta);
    }
}
