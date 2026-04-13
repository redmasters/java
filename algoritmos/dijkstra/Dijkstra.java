import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class Dijkstra {
  private int vertices[][];
  private Set<Integer> nosVisitados = new HashSet<>();
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

  public List<Integer> getCaminho() {
    log.info("Caminho criado: %s".formatted(listaCaminho.toString().replace(",", " ->")));
    return listaCaminho;
  }

  public List<Integer> getDistancia() {
    if (nosVisitados.isEmpty()) {
      // distancias com caminhos infinitos
      for (int i = 0; i < vertices.length; i++) {
        if (i == 0) {
          listaDistancia.put(i, 0);
        } else {
          listaDistancia.put(i, Integer.MAX_VALUE);
        }
      }

    }
    var distanciaLista = new ArrayList<>(listaDistancia.entrySet());

    log.info("Distancia criada: %s".formatted(distanciaLista.toString().replace(",", " ->")));

    return distanciaLista.stream().map(Map.Entry::getValue).toList();
  }

}
