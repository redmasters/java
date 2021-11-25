package br.com.estruturadados.isidro;

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
