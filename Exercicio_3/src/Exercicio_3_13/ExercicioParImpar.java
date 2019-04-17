package Exercicio_3_13;

public class ExercicioParImpar {

	public static void main(String[] args) {
		
		// 3.13.7
		int x = 13;
		
		for ( int i = 0; i < 100; i++) {
			if (x % 2 == 0) {
				x = x / 2;
				if (x == 1) {
					break;
				}
			}
			else{
				x = 3 * x + 1;
				
				if (x == 1) {
					break;
				}
			}
			System.out.print(x + " -> ");
		}
		System.out.print(x);
	}

}
