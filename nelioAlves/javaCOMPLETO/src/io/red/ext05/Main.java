package io.red.ext05;

import io.red.ext05.adapter.input.controller.ContaController;
import io.red.ext05.core.entities.Conta;
import io.red.ext05.infra.config.ManualConfig;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var config = new ManualConfig();
        var criarConta = config.criarConta();
        var exibirConta = config.exibirConta();
        var controller = new ContaController(criarConta, exibirConta);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nome titular: ");
        var nomeTitular = sc.nextLine();
        System.out.println("Numero: ");
        var numero = sc.nextLong();
        Conta conta = controller.criarConta(nomeTitular, numero);
        controller.exibir(conta);
    }
}
