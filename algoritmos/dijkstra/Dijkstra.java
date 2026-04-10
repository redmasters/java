import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dijkstra {
  private int vertices[][];
  private Set<Integer> nosNaoVisitados = new HashSet<>();

  public Dijkstra(final int numVertices) {
    vertices = new int[numVertices][numVertices];
  }

  public void criarAresta(final int noOrigem, final int noDestino, final int peso) {
    if (peso < 0) {
      throw new InvalidParameterException("Peso negativo");
    }
    if (noOrigem == noDestino) {
      vertices[noOrigem][noDestino] = 0;
    }

    vertices[noOrigem][noDestino] = peso;
    vertices[noDestino][noOrigem] = peso;

  }

  public Set<Integer> getNosNaoVisitados() {
    for (int i = 0; i < vertices.length; i++) {
      this.nosNaoVisitados.add(i);
    }

    return nosNaoVisitados;

  }

  public List<Integer> getDistanciaNaoConhecida() {
    var listaDistanciaNaoConhecida = new ArrayList<Integer>();
    var distanciaInicial = 0;
    var distianciaInfinita = Integer.MAX_VALUE;
    listaDistanciaNaoConhecida.add(distanciaInicial);

    for (int i = 0; i < vertices.length; i++) {
      if (i != distanciaInicial) {
        listaDistanciaNaoConhecida.add(distianciaInfinita);
      }

    }

    System.out.println("distancia nao conhecida: " + listaDistanciaNaoConhecida.toString());
    return listaDistanciaNaoConhecida;
  }

  public int getNoMaisProximo(int noOrigem) {
    var noMaisProximo = 0;
    var listaNosNaoVisitados = getNosNaoVisitados();

    for (Integer integer : listaNosNaoVisitados) {

      if (noOrigem < integer) {
        noMaisProximo = integer;
        System.out.println("no origem: %s, no mais proximo: %s, peso: %s".formatted(noOrigem, noMaisProximo,
            getPeso(noOrigem, noMaisProximo)));
        removeVisited(noOrigem, noMaisProximo);

        break;
      }

    }
    System.out.println("nao visitados: %s".formatted(listaNosNaoVisitados.toString()));
    return noMaisProximo;
  }

  public int getPeso(int noOrigem, int noDestino) {
    var peso = vertices[noOrigem][noDestino];
    return peso;
  }

  public void removeVisited(int noOrigem, int noDestino) {
    var listaNosNaoVisitados = nosNaoVisitados;
    if (listaNosNaoVisitados.contains(noOrigem) && listaNosNaoVisitados.contains(noDestino)) {
      listaNosNaoVisitados.remove(Integer.valueOf(noOrigem));
      listaNosNaoVisitados.remove(Integer.valueOf(noDestino));
    }
    getNosNaoVisitados();
  }
}
