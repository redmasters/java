package io.red.rh.service.reajuste;

import io.red.rh.model.Cargo;
import io.red.rh.model.Funcionario;

import java.math.BigDecimal;

public class ValidacaoNova implements ValidacaoReajuste{

    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        final var bob = new Funcionario("Bob", "0000", Cargo.ANALISTA, BigDecimal.valueOf(7999));
        BigDecimal salarioAtual = bob.getSalario();

    }
}
