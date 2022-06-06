package io.red.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o preco do dolar? ");
        CurrencyConverter.setDolar(sc.nextDouble());

        System.out.print("Quantos dolares?");
        System.out.println(CurrencyConverter.calculate(sc.nextDouble()));
        sc.close();

    }
}
