package Java8Pratico.capitulo4;

import Java8Pratico.capitulo2.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

//Default Methods
public class Capitulo4 {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Gabriel Pereira", 160);
        Usuario user2 = new Usuario("Erasmo Jr", 134);
        Usuario user3 = new Usuario("Waidiney Jr", 3330);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        Consumer<Usuario> mostraMensagem = u ->
            System.out.println("Antes de imprimir os nomes");

        Consumer<Usuario> imprimeNome = u ->
            System.out.println(u.getNome());

        usuarios.forEach(mostraMensagem.andThen(imprimeNome));

        List<Usuario> usuarios1 = new ArrayList<>();
        usuarios1.add(user1);
        usuarios1.add(user2);
        usuarios1.add(user3);

        usuarios1.removeIf(u -> u.getPontos() > 3000);
        usuarios1.forEach(u -> System.out.println(u.getNome()));



    }
}
