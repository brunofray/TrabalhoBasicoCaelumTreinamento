package br.com.moldsystems.main;

import br.com.caelum.contas.SaldoInsuficienteException;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.contas.modelo.ControleDeBonificacoes;
import br.com.caelum.contas.modelo.Data;
import br.com.moldsystems.pessoa.Gerente;

public class Main {

	public static void main(String[] args) {

		// 4.5 e 4.12

		/*
		 * criando a conta Conta c1; c1 = new Conta(); Conta c2; c2 = new Conta();
		 */
		// 5.4 - Criando conta 2.0
		String carlos = "Carlos";
		String antonio = "Antonio";
		Conta c1 = new ContaPoupanca();
		c1.setTitular(carlos);
		Conta c2 = new ContaPoupanca();
		c2.setTitular(antonio);
		System.out.println("Primeiro titular conta 1: " + c1.getTitular());
		int total = Conta.getTotalDeContas();
		System.out.println("Total de contas criadas: " + total);

		// alterando os valores de c1
		c1.numero = 125;
		c1.agencia = "420-0";
		c1.setSaldo(1000);
		Data data = new Data();
		c1.dataAbertura = data;
		c1.dataAbertura.dia = 15;
		c1.dataAbertura.mes = 04;
		c1.dataAbertura.ano = 2015;
		// alterando os valores de c2
		c2.numero = 187;
		c2.agencia = "442-0";
		c2.setSaldo(1500);
		Data data2 = new Data();
		c2.dataAbertura = data2;

		// 5.1
		double novoSaldo = -200;
		if (novoSaldo < 0) {
			System.out.println("Não é possivel alterar para esse saldo");
		} else {
			c1.setSaldo(novoSaldo);
		}
		// fim 5.1

		if (c1 == c2) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
		// saca 200 reais
		c1.saca(200);

		// deposita 500 reais
		c1.deposita(500);
		
		// alterando titular da conta 1
		c1.setTitular("Clovis");

		System.out.println("saldo atual: " + c1.getSaldo());
		System.out.println("rendimento mensal: " + c1.calculaRendimento());
		System.out.println(c1.recuperaDadosParaImpressao());
		
		// 9.1
		Gerente gerente = new Gerente();
		gerente.setNome("Breno");
		gerente.setSenha(5214);
		gerente.autentica(5214);
		gerente.setSalario(5000);
		System.out.println(gerente.getBonificacao());
		
		// 9.4
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		
		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(6000);
		controle.registra(funcionario1);
		
		Gerente funcionario2 = new Gerente();
		funcionario2.setSalario(1000);
		controle.registra(funcionario2);
		
		System.out.println("Controle total de bonificacoes: " + controle.getTotalDeBonificacoes());
		
		// 12.7 e 12.8
				try {
					c1.saca(50000);
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
				try {
					c1.saca(150);
					System.out.println("Consegui sacar da conta corrente");
				} catch(IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
				
				
				// 12.9
				Conta c3 = new ContaCorrente();
				c3.deposita(10);
				
				try {
					c3.saca(100);
				} catch (SaldoInsuficienteException e) {
					System.out.println(e.getMessage());
				}
				
				// 12.10
//				
//				try {
//					// bloco try
//				} catch (IOException ex) {
//					// bloco catch 1
//				} catch (SQLException sqlex) {
//					// bloco catch 2
//				} finally {
//					// bloco que será sempre executado, independente
//					// se houve ou nao exception e se ela foi tratada ou não
//				}		
				
				// 12.11
				try {
					c2.deposita(-450);
					System.out.println("Depositado com sucesso");
				} catch(IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
				try {
					c3.saca(-50);
				} catch(IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
				
				// 12.7
				//c2.saca(8000);
				
				// 13.4
				ContaCorrente cc = new ContaCorrente();
				cc.setTitular("Mario");
				cc.setNumero(123);
				cc.setAgencia("0231-1");
				
				System.out.println(cc);
				System.out.println("Conta: " + cc); //concatenar Strings
				
				// 13.5.2
//				PrintStream saida = System.out;
//				saida.println("Ola");
				
				// 14.2
				Conta[] minhasContas = new Conta[10];
				minhasContas[0] = new ContaCorrente();
				minhasContas[1] = new ContaPoupanca();
	}

}
