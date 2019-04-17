package br.com.moldsystems.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaLista {
	// 15.6.5
	public static void main(String[] args) {
		
		List<Conta> contas = new ArrayList<Conta>();
	    Random random = new Random();

	    ContaCorrente c1 = new ContaCorrente(2, "100-0", "Caio", random.nextInt(2000));
	    c1.deposita(random.nextInt(1000));
	    contas.add(c1);

	    ContaPoupanca c2 = new ContaPoupanca(1, "100-0", "Adriano", random.nextInt(2000));
	    c2.deposita(random.nextInt(1000));
	    contas.add(c2);

	    ContaPoupanca c3 = new ContaPoupanca(0, "100-0", "Victor", random.nextInt(2000));
	    c3.deposita(random.nextInt(1000));
	    contas.add(c3);
	    
	    for (int i = 3; i < 7; i++) {
	    	ContaCorrente c = new ContaCorrente(i, "100-0", "Titular: " + i, random.nextInt(2000));
	    	c.deposita(random.nextInt(500));
	    	contas.add(c);
	    }

	    Collections.sort(contas); // Ordena pelo valor passado pelo compareTo
	    
	    // usando foreach seguido de ctr+espaço, gera o esqueleto do enhanced for
	    for (Conta conta : contas) { 
	      System.out.println(conta + " com saldo de: " + conta.getSaldo());
	    }
	    
	    System.out.println("Há " + contas.size() + " elementos na lista");
		
//		Crie uma nova	classe TestaLista que cria uma ArrayList e insere novas	contas com
//		saldos aleatórios usando um laço ( for ). Adivinhe o  nome da classe para colocar	
//		saldos aleatórios? Random.
//		
//	    Do pacote java.util. Consulte sua documentação para usá-la (utilize	o método
//		nextInt() passando o número	máximo a ser sorteado).
	}

}
