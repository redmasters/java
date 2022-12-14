package io.red.ex06Vetores.app;

import io.red.ex06Vetores.adapter.input.VetorController;
import io.red.ex06Vetores.core.config.Instancias;

public class Main {

    public static void main(String[] args) {
        var config = new Instancias();
        var inserirNumeros = config.inserirNumeros();
        var controller = new VetorController(inserirNumeros);



    }
}
