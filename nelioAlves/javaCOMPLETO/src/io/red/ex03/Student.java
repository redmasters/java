package io.red.ex03;

public class Student {
    private String nome;
    private static double primeiroSemestre;
    private static double segundoSemestre;
    private double terceiroSemestre;

    static double TRINTA = 30;
    static double TRINTA_E_CINCO= 35;

    public static Double gravarPrimeiraNota(double primeiraNota) throws RuntimeException{
        return primeiroSemestre = primeiraNota;
    }

    public static Double gravarSegundaNota(double segundaNota) {
        return segundoSemestre = segundaNota;
    }

    public static String imprimirResultado() {
       if(isPontosNecessarios()){
           return pontosSuficientes();
       }
       return pontosInsuficientes();
    }

    private static boolean isPontosNecessarios(){
        return calcularNotas() >= 0;
    }

    public static double calcularNotas() {
       return primeiroSemestre + segundoSemestre;
    }

    private static String pontosSuficientes() {
        return "FINAL GRADE = " + calcularNotas() +"\nPASS";
    }

    private static String pontosInsuficientes() {
        return "FINAL GRADE = " + calcularNotas() + "\nFAILED" +
                "\nMISSING POINTS ";

    }


    public String getNome() {
        return nome;
    }

    public double getPrimeiroSemestre() {
        return primeiroSemestre;
    }

    public double getSegundoSemestre() {
        return segundoSemestre;
    }

    public double getTerceiroSemestre() {
        return terceiroSemestre;
    }
}
