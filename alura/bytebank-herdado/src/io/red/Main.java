package io.red;

import io.red.financeiro.ControleBonificacao;
import io.red.models.Designer;
import io.red.models.Funcionario;
import io.red.models.Gerente;

public class Main {
    public static void main(String[] args) {
        Funcionario red = new Funcionario();
        ControleBonificacao financeiro = new ControleBonificacao();
        red.setNome("Red");
        red.setCpf("03030");
        red.setSalario(10000.00);
        System.out.println(red.getNome());
        System.out.println(red.getSalario());
        System.out.println(red.getBonificacao());

        Gerente redmaster = new Gerente();
        redmaster.setNome("redmaster");
        redmaster.setCpf("0239023");
        redmaster.setSalario(1000);
        redmaster.setSenha(2222);
        financeiro.bonifica(redmaster);

        Funcionario designer = new Designer();
        designer.setSalario(2000);
        designer.setNome("Felipe");
        financeiro.bonifica(designer);

        System.out.println("\n Gerente:");
        System.out.println(redmaster.getNome());
        System.out.println(redmaster.getSenha());
        System.out.println("Bonificacao: " + financeiro.getSoma());
        System.out.println(redmaster.autentica(2222));

        System.out.println("\n Designer");
        System.out.println(designer.getNome());
        System.out.println(designer.getSalario());
        System.out.println("Bonificacao: " + designer.getBonificacao());

    }
}
