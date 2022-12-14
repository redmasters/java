package io.red.ex05.adapter.output.memory;

import io.red.ex05.app.domain.repositories.ContaRepository;
import io.red.ex05.core.entities.Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        contas.forEach(cont -> {
            System.out.println(cont);
        });
    }

    @Override
    public void semSaldo(Conta conta) {
        System.out.println(conta.semSaldo());
    }

    @Override
    public void depositar(double quantidade, Long numeroConta) {
       var contaAlvo = encontrarConta(numeroConta);
        contaAlvo.ifPresent(conta -> conta.deposita(quantidade));
    }

    @Override
    public void sacar(double quantidade, Long numeroConta) {
        var contaAlvo = encontrarConta(numeroConta);
        contaAlvo.ifPresent(conta -> conta.saca(quantidade));
    }

    @Override
    public void alterarTaxa(double taxa, Long numeroConta) {
        var contaAlvo = encontrarConta(numeroConta);
        contaAlvo.ifPresent(conta -> conta.alteraTaxa(taxa));
    }

    public Optional<Conta> encontrarConta(Long numeroConta) {
        return contas.stream()
                .filter(conta -> conta.getNumero().equals(numeroConta))
                .findFirst();
    }
}