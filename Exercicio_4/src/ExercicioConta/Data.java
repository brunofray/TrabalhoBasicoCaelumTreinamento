package ExercicioConta;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String formatada() {
		String result = String.format("%s/%s/%s", dia, mes, ano);
		return result;
	}
}
