package ExercicioFibonacci;

public class FibonacciRecursivo {
	int calculaFibonacci(int posicao) {
		return (posicao <= 2 ? 1 : calculaFibonacci(posicao - 1) + calculaFibonacci(posicao - 2));

	}
}
