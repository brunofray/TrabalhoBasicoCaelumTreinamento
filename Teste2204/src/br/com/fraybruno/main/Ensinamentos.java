package br.com.fraybruno.main;

import java.util.Scanner;

public class Ensinamentos {

	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);
		    int opcao = 0;
		    int enter = 0;
		    int press = 0;
		     
		    do {
		      System.out.println("## Escolha uma das opções abaixo ##");
		      System.out.println("Opção 1 - Elementos de POO");
		          System.out.println("Opção 2 - Construtores");
		          System.out.println("Opção 3 - Getters e Setters");
		          System.out.println("Opção 4 - Encapsulamento e polimorfismo");
		          System.out.println("Opção 5 - Classes abstratas e Class Object");
		          System.out.println("Opção 6 - Integer");
		          System.out.println("Opção 7 - Equals e Enhanced-for");
		          System.out.println("Opção 8 - Arrays");
		          System.out.println("Opção 9 - Collections e suas opções");
		          System.out.println("Opção 10 - Threads e suas opções");
		          System.out.println("Opção 11 - Scanner");
		          System.out.println("Opção 12 - Sockets");
		          System.out.println("Opção 0 - Sair do programa");
		          System.out.println("_______________________");
		           
		          System.out.print("Digite aqui sua opção: ");
		          opcao = Integer.parseInt(sc.nextLine());
		          cls();
		           
		          if(opcao == 1){
		          System.out.print("ELEMENTOS: Classes, Objetos, Atributos, Métodos, Construtores");
		          System.out.println("\n## Pressione a opção que deseja mais conhecimento ##");
		          System.out.println("Opção 1 - Classes");
		          System.out.println("Opção 2 - Objetos");
		          System.out.println("Opção 3 - Atributos");
		          System.out.println("Opção 4 - Métodos");
		          System.out.println("Opção 0 - Voltar");
		          enter = Integer.parseInt(sc.nextLine());
		          cls();
		          
		          switch (enter) {
		          		case 1:
		          			System.out.println("Classes: \nArmazenam propriedades e métodos dentro dela, representam por exemplo: uma pessoa, um lugar, algo abstrato.\r\n" + 
		          					"Caracteristicas: Possui nome, possui visibilidade(public, private, protected)\r\n" + 
		          					"\r\n" + 
		          					"public class Teste{\r\n" + 
		          					"//ATRIBUTOS OU PROPRIEDADES\r\n" + 
		          					"//MÉTODOS\r\n" + 
		          					"}");
		          			voltarCls(sc);
		          			break;
		          			
		          		case 2:
		          			System.out.println("Objetos: \nSão caracteristicas definidas pelas classes.\r\n" + 
		          					"Instanciam objetos da classe para inicializar atributos e invocar métodos.\r\n" + 
		          					"Todo objeto é algo que existe, concreto. Já a classe é um modelo ou projeto de um objeto, intocavel.");
		          			voltarCls(sc);
		          			break;
		          			
		          		case 3:
		          			System.out.println("Atributos: \nSão propriedades de um objetos. Conhecidos como variáveis. \r\n" + 
		          					"Definem estado de objeto, podendo sofrer alterações.");
		          			voltarCls(sc);
		          			break;
		          			
		          		case 4:
		          			System.out.println("Métodos: \nSão ações ou procedimentos a tomar, podem interagir e se comunicarem com outros objetos.\r\n" + 
		          					"Boas práticas, indicado sempre usar nomes declarados como verbos (voltar,avançar,resgatar).");
		          			voltarCls(sc);
		          			break;

		          		default:
		          			System.out.println();
		          			break;
		          }
		         
		          }else if(opcao == 2){
		        	  System.out.println("Construtores:\r\n" + 
		        	  		"Método especial, inicializa seus atributos toda vez que é instanciado.\r\n" + 
		        	  		"Toda palavra \"new\", o objeto solicita armazenar, onde chama o construtor para inicializar o objeto.\r\n" + 
		        	  		"Identificação sempre pelo próprio nome da classe.\r\n" + 
		        	  		"Toda classe tem um construtor padrão, mesmo sem declarar.\r\n" + 
		        	  		"Esse construtor não recebe argumentos e existe para possibilitar a criação de objetos para uma classe.");
		        	  voltarCls(sc);
		          } else if(opcao == 3){
		        	  System.out.println("Getters e Setters:\r\n" + 
		        	  		"Fornecem métodos acessores para preservar a flexibilidade de alterar a representação interna da classe.\r\n" + 
		        	  		"Classes publicas não devem expor campos mutaveis.");
		        	  voltarCls(sc);
		          } else if(opcao == 4){
		        	  System.out.println("## Pressione a opção que deseja mais conhecimento ##");
			          System.out.println("Opção 1 - Encapsulamento");
			          System.out.println("Opção 2 - Static");
			          System.out.println("Opção 3 - Polimorfismo");
			          System.out.println("Opção 0 - Voltar");
			          enter = Integer.parseInt(sc.nextLine());
			          cls();
			          switch (enter) {
						case 1:
							System.out.println("Encapsulamento:\r\n" + 
									"Private, protected, public.\r\n" + 
									"Esconde a maneira como os objetos guardam seus dados. Ajuda a proteger os atributos.\r\n" + 
									"Oferece a ideia de tornar o software mais flexivel, facil de modificar e de criar novas implementações.\r\n" + 
									"Oferece controle de acesso aos atributos e métodos.");
							voltarCls(sc);
							break;
						case 2:
							System.out.println("Static: \r\n" + 
									"Atributo não passa mais ser de cada objeto, mas sim um atributo de classe. Informação fica guardada pela classe.");					
							voltarCls(sc);
							break;
						case 3:
							System.out.println("Polimorfismo:\r\n" + 
									"Um objeto nasce de um tipo e morre daquele tipo, o que muda é a maneira da qual nos referimos a ele.");
							voltarCls(sc);
							break;
						default:
							System.out.println();
							break;
					}
		          } else if(opcao == 5){
		        	  System.out.println("## Pressione a opção que deseja mais conhecimento ##");
			          System.out.println("Opção 1 - Classes abstratas");
			          System.out.println("Opção 2 - Overloading");
			          System.out.println("Opção 3 - Classe Object");
			          System.out.println("Opção 0 - Voltar");
			          enter = Integer.parseInt(sc.nextLine());
			          cls();
			          switch (enter) {
			          	case 1:
			          		System.out.println("Classe abstrata:\r\n" + 
			          				"Uma classe abstrata não pode ser instanciada, apenas referenciada. \r\n" + 
			          				"Servindo para polimorfismo e herança dos atributos e métodos.");
			          		voltarCls(sc);
			          		break;
			          	case 2:
			          		System.out.println("Overloading - sobrecarga de método:\r\n" + 
			          				"São métodos possuem o mesmo nome mas que não são ambiguos, há uma maneira de distinguir na chamada.");
			          		voltarCls(sc);
			          		break;
			          	case 3:
			          		System.out.println("Classe Object:\r\n" + 
			          				"É a classe da qual todas as clasess, sem exceção, herdam.");
			          		voltarCls(sc);
			          		break;
			          	default:
			          		System.out.println();
			          		break;
					}
		          } else if(opcao == 6){
		        	  System.out.println("Integer:\r\n" + 
		        	  		"É o objeto também conhecido como wrapper(classe que representa um tipo primitivo), diferente do int que é tipo primitivo.\r\n" + 
		        	  		"Tipo primitivo não representa uma classe.\r\n" + 
		        	  		"Int quando vazio apresenta \"0\", Integer quando vazio apresenta NULL.");
		        	  voltarCls(sc);
		          } else if(opcao == 7){
		        	  System.out.println("## Pressione a opção que deseja mais conhecimento ##");
			          System.out.println("Opção 1 - Equals");
			          System.out.println("Opção 2 - Enhanced-for");
			          System.out.println("Opção 0 - Voltar");
			          enter = Integer.parseInt(sc.nextLine());
			          cls();
			          switch (enter) {
			          	case 1:
			          		System.out.println("Equals:\r\n" + 
			          				"É utilizado para comparações.");
			          		voltarCls(sc);
			          		break;
			          	case 2:
			          		System.out.println("Enhanced-For (for aprimorado):\r\n" + 
			          				"Pega um vetor(array,list,set) e itera por ele passando o valor em cada posição para a variavel esquerda.\r\n" + 
			          				"Se for numa lista passa os valores de forma ordenada, se for em Set depende do conjunto aplicado essa ordenação.\r\n" + 
			          				"Exemplo:\r\n" + 
			          				"void imprimeArray(int[] array) {  \r\n" + 
			          				"     for (int x : array) {  \r\n" + 
			          				"            System.out.println(x);  \r\n" + 
			          				"     }  \r\n" + 
			          				"}\r\n" + 
			          				"Nesse caso o vetor a ser lido é o array, e a cada iteração o valor da posição será enviado a x.\r\n" + 
			          				"Percorrendo assim o vetor, até seu fim e imprimindo o resultado de cada espaço.\r\n" + 
			          				"No eclipse: escrevendo foreach e dando ctrl+espaço, ele monta um esqueleto para uso.");
			          		voltarCls(sc);
			          		break;

			          	default:
			          		System.out.println();
			          		break;
					}
		          } else if(opcao == 8){
		        	  System.out.println("## Pressione a opção que deseja mais conhecimento ##");
			          System.out.println("Opção 1 - Arrays");
			          System.out.println("Opção 2 - Arrays Muldidimensionais");
			          System.out.println("Opção 0 - Voltar");
			          enter = Integer.parseInt(sc.nextLine());
			          cls();
			          switch (enter) {
			          	case 1:
			          		System.out.println("Arrays:\r\n" + 
			          				"Contém um numero fixo de valores de um único tipo. Comprimento estabelecido quando criado, ficando fixo após a criação.\r\n" + 
			          				"É possivel aumentar o tamanho do Array quando o mesmo ultrapassa seu limite pré estabelecido, mas demanda custo.\r\n" + 
			          				"Cada item no Array é chamado de elemento que são acessados por um numero. Começando por 0.");
			          		voltarCls(sc);
			          		break;
			          	case 2:
							System.out.println("Arrays multidimensionais:\r\n" + 
									"Declarado como tendo duas dimensões, usado para tabela de valores com linhas e colunas.\r\n" + 
									"Exemplo: numero[indiceA][indiceB], numero é o array, indiceA é a linha, indiceB é a coluna.");
							voltarCls(sc);
			          		break;

			          	default:
			          		System.out.println();
			          		break;
					}
		          } else if(opcao == 9){
		        	  System.out.println("## Pressione a opção que deseja mais conhecimento ##");
			          System.out.println("Opção 1 - Listas");
			          System.out.println("Opção 2 - Map");
			          System.out.println("Opção 3 - Interface Set");
			          System.out.println("Opção 4 - Stream");
			          System.out.println("Opção 0 - Voltar");
			          enter = Integer.parseInt(sc.nextLine());
			          cls();
			          switch (enter) {
			          	case 1:
			          		System.out.println("Lista: \r\n" + 
					        		"Coleção que permite elementos duplicados e mantém uma ordenação especifica entre os elementos.");
					        System.out.println("## Pressione a opção que deseja mais conhecimento ##");
					        System.out.println("Opção 1 - List");
					        System.out.println("Opção 2 - ArrayList");
					        System.out.println("Opção 3 - Vector");
					        System.out.println("Opção 4 - LinkedList");
					        System.out.println("Opção 0 - Voltar");
					        press = Integer.parseInt(sc.nextLine());
					        cls();
					        switch (press) {
							case 1:
								System.out.println("List:\r\n" + 
										"Cresce conforme for necessário.\r\n" + 
										"Possui dois métodos: add, que recebe o objeto a ser inserido e o coloca no final da lista.\r\n" + 
										"E um segundo que permite adicionar elemento em qualquer posição");
								voltarCls(sc);
								break;
							case 2:
								System.out.println("ArrayList:\r\n" + 
										"Trabalha com um array interno para gerar uma lista. Rápida na pesquisa.\r\n" + 
										"Começa com um tamanho fixo, aumentando conforme necessário. Custo alto de aumento.\r\n" + 
										"Não são sincronizados, não são thread-safe.\r\n" + 
										"Aumenta em 50% do seu tamanho quando a lista está cheia.");
								voltarCls(sc);
								break;
							case 3:
								System.out.println("Vector:\r\n" + 
										"É sincronizado, se precisar de thread-safe.\r\n" + 
										"Aumenta o dobro de seu tamanho quando a lista está cheia.\r\n" + 
										"Se precisa aumentar a quantidade de elementos frequentemente, o ideal é usar Vector.");
								voltarCls(sc);
								break;
							case 4:
								System.out.println("LinkedList:\r\n" + 
										"Rápida na inserção e remoção de itens nas pontas. (add e remove).\r\n" + 
										"Comparando com ArrayList, pior performance nos métodos (get e set(para buscas)).");
								voltarCls(sc);
								break;
							default:
								System.out.println();
								break;
							}
			          		break;
			          	case 2:
			          		System.out.println("Map:\r\n" + 
			          				"Faz parte de collections do JAVA. Map é uma interface que precisa ser inicializada por uma classe.\r\n" + 
			          				"Essas classes são HashMap,HashTable, linkedHashMap e TreeMap.\r\n" + 
			          				"HashMap: mapa não classificado e não ordenado. Permitindo uma chave null e multiplos null.\r\n" + 
			          				"Chave é um ID que não pode ser repetido.");
			          		voltarCls(sc);
			          		break;
			          	case 3:
			          		System.out.println("Interface Set:\r\n" + 
			          				"Nenhuma interface Set é thread-safe, se está utilizando multiplas threads para acessar o mesmo Set, deve ser feito sincronização externamente.\r\n" + 
			          				"Não aceitam elementos duplicados. Qualquer valor duplicado será excluido.\r\n" + 
			          				"Tipos: HashSet, TreeSet e LinkedHashSet.");
			          		System.out.println("## Pressione a opção que deseja mais conhecimento ##");
					        System.out.println("Opção 1 - HashSet");
					        System.out.println("Opção 2 - TreeSet");
					        System.out.println("Opção 3 - LinkedHashSet");
					        System.out.println("Opção 0 - Voltar");
					        press = Integer.parseInt(sc.nextLine());
					        cls();
			          		switch (press) {
			          		case 1:
								System.out.println("HashSet:\r\n" + 
										"É o mais rapido de todos, utiliza-se de HashTable. Elementos não ordenados.\r\n" + 
										"Indicada para garantia de alta performance sem se importar com a ordem com que os elementos estão ordenados.");
								voltarCls(sc);
								break;
							case 2:
								System.out.println("TreeSet:\r\n" + 
										"Unico Set que implementa a interface SortedSet, em vez de Set diretamente.\r\n" + 
										"Possui elementos ordenados automaticamente, independente da ordem de inserção, serão ordenados.\r\n" + 
										"Custo maior, a complexidade para os métodos (add,remove e contains) são maiores que do HashSet pela ordenação.\r\n" + 
										"Funciona juntamente com a interface Comparable, obrigando a implementar o método \"compareTo\" para não inteiros.");
								voltarCls(sc);
								break;
							case 3:
								System.out.println("LinkedHashSet:\r\n" + 
										"Meio termo entre TreeSet e HashSet. Um pouco de performance, um pouco de ordenação.\r\n" + 
										"Elementos continuam na ordem que são inseridos. Diferente do HashSet que embaralha tudo.");
								voltarCls(sc);
								break;
							default:
								System.out.println();
								break;
							}
			          		break;
			          	case 4:
			          		System.out.println("Stream:\n É um fluxo de dados, seja para leitura ou para escrita.");
			          		System.out.println("## Pressione a opção que deseja mais conhecimento ##");
					        System.out.println("Opção 1 - InputStream");
					        System.out.println("Opção 2 - OutputStream");
					        System.out.println("Opção 0 - Voltar");
					        press = Integer.parseInt(sc.nextLine());
					        cls();
			          		switch (press) {
							case 1:
								System.out.println("InputStream:\r\n" + 
										"Para programas que precisam ler algum dado de algum local.\r\n" + 
										"Permite ler um arquivo qualquer e retornar os dados em byte. Podendo converter em char para uma informação mais relevante.\r\n" + 
										"Escreve pelo método read().");
								voltarCls(sc);
								break;

							case 2:
								System.out.println("OutputStream:\r\n" + 
										"Para programas que precisam escrever um dado em algum local.\r\n" + 
										"Capaz de enviar dados a um determinado Stream.\r\n" + 
										"Escreve pelo método write().");
								voltarCls(sc);
								break;
							default:
								System.out.println();
								break;
							}
			          		break;
			          	default:
			          		System.out.println();
			          		break;
					}
		          } else if(opcao == 10){
		        	  System.out.println("## Pressione a opção que deseja mais conhecimento ##");
			          System.out.println("Opção 1 - Thread");
			          System.out.println("Opção 2 - Interface Runnable");
			          System.out.println("Opção 3 - Classe anonima");
			          System.out.println("Opção 0 - Voltar");
			          enter = Integer.parseInt(sc.nextLine());
			          cls();
			          switch (enter) {
			          	case 1:
			          		System.out.println("Thread:\r\n" + 
			          				"São subdivisões dos processos. Se deseja que o programa nao trave para o usuario, utilizar thread.\r\n" + 
			          				"O start() significa que já está iniciando o processamento paralelo e libera o programa para executar outra thread.\r\n" + 
			          				"Em java, a classe Thread recebe como argumento um objeto com o código que desejamos rodar.\r\n" + 
			          				"Exemplo: Desejo rodar a classe programa que implementa runnable, portanto:\r\n" + 
			          				"Programa p = new Programa(); // Defino a iniciativa da classe normalmente.\r\n" + 
			          				"Thread t = new Thread(p); // Agora coloco o objeto p como sendo o que desejo rodar com Thread.\r\n" + 
			          				"// Em Programa ele procurará o método run com os procedimentos que devem ser executados.");
			          		voltarCls(sc);
			          		break;
			          	case 2:
			          		System.out.println("Interface Runnable:\r\n" + 
			          				"Possui método run, que dentro deve devem ficar os procedimentos a serem executados paralelamente.");
			          		voltarCls(sc);
			          		break;
			          	case 3:
			          		System.out.println("Classe anonima:\r\n" + 
			          				"Permite dar new numa interface, desde que implemente os metodos.");
			          		voltarCls(sc);
			          		break;
			          	default:
			          		System.out.println();
			          		break;
					}
		          } else if(opcao == 11){
		        	  System.out.println("Scanner:\r\n" + 
		        	  		"Analisa os tipos primitivos e strings usando expressões regulares, com objetivo de separar entrada dos textos em blocos, gerando tokens.\r\n" + 
		        	  		"Tokens são sequencias de caracteres separados por delimitadores, que podem ser espaços em branco, tabulações, mudança de linha.\r\n" + 
		        	  		"Com Scanner pode ser convertido texto para tipo primitivo, podendo ser objetos do tipo String, InputStream e arquivos.");
		        	  voltarCls(sc);;
		          } else if(opcao == 12){
		        	  System.out.println("Sockets:\r\n" + 
		        	  		"Socket é um ponto de comunicação entre duas maquinas, é possivel enviar mensagem de Maquina A para Maquina B pela conexão com Socket.");
		        	  System.out.println("## Pressione a opção que deseja mais conhecimento ##");
			          System.out.println("Opção 1 - ServerSocket class");
			          System.out.println("Opção 2 - Socket class");
			          System.out.println("Opção 0 - Voltar");
			          enter = Integer.parseInt(sc.nextLine());
			          cls();
			          switch (enter) {
			          	case 1:
			          		System.out.println("ServerSocket class: \r\n" + 
			          				"Responsavel por esperar a conexão do cliente, possui um construtor onde é passado a porta desejada a usar para escutar as conexões.\r\n" + 
			          				"Método accept(): Escuta uma conexão e aceita se alguma for encontrada. Bloqueia todo restante até uma conexão ser estabelecida.\r\n" + 
			          				"Método close(): Fecha a conexão atual, qualquer cliente conectado será automaticamente desconectado.\r\n" + 
			          				"Método getInetAdress(): Retorna o endereço IP local do servidor.");
			          		voltarCls(sc);
			          		break;
			          	case 2:
			          		System.out.println("Socket class:\r\n" + 
			          				"É o cliente propriamente dito.\r\n" + 
			          				"Método getInputStream(): Através deste, o servidor consegue capturar o que o cliente está enviando.\r\n" + 
			          				"Método getOutputStream(): Envia dados para o outro lado da comunicação, neste caso o ServerSocket.");
			          		voltarCls(sc);;
			          		break;

			          	default:
			          		System.out.println();
			          		break;
					}
			          
		          }
		          
		    } while (opcao != 0);
		     
		    sc.close();
		  } 
	
	public static void voltar(Scanner sc) {
		System.out.println("\nPressione enter para voltar ao inicio");
		sc.nextLine();
	}
	public static void cls()
    {
            for(int i = 0; i < 40; i++)
            System.out.print("\r\n");
    }
	public static void voltarCls(Scanner sc) {
		System.out.println("\nPressione enter para voltar ao inicio");
		sc.nextLine();
		for(int i = 0; i < 40; i++)
            System.out.print("\r\n");
	}
}
