package io.red.ex06Vetores.core.usecases;

import io.red.ex06Vetores.core.domain.entities.VetorNumeros;
import io.red.ex06Vetores.core.usecases.port.VetorRepository;

public class MostrarNumerosNegativos {
    private final VetorRepository vetorRepository;

    public MostrarNumerosNegativos(VetorRepository vetorRepository) {
        this.vetorRepository = vetorRepository;
    }

    public VetorNumeros mostrar(VetorNumeros numeros){
        return vetorRepository.mostrarNegativos(numeros);
    }
}
