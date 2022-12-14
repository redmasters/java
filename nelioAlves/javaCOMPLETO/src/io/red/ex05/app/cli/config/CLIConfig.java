package io.red.ex05.app.cli.config;

import io.red.ex05.app.domain.repositories.ContaRepository;
import io.red.ex05.app.domain.usecases.CriarConta;
import io.red.ex05.app.domain.usecases.DepositarValor;
import io.red.ex05.app.domain.usecases.ExibirConta;
import io.red.ex05.adapter.output.memory.ContaMemoryRepository;
import io.red.ex05.app.domain.usecases.TaxaSaque;

public class CLIConfig {
    private final ContaRepository dataBase = new ContaMemoryRepository();

    public CriarConta criarConta(){
        return new CriarConta(dataBase);
    }

    public ExibirConta exibirConta(){
        return new ExibirConta(dataBase);
    }
    public DepositarValor depositar(){
        return new DepositarValor(dataBase);
    }
    public TaxaSaque alterarTaxa(){
        return new TaxaSaque(dataBase);
    }
}
