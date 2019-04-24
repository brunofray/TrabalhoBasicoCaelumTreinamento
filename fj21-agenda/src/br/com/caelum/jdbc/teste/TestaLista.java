package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class TestaLista {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.getLista();
		
		// Configurando data format
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		for(Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " + 
					sdf.format(contato.getDataNascimento().getTime()) + "\n");
		}
		
		

	}

}
