package io.red.ex04;

import org.w3c.dom.ls.LSOutput;

public class CurrencyConverter {
    private static double dolarCurrent;

    static double IOF = 6;

    public static String printResult(Double dolarQuantity) {
        String printer = String.valueOf(calculate(dolarQuantity));
        return "Resultado: " + printer;
    }

    public static double calculate(Double dolarQuantity) {
        double result = dolarCurrent * dolarQuantity;
        double resultTax = (IOF / 100) * result;
        return resultTax;
    }

    public static void setDolar(Double dolarPrice) {
        dolarCurrent = dolarPrice;
    }

}
