package io.red.exFebs01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Novo carro");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Modelo do carro");
        String modeloCarro = "Kwid ";

        System.out.println("Custo de Fabrica");
        double custoFabrica = 3999.00;

        final var novoCarro = new Carro(
                modeloCarro,
                custoFabrica
        );

        System.out.println("Porcentagem distribuidor: ");
        double porcentagemDistribuidor = scanner.nextDouble();
        novoCarro.calculaDistribuidor(porcentagemDistribuidor);

        System.out.println("Porcentagem impostos: ");
        double porcentagemImpostos = scanner.nextDouble();
        novoCarro.calculaImposto(porcentagemImpostos);

        System.out.println("O carro do modelo: " + novoCarro.getModelo() + "\n" +
                "Com impostos de " + novoCarro.getImposto() + "\n" +
                "E custo de distribuicao de " + novoCarro.getPorcentagemDistribuidor());
        System.out.println("Valor Final: " + novoCarro.getValorFinal());

    }
}
