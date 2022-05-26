package io.red.ex01.entities;

public class Retangulo {
    private double width;
    private double height;

    public double area() {
        return width * height;
    }

    public double perimetro() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "AREA: " +
                String.format("%.2f", area()) +
                "\nPERIMETER: " +
                String.format("%.2f", perimetro()) +
                "\nDIAGONAL : " +
                String.format("%.2f", diagonal());
    }
}
