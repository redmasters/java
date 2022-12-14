package io.red.ex05.app.cli;

import io.red.ex05.adapter.input.controller.ContaController;
import io.red.ex05.core.entities.Conta;
import io.red.ex05.app.cli.config.CLIConfig;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var config = new CLIConfig();
        var criarConta = config.criarConta();
        var exibirConta = config.exibirConta();
        var depositar = config.depositar();
        var taxaDeSaque = config.alterarTaxa();

        var controller = new ContaController(criarConta, exibirConta, depositar);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nome titular: ");
        var nomeTitular = sc.nextLine();

        System.out.println("Numero: ");
        var numero = sc.nextLong();
        Conta conta = controller.criarConta(nomeTitular, numero);
        taxaDeSaque.fixar(0.5, numero);
        System.out.println("Deposita valor inicial? s/n");
        char resposta = sc.next().charAt(0);
        if(resposta == 's'){
            System.out.println("Digite o valor: ");
            controller.depositar(sc.nextDouble(), conta.getNumero());
            controller.exibir(conta);
        } else {
            controller.semSaldo(conta);
        }
    }
}
