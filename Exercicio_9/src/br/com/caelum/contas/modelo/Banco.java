package br.com.caelum.contas.modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	// 14.5.4
	private String nome;
	private int numero;
	private Conta[] contas;
	// 15.15.5
	private List<Conta> conta; 
	private int numDeContas;
	private Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();
	
	public Banco() {
		
	}
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new Conta[10];
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}
	
	public void adiciona(Conta c) {
			for (int i = 0; i < this.contas.length; i++) {
				if(this.contas[i] == null) {
					this.contas[i] = c;
					return;
				}
			}
			// realoca se não há mais posições no array
			Conta[] temp = new Conta[this.contas.length * 2];
			for (int i = 0; i < this.contas.length; i++) {
				temp[i] = contas[i];
			}
			this.contas = temp;
			// adiciona após ser realocado
			this.adiciona(c);
	}
	
	public void mostraContas() {
		for( int i = 0; i < this.contas.length; i++) {
			if(contas[i] == null) {
				System.out.println("Não ha conta criada na posição " + i);
			} else {
				System.out.println("Conta na posição " + i + ": " + contas[i]);
			}
		}
	}
	public boolean contem(Conta conta) {
		for ( int i = 0; i < contas.length; i++) {
			if(conta == this.contas[i]) {
				System.out.println("Conta: " + conta + " pertence ao banco!");
				return true;
			}
		}
		System.out.println("Conta: " + conta + " não pertence ao banco!");
		return false;
	}
	
	// 15.15.6 - adicionando HashMap e List
	public void adicionaList(Conta c) {
		conta.add(c);
		mapaDeContas.put(c.getTitular(), c);
		numDeContas++;
	}
	public Conta pegaConta(int x) {
		return conta.get(x);
	}
	public List<Conta> getConta() {
		return conta;
	}
	public void setConta(List<Conta> conta) {
		this.conta = conta;
	}
	public int pegaQuantidadeDeContas() {
		return this.numDeContas;
	}
	public Conta buscaPorTitular(String nome) {
		return mapaDeContas.get(nome);
	}
	
	

}
