package br.jus.tjma.toadalab.avaliacao;

import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import us.codecraft.xsoup.Xsoup;


/*
 * Classe para realização da questão 2 [XPath]
 * 
 *  * @author ToadaLab
 */
public class MainXPath {

	public static void main(String[] args) {
		//URL: https://www.tjma.jus.br/midia/toadalab/pagina/hotsite/500297
		//Objetivo: buscar os valores contidos nos elementos Missão, Visão, Valores da página acima.
		
		//TODO: {Questão 3} Preencher as variáveis com os valores xPath correspondentes 
		String  xPathMissao = "", //3a
				xPathVisao = "", //3b
				xPathValores = "", //3c
				xPathAumentarFonte = "", //3d
				xPathIdiomaPtBr = ""; //3e
		
		URL toadaLabUrl;
		try {
			toadaLabUrl = new URL("https://www.tjma.jus.br/midia/toadalab/pagina/hotsite/500297");
			
			Document doc = Jsoup.parse(toadaLabUrl, 5000);
			
			String missao = Xsoup.compile(xPathMissao).evaluate(doc).getElements().text();
			String visao = Xsoup.compile(xPathVisao).evaluate(doc).getElements().text();
			String valores = Xsoup.compile(xPathValores).evaluate(doc).getElements().text();
			
			String titleAumentaFonte = Xsoup.compile(xPathAumentarFonte).evaluate(doc).getElements().attr("title");

			String altIdiomaPtBr = Xsoup.compile(xPathIdiomaPtBr).evaluate(doc).getElements().attr("alt");
			
			
			System.out.println("Missão: " + missao);
			System.out.println("Visão: " + visao);
			System.out.println("Valores: " + valores);
			System.out.println("Title da imagem de aumento de fonte: " + titleAumentaFonte);
			System.out.println("Alt do Idioma pt_BR: " + altIdiomaPtBr);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
        

	}

}
