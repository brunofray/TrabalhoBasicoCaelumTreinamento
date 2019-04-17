package Exercicio_3_13;

public class ExercicioFibonacci {

	public static void main(String[] args) {
		
		// 3.13.6
		int i;
		int n1 = 1;
		int n2 = 0;
		
		System.out.println("Sequencia de Fibonacci: " + n2);
		System.out.println("Sequencia de Fibonacci: " + n1);
		for(i = 0; i < 20; i++) {
			n1 = n1 + n2;
			n2 = n1 - n2;
			if (n1 < 100) {
				System.out.println("Sequencia de Fibonacci: " + n1);
			}
		}

	}

}
