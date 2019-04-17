package br.com.caelum.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionaNaPrimeiraPosicao {

	public static void main(String[] args) {
	
		System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();
		
		// troca entre ArrayList e LinkedList
		List<Integer> teste = new LinkedList<>();
		List<Integer> testeArray = new ArrayList<>();
		
		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo gasto utilizando LinkedList: " + tempo);
		
		long inicioArray = System.currentTimeMillis();
		
		for (int i = 0; i < 30000; i++) {
			testeArray.add(0, i);
		}
		
		long fimArray = System.currentTimeMillis();
		double tempoArray = (fimArray - inicioArray) / 1000.0;
		System.out.println("Tempo gasto utilizando ArrayList: " + tempoArray);

	}

}
