package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca() {
		
	}
	public ContaPoupanca(int numero, String agencia, String titular, double saldo) {
		super(numero, agencia, titular, saldo);
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}
	@Override
	public String getTipo() {
		return "Conta Poupança";
	}
	@Override
	public int compareTo(Conta outraConta) {
	//	return this.titular.compareTo(outraConta.titular); //Compara para ordernar pelo nome de titular
		return this.getNumero() - outraConta.getNumero(); //Compara para ordernar pelo numero
	}

}
