package ExercicioPorta;

public class Porta {
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	
	void abre() {
		aberta = true;
	}
	void fecha() {
		aberta = false;
	}
	void pinta(String s) {
		cor = s;
	}
	boolean estaAberta() {
		if(aberta) {
			System.out.println("Porta está aberta!");
		} else {
			System.out.println("Porta está fechada!");
		}
		return aberta;
	}
}
