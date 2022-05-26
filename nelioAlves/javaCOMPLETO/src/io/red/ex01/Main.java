package io.red.ex01;

import io.red.ex01.entities.Retangulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final var retangulo = new Retangulo();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangle width and height: ");
        retangulo.setWidth(sc.nextDouble());
        retangulo.setHeight(sc.nextDouble());
        System.out.println(retangulo);
        sc.close();

    }
}
