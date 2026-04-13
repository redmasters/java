import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class Dijkstra {
  private int vertices[][];
  private boolean nosVisitados[];
  private List<Integer> listaCaminho = new ArrayList<Integer>();
  private Map<Integer, Integer> listaDistancia = new HashMap<>();
  private static Logger log = Logger.getLogger(Dijkstra.class.getName());

  public Dijkstra(final int numVertices) {
    vertices = new int[numVertices][numVertices];
  }

  public void criarAresta(final int noOrigem, final int noDestino, final int caminho) {
    if (caminho < 0) {
      throw new InvalidParameterException("Peso negativo");
    }
    if (noOrigem == noDestino) {
      vertices[noOrigem][noDestino] = 0;
    }

    vertices[noOrigem][noDestino] = caminho;
    vertices[noDestino][noOrigem] = caminho;
    log.info("Aresta criada: %s -> %s, caminho: %s".formatted(noOrigem, noDestino, caminho));
    criarCaminho(noOrigem, noDestino, caminho);

  }

  public void criarCaminho(final int noOrigem, final int noDestino, final int caminho) {
    for (int i = 0; i < vertices.length; i++) {

      if (i == noOrigem) {
        listaCaminho.add(noOrigem);
      }
      if (i == noDestino) {
        listaCaminho.add(noDestino);
      }
    }
  }

  public int getDistancia(int[] distancia, boolean[] visitados) {
    int min = Integer.MAX_VALUE;
    int minIndex = -1;

    for (int v = 0; v < vertices.length; v++) {
      if (!visitados[v] && distancia[v] < min) {
        min = distancia[v];
        minIndex = v;
      }
    }
    return minIndex;
  }

  public void getCaminho(int origem) {
    int[] distancia = new int[vertices.length];
    nosVisitados = new boolean[vertices.length];
    Arrays.fill(distancia, Integer.MAX_VALUE);
    distancia[origem] = 0;

    for (int count = 0; count < vertices.length - 1; count++) {
      int u = getDistancia(distancia, nosVisitados);
      nosVisitados[u] = true;

      for (int v = 0; v < vertices.length; v++) {
        if (!nosVisitados[v] &&
            vertices[u][v] != 0 &&
            distancia[u] != Integer.MAX_VALUE
            && distancia[u] + vertices[u][v] < distancia[v]) {
          distancia[v] = distancia[u] + vertices[u][v];
        }
      }
    }
    imprimirCaminho(distancia, origem);
    imprimirVisitados();
  }

  public void imprimirCaminho(int[] distancia, int origem) {
    System.out.println("distancias minimas do vertice %s para todos os outros vertices:".formatted(origem));

    System.out.println("Vertice \t Distancia");
    for (int i = 0; i < vertices.length; i++) {
      System.out.println("%d \t\t %d".formatted(i, distancia[i]));
    }

  }

  public void imprimirVisitados() {
    System.out.println("Vertices visitados:");
    for (int i = 0; i < nosVisitados.length; i++) {
      if (nosVisitados[i]) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

  public void imprimirArestas() {
    System.out.println("Matriz de adjacencia:");
    System.out.println("    0  1  2  3  4  5  6");
    for (int i = 0; i < vertices.length; i++) {
      System.out.print(i + " ");
      for (int j = 0; j < vertices.length; j++) {
        if (vertices[i][j] == 0 && i != j) {
          System.out.print("   -");
        } else {
          System.out.printf("%3d ", vertices[i][j]);
        }
      }
      System.out.println("\n");
    }
    System.out.println();
  }

}
