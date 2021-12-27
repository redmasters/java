package main.java.io.redmasters.javabuilder.builders;

import java.util.Date;
import java.util.List;

public interface Artigo {
    void setAutor(String autor);
    void setTitulo(String nome);
    void setMarcacoes(List marcacoes);
    void setPaginas(int paginas);
    void setDataDaPublicacao(Date data);
    void setTexto(String texto);
    String toString();
}
