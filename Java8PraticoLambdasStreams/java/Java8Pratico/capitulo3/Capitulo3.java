package Java8Pratico.capitulo3;

public class Capitulo3 {
    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    System.out.println(i);

                }
            }
        };
        new Thread(r).start();

        // Instanciada com expressao lambda
        Runnable run = () -> {
            for (int i = 0; i <= 1000; i++) {
                System.out.println(i);
            }
        };

        new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                System.out.println("Thread" + i);
            }
        }).start();

        // Listeners
        // Funcoes Lambdas Customizadas
        Validador<String> validadorCEP = new Validador<String>() {
            @Override
            public boolean valida(String valor) {
                return valor.matches("[0-9]{5}-[0-9]{3}");
            }
        };

        Validador<String> validadorCEP2 =
            valor -> {
            return valor.matches("[0-9]{5}-[0-9]{3}");
            };

        Validador<String> validadorCEP3 =
            valor -> valor.matches("[0-9]{5}-[0-9]{3}");

        validadorCEP3.valida("65058-566");



    }

}
