package io.red.ex06Vetores.somaVetor;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros?");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("VALORES: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");

        }
        System.out.println("");
        System.out.print("SOMA: ");
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.print(soma + "\n");

        double avg = soma / vetor.length;
        System.out.println("MEDIA:" + avg);


    }
}
