package br.com.moldsystems.pessoa;

import br.com.caelum.contas.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel{
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso permitido!");
			return true;
		} else {
			System.out.println("Acesso negado!");
			return false;
		}
		
	}
	
	@Override
	public double getBonificacao() {
		return this.salario * 0.15;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
