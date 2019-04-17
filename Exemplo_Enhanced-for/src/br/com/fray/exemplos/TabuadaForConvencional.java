package br.com.fray.exemplos;

public class TabuadaForConvencional {

	public static void main(String[] args) {
		
		// for convencional
		int n = 10;
		
		for(int i = 1; i <= n; i++) {
			System.out.println(n + " x " + i + " = " + i * n); //Itera 10 vezes
		}
		
		System.out.println("\n");
		int array[] = {5, 10, 12, 15, 3, 7, 10, 9};
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 10) {
				System.out.println(array[i]);
			}
		}

	}

}
