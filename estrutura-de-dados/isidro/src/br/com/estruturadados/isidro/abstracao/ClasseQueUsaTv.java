package br.com.estruturadados.isidro.abstracao;

public class ClasseQueUsaTv {
    public static void main(String[] args) {
        Televisao t = new Televisao();
        t.defineMarca("Samsung");
        t.ligar();
        t.defineVolume(10);
        t.defineCanal(1);
        t.aumentaVolume();
        t.desligar();

    }
}
