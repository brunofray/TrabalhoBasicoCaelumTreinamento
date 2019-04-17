package ExercicioFibonacci;

public class TesteFibonacciRecursivo {

	public static void main(String[] args) {
		FibonacciRecursivo fibonacci = new FibonacciRecursivo();
		for (int i = 1; i <= 6; i++) {
			int result = fibonacci.calculaFibonacci(i);
			System.out.println(result); 
		}
	}
}
