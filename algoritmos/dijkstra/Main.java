public class Main {
  private static final int S0 = 0;
  private static final int S1 = 1;
  private static final int S2 = 2;
  private static final int S3 = 3;
  private static final int S4 = 4;
  private static final int S5 = 5;
  private static final int S6 = 6;

  public static void main(String[] args) {

    int numVertices = 7;
    var dijkstra = new Dijkstra(numVertices);

    dijkstra.criarAresta(S0, S0, 0);
    dijkstra.criarAresta(S0, S1, 2);
    dijkstra.criarAresta(S0, S2, 6);
    dijkstra.criarAresta(S1, S3, 5);
    dijkstra.criarAresta(S2, S3, 8);
    dijkstra.criarAresta(S3, S4, 10);
    dijkstra.criarAresta(S3, S5, 15);
    dijkstra.criarAresta(S4, S5, 6);
    dijkstra.criarAresta(S5, S6, 6);
    dijkstra.criarAresta(S4, S6, 2);
    dijkstra.getDistanciaNaoConhecida();
    dijkstra.getNoMaisProximo(S0);
    dijkstra.getDistanciaConhecida();

  }
}
