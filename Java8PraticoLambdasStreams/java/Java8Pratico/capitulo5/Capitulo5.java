package Java8Pratico.capitulo5;

import Java8Pratico.capitulo2.Usuario;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import static java.util.Comparator.comparing;

public class Capitulo5 {
    public static void main(String[] args) {

        Usuario user1 = new Usuario("Gabriel Pereira", 160);
        Usuario user2 = new Usuario("Erasmo Jr", 134);
        Usuario user3 = new Usuario("Waidiney Jr", 3330);
        Usuario user4 = new Usuario("Amanda Carvalho", 10);
        Usuario user5 = new Usuario("Josy Rodrigues", 99990);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3, user4, user5);

        Comparator<Usuario> comparador = new Comparator<Usuario>() {
            @Override
            public int compare(Usuario u1, Usuario u2) {
                return u1.getNome().compareTo(u2.getNome());
            }
        };

        Collections.sort(usuarios, comparador);

        // Rescrevendo Comparator
        // Forma 1
        Comparator<Usuario> comparator =
            (u1, u2) -> u1.getNome().compareTo(u2.getNome());

        Collections.sort(usuarios, comparator);

        // Forma 2
        Collections.sort(usuarios,
            (u1, u2) -> u1.getNome().compareTo(u2.getNome()));

        // List Sort
        usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));

        // Comparing
        Comparator<Usuario> comparator1 =
            comparing(u -> u.getNome());

        Comparator<Usuario> comparator2 =
            comparing(u -> u.getPontos());

        usuarios.sort(comparator1);
        usuarios.forEach(u -> System.out.println("By Name: " + u.getNome()));

        usuarios.sort(comparator2);
        usuarios.forEach(u -> System.out.println("By Points ASC: " + u.getPontos()));

        usuarios.sort(Comparator.comparing(u -> u.getNome()));
        usuarios.forEach(u -> System.out.println("COMPARATOR: By Name: " + u.getNome()));
        System.out.println("\n");
        usuarios.sort(comparing(u -> u.getNome()));
        usuarios.forEach(u -> System.out.println("STATIC COMPARING: By Name: " + u.getNome()));

        // Indexando pela ordem natural
        List<String> palavras = Arrays.asList("Casa do Codigo", "Alura", "Caelum", "Branca de Neve", "Zappata");
        Collections.sort(palavras);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Ordenacao com Collections:");
        System.out.println(palavras);

        System.out.println("\n");
        palavras.sort(Comparator.naturalOrder());
        System.out.println("Natural Order:");
        System.out.println(palavras);

        System.out.println("\n");
        palavras.sort(Comparator.reverseOrder());
        System.out.println("Reverse Order:");
        System.out.println(palavras);

        Function<Usuario, String> extraiNome = u -> u.getNome();
        Comparator<Usuario> comparator3 =
            Comparator.comparing(extraiNome);

        usuarios.sort(comparator3);
        System.out.println("Comparator usando Function:");
        System.out.println(usuarios);

        Function<Usuario, Integer> extraiPontos= u -> u.getPontos();
        Comparator<Usuario> comparator4 =
            Comparator.comparing(extraiPontos);

        usuarios.sort(comparator4);
        System.out.println("\n");
        System.out.println("Comparator usando Function<Integer> by Points");
        System.out.println(usuarios);

        ToIntFunction<Usuario> extraiPontosComInt = u -> u.getPontos();
        Comparator<Usuario> comparator5 =
            Comparator.comparingInt(extraiPontosComInt);

        System.out.println("\n");
        System.out.println("Comparator usando ToIntFunction<Usuario> by Points");
        System.out.println(usuarios);

        usuarios.sort(Comparator.comparingInt(u -> u.getPontos()));
        System.out.println(usuarios);



    }
}

















