package br.com.caelum.chat;

import java.util.Collection;

public class ProduzMensagens implements Runnable{
	
	// 20.5
	private int comeco;
	private int fim;
	private Collection<String> mensagens;
	
	public ProduzMensagens(int comeco, int fim, Collection<String> mensagens) {
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagens;
	}
	public void run() {
		for (int i = comeco; i < fim; i++) {
			// APENAS UMA THREAD PODE ESTAR DENTRO AO MESMO TEMPO, A CHAVE ESTARÁ COM ELA
			synchronized (mensagens) { 
				mensagens.add("Mensagem " + i);
			}
		}
	}

}
