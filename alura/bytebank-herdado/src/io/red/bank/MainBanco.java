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

        ContaCorrente cc3 = new ContaCorrente(
                "Corrente3",
                333,
                233
        );

        cc3.deposita(100.0);
        System.out.println(cc3.getSaldo());

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorImposto calc = new CalculadorImposto();

        calc.registra(cc);
        calc.registra(seguro);

        System.out.println("Calc imposto");
        System.out.println(calc.getTotalImposto());

    }
}
