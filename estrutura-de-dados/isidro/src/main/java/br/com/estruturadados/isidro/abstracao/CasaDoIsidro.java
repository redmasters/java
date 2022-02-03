package br.com.estruturadados.isidro.abstracao;

public class CasaDoIsidro {
    public static void main(String[] args) {
        Televisao t1;
        Televisao t2;

        t1 = new Televisao();
        t2 = new Televisao();

        t1.defineMarca("Samsung da Cozinha");
        t2.defineMarca("Samsung do Quarto");

        t1.ligar();
        t2.ligar();

        t1.defineCanal(2);
        t1.defineVolume(25);

        t1.desligar();
        t2.desligar();
    }

}
