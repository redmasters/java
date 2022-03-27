package Java8Pratico.capitulo6;

import Java8Pratico.capitulo2.Usuario;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

// Method References
public class Capitulo6 {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Josy Rodrigues", 9999);
        Usuario user2 = new Usuario("Lucky Rodrigues Pereira", 3445);
        Usuario user3 = new Usuario("Erasmo Jr", 2355);
        Usuario user4 = new Usuario("Nina Rodrigues Pereira", 1235);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3, user4);

        usuarios.forEach(u -> u.tornaModerador());
        usuarios.forEach(u -> System.out.println(u.isModerador()));

        System.out.println("\n");
        usuarios.forEach(Usuario::tornaModerador);
        usuarios.forEach(u -> System.out.println(u.isModerador()));

        Consumer<Usuario> tornarModerador = Usuario::tornaModerador;
        usuarios.forEach(tornarModerador);

        // Usuarios por nome
        usuarios.sort(comparing(Usuario::getNome));
        System.out.println("\n");

        Function<Usuario, String> byName = Usuario::getNome;
        usuarios.sort(comparing(byName));
        usuarios.sort(comparingInt(Usuario::getPontos));

        Comparator<Usuario> c = Comparator.comparingInt(Usuario::getPontos)
            .thenComparing(Usuario::getNome);

        usuarios.sort(Comparator.comparingInt(Usuario::getPontos)
            .thenComparing(Usuario::getNome));

        usuarios.sort(Comparator.nullsLast(
            Comparator.comparing(Usuario::getNome)
        ));

        System.out.println(usuarios);

        usuarios.sort(comparing(Usuario::getPontos).reversed());
        usuarios.forEach(u -> System.out.println(u.getPontos()));

        // Referenciando Metodos em Instancia
        Usuario lucky = new Usuario("Lucky", 10);
        Runnable bloco = lucky::tornaModerador;
        bloco.run();

        Runnable bloco1 = lucky::tornaModerador;
        Runnable bloco2 = () -> lucky.tornaModerador();

    }

}
