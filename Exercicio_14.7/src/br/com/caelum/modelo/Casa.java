package br.com.caelum.modelo;

public class Casa {
	public String cor;
	int totalDePortas;
	Porta[] portas = new Porta[10];
	int quantidadePortasAbertas = 0;
	
	public Casa(int p) {
		totalDePortas = p;
		for ( int i = 0; i < totalDePortas; i++) {
			Porta porta = new Porta("fechada");
			portas[i] = porta;
		}
		for ( int i = totalDePortas; i < portas.length; i++) {
			portas[i] = null;
		}
	}
	
	public void pinta( String s) {
		this.cor = s;
		System.out.println(this.cor);
	}
	
	public int quantasPortasEstaoAbertas() {
		for (int x = 0; x < totalDePortas; x++) {
			if(portas[x].aberta == true) {
				quantidadePortasAbertas++;
			} 
		}
		System.out.println("Numero de portas abertas: " + quantidadePortasAbertas);
		return quantidadePortasAbertas;
	}

	public void adicionaPorta(Porta p) {
		if(totalDePortas < portas.length) {
			portas[totalDePortas] = p;
			totalDePortas++;
		} else {
			System.out.println("Array cheia");
		}
	}
	
	public int totalDePortas() {
		int cont = 0;
		for ( int i = 0; i < portas.length; i++) {
			if( portas[i] != null) {
				cont++;
			}
		}
		System.out.println("Total de portas: " + cont);
		return cont;
	}
	
}
