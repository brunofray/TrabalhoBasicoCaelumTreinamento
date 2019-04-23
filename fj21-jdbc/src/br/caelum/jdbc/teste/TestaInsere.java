package br.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {
	
	public static void main(String[] args) {
		
		// Feito para gravar
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());
		
		contato.setNome("Bruno");
		contato.setEmail("bruno@caelum.com.br");
		contato.setEndereco("R. Sindicato 219 cd58");
		contato.setDataNascimento(Calendar.getInstance());
		
		// Gravando nessa conexão
		ContatoDao dao = new ContatoDao();
		
		// Adicionando de maneira elegante
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
		
	}

}
