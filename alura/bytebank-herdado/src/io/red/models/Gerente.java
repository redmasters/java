package io.red.models;

public class Gerente extends Funcionario{

    private int senha = 0;

    @Override
    public double getBonificacao() {
        return this.getSalario();
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }


    }
}
