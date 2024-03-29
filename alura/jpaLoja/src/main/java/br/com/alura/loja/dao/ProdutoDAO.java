package br.com.alura.loja.dao;

import br.com.alura.loja.model.Produto;

import javax.persistence.EntityManager;
import java.util.List;

public class ProdutoDAO {

    private EntityManager em;

    public ProdutoDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Produto produto){
        this.em.persist(produto);
    }

    public Produto buscarPorId(Long id){
       return em.find(Produto.class, id) ;
    }

    public List<Produto> buscarTodos(){
        String jpql = "SELECT p FROM Produto p";
        return em.createQuery(jpql, Produto.class).getResultList();
    }

    public List<Produto> buscarPorNome(String nome){
        String jpql = "SELECT p FROM Produto p where p.nome = :nome";
        return em.createQuery(jpql, Produto.class)
                .setParameter("nome", nome)
                .getResultList();
    }

    public List<Produto> buscarPorCategoria(String categoria){
        String jpql = "SELECT p FROM Produto p where p.categoria.nome = :categoria";
        return em.createQuery(jpql, Produto.class)
                .setParameter("categoria", categoria)
                .getResultList();
    }
}
