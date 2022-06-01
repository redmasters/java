package io.red.funcoes.exemplos;

public abstract class Funcionario {
    public abstract boolean isDiaPagamento();
    public abstract Pagamento calcularPagamento();
    public abstract void efetuarPagamento(Pagamento pagar);
}
