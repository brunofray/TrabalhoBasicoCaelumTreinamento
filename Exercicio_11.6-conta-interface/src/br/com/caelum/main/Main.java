package br.com.caelum.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class Main {
	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		ContaCorrente t = new ContaCorrente();
		
		c.deposita(500);
		c.deposita(8000);
		t.deposita(9800);
		t.saca(850);
		
		System.out.println(c.getSaldo());
		System.out.println(t.getSaldo());
		System.out.println(t.getValorImposto());
	}
}
