package br.com.fraybruno.main;

import java.util.Scanner;

public class Ensinamentos {

	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);
		    int opcao = 0;
		    int enter = 0;
		    int press = 0;
		     
		    do {
		      System.out.println("## Escolha uma das op��es abaixo ##");
		      System.out.println("Op��o 1 - Elementos de POO");
		          System.out.println("Op��o 2 - Construtores");
		          System.out.println("Op��o 3 - Getters e Setters");
		          System.out.println("Op��o 4 - Encapsulamento e polimorfismo");
		          System.out.println("Op��o 5 - Classes abstratas e Class Object");
		          System.out.println("Op��o 6 - Integer");
		          System.out.println("Op��o 7 - Equals e Enhanced-for");
		          System.out.println("Op��o 8 - Arrays");
		          System.out.println("Op��o 9 - Collections e suas op��es");
		          System.out.println("Op��o 10 - Threads e suas op��es");
		          System.out.println("Op��o 11 - Scanner");
		          System.out.println("Op��o 12 - Sockets");
		          System.out.println("Op��o 0 - Sair do programa");
		          System.out.println("_______________________");
		           
		          System.out.print("Digite aqui sua op��o: ");
		          opcao = Integer.parseInt(sc.nextLine());
		          cls();
		           
		          if(opcao == 1){
		          System.out.print("ELEMENTOS: Classes, Objetos, Atributos, M�todos, Construtores");
		          System.out.println("\n## Pressione a op��o que deseja mais conhecimento ##");
		          System.out.println("Op��o 1 - Classes");
		          System.out.println("Op��o 2 - Objetos");
		          System.out.println("Op��o 3 - Atributos");
		          System.out.println("Op��o 4 - M�todos");
		          System.out.println("Op��o 0 - Voltar");
		          enter = Integer.parseInt(sc.nextLine());
		          cls();
		          
		          switch (enter) {
		          		case 1:
		          			System.out.println("Classes: \nArmazenam propriedades e m�todos dentro dela, representam por exemplo: uma pessoa, um lugar, algo abstrato.\r\n" + 
		          					"Caracteristicas: Possui nome, possui visibilidade(public, private, protected)\r\n" + 
		          					"\r\n" + 
		          					"public class Teste{\r\n" + 
		          					"//ATRIBUTOS OU PROPRIEDADES\r\n" + 
		          					"//M�TODOS\r\n" + 
		          					"}");
		          			voltarCls(sc);
		          			break;
		          			
		          		case 2:
		          			System.out.println("Objetos: \nS�o caracteristicas definidas pelas classes.\r\n" + 
		          					"Instanciam objetos da classe para inicializar atributos e invocar m�todos.\r\n" + 
		          					"Todo objeto � algo que existe, concreto. J� a classe � um modelo ou projeto de um objeto, intocavel.");
		          			voltarCls(sc);
		          			break;
		          			
		          		case 3:
		          			System.out.println("Atributos: \nS�o propriedades de um objetos. Conhecidos como vari�veis. \r\n" + 
		          					"Definem estado de objeto, podendo sofrer altera��es.");
		          			voltarCls(sc);
		          			break;
		          			
		          		case 4:
		          			System.out.println("M�todos: \nS�o a��es ou procedimentos a tomar, podem interagir e se comunicarem com outros objetos.\r\n" + 
		          					"Boas pr�ticas, indicado sempre usar nomes declarados como verbos (voltar,avan�ar,resgatar).");
		          			voltarCls(sc);
		          			break;

		          		default:
		          			System.out.println();
		          			break;
		          }
		         
		          }else if(opcao == 2){
		        	  System.out.println("Construtores:\r\n" + 
		        	  		"M�todo especial, inicializa seus atributos toda vez que � instanciado.\r\n" + 
		        	  		"Toda palavra \"new\", o objeto solicita armazenar, onde chama o construtor para inicializar o objeto.\r\n" + 
		        	  		"Identifica��o sempre pelo pr�prio nome da classe.\r\n" + 
		        	  		"Toda classe tem um construtor padr�o, mesmo sem declarar.\r\n" + 
		        	  		"Esse construtor n�o recebe argumentos e existe para possibilitar a cria��o de objetos para uma classe.");
		        	  voltarCls(sc);
		          } else if(opcao == 3){
		        	  System.out.println("Getters e Setters:\r\n" + 
		        	  		"Fornecem m�todos acessores para preservar a flexibilidade de alterar a representa��o interna da classe.\r\n" + 
		        	  		"Classes publicas n�o devem expor campos mutaveis.");
		        	  voltarCls(sc);
		          } else if(opcao == 4){
		        	  System.out.println("## Pressione a op��o que deseja mais conhecimento ##");
			          System.out.println("Op��o 1 - Encapsulamento");
			          System.out.println("Op��o 2 - Static");
			          System.out.println("Op��o 3 - Polimorfismo");
			          System.out.println("Op��o 0 - Voltar");
			          enter = Integer.parseInt(sc.nextLine());
			          cls();
			          switch (enter) {
						case 1:
							System.out.println("Encapsulamento:\r\n" + 
									"Private, protected, public.\r\n" + 
									"Esconde a maneira como os objetos guardam seus dados. Ajuda a proteger os atributos.\r\n" + 
									"Oferece a ideia de tornar o software mais flexivel, facil de modificar e de criar novas implementa��es.\r\n" + 
									"Oferece controle de acesso aos atributos e m�todos.");
							voltarCls(sc);
							break;
						case 2:
							System.out.println("Static: \r\n" + 
									"Atributo n�o passa mais ser de cada objeto, mas sim um atributo de classe. Informa��o fica guardada pela classe.");					
							voltarCls(sc);
							break;
						case 3:
							System.out.println("Polimorfismo:\r\n" + 
									"Um objeto nasce de um tipo e morre daquele tipo, o que muda � a maneira da qual nos referimos a ele.");
							voltarCls(sc);
							break;
						default:
							System.out.println();
							break;
					}
		          } else if(opcao == 5){
		        	  System.out.println("## Pressione a op��o que deseja mais conhecimento ##");
			          System.out.println("Op��o 1 - Classes abstratas");
			          System.out.println("Op��o 2 - Overloading");
			          System.out.println("Op��o 3 - Classe Object");
			          System.out.println("Op��o 0 - Voltar");
			          enter = Integer.parseInt(sc.nextLine());
			          cls();
			          switch (enter) {
			          	case 1:
			          		System.out.println("Classe abstrata:\r\n" + 
			          				"Uma classe abstrata n�o pode ser instanciada, apenas referenciada. \r\n" + 
			          				"Servindo para polimorfismo e heran�a dos atributos e m�todos.");
			          		voltarCls(sc);
			          		break;
			          	case 2:
			          		System.out.println("Overloading - sobrecarga de m�todo:\r\n" + 
			          				"S�o m�todos possuem o mesmo nome mas que n�o s�o ambiguos, h� uma maneira de distinguir na chamada.");
			          		voltarCls(sc);
			          		break;
			          	case 3:
			          		System.out.println("Classe Object:\r\n" + 
			          				"� a classe da qual todas as clasess, sem exce��o, herdam.");
			          		voltarCls(sc);
			          		break;
			          	default:
			          		System.out.println();
			          		break;
					}
		          } else if(opcao == 6){
		        	  System.out.println("Integer:\r\n" + 
		        	  		"� o objeto tamb�m conhecido como wrapper(classe que representa um tipo primitivo), diferente do int que � tipo primitivo.\r\n" + 
		        	  		"Tipo primitivo n�o representa uma classe.\r\n" + 
		        	  		"Int quando vazio apresenta \"0\", Integer quando vazio apresenta NULL.");
		        	  voltarCls(sc);
		          } else if(opcao == 7){
		        	  System.out.println("## Pressione a op��o que deseja mais conhecimento ##");
			          System.out.println("Op��o 1 - Equals");
			          System.out.println("Op��o 2 - Enhanced-for");
			          System.out.println("Op��o 0 - Voltar");
			          enter = Integer.parseInt(sc.nextLine());
			          cls();
			          switch (enter) {
			          	case 1:
			          		System.out.println("Equals:\r\n" + 
			          				"� utilizado para compara��es.");
			          		voltarCls(sc);
			          		break;
			          	case 2:
			          		System.out.println("Enhanced-For (for aprimorado):\r\n" + 
			          				"Pega um vetor(array,list,set) e itera por ele passando o valor em cada posi��o para a variavel esquerda.\r\n" + 
			          				"Se for numa lista passa os valores de forma ordenada, se for em Set depende do conjunto aplicado essa ordena��o.\r\n" + 
			          				"Exemplo:\r\n" + 
			          				"void imprimeArray(int[] array) {  \r\n" + 
			          				"     for (int x : array) {  \r\n" + 
			          				"            System.out.println(x);  \r\n" + 
			          				"     }  \r\n" + 
			          				"}\r\n" + 
			          				"Nesse caso o vetor a ser lido � o array, e a cada itera��o o valor da posi��o ser� enviado a x.\r\n" + 
			          				"Percorrendo assim o vetor, at� seu fim e imprimindo o resultado de cada espa�o.\r\n" + 
			          				"No eclipse: escrevendo foreach e dando ctrl+espa�o, ele monta um esqueleto para uso.");
			          		voltarCls(sc);
			          		break;

			          	default:
			          		System.out.println();
			          		break;
					}
		          } else if(opcao == 8){
		        	  System.out.println("## Pressione a op��o que deseja mais conhecimento ##");
			          System.out.println("Op��o 1 - Arrays");
			          System.out.println("Op��o 2 - Arrays Muldidimensionais");
			          System.out.println("Op��o 0 - Voltar");
			          enter = Integer.parseInt(sc.nextLine());
			          cls();
			          switch (enter) {
			          	case 1:
			          		System.out.println("Arrays:\r\n" + 
			          				"Cont�m um numero fixo de valores de um �nico tipo. Comprimento estabelecido quando criado, ficando fixo ap�s a cria��o.\r\n" + 
			          				"� possivel aumentar o tamanho do Array quando o mesmo ultrapassa seu limite pr� estabelecido, mas demanda custo.\r\n" + 
			          				"Cada item no Array � chamado de elemento que s�o acessados por um numero. Come�ando por 0.");
			          		voltarCls(sc);
			          		break;
			          	case 2:
							System.out.println("Arrays multidimensionais:\r\n" + 
									"Declarado como tendo duas dimens�es, usado para tabela de valores com linhas e colunas.\r\n" + 
									"Exemplo: numero[indiceA][indiceB], numero � o array, indiceA � a linha, indiceB � a coluna.");
							voltarCls(sc);
			          		break;

			          	default:
			          		System.out.println();
			          		break;
					}
		          } else if(opcao == 9){
		        	  System.out.println("## Pressione a op��o que deseja mais conhecimento ##");
			          System.out.println("Op��o 1 - Listas");
			          System.out.println("Op��o 2 - Map");
			          System.out.println("Op��o 3 - Interface Set");
			          System.out.println("Op��o 4 - Stream");
			          System.out.println("Op��o 0 - Voltar");
			          enter = Integer.parseInt(sc.nextLine());
			          cls();
			          switch (enter) {
			          	case 1:
			          		System.out.println("Lista: \r\n" + 
					        		"Cole��o que permite elementos duplicados e mant�m uma ordena��o especifica entre os elementos.");
					        System.out.println("## Pressione a op��o que deseja mais conhecimento ##");
					        System.out.println("Op��o 1 - List");
					        System.out.println("Op��o 2 - ArrayList");
					        System.out.println("Op��o 3 - Vector");
					        System.out.println("Op��o 4 - LinkedList");
					        System.out.println("Op��o 0 - Voltar");
					        press = Integer.parseInt(sc.nextLine());
					        cls();
					        switch (press) {
							case 1:
								System.out.println("List:\r\n" + 
										"Cresce conforme for necess�rio.\r\n" + 
										"Possui dois m�todos: add, que recebe o objeto a ser inserido e o coloca no final da lista.\r\n" + 
										"E um segundo que permite adicionar elemento em qualquer posi��o");
								voltarCls(sc);
								break;
							case 2:
								System.out.println("ArrayList:\r\n" + 
										"Trabalha com um array interno para gerar uma lista. R�pida na pesquisa.\r\n" + 
										"Come�a com um tamanho fixo, aumentando conforme necess�rio. Custo alto de aumento.\r\n" + 
										"N�o s�o sincronizados, n�o s�o thread-safe.\r\n" + 
										"Aumenta em 50% do seu tamanho quando a lista est� cheia.");
								voltarCls(sc);
								break;
							case 3:
								System.out.println("Vector:\r\n" + 
										"� sincronizado, se precisar de thread-safe.\r\n" + 
										"Aumenta o dobro de seu tamanho quando a lista est� cheia.\r\n" + 
										"Se precisa aumentar a quantidade de elementos frequentemente, o ideal � usar Vector.");
								voltarCls(sc);
								break;
							case 4:
								System.out.println("LinkedList:\r\n" + 
										"R�pida na inser��o e remo��o de itens nas pontas. (add e remove).\r\n" + 
										"Comparando com ArrayList, pior performance nos m�todos (get e set(para buscas)).");
								voltarCls(sc);
								break;
							default:
								System.out.println();
								break;
							}
			          		break;
			          	case 2:
			          		System.out.println("Map:\r\n" + 
			          				"Faz parte de collections do JAVA. Map � uma interface que precisa ser inicializada por uma classe.\r\n" + 
			          				"Essas classes s�o HashMap,HashTable, linkedHashMap e TreeMap.\r\n" + 
			          				"HashMap: mapa n�o classificado e n�o ordenado. Permitindo uma chave null e multiplos null.\r\n" + 
			          				"Chave � um ID que n�o pode ser repetido.");
			          		voltarCls(sc);
			          		break;
			          	case 3:
			          		System.out.println("Interface Set:\r\n" + 
			          				"Nenhuma interface Set � thread-safe, se est� utilizando multiplas threads para acessar o mesmo Set, deve ser feito sincroniza��o externamente.\r\n" + 
			          				"N�o aceitam elementos duplicados. Qualquer valor duplicado ser� excluido.\r\n" + 
			          				"Tipos: HashSet, TreeSet e LinkedHashSet.");
			          		System.out.println("## Pressione a op��o que deseja mais conhecimento ##");
					        System.out.println("Op��o 1 - HashSet");
					        System.out.println("Op��o 2 - TreeSet");
					        System.out.println("Op��o 3 - LinkedHashSet");
					        System.out.println("Op��o 0 - Voltar");
					        press = Integer.parseInt(sc.nextLine());
					        cls();
			          		switch (press) {
			          		case 1:
								System.out.println("HashSet:\r\n" + 
										"� o mais rapido de todos, utiliza-se de HashTable. Elementos n�o ordenados.\r\n" + 
										"Indicada para garantia de alta performance sem se importar com a ordem com que os elementos est�o ordenados.");
								voltarCls(sc);
								break;
							case 2:
								System.out.println("TreeSet:\r\n" + 
										"Unico Set que implementa a interface SortedSet, em vez de Set diretamente.\r\n" + 
										"Possui elementos ordenados automaticamente, independente da ordem de inser��o, ser�o ordenados.\r\n" + 
										"Custo maior, a complexidade para os m�todos (add,remove e contains) s�o maiores que do HashSet pela ordena��o.\r\n" + 
										"Funciona juntamente com a interface Comparable, obrigando a implementar o m�todo \"compareTo\" para n�o inteiros.");
								voltarCls(sc);
								break;
							case 3:
								System.out.println("LinkedHashSet:\r\n" + 
										"Meio termo entre TreeSet e HashSet. Um pouco de performance, um pouco de ordena��o.\r\n" + 
										"Elementos continuam na ordem que s�o inseridos. Diferente do HashSet que embaralha tudo.");
								voltarCls(sc);
								break;
							default:
								System.out.println();
								break;
							}
			          		break;
			          	case 4:
			          		System.out.println("Stream:\n � um fluxo de dados, seja para leitura ou para escrita.");
			          		System.out.println("## Pressione a op��o que deseja mais conhecimento ##");
					        System.out.println("Op��o 1 - InputStream");
					        System.out.println("Op��o 2 - OutputStream");
					        System.out.println("Op��o 0 - Voltar");
					        press = Integer.parseInt(sc.nextLine());
					        cls();
			          		switch (press) {
							case 1:
								System.out.println("InputStream:\r\n" + 
										"Para programas que precisam ler algum dado de algum local.\r\n" + 
										"Permite ler um arquivo qualquer e retornar os dados em byte. Podendo converter em char para uma informa��o mais relevante.\r\n" + 
										"Escreve pelo m�todo read().");
								voltarCls(sc);
								break;

							case 2:
								System.out.println("OutputStream:\r\n" + 
										"Para programas que precisam escrever um dado em algum local.\r\n" + 
										"Capaz de enviar dados a um determinado Stream.\r\n" + 
										"Escreve pelo m�todo write().");
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
		        	  System.out.println("## Pressione a op��o que deseja mais conhecimento ##");
			          System.out.println("Op��o 1 - Thread");
			          System.out.println("Op��o 2 - Interface Runnable");
			          System.out.println("Op��o 3 - Classe anonima");
			          System.out.println("Op��o 0 - Voltar");
			          enter = Integer.parseInt(sc.nextLine());
			          cls();
			          switch (enter) {
			          	case 1:
			          		System.out.println("Thread:\r\n" + 
			          				"S�o subdivis�es dos processos. Se deseja que o programa nao trave para o usuario, utilizar thread.\r\n" + 
			          				"O start() significa que j� est� iniciando o processamento paralelo e libera o programa para executar outra thread.\r\n" + 
			          				"Em java, a classe Thread recebe como argumento um objeto com o c�digo que desejamos rodar.\r\n" + 
			          				"Exemplo: Desejo rodar a classe programa que implementa runnable, portanto:\r\n" + 
			          				"Programa p = new Programa(); // Defino a iniciativa da classe normalmente.\r\n" + 
			          				"Thread t = new Thread(p); // Agora coloco o objeto p como sendo o que desejo rodar com Thread.\r\n" + 
			          				"// Em Programa ele procurar� o m�todo run com os procedimentos que devem ser executados.");
			          		voltarCls(sc);
			          		break;
			          	case 2:
			          		System.out.println("Interface Runnable:\r\n" + 
			          				"Possui m�todo run, que dentro deve devem ficar os procedimentos a serem executados paralelamente.");
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
		        	  		"Analisa os tipos primitivos e strings usando express�es regulares, com objetivo de separar entrada dos textos em blocos, gerando tokens.\r\n" + 
		        	  		"Tokens s�o sequencias de caracteres separados por delimitadores, que podem ser espa�os em branco, tabula��es, mudan�a de linha.\r\n" + 
		        	  		"Com Scanner pode ser convertido texto para tipo primitivo, podendo ser objetos do tipo String, InputStream e arquivos.");
		        	  voltarCls(sc);;
		          } else if(opcao == 12){
		        	  System.out.println("Sockets:\r\n" + 
		        	  		"Socket � um ponto de comunica��o entre duas maquinas, � possivel enviar mensagem de Maquina A para Maquina B pela conex�o com Socket.");
		        	  System.out.println("## Pressione a op��o que deseja mais conhecimento ##");
			          System.out.println("Op��o 1 - ServerSocket class");
			          System.out.println("Op��o 2 - Socket class");
			          System.out.println("Op��o 0 - Voltar");
			          enter = Integer.parseInt(sc.nextLine());
			          cls();
			          switch (enter) {
			          	case 1:
			          		System.out.println("ServerSocket class: \r\n" + 
			          				"Responsavel por esperar a conex�o do cliente, possui um construtor onde � passado a porta desejada a usar para escutar as conex�es.\r\n" + 
			          				"M�todo accept(): Escuta uma conex�o e aceita se alguma for encontrada. Bloqueia todo restante at� uma conex�o ser estabelecida.\r\n" + 
			          				"M�todo close(): Fecha a conex�o atual, qualquer cliente conectado ser� automaticamente desconectado.\r\n" + 
			          				"M�todo getInetAdress(): Retorna o endere�o IP local do servidor.");
			          		voltarCls(sc);
			          		break;
			          	case 2:
			          		System.out.println("Socket class:\r\n" + 
			          				"� o cliente propriamente dito.\r\n" + 
			          				"M�todo getInputStream(): Atrav�s deste, o servidor consegue capturar o que o cliente est� enviando.\r\n" + 
			          				"M�todo getOutputStream(): Envia dados para o outro lado da comunica��o, neste caso o ServerSocket.");
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
