package br.caelum.jdbc.teste;


import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaInsereFuncionario {

	public static void main(String[] args) {
		// Feito para gravar
				Funcionario funcionario = new Funcionario();
				funcionario.setNome("Bruno");
				funcionario.setUsuario("usuario.2");
				funcionario.setSenha("54321");
				
				// Gravando nessa conexão
				FuncionarioDao dao = new FuncionarioDao();
				
				// Adicionando de maneira elegante
				dao.adiciona(funcionario);
				
				System.out.println("Gravado!");

	}

}
