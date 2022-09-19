package io.red.exFebs01;

public class Carro {

    private String modelo;
    private double valorFinal;
    private double custoFabrica;
    private double imposto;
    private double porcentagemDistribuidor;

    public Carro() {
    }

    public Carro(String modelo, double custoFabrica, double imposto, double porcentagemDistribuidor) {
        this.modelo = modelo;
        this.custoFabrica = custoFabrica;
        this.imposto = imposto;
        this.porcentagemDistribuidor = porcentagemDistribuidor;
    }

    public Carro(String modelo, double custoFabrica) {
        this.modelo = modelo;
        this.custoFabrica = custoFabrica;
    }

    public String getModelo() {
        return modelo;
    }


    public double getValorFinal() {
        valorFinal = getCustoFabrica() + getPorcentagemDistribuidor() + getImposto();
        return valorFinal;
    }

    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void calculaDistribuidor(double porcentagem){
        this.porcentagemDistribuidor += (porcentagem / 100) * getCustoFabrica();
    }

    public void calculaImposto(double porcentagem){
        this.imposto += (porcentagem / 100) * getCustoFabrica();
    }

    public double getPorcentagemDistribuidor() {
        return porcentagemDistribuidor;
    }

    public double getImposto() {
        return imposto;
    }
}
