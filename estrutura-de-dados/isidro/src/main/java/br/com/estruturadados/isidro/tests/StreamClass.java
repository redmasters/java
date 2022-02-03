package br.com.estruturadados.isidro.tests;

import java.util.ArrayList;

public class StreamClass {
    public static void main(String[] args) {
        ArrayList<String> agenda = new ArrayList<>();
        agenda.add("Joao");
        agenda.add("Jose");
        agenda.add("Maria");
        agenda.add("Toperosn");


        agenda.stream()
            .map(ppl -> {

                    System.out.println(ppl.equals("Joao"));
                    return ppl.equals("Joao");
                }
            ).toArray();

    }
}
