package br.com.caelum.contas.modelo;

public class Data {
	public int dia;
	public int mes;
	public int ano;
	
	String formatada() {
		String result = String.format("%s/%s/%s", dia, mes, ano);
		return result;
	}
}
