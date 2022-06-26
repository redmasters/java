package io.red.ext05.infra.config;

import io.red.ext05.app.domain.repositories.ContaRepository;
import io.red.ext05.app.domain.usecases.CriarConta;
import io.red.ext05.app.domain.usecases.ExibirConta;
import io.red.ext05.infra.ContaMemoryRepository;

public class ManualConfig {
    private final ContaRepository dataBase = new ContaMemoryRepository();

    public CriarConta criarConta(){
        return new CriarConta(dataBase);
    }

    public ExibirConta exibirConta(){
        return new ExibirConta(dataBase);
    }
}
