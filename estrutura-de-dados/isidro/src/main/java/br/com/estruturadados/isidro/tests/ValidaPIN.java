package br.com.estruturadados.isidro.tests;

public class ValidaPIN {

    public static boolean validaPin(String pin){

        boolean letters = pin.matches("[a-zA-Z]{4,6}");
        boolean numbers = pin.matches("[0-9]{4,6}");

        if(!(letters)){
            if(!(letters || numbers)){
                return false;
            } else if (numbers){
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validaPin("1"));

    }



}
