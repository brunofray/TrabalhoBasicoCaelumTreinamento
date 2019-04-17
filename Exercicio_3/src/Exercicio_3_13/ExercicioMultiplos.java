package Exercicio_3_13;

public class ExercicioMultiplos {

	public static void main(String[] args) {
		
		// 3.13.3
		int i;
		int j = 100;
		int multiplos;
		
		for (i = 1; i < j; i++) {
			multiplos = i * 3;
			if (multiplos < 100) {
				System.out.println(" Multiplos de 3 são: " + multiplos);
			}

		}

	}	
}
