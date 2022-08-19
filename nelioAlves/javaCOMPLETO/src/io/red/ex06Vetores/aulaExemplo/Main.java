package io.red.ex06Vetores.aulaExemplo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] vetor = new Produto[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vetor[i] = new Produto(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            sum += vetor[i].getPrice();
        }

        double avg = sum / vetor.length;
        System.out.printf("PRECO MEDIO = %.2f%n", avg);

        sc.close();


    }
}
