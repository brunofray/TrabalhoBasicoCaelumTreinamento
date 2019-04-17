package br.com.caelum.modelo;

public class Porta {
	public boolean aberta; 
	
	public Porta(String s){
		if(s.equals("aberta")) {
			aberta = true;
		} else {
			aberta = false;
		}
	}
	public boolean estaAberta() {
		if(this.aberta == true) {
			System.out.println("Porta está aberta!");
		} else {
			System.out.println("Porta está fechada!");
		}
		return false;
	}
}
