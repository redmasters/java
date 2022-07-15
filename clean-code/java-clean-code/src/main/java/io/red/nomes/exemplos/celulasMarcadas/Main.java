package io.red.nomes.exemplos.celulasMarcadas;

import java.util.ArrayList;
import java.util.List;

/*
 * Use nomes que Revelem seu Proposito
 * */

public class Main {

    // Codigo Ruim
    public List<int[]> capturar() {
        List<int[]> list1 = new ArrayList<int[]>();
        int[][] theList = new int[0][];
        for (int[] x : theList) {
            if (x[0] == 4)
                list1.add(x);
        }
        return list1;
    }

    // Codigo limpo
    int VALOR_DO_STATUS;
    int MARCADO = 4;

    public List<int[]> capturarCelulasMarcadas() {
        List<int[]> celulasMarcadas = new ArrayList<>();
        int[][] tabuleiro = new int[0][];
        for (int[] celula : tabuleiro)
            if (celula[VALOR_DO_STATUS] == MARCADO)
                celulasMarcadas.add(celula);
        return celulasMarcadas;
    }

    // Codigo Mais Limpo
    public List<Celula> capturaCelulasMarcadas() {
        List<Celula> celulasMarcadas = new ArrayList<>();
        Celula[] tabuleiro = new Celula[0];
        for (Celula celula : tabuleiro)
            if (celula.isMarcada())
                celulasMarcadas.add(celula);
        return celulasMarcadas;
    }
}

