
public class BalancoTrimestral {

	public static void main(String[] args) {

		// 3.3.1 e 3.3.2
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		int mediaMensal = gastosTrimestre / 3;
		
		System.out.println("O total de balanco trimestral é: " + gastosTrimestre);
		System.out.println("Valor da media mensal = " + mediaMensal);
		
	}

}
