package io.red.empresa;

public class Main {
    public static void main(String[] args) {

        Autenticavel g = new Gerente();
        g.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);

        Autenticavel adm = new Administrador();
        adm.autentica(2222);


    }
}
