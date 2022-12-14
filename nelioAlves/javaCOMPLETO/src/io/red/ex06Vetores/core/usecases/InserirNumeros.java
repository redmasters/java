package io.red.ex06Vetores.core.usecases;

import io.red.ex06Vetores.core.domain.entities.VetorNumeros;
import io.red.ex06Vetores.core.usecases.port.VetorRepository;

public class InserirNumeros {
    private final VetorRepository vetorRepository;

    public InserirNumeros(VetorRepository vetorRepository) {
        this.vetorRepository = vetorRepository;
    }

    public VetorNumeros inserir(VetorNumeros vetorNumeros) {
        return vetorRepository.inserir(vetorNumeros);
    }


}
