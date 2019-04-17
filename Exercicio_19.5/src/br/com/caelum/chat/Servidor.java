package br.com.caelum.chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Servidor {

	public static void main(String[] args) throws IOException {
		
		new Servidor(12345).executa();
		
	}	
	
	private int porta;
	private List<PrintStream> clientes;
	
	public Servidor(int porta) {
		this.porta = porta;
		this.clientes = new ArrayList<PrintStream>();
	}
	public void executa() throws IOException {
		// abre a porta e espera ate alguem se conectar
		ServerSocket servidor = new ServerSocket(this.porta);
		System.out.println("Porta 12345 aberta!");
		
		while(true) {
			//aceita um cliente
			Socket cliente = servidor.accept();
			System.out.println("Nova conexão com o cliente " + 
					cliente.getInetAddress().getHostAddress()
			);
			
			// adiciona saida do cliente a lista
			PrintStream ps = new PrintStream(cliente.getOutputStream());
			this.clientes.add(ps);
			
			//cria tratador de cliente numa nova thread
			TrataCliente tc = 
					new TrataCliente(cliente.getInputStream(), this);
			new Thread(tc).start();
			
		}
	}
	public void distribuiMensagem(String msg) {
		 //envia msg para todos os clientes
		for (PrintStream cliente : this.clientes) {
			cliente.println(msg);
		}
	}
}
//		// cria um objeto que vai tratar a conexao
//		TratamentoClass tratamento = new TratamentoClass(cliente);
//		// cria a thread em cima deste objeto
//		Thread t = new Thread(tratamento);
//		//inicia a Thread
//		t.start();
				
//		System.out.println("Nova conexão com o cliente " +
//				cliente.getInetAddress().getHostAddress()
//		);
//		// le toda informaçao que o cliente envia
//		Scanner entrada = new Scanner(cliente.getInputStream());
//		while (entrada.hasNextLine()) {
//			System.out.println(entrada.nextLine());
//		}
//		// fechando as conexoes
//		entrada.close();
//		servidor.close();
	
		

	


