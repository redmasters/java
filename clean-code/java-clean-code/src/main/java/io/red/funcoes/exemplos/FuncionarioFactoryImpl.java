package io.red.funcoes.exemplos;

public class FuncionarioFactoryImpl implements FuncionarioFactory{
    @Override
    public Funcionario criarFuncionario(DadosFuncionario dados) throws FuncionarioInvalido {
        switch (dados.tipo){
            case COMISSAO:
                return new FuncionarioComissionado(dados);
            case HORA:
                return new FuncionarioHorista(dados);
            case SALARIO:
                return new FuncionarioAssalariado(dados);
            default:
                throw new FuncionarioInvalido(dados.tipo);
        }
    }
}
