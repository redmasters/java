package io.red.models;

public class Designer extends Funcionario{

    public double getBonificacao() {
        return super.getBonificacao() + 200;
    }

}
