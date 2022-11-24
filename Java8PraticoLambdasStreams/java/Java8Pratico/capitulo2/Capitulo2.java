package Java8Pratico.capitulo2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2 {
    public static void main(String... args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silvaeirra", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        for (Usuario u : usuarios) {
            System.out.println(u.getNome());
        }

        System.out.println("---Mostrador---");
        Mostrador mostrador = new Mostrador();
        usuarios.forEach(mostrador);

        System.out.println("---Mostrador1---");
        Consumer<Usuario> mostrador1 = new Consumer<Usuario>() {
            @Override
            public void accept(Usuario usuario) {
                System.out.println(usuario.getNome());
            }
        };
        usuarios.forEach(mostrador1);

        System.out.println("---ForEach---");
        usuarios.forEach(new Consumer<Usuario>() {
            @Override
            public void accept(Usuario usuario) {
                System.out.println(usuario.getNome());
            }
        });

        // O LAMBDA
        System.out.println("---Mostrador2---");
        Consumer<Usuario> mostrador2 =
            (Usuario u) -> { System.out.println(u.getNome());};

        System.out.println("---Mostrador3---");
        Consumer<Usuario> mostrador3 =
            u -> {
                System.out.println(u.getNome());
            };

        System.out.println("---Mostrador4---");
        Consumer<Usuario> mostrador4 =
            u ->
                System.out.println(u.getNome());

        System.out.println("ForEach");
        usuarios.forEach(u -> System.out.println(u.getNome()));

        System.out.println("TornaModerador");
        usuarios.forEach(u -> u.tornaModerador());

    }
}
