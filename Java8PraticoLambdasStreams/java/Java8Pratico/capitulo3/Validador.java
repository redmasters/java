package Java8Pratico.capitulo3;

@FunctionalInterface
public interface Validador <T>{
    boolean valida(T t);
}
