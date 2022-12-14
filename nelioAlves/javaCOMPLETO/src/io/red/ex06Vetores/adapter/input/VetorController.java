package io.red.ex06Vetores.adapter.input;

import io.red.ex06Vetores.core.domain.entities.VetorNumeros;
import io.red.ex06Vetores.core.usecases.InserirNumeros;

public class VetorController {
    private final InserirNumeros novoVetor;

    public VetorController(InserirNumeros novoVetor) {
        this.novoVetor = novoVetor;
    }

    public VetorNumeros inserir(VetorNumeros numeros) {
        return novoVetor.inserir(numeros);
    }


}
