package br.com.caelum.contas.modelo;

public abstract class Conta implements Comparable<Conta>{
	public int numero;
	protected String titular; // Havera um new Cliente para cada new Conta
	public String agencia;
	public Data dataAbertura;
	protected double saldo;
	private double limite; // adiciona limite a conta
	protected static int totalDeContas;

	public Conta() {
	}

	public Conta(int numero, String agencia, String titular, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}
	
	@Override
	public String toString() {
		return "[titular=" + titular.toUpperCase() + ", numero=" + numero + ", agencia=" + agencia + "]";
	}

	public int getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	// 15.15.7
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}

	public void saca(double valor) {
		if (valor > this.saldo) {
			// 12.7
			throw new IllegalArgumentException("Saldo Insuficiente");
		} else {
			this.saldo -= valor;
		}
	}

	// 5.3
	public double pegaSaldo() {
		return this.saldo;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular2) {
		this.titular = titular2;
	}

	public double getSaldo() {
		return this.saldo + this.limite;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// 5.3
	public void deposita(double quantidade) {
		if (quantidade >= 0) {
			this.saldo += quantidade;
		} else {
			throw new IllegalArgumentException("Valor a ser depositado é negativo");
		}
	}

	public double calculaRendimento() {
		return saldo * 0.1;
	}

	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.getTitular();
		dados += "\nNumero: " + this.numero;
		dados += "\nAgencia: " + this.agencia;
		dados += "\nData de Abetura: " + this.dataAbertura.formatada();
		dados += "\nSaldo: " + this.saldo;
		dados += "\nRendimento mensal: " + this.calculaRendimento();

		return dados;
	}

	public void transfere(Conta conta, double valor) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
	
	
	public abstract int compareTo(Conta outraConta);
	
	/*
	public String getTipo() {
		return "Conta";
	}
	*/
	// 10.6 - Deixando o método getTipo abstrato para ser acessado diretamente nas classes filhas.
	public abstract String getTipo();
}
