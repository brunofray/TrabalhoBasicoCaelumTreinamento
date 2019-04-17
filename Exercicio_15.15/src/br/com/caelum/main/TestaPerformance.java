package br.com.caelum.main;

//import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
//		Collection<Integer> teste = new ArrayList<>();
		Collection<Integer> testeHash = new HashSet<>();
//		pesquisar sobre integer depois
		long inicioAdd = System.currentTimeMillis(); // metodo de system para cronometrar o tempo gasto
		
		int total = 30000;
		
		for (int i = 0; i < total; i++) {
//			teste.add(i);
			testeHash.add(i);
		}
		
		long fimAdd = System.currentTimeMillis();
		long tempoAdd = fimAdd - inicioAdd;
		System.out.println("Tempo gasto de inserção foi de: " + tempoAdd);
		// tempo de inserção é maior que o tempo de busca
		
		long inicioBusca = System.currentTimeMillis();
		
		for (int i = 0; i < total; i++) {
//			teste.contains(i);
			testeHash.contains(i);
		}
		
		long fimBusca = System.currentTimeMillis();
		long tempoBusca = fimBusca - inicioBusca;
		System.out.println("Tempo gasto de busca foi de: " + tempoBusca);
		
		// diferença utilizando HashSet é gritante.

	}

}
