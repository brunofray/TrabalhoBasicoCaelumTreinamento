package br.com.moldsystems.conta;

public class Data {
	public int dia;
	public int mes;
	public int ano;
	
	String formatada() {
		String result = String.format("%s/%s/%s", dia, mes, ano);
		return result;
	}
}
