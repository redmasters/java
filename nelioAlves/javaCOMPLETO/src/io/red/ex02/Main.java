package io.red.ex02;

import io.red.ex02.entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final var employee = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        employee.setName(sc.next());
        System.out.print("Gross Salary: " );
        employee.setGrossSalary(sc.nextDouble());
        System.out.print("Tax: ");
        employee.increaseSalary(sc.nextDouble());
        System.out.println("Which percentage to increase salary? ");
        employee.setTax(sc.nextDouble());

        sc.close();

        System.out.println(employee);


    }
}
