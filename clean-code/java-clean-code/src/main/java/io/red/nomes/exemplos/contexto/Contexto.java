package io.red.nomes.exemplos.contexto;

public class Contexto {
    private String numero;
    private String verbo;
    private String modificadorPlural;

    public String construirMensagem(char candidato, int contador) {
        criarPartesPluraisDaMessagem(contador);
        return String.format(
                "Existem %s %s %s %s", verbo, numero,
                candidato, modificadorPlural
        );
    }

    private void criarPartesPluraisDaMessagem(int contador) {
        if (contador == 0) {
            naoExisteLetras();
        } else if (contador == 1) {
            existeUmaLetra();
        } else {
            existemVariasLetras(contador);
        }
    }

    private void existemVariasLetras(int contador) {
        numero = Integer.toString(contador);
        verbo = "are";
        modificadorPlural = "s";
    }

    private void existeUmaLetra() {
        numero = "1";
        verbo = "are";
        modificadorPlural = "s";
    }

    private void naoExisteLetras() {
        numero = "no";
        verbo = "are";
        modificadorPlural = "s";
    }
}
