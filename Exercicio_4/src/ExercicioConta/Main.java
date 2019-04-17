package ExercicioConta;

public class Main {

	public static void main(String[] args) {

		// 4.5 e 4.12

		/*
		 * criando a conta Conta c1; c1 = new Conta(); Conta c2; c2 = new Conta();
		 */
		// 5.4 - Criando conta 2.0
		String carlos = "Carlos";
		String antonio = "Antonio";
		Conta c1 = new Conta(carlos);
		Conta c2 = new Conta(antonio);
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
		c1.dataAbertura.mes = 11;
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

		boolean consegui = c1.saca(2000);
		if (consegui) {
			System.out.println("Consegui sacar");
		} else {
			System.out.println("Não consegui sacar");
		}

		// saca 200 reais
		c1.saca(200);

		// deposita 500 reais
		c1.deposita(500);

		System.out.println("saldo atual: " + c1.getSaldo());
		System.out.println("rendimento mensal: " + c1.calculaRendimento());
		System.out.println(c1.recuperaDadosParaImpressao());
	}

}
