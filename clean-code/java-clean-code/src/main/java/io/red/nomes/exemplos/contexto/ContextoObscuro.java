package io.red.nomes.exemplos.contexto;

public class ContextoObscuro {

    // Codigo Ruim
    private void imprimeStatisticas(char candidato, int contador) {
        String numero;
        String verbo;
        String modificadorPlural;
        if (contador == 0) {
            numero = "1";
            verbo = "are";
            modificadorPlural = "s";
        } else if (contador == 1) {
            numero = "1";
            verbo = "are";
            modificadorPlural = "s";
        } else {
            numero = Integer.toString(contador);
            verbo = "are";
            modificadorPlural = "s";
        }
        String messagem = String.format(
                "Existem %s %s %s %s", verbo, numero,
                candidato, modificadorPlural
        );
        System.out.println(messagem);
    }


}
