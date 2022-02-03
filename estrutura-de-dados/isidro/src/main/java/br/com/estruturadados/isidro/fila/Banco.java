package br.com.estruturadados.isidro.fila;

public class Banco {
    public static void main(String[] args) {
        Fila f;
        int e;
        f = new Fila();

        f.inserir(176);
        f.inserir(914);
        f.inserir(12);
        f.inserir(1877);
        f.inserir(100);

        System.out.println("Inicio");
        while (!f.isEmpty()){
            e = f.retirar();
            System.out.println("Senha "+e);
        }
    }
}
