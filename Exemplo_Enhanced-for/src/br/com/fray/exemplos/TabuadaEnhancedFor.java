package br.com.fray.exemplos;

public class TabuadaEnhancedFor {

	public static void main(String[] args) {
		//enhancer for. 
		int[] tabuada = new int[10];
		tabuada[0] = 1;
		tabuada[1] = 2;
		tabuada[2] = 3;
		tabuada[3] = 4;
		tabuada[4] = 5;
		tabuada[5] = 6;
		tabuada[6] = 7;
		tabuada[7] = 8;
		tabuada[8] = 9;
		tabuada[9] = 10;
		int n = 10;
		
		for (int i : tabuada) { // itera sobre todo o array tabuada
			System.out.println(n + " x " + i + " = " + i * n);
		}
		
		
		System.out.println("\n");
		int array[] = {5, 10, 12, 15, 3, 7, 10, 9};
		for ( int x: array) { //O x é o valor real presente no array
			if (x > 10) {
				System.out.println(x);
			}
		}
		

	}

}
