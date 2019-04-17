package br.com.caelum.chat;

import java.util.ArrayList;
import java.util.Collection;

public class RegistroDeMensagens {
	
	// 20.5
	public static void main(String[] args) throws InterruptedException {
		Collection<String> mensagens = new ArrayList<String>();
		
		Thread t1 = new Thread(new ProduzMensagens(0, 10000, mensagens));
		Thread t2 = new Thread(new ProduzMensagens(10000, 20000, mensagens));
		Thread t3 = new Thread(new ProduzMensagens(20000, 30000, mensagens));
		
		t1.start();
		t2.start();
		t3.start();
		
		 // FAZ COM QUE A THREAD QUE RODA O MAIN AGUARDE O FIM DESSAS
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Threads produtos de mensagens finalizadas");
		
		// VERIFCA SE TODAS AS MENSAGENS FORAM GUARDADAS
		
		for ( int i = 0; i < 15000; i++) {
			if(!mensagens.contains("Mensagem " + i)) {
				throw new IllegalStateException("Não encontrei a mensagem: " + i);
			}
		}
		
		// VERIFICA SE ALGUM MENSAGEM FICOU NULA
		if (mensagens.contains(null)) {
			throw new IllegalStateException("Não devia ter null aqui dentro!");
		}
		System.out.println("Fim da execução com sucesso");
		
	}

}
