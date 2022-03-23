package br.jus.tjma.toadalab.avaliacao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import br.jus.tjma.toadalab.avaliacao.models.Cliente;
import br.jus.tjma.toadalab.avaliacao.models.Colaborador;
import br.jus.tjma.toadalab.avaliacao.models.Pessoa;
import br.jus.tjma.toadalab.avaliacao.models.TipoVinculo;
import br.jus.tjma.toadalab.avaliacao.models.Venda;
import br.jus.tjma.toadalab.avaliacao.models.cargos.GerenteLoja;
import br.jus.tjma.toadalab.avaliacao.models.cargos.GerenteVendas;
import br.jus.tjma.toadalab.avaliacao.models.cargos.VendedorLoja;
import br.jus.tjma.toadalab.avaliacao.models.funcoes.Gerente;
import br.jus.tjma.toadalab.avaliacao.models.funcoes.Vendedor;

/**
 * 
 */

/**
 * Classe Main para realização da Questão 1 [Java]
 * 
 * @author ToadaLab
 *
 */
public class Main {

	static Scanner scanner;

	// Estrutura de dados principal
	static HashMap<String, ArrayList<?>> data = new HashMap<>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--== EXECUÇÃO INICIADA ==--");

		seedData();

		try {
			scanner = new Scanner(System.in);
		} catch (Exception e) {
			e.printStackTrace();
		}

		menu();

