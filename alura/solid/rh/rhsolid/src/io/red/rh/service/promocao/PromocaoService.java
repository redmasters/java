package io.red.rh.service.promocao;

import io.red.rh.exception.ValidacaoException;
import io.red.rh.model.Cargo;
import io.red.rh.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida) {
        Cargo cargoAtual = funcionario.getCargo();
        if (Cargo.GERENTE == cargoAtual) {
            throw new ValidacaoException("Gerente nao pode ser promovido");
        }

        if (metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        }

        throw new ValidacaoException("Funcionario nao pode ser promovido");

    }
}
