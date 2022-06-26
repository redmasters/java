package io.red.ext05.app.domain.repositories;

import io.red.ext05.core.entities.Conta;

public interface ContaRepository {
    Conta com(String nomeTitular, Long numero);
    void exibir(String s);
}
