package io.red.ex06Vetores.core.config;

import io.red.ex06Vetores.adapter.output.VetorGateway;
import io.red.ex06Vetores.core.usecases.InserirNumeros;
import io.red.ex06Vetores.core.usecases.port.VetorRepository;

public class Instancias {
    private final VetorGateway dataBase = new VetorGateway();

    public InserirNumeros inserirNumeros() {
        return new InserirNumeros(dataBase);
    }

}
