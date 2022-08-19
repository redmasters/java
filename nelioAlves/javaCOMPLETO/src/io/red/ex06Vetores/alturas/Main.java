package io.red.ex06Vetores.alturas;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas? ");
        int n = sc.nextInt();
        Pessoa[] pessoaVetor = new Pessoa[n];

        for (int i = 0; i < pessoaVetor.length; i++) {
            System.out.println("======================");
            System.out.println("Dados da " + i +"a pessoa");
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoaVetor[i] = new Pessoa(nome, idade, altura);
        }

        double soma = 0.0;
        for (int i = 0; i < pessoaVetor.length; i++) {
            soma += pessoaVetor[i].getAltura();
        }
        double avg = soma / pessoaVetor.length;
        System.out.printf("ALTURA MEDIA: %.2f%n", avg);

        System.out.print("Pessoas menores de 16 anos: ");
        int menores = 0;
        for (int i = 0; i < pessoaVetor.length; i++) {
            if(pessoaVetor[i].getIdade() <= 16) {
                menores++;
                double percent = ((double)menores / pessoaVetor.length) * 100.0;
                System.out.println(menores);
                System.out.printf("Pessoas %.1f%%\n", percent);
            }
        }

    }
}
