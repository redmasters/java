package br.com.estruturadados.isidro.pilha;


import java.util.Scanner;

public class Conversor {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int numero = obj.nextInt();
        Pilha p = new Pilha();

        int resto;

        // fase 1 = empilhamento dos restos
        while (numero != 0) {
            resto = numero % 2; // pega o resto da divisao deste numero por 2 (vale 0 ou 1)
            p.push(resto); // armazena na pilha
            numero = numero / 2; // gera um novo número, resultado da divisão dele por 2
        }

        // fase 2 = exibicao dos restos
        while (!p.isEmpty()){
            resto = p.pop(); // remove do topo da pilha
            System.out.print(resto);
        }

        System.out.println("\n---Fim---");
    }
}


