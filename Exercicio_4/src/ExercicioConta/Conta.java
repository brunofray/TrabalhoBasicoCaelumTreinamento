package ExercicioConta;

public class Conta {
	int numero;
	private Cliente titular = new Cliente(); // Haverá um new Cliente para cada new Conta
	String agencia;
	Data dataAbertura;
	private double saldo;
	private double limite; // adiciona limite a conta
	private static int totalDeContas;

	public Conta() {
	}

	Conta(String titular) {
		this.titular.setNome(titular);
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}

	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}

	public boolean saca(double valor) {
		if (valor > this.saldo) {
			System.out.println("Não é possivel sacar um valor maior que o saldo!");
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	// 5.3
	public double pegaSaldo() {
		return this.saldo;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return this.saldo + this.limite;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// 5.3
	void deposita(double quantidade) {
		if (quantidade > 0) {
			this.saldo += quantidade;
		} else {
			System.out.println("Valor a ser depositado é negativo");
		}
	}

	double calculaRendimento() {
		return saldo * 0.1;
	}

	String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular.getNome();
		dados += "\nNumero: " + this.numero;
		dados += "\nAgencia: " + this.agencia;
		dados += "\nData de Abetura: " + this.dataAbertura.formatada();
		dados += "\nSaldo: " + this.saldo;
		dados += "\nRendimento mensal: " + this.calculaRendimento();

		return dados;
	}

	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			// não conseguiu sacar
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}
}
