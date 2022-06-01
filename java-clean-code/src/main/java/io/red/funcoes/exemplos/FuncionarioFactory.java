package io.red.funcoes.exemplos;

public interface FuncionarioFactory {
    public Funcionario criarFuncionario(DadosFuncionario dados) throws
            FuncionarioInvalido;
}
