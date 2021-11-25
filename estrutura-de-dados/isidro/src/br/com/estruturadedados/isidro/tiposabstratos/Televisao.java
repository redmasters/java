package br.com.estruturadedados.isidro.tiposabstratos;

public class Televisao {
    String marca;
    boolean ligado;
    int volume;
    int canal;

    public Televisao(){
        ligado = false;
    }

    public void ligar(){
        ligado = true;
        System.out.println("TV "+marca+" ligada!");
    }

    public void desligar(){
        ligado = false;
        System.out.println("TV "+marca+" desligada!");
    }

    public void defineMarca(String nomeMarca){
        marca = nomeMarca;
        System.out.println("TV - Marca Definida: " +marca);
    }

    public void defineVolume(int vol) {
        if(ligado){
            volume = vol;
            System.out.println("TV " +marca+ " volume definido para "+volume);
        } else {
            System.out.println("Ligue antes a TV: "+marca);
        }

    }

    public void defineCanal(int ca) {
        if (ligado){
            canal = canal;
            System.out.println("TV "+marca+" com canal definido para "+canal);
        } else {
            System.out.println("Por favor, ligue antes a TV "+marca);
        }
    }

    public void aumentaVolume(){
        volume++;
        System.out.println("TV "+marca+": volume atual "+volume);
    }

}
