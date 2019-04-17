package br.com.moldsystems.pessoa;

public class FuncionarioAutenticavel extends Funcionario{

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public boolean autentica(int senha) {
		return false;
		
	}

}
