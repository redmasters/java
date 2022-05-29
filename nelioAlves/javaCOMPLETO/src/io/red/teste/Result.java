package io.red.teste;

import java.util.List;

public class Result {

    public static int acharMinimoDeDias(List<Float> duracoes) {
        float aux = 0;
        for (int i = 0; i < duracoes.size(); i++) {
            aux += duracoes.get(i);
        }
        return (int) aux;
    }

}
