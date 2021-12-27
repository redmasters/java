package main.java.io.redmasters.javabuilder.builders;

import java.util.Date;
import java.util.List;

public class Blog implements Artigo{
    private String autor;
    private String titulo;
    private List marcacoes;
    private int paginas;
    private Date publicado;
    private String texto;

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public List getMarcacoes() {
        return marcacoes;
    }

    public int getPaginas() {
        return paginas;
    }

    public Date getPublicado() {
        return publicado;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void setMarcacoes(List marcacoes) {
        this.marcacoes = marcacoes;
    }

    @Override
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public void setDataDaPublicacao(Date data) {
        this.publicado = data;

    }

    @Override
    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Blog{" +
            "autor='" + autor + '\'' +
            ", titulo='" + titulo + '\'' +
            ", marcacoes=" + marcacoes +
            ", paginas=" + paginas +
            ", publicado=" + publicado +
            ", texto='" + texto + '\'' +
            '}';
    }
}
