package io.red.ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student.gravarPrimeiraNota(sc.nextDouble());
        Student.gravarSegundaNota(sc.nextDouble());
        String resultado = Student.imprimirResultado();
        System.out.println(resultado);

        sc.close();
    }
}
