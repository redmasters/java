package io.red.funcoes.exemplos;

public class Payroll {

    // Codigo Ruim
    public Pagamento calcularPagamento(Funcionario funcionario)
    throws FuncionarioInvalido {
       switch (funcionario.tipo){
           case COMISSIONADO:
               return calcularPagamentoComissionado(funcionario);
           case HORA:
               return calcularPagamentoPorHora(funcionario);
           case SALARIO:
               return calcularPagamentoSalario(funcionario);
           default:
               throw new FuncionarioInvalido(funcionario.tipo);
       }
    }
}
