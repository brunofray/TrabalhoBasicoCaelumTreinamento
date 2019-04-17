package br.com.caelum.chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
			new Cliente("127.0.0.1", 12345).executa();
		}
	
	private String host;
	private int porta;
	
	public Cliente(String host, int porta) {
		this.host = host;
		this.porta = porta;
	}
	public void executa() throws UnknownHostException, IOException {
		// tenta se conectar ao ip e porta especificados
		Socket cliente = new Socket(this.host, this.porta);
		System.out.println("O cliente se conectou ao servidor!");
			
		//Thread para receber mensagens do servidor
		Recebedor r = new Recebedor(cliente.getInputStream());
		new Thread(r).start();
		
		// ler os dados de entrada padrão do teclado do cliente e joga no buffer de saida
		Scanner teclado = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());			
		while (teclado.hasNextLine()) {
			saida.println(teclado.nextLine());
		}
			
		saida.close();
		teclado.close();
		cliente.close();
	}
		
	

	

}
