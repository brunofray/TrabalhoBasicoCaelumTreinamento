package br.com.caelum.chat;

import java.io.InputStream;
import java.util.Scanner;

public class TrataCliente implements Runnable{
	// 19.11
	private InputStream cliente;
	private Servidor servidor;
	
	public TrataCliente(InputStream cliente, Servidor servidor) {
		this.cliente = cliente;
		this.servidor = servidor;
	}

	@Override
	public void run() {
		// Quando chegar alguma mensagem, distribui para todos
		Scanner s = new Scanner(this.cliente);
		while(s.hasNextLine()) {
			servidor.distribuiMensagem(s.nextLine());
		}
		s.close();
	}
}
