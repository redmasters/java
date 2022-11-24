package br.com.alura.loja;

import br.com.alura.loja.dao.CategoriaDAO;
import br.com.alura.loja.dao.ProdutoDAO;
import br.com.alura.loja.model.Categoria;
import br.com.alura.loja.model.Produto;
import br.com.alura.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class CadastroDeProduto {
    public static void main(String[] args) {
        cadastrarProduto();

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        Produto p = produtoDAO.buscarPorId(1L);
        System.out.println(p.getPreco());

        List<Produto> produtoList = produtoDAO.buscarTodos();
        produtoList.forEach(p2 -> System.out.println(p.getNome()));

        List<Produto> listaProduto = produtoDAO.buscarPorNome("Xiaomi");
        listaProduto.forEach(p2 -> System.out.println(p.getNome()));

        List<Produto> todos = produtoDAO.buscarPorCategoria("CELUARES");
        todos.forEach(c1 -> System.out.println(c1.getCategoria().getNome()));



    }

    private static void cadastrarProduto() {
        Categoria celulares = new Categoria("CELULARES");
        Produto celular = new Produto(
                "Xiaomi",
                "Top",
                new BigDecimal("899"),
                celulares
        );

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDAO produtoDAO = new ProdutoDAO(em);
        CategoriaDAO categoriaDAO = new CategoriaDAO(em);

        em.getTransaction().begin();

        categoriaDAO.cadastrar(celulares);
        produtoDAO.cadastrar(celular);
        em.getTransaction().commit();

        em.close();
    }
}
