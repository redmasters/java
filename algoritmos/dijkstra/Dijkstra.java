import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dijkstra {
  private int vertices[][];

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

    getPeso(noOrigem, noDestino);

  }

  public List<Integer> getNosNaoVisitados() {
    var listaNosNaoVisitados = new ArrayList<Integer>();
    for (int i = 0; i < vertices.length; i++) {
      listaNosNaoVisitados.add(i);
    }

    return listaNosNaoVisitados;

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
    System.out.println("nao visitados: " + listaNosNaoVisitados.toString());

    for (Integer integer : listaNosNaoVisitados) {

      if (noOrigem < integer) {
        noMaisProximo = integer;
        break;
      }
    }
    System.out.println("no mais proximo: " + noMaisProximo);
    return noMaisProximo;
  }

  public int getPeso(int noOrigem, int noDestino) {
    var peso = vertices[noOrigem][noDestino];
    System.out.println("peso: " + peso);
    return peso;
  }
}
