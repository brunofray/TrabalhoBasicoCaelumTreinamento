package br.caelum.jdbc.teste;

import java.sql.SQLException;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaPesquisa {

	public static void main(String[] args) throws SQLException {
		ContatoDao dao = new ContatoDao();
		Contato selecionado = dao.pesquisar(1);

		Long testa = selecionado.getId();

		if(testa != 0){
			System.out.println("ID selecionada: " +selecionado.getId());
			System.out.println("Nome completo: " +selecionado.getNome());
			System.out.println("Email: " +selecionado.getEmail());
			System.out.println("Endereco: " +selecionado.getEndereco());			
		} else 
			System.out.println("ID nao encontrada...");
	}

}
