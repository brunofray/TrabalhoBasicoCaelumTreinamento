package br.com.moldsystems.main;

import java.io.FileNotFoundException;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteErro {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
		
		// 12.6
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (java.io.FileNotFoundException e) {
			System.out.println("Nao foi possivel abrir o arquivo para leitura");
		}
		
		int i = 5571;
		i = i / 0;
		System.out.println("O resultado " + i);

	}
	
	static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	static void metodo2() {
		System.out.println("Inicio do metodo2");
		ContaCorrente cc = new ContaCorrente();
		try {
			for (int i = 0; i <= 15; i++) {
				cc.deposita(i + 1000);
				System.out.println(cc.getSaldo());
				if ( i == 5){
					cc = null;
				}
			}
		} catch (NullPointerException e) {
			System.out.println("erro: " + e);
		}
		
		System.out.println("Fim do metodo2");
	}
	
}
