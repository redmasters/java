package io.red.ex06Vetores.core.usecases.port;

import io.red.ex06Vetores.core.domain.entities.VetorNumeros;

public interface VetorRepository {
    VetorNumeros inserir(VetorNumeros vetorNumeros);
    VetorNumeros mostrarNegativos(VetorNumeros vetorNumeros);
}
