package io.red.bank;

public class MainBanco {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("Corrente", 111, 1234);
        System.out.println(cc.getNome());
        cc.deposita(100);
        System.out.println(cc.getSaldo());
        cc.saca(30);
        System.out.println(cc.getSaldo());
        System.out.println("\n--------------");

    }
}
