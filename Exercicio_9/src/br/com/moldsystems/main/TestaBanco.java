package br.com.moldsystems.main;

import java.util.LinkedList;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaBanco {
	// 14.5.6
	public static void main(String[] args) {
		
		Banco banco = new Banco ("CaelumBank", 999);
		
		// CRIANDO AS CONTAS DENTRO DE UM LOOP
		for(int i = 0; i < 10; i++) {
			ContaCorrente conta = new ContaCorrente();
			conta.setTitular("Titular " + i);
			conta.setNumero(i);
			conta.setAgencia("100-0");
			conta.deposita(i * 1000);
			banco.adiciona(conta);
		}
		
		ContaCorrente c1 = new ContaCorrente();
		c1.setTitular("Antonio");
		c1.setNumero(10);
		c1.setAgencia("100-0");
		c1.deposita(100000);
		banco.adiciona(c1);
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setTitular("Betina");
		c2.setNumero(11);
		c2.setAgencia("100-0");
		c2.deposita(890000);
		banco.adiciona(c2);
		
		ContaCorrente c3 = new ContaCorrente();
		c3.setTitular("Clodosvaldo");
		c3.setNumero(5);
		c3.setAgencia("1010-0");
		c3.deposita(100000);

		banco.mostraContas();
		banco.contem(c2);
		banco.contem(c3);
		
		
		// 15.15.6
		Banco bancoList = new Banco();
		bancoList.setConta(new LinkedList<Conta>());
		
		Conta cList = new ContaCorrente();
		cList.setTitular("Ediovaldo");
		cList.deposita(1500);
		bancoList.adicionaList(cList);
		
		Conta cList2 = new ContaCorrente();
		cList2.setTitular("Pericles");
		cList2.deposita(2500);
		bancoList.adicionaList(cList2);
		
		System.out.println("\nResultado titular da contaList: " + bancoList.buscaPorTitular("Pericles"));
		System.out.println("Quantidade total de contas no bancoList: " + bancoList.pegaQuantidadeDeContas());
		System.out.println("Pega a conta numa determinada posição da lista: " + bancoList.pegaConta(0));
	}

}
