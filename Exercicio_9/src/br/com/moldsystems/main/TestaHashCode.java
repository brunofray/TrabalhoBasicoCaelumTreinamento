package br.com.moldsystems.main;

import java.util.LinkedList;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaHashCode {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		banco.setConta(new LinkedList<Conta>());
		
		ContaCorrente c1 = new ContaCorrente();
		c1.setTitular("Antonio");
		c1.setNumero(10);
		c1.setAgencia("100-0");
		c1.deposita(100000);
		banco.adicionaList(c1);
		
		ContaCorrente c2 = new ContaCorrente();
		c2.setTitular("Breno");
		c2.setNumero(10);
		c2.setAgencia("100-0");
		c2.deposita(150000);
		banco.adicionaList(c2);
		
		ContaCorrente c3 = new ContaCorrente();
		c3.setTitular("Clovis");
		c3.setNumero(8);
		c3.setAgencia("120-0");
		c3.deposita(8500);
		banco.adicionaList(c3);
		
		// Compara se numero de agencia e numero são iguais com equals, ditando que são iguais.
		System.out.println("Comparação entre c1 e c2: " + c1.equals(c2));
		System.out.println("Comparação entre c1 e c3: " + c1.equals(c3));
		System.out.println("hashCode de c1: " + c1.hashCode());
		System.out.println("hashCode de c2: " + c2.hashCode());
		System.out.println("hashCode de c3: " + c3.hashCode());
		
		System.out.println("Primeira conta: " + c1);
		System.out.println("Segunda conta: " + c2);
		System.out.println("Terceira conta: " + c3);

	}

}
