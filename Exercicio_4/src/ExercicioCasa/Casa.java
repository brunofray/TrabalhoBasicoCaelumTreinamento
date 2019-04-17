package ExercicioCasa;

public class Casa {
	String cor;
	boolean porta1;
	boolean porta2;
	boolean porta3;
	int quantidadePortasAbertas = 0;
	
	void pinta(String s) {
		cor = s;
	}
	void abreP1() {
		porta1 = true;
	}
	void abreP2() {
		porta2 = true;
	}
	void abreP3() {
		porta3 = true;
	}
	void fechaP1() {
		porta1 = false;
	}
	void fechaP2() {
		porta2 = false;
	}
	void fechaP3() {
		porta3 = false;
	}
	
	int quantasPortasEstaoAbertas() {
		if ( porta1 == true ) {
			quantidadePortasAbertas = quantidadePortasAbertas + 1;
		}
		if ( porta2 == true) {
			quantidadePortasAbertas = quantidadePortasAbertas + 1;
		}
		if ( porta3 == true) {
			quantidadePortasAbertas = quantidadePortasAbertas + 1;
		}
		return quantidadePortasAbertas;
	}
}
