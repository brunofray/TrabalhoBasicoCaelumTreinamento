package br.com.caelum.main;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TestaOrdemDecrescente {

	public static void main(String[] args) {
		int total = 1000;
		// 15.16.1 - Utilizando TreeSet para fazer ordem decrescente
		
		// TreeSet utilizando Collections de recurso para inverer elementos
		TreeSet<Integer> lista = new TreeSet<Integer>( Collections.reverseOrder()) ;
		for (int i = 0; i <= total; i++) {
			lista.add(i);
		}
		System.out.println("Primeira maneira com TreeSet: " + lista + "\n");
		
		// TreeSet sem implemenar collections, fazendo descendingSet
		TreeSet<Integer> numero = new TreeSet<Integer>(); 
		
		for (int i = 1; i <= 1000; i++) {
			numero.add(i); 
		} 
		
		System.out.println("Segunda maneira com TreeSet em ordem crescente" + numero);
		System.out.println("Segunda maneira com TreeSet em ordem decrescente: " + numero.descendingSet());
		
		// 15.16.2 - Utilizando ArrayList para fazer ordem decrescente
		List<Integer> teste = new ArrayList<Integer>();
		List<Integer> teste2 = new ArrayList<Integer>();
				
				
				
		for (int i = 0; i <= total; i++) {
			teste.add(i);
			teste2.add(i);
		}
		System.out.println("\nArrayList em ordem crescente: " + teste);
		Collections.sort(teste);
		Collections.reverse(teste); // utilizando reverse
		System.out.println("Primeira maneira ArrayList em ordem decrescente: " + teste);
		Collections.sort(teste2, Collections.reverseOrder()); // utilizando classe collections e reverseOrder
		System.out.println("Segunda maneira ArrayList em ordem decrescente: " + teste2);
	}

}
