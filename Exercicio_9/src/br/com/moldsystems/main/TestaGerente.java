package br.com.moldsystems.main;

import br.com.moldsystems.pessoa.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		// podemos chamar métodos do funcionário.
		gerente.setNome("Breno");
		
		// métodos do gerente
		gerente.setSenha(5214);
		

	}

}
