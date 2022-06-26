package io.red.ext05.infra;

import io.red.ext05.app.domain.repositories.ContaRepository;
import io.red.ext05.core.entities.Conta;

import java.util.ArrayList;
import java.util.List;

public class ContaMemoryRepository implements ContaRepository {
    List<Conta> contas = new ArrayList<>();

    @Override
    public Conta com(String nomeTitular, Long numero) {
        Conta novaConta = new Conta(nomeTitular, numero);
        contas.add(novaConta);
        return novaConta;
    }

    @Override
    public void exibir(String conta) {
        System.out.println(conta);
    }
}