		System.out.println("--== EXECUÇÃO FINALIZADA ==--");
	}

	private static void seedData() {
		// Insere clientes
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(new Cliente("Fulano de Tal", LocalDate.of(2001, 11, 11), 1111111111,
				"Rua A, 110, Turu. São Luis - MA"));
		clientes.add(new Cliente("Balbino Comprador", LocalDate.of(2001, 11, 11), 1222222222,
				"Rua A, 110, Turu. São Luis - MA"));
		clientes.add(new Cliente("João Gastão", LocalDate.of(2001, 11, 11), 1333333333,
				"Rua A, 110, Turu. São Luis - MA"));
		data.put("clientes", clientes);

		// Insere colaboradores
		ArrayList<Colaborador> colaboradores = new ArrayList<Colaborador>();
		colaboradores.add(new VendedorLoja("Marcio Miranda", LocalDate.of(1998, 11, 14), 123456,
				"Rua A, Casa 10, Qd. 05. Res. Vale 1, Dist. Industrial", TipoVinculo.EFETIVO, "Loja Centro", 2000.00f));
		colaboradores.add(new GerenteLoja("Nestor Gestor", LocalDate.of(2000, 4, 6), 1245678,
				"Rua 1, Casa 2, Qd. 3. Pq. Aurora. São Luis - MA", TipoVinculo.EFETIVO, "Loja Centro", 4000.00f));
		colaboradores.add(new GerenteVendas("João Vendão", LocalDate.of(2000, 4, 6), 15789464,
				"Av. Jerônimo de Albuquerque, Casa 205, Cohab. São Luis - MA", TipoVinculo.EFETIVO, "Loja Centro",
				3500.00f));
		data.put("colaboradores", colaboradores);

		// Cria lista vazia de vendas
		ArrayList<Venda> vendas = new ArrayList<Venda>();
		data.put("vendas", vendas);
	}

	// Menu Principal
	private static void menu() {
		String input = null;
		do {
			printHeader();
			System.out.println("\n========== MENU PRINCIPAL ==========");
			System.out.println("======================================");
			System.out.println("|     1 - Registrar Venda            |");
			System.out.println("|     2 - Listar/Autorizar Venda     |");
			System.out.println("|     3 - Cadastro de Colaboradores  |");
			System.out.println("|     4 - Cadastro de Clientes       |");
			System.out.println("|     0 - Sair                       |");
			System.out.println("======================================\n");

			System.out.println("Opção -> ");

			input = scanner.nextLine();

			switch (input) {
			case "1":
				registrarVenda();
				break;
			case "2":
				autorizarVenda();
				break;
			case "3":
				cadastrarColaborador();
				break;
			case "4":
				cadastrarCliente();
				break;
			case "0":
				System.out.println("Saindo do sistema...");
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (!input.equals("0"));
	}

	private static void cadastrarCliente() {
		clearScreen();

		@SuppressWarnings("unchecked")
		ArrayList<Pessoa> clientes = (ArrayList<Pessoa>) data.get("clientes");

		printHeader();
		printListPessoas(clientes, "CADASTRO DE CLIENTES");

		System.out.println("Informe os dados do novo cliente abaixo.");
		System.out.println("Responda 0 em qualquer das questões para voltar ao menu principal.\n");
		System.out.flush();

		String input;

		System.out.println("Informe o nome do cliente:");
		input = scanner.nextLine();
		System.out.println();

		if (input.equals("0"))
			return;

		Cliente novoCliente = new Cliente(); // Só cria após início do cadastro
		novoCliente.setNome(input);

		System.out.println("Informe o CPF do cliente [somente números]:");
		input = scanner.nextLine();
		System.out.println();

		if (input.equals("0"))
			return;

		//TODO: {Questão 2e} Validar o tipo de entrada
		//TODO: {Questão 2h} Validar CPF
		novoCliente.setCPF(Integer.parseInt(input));

		LocalDate dataNascimento = null;
		do {
			System.out.println("Informe o nascimento do cliente [dd/mm/yyyy]:");
			input = scanner.nextLine();
			System.out.println();

			if (input.equals("0"))
				return;

			dataNascimento = parseDate(input);
		} while (dataNascimento == null);
		novoCliente.setDataNascimento(dataNascimento);

		System.out.println("Informe o endereço do cliente [em uma linha]:");
		input = scanner.nextLine();
		System.out.println();

		if (input.equals("0"))
			return;

		novoCliente.setEndereco(input);

		clientes.add(novoCliente);
		data.replace("clientes", clientes);
		System.out.println("Cliente cadastrado com sucesso!");

		System.out.println("Pressione qualquer tecla pra prosseguir...");
		scanner.nextLine();
	}

	 //TODO: {Questão 2b} Descubra e corrija o bug
	private static void cadastrarColaborador() {
		clearScreen();

		@SuppressWarnings("unchecked")
		ArrayList<Pessoa> colaboradores = (ArrayList<Pessoa>) data.get("colaboradores");

		printHeader();
		printListPessoas(colaboradores, "CADASTRO DE COLABORADORES");

		System.out.println("Informe os dados do novo colaborador abaixo.");
		System.out.println("Responda 0 em qualquer das questões para voltar ao menu principal.\n");
		System.out.flush();

		String input;

		System.out.println("Informe o tipo do colaborador a cadastrar:");
		System.out.println("1 - Gerente de Loja");
		System.out.println("2 - Gerente de Vendas");
		System.out.println("3 - Vendedor");
		System.out.println("Opção -> ");
		input = scanner.nextLine();
		System.out.println();

		if (input.equals("0"))
			return;

		Colaborador novoColaborador;
		switch (input) {
		case "1":
			novoColaborador = new GerenteLoja();
			break;
		case "2":
			novoColaborador = new GerenteLoja();
			break;
		case "3":
			novoColaborador = new VendedorLoja();
			break;
		default:
			System.out.println("Tipo de colaborador inválido!");
			System.out.println("Pressione qualquer tecla pra prosseguir...");
			scanner.nextLine();
			return;
		}

		System.out.println("Informe o nome do colaborador:");
		input = scanner.nextLine();
		System.out.println();

		if (input.equals("0"))
			return;

		novoColaborador.setNome(input);

		System.out.println("Informe o CPF do colaborador [somente números]:");
		input = scanner.nextLine();
		System.out.println();

		if (input.equals("0"))
			return;
		
		//

		//TODO: {Questão 2e} Validar o tipo de entrada
		//TODO: {Questão 2h} Validar CPF
		novoColaborador.setCPF(Integer.parseInt(input));

		LocalDate dataNascimento = null;
		do {
			System.out.println("Informe o nascimento do colaborador [dd/mm/yyyy]:");
			input = scanner.nextLine();
			System.out.println();

			if (input.equals("0"))
				return;

			dataNascimento = parseDate(input);
		} while (dataNascimento == null);
		novoColaborador.setDataNascimento(dataNascimento);

		System.out.println("Informe o endereço do colaborador [em uma linha]:");
		input = scanner.nextLine();

		System.out.println();

		if (input.equals("0"))
			return;

		novoColaborador.setEndereco(input);

		do {
			System.out.println("Informe o tipo de vínculo do colaborador:");
			System.out.println("1 - " + TipoVinculo.EFETIVO);
			System.out.println("2 - " + TipoVinculo.PRESTADOR_SERVICOS);
			System.out.println("Opção -> ");
			input = scanner.nextLine();
			System.out.println();

			if (input.equals("0"))
				return;

			switch (input) {
			case "1":
				novoColaborador.setTipoVinculo(TipoVinculo.EFETIVO);
				break;
			case "2":
				novoColaborador.setTipoVinculo(TipoVinculo.PRESTADOR_SERVICOS);
				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (!input.equals("1") && !input.equals("2"));

		System.out.println("Informe o local de lotação do colaborador [em uma linha]:");
		input = scanner.nextLine();
		System.out.println();

		if (input.equals("0"))
			return;

		novoColaborador.setLocalLotacao(input);

		System.out.println("Informe o salário do colaborador [Formato 0000.00]:");
		input = scanner.nextLine();
		System.out.println();

		if (input.equals("0"))
			return;

		//TODO: {Questão 2f} Validar entrada para evitar erros
		novoColaborador.setSalario(Float.parseFloat(input)); 

		colaboradores.add(novoColaborador);
		data.replace("colaboradores", colaboradores);
		System.out.println("Colaborador cadastrado com sucesso!");

		System.out.println("Pressione qualquer tecla pra prosseguir...");
		scanner.nextLine();
	}

	private static void registrarVenda() {
		String input = null;
		Venda venda = new Venda();

		/*
		 * Escolha do vendedor
		 */
		@SuppressWarnings("unchecked")
		ArrayList<Pessoa> colaboradores = (ArrayList<Pessoa>) data.get("colaboradores");

		// Busca apenas vendedores
		ArrayList<Pessoa> vendedores = new ArrayList<Pessoa>();
		for (Pessoa c : colaboradores) {
			if (c instanceof Vendedor) {
				vendedores.add(c);
			}
		}

		printListPessoas(vendedores, "LISTA DE VENDEDORES");
		System.out.println("Escolha o vendedor responsável:");
		System.out.println("Opção -> ");
		input = scanner.nextLine();
		System.out.println();

		if (input.equals("0"))
			return;

		//TODO: {Questão 2f} Validar entrada para evitar erros
		int opcao = Integer.parseInt(input);
		opcao--; // Corrigindo índice (0 é o primeiro)

		//TODO: {Questão 2d} Existe um bug nessa operação, ao escolher opção inválida (i.e. fora dos limites da lista)
		
		venda.setVendedor((Vendedor) vendedores.get(opcao));

		/*
		 * Escolha do cliente
		 */
		@SuppressWarnings("unchecked")
		ArrayList<Pessoa> clientes = (ArrayList<Pessoa>) data.get("clientes");

		printListPessoas(clientes, "LISTA DE CLIENTES");
		System.out.println("Escolha o cliente comprador:");
		System.out.println("Opção -> ");
		input = scanner.nextLine();
		System.out.println();

		if (input.equals("0"))
			return;

		//TODO: {Questão 2f} Validar entrada para evitar erros
		opcao = Integer.parseInt(input);
		opcao--; // Corrigindo índice (0 é o primeiro)

		//TODO: {Questão 2d} Evitar escolha de opção inválida
		venda.setComprador((Cliente) clientes.get(opcao));

		/*
		 * Valor da venda
		 */
		System.out.println("Informe o valor da venda [Formato 0000.00]:");
		input = scanner.nextLine();
		System.out.println();

		if (input.equals("0"))
			return;

		//TODO: {Questão 2f} Validar entrada para evitar erros
		venda.setValorVenda(Float.parseFloat(input));

		@SuppressWarnings("unchecked")
		ArrayList<Venda> vendas = (ArrayList<Venda>) data.get("vendas");
		
		vendas.add(venda);
		data.replace("vendas", vendas);
		System.out.println("Venda cadastrada com sucesso!");

		System.out.println("Pressione qualquer tecla pra prosseguir...");
		scanner.nextLine();
	}

	private static void autorizarVenda() {
		String input = null;
		
		@SuppressWarnings("unchecked")
		ArrayList<Venda> vendas = (ArrayList<Venda>) data.get("vendas");

		/*
		 * Escolha da venda
		 */
		System.out.println("\n============================================ LISTA DE VENDAS ===================================================");
		System.out.println("\n==============================================================================================================");
		System.out.println(
				String.format("|%2s %-30s %-30s %-30s %-8s", "ID", "Vendedor", "Comprador", "Autorizador", "Valor"));
		//TODO: {Questão 2g} Caso não haja vendas cadastradas, exibir mensagem que informe isso na lista da tela.
		for (int i = 0; i < vendas.size(); i++) {
			Venda v = vendas.get(i);
			Colaborador vendedor = (Colaborador) v.getVendedor();
			Cliente cliente = (Cliente) v.getComprador();
			Colaborador gerente = (Colaborador) v.getAutorizador();
			//TODO: {Questão 2j} Bug caso a venda não tenha sido autorizada ainda
			System.out.println(String.format("|%2d %-30s %-30s %-30s %.2f", i + 1, vendedor.getNome(), cliente.getNome(),
					gerente.getNome()));
		}
		System.out.println("==============================================================================================================\n");
		System.out.println("Escolha a venda para autorizar:");
		System.out.println("Opção -> ");
		input = scanner.nextLine();
		System.out.println();

		if (input.equals("0"))
			return;

		//TODO: {Questão 2f} Validar entrada para evitar erros
		int opcao = Integer.parseInt(input);
		opcao--; // Corrigindo índice (0 é o primeiro)

		//TODO: {Questão 2d} Existe um bug nessa operação, ao escolher opção inválida (i.e. fora dos limites da lista)

		Venda vendaEscolhida = vendas.get(opcao);
		
		/*
		 * Escolha de gerente autorizador 
		 */
		@SuppressWarnings("unchecked")
		ArrayList<Pessoa> colaboradores = (ArrayList<Pessoa>) data.get("colaboradores");

		// Busca apenas gerentes
		ArrayList<Pessoa> gerentes = new ArrayList<Pessoa>();
		for (Pessoa c : colaboradores) {
			if (c instanceof Gerente) {
				gerentes.add(c);
			}
		}
		
		printListPessoas(gerentes, "LISTA DE GERENTES");
		System.out.println("Escolha o gerente autorizador:");
		System.out.println("Opção -> ");
		input = scanner.nextLine();
		System.out.println();

		if (input.equals("0"))
			return;

		//TODO: {Questão 2f} Validar entrada para evitar erros
		opcao = Integer.parseInt(input);
		opcao--; // Corrigindo índice (0 é o primeiro)

		//TODO: {Questão 2d} Existe um bug nessa operação, ao escolher opção inválida (i.e. fora dos limites da lista)

		Gerente gerenteEscolhido = (Gerente) gerentes.get(opcao);
		vendaEscolhida.setAutorizador(gerenteEscolhido);
		gerenteEscolhido.autorizarVenda();
		
		vendas.set(vendas.indexOf(vendaEscolhida), vendaEscolhida);
		data.replace("vendas", vendas);
		System.out.println("Venda autorizada com sucesso!");
		System.out.println("Pressione qualquer tecla pra prosseguir...");
		scanner.nextLine();
	}

	/*
	 * =================== MÉTODOS AUXILIARES ===================
	 */
	
	/*
	 * Função que valida e converte string no formato dia/mês/ano em LocalDate
	 * 
	 * Essa função também deve informar o usuário sobre data inválida (System.out...) 
	 */
	//TODO: {Questão 2c} Implemente esta função
	private static LocalDate parseDate(String input) {
		return null;
	}

	//TODO: {Questão 2i} Exibir tipo de vínculo do colaborador
	private static void printListPessoas(ArrayList<Pessoa> pessoas, String titulo) {
		System.out.println("\n=============== " + titulo + " =================");
		System.out.println("\n=======================================================");
		for (int i = 0; i < pessoas.size(); i++) {
			Pessoa p = pessoas.get(i);
			System.out.println(String.format("|%d %-30s - CPF: %15s - %s", i + 1, p.getNome(), p.getCPF(),
					p.getClass().getSimpleName()));
		}
		System.out.println("=======================================================\n");
	}

	private static void printHeader() {
		System.out.println("\n### AVALIAÇÃO TOADALAB ###");
		System.out.println("\n\n### Sistema Teste de Cadastro de Vendas ###");
	}

	/**
	 * Função que limpa a tela quando a aplicação roda a partir do console
	 */
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

}
