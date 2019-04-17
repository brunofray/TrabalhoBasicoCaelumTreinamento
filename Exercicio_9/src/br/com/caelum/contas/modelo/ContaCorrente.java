package br.com.caelum.contas.modelo;

import br.com.caelum.contas.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel{
	public ContaCorrente() {
		
	}
	public ContaCorrente(int numero, String agencia, String titular, double saldo) {
		super(numero, agencia, titular, saldo);
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}
	
	@Override
	public void saca(double valor) {
		if (valor < 0) {
			// 12.7
			throw new IllegalArgumentException("Voce tentou sacar um valor negativo");
		} 
		if (this.saldo < valor ) {
			throw new SaldoInsuficienteException(valor);
		}
		else {
			this.saldo -= valor + 0.10;
		}
	}
	@Override
	public String getTipo() {
		return "Conta Corrente";
	}
	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
	@Override
	public int compareTo(Conta outraConta) {
	//	return this.titular.compareTo(outraConta.titular); //Compara para ordernar pelo nome de titular
		return this.getNumero() - outraConta.getNumero(); //Compara para ordernar pelo numero
	}
	

}
