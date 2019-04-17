package Exercicio_3_13;

public class ExercicioFatorial {

	public static void main(String[] args) {
		
		// 3.13.4 e 3.13.5
		
		long fatorial = 1;
		for (long n = 1; n <= 40; n++) {
			fatorial = fatorial * n;
			System.out.println("O fatorial de " + n + " é = " + fatorial);
		}

	}

}
