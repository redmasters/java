package io.red.ex02.entities;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        this.grossSalary += (percentage / 100) * getGrossSalary() ;
    }

    public String getName() {
        return name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String toString(){
        return "Employee: " + name + ", $" + netSalary() + "\n" +
                "Upated data: " + name + ", $" + grossSalary;

    }
}

