package br.com.moldsystems.pessoa;

import br.com.caelum.contas.Autenticavel;

public class Diretor extends Funcionario implements Autenticavel{

	public boolean autentica(int senha) {
		return false;
		
	}
	@Override
	public double getBonificacao() {
		return this.salario * 0.25;
	}

}
