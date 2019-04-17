package br.com.caelum.main;

import br.com.caelum.modelo.Casa;
import br.com.caelum.modelo.Porta;

public class TestaPorta {

	public static void main(String[] args) {
		
		Casa c = new Casa(0);
		Porta p = new Porta("aberta");
		Porta p2 = new Porta("aberta");
		Porta p3 = new Porta("aberta");

		
		p.aberta = true;
		p.estaAberta();
		c.cor = "Azul";
		c.pinta("Preto");
		
		p.aberta = false;
		p2.aberta = true;
		p3.aberta = false;
		
		c.adicionaPorta(p);
		c.adicionaPorta(p2);
		c.adicionaPorta(p3);
		c.quantasPortasEstaoAbertas();
		c.totalDePortas();
		
		

	}

}
