package Exercicio_3_13;

public class ExercicioSoma {

	public static void main(String[] args) {
		
		// 3.13.2
		int i;
		int j = 1000;
		int soma = 0;
		
		for (i = 1; i <= j; i++) {
			soma = soma + i;
		}
		System.out.println("A soma de 1 até 1000 é: " + soma);
	}

}
