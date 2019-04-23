package br.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAltera {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		Contato contato = new Contato();
		
		contato.setNome("Clovis");
		contato.setEmail("doido@caelum.com.br");
		contato.setEndereco("R. doideira 58 dp57");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId((long) 3);
		
		dao.altera(contato);
		System.out.println("Alteração gravada!");
	}
}
