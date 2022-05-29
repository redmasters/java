package io.red.teste;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Nubank.txt"));

        int duracoesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Float> duracoes = new ArrayList<>();

        for (int i = 0; i < duracoesCount; i++) {
            float duracoesItem = Float.parseFloat(bufferedReader.readLine().trim());
            duracoes.add(duracoesItem);
        }

        int result = Result.acharMinimoDeDias(duracoes);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
