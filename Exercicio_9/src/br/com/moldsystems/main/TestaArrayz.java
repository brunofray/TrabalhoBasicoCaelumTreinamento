package br.com.moldsystems.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrayz {

	public static void main(String[] args) {

		Conta[] contas = new Conta[10];
		int soma = 0;
		
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100.0);
			contas[i] = conta;
			System.out.println("Conta " + i + " possui " + contas[i].getSaldo() + " de saldo");
		}
		for (int i = 0; i < contas.length; i++) {
			soma = (int) (soma + contas[i].getSaldo());
		}
		System.out.println("A soma total de contas é: " + soma);
		System.out.println("A MEDIA É: " + soma/contas.length);
	}

}
