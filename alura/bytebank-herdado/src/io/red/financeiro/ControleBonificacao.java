package io.red.financeiro;

import io.red.models.Funcionario;

public class ControleBonificacao {

    public double soma;

    public void bonifica(Funcionario funcionario){
        double bonificacao = funcionario.getBonificacao();
        this.soma = this.soma + bonificacao;

    }

    public double getSoma() {
        return soma;
    }
}
