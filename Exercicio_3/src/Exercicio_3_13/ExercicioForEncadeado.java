package Exercicio_3_13;

public class ExercicioForEncadeado {

	public static void main(String[] args) {
		
		// 3.13.8
		for (int a = 0; a < 5; a++) {
	        for (int b = 1; b <= a; b++) {
	            System.out.print(" " + a * b );
	        }
	        System.out.println("");
	    }
	}

}
